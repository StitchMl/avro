<#
    run-m3-measures.ps1
    Misura tutte le famiglie di test su Schema e Symbol, con scope corretto
    (classe esterna + classi annidate) e senza contaminazione fra le run.

    Uso:
        .\scripts\run-m3-measures.ps1
        .\scripts\run-m3-measures.ps1 -Only manuale,evosuite
        .\scripts\run-m3-measures.ps1 -SkipJaCoCo

    Produce:
        evidence\c0\measures\<famiglia>_<classe>\pit\      report PIT
        evidence\c0\measures\<famiglia>_<classe>\jacoco\   report JaCoCo
        evidence\c0\measures\riepilogo.csv                 tabella riassuntiva
#>
param(
    [string]$RepoRoot = (Resolve-Path (Join-Path $PSScriptRoot '..')).Path,
    [string]$Java8    = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.482.8-hotspot',
    [string[]]$Only   = @(),
    [switch]$SkipJaCoCo
)

# I comandi nativi (java, mvn) scrivono su stderr anche quando vanno a buon fine:
# con ErrorActionPreference='Stop' PowerShell li tratterebbe come errori terminanti.
# Si usa 'Continue' e si controlla esplicitamente $LASTEXITCODE.
$ErrorActionPreference = 'Continue'
$Pom     = Join-Path $RepoRoot 'lang\java\avro\pom.xml'
$Module  = Join-Path $RepoRoot 'lang\java\avro'
$OutBase = Join-Path $RepoRoot 'evidence\c0\measures'

# --- JDK 8 forzato -----------------------------------------------------------
$env:JAVA_HOME = $Java8
$env:Path = "$Java8\bin;" + [string]::Join(';', ($env:Path -split ';' |
    Where-Object { $_ -and ($_ -notmatch 'Adoptium\\jdk-(?!8)') }))
$v = (& java -version 2>&1 | Out-String)
if ($v -notmatch '1\.8\.') {
    Write-Host "JDK 8 non attivo. java -version dice:`n$v" -ForegroundColor Red
    exit 1
}
Write-Host "JDK 8 OK ($Java8)" -ForegroundColor Green

# --- definizione delle famiglie ---------------------------------------------
# targetClasses include SEMPRE la classe esterna e le annidate ($*),
# escludendo cosi' SchemaParseException (che 'Schema*' includerebbe per errore).
$targets = @{
    Schema = @{
        Classes = 'org.apache.avro.Schema,org.apache.avro.Schema$*'
        Prefix  = 'org.apache.avro'
        JaCoCo  = 'Schema'
    }
    Symbol = @{
        Classes = 'org.apache.avro.io.parsing.Symbol,org.apache.avro.io.parsing.Symbol$*'
        Prefix  = 'org.apache.avro.io.parsing'
        JaCoCo  = 'Symbol'
    }
}

$families = [ordered]@{
    'manuale'    = @{ Schema = 'SchemaM3BBTest,SchemaM3CFTest,SchemaM3CoverageTest,SchemaM3MutationTest'
                      Symbol = 'SymbolM3BBTest,SymbolM3CFTest,SymbolM3CoverageTest,SymbolM3MutationTest' }
    'evosuite300' = @{ Schema = 'Schema_ESTest'             ; Symbol = 'Symbol_ESTest' }
    'evosuite60'  = @{ Schema = 'Schema_ES60Test'           ; Symbol = 'Symbol_ES60Test' }
    'randoop300' = @{ Schema = 'SchemaM3Random300Test*'     ; Symbol = 'SymbolM3Random300Test*' }
    'randoop60'  = @{ Schema = 'SchemaM3RandomTest'         ; Symbol = 'SymbolM3RandomTest' }
    'llm'        = @{ Schema = 'SchemaM3LLMTest'            ; Symbol = 'SymbolM3LLMTest' }
}

if ($Only.Count) {
    $filtered = [ordered]@{}
    foreach ($k in $families.Keys) { if ($Only -contains $k) { $filtered[$k] = $families[$k] } }
    $families = $filtered
}

New-Item -ItemType Directory -Force $OutBase | Out-Null
$rows = @()

function Get-PitStats($outDir) {
    # legge il riepilogo dal report XML di PIT
    $xml = Join-Path $outDir 'mutations.xml'
    if (-not (Test-Path $xml)) { return $null }
    [xml]$d = Get-Content $xml
    $all = @($d.mutations.mutation)
    $killed  = @($all | Where-Object { $_.status -eq 'KILLED' -or $_.status -eq 'TIMED_OUT' }).Count
    $noCov   = @($all | Where-Object { $_.status -eq 'NO_COVERAGE' }).Count
    $total   = $all.Count
    $covered = $total - $noCov
    [pscustomobject]@{
        Mutanti      = $total
        Uccisi       = $killed
        NonCoperti   = $noCov
        MutationCov  = if ($total)   { [math]::Round(100 * $killed / $total, 0) }   else { $null }
        TestStrength = if ($covered) { [math]::Round(100 * $killed / $covered, 0) } else { $null }
    }
}

function Get-JaCoCoStats($csvPath, $classPrefix) {
    if (-not (Test-Path $csvPath)) { return $null }
    $rows = Import-Csv $csvPath | Where-Object {
        $_.CLASS -eq $classPrefix -or $_.CLASS -like "$classPrefix.*"
    }
    if (-not $rows) { return $null }
    $lc = ($rows | Measure-Object LINE_COVERED   -Sum).Sum
    $lm = ($rows | Measure-Object LINE_MISSED    -Sum).Sum
    $bc = ($rows | Measure-Object BRANCH_COVERED -Sum).Sum
    $bm = ($rows | Measure-Object BRANCH_MISSED  -Sum).Sum
    [pscustomobject]@{
        LineCov   = if (($lc + $lm)) { [math]::Round(100 * $lc / ($lc + $lm), 0) } else { $null }
        BranchCov = if (($bc + $bm)) { [math]::Round(100 * $bc / ($bc + $bm), 0) } else { $null }
        Linee     = "$lc/$($lc + $lm)"
        Branch    = "$bc/$($bc + $bm)"
    }
}

foreach ($fam in $families.Keys) {
    foreach ($cls in @('Schema', 'Symbol')) {

        $tests = $families[$fam][$cls]
        $tg    = $targets[$cls]
        $label = "$fam / $cls"
        $dest  = Join-Path $OutBase "${fam}_${cls}"
        New-Item -ItemType Directory -Force $dest | Out-Null

        Write-Host "`n=== $label ===" -ForegroundColor Cyan

        # ---------- PIT (mutation + line coverage, gia' ristretto ai test) ----
        Write-Host "  PIT..." -NoNewline
        $pitLog = Join-Path $dest 'mvn-pit.log'
        & mvn -f $Pom org.pitest:pitest-maven:1.9.11:mutationCoverage `
            "-DtargetClasses=$($tg.Classes)" `
            "-DtargetTests=$($tg.Prefix).$($tests -replace ',', ",$($tg.Prefix).")" `
            "-DoutputFormats=XML,HTML" *> $pitLog
        $pitOk = ($LASTEXITCODE -eq 0)

        $pitSrc = Join-Path $Module 'target\pit-reports'
        $pitDst = Join-Path $dest 'pit'
        if ($pitOk -and (Test-Path $pitSrc)) {
            if (Test-Path $pitDst) { Remove-Item -Recurse -Force $pitDst }
            Copy-Item -Recurse -Force $pitSrc $pitDst
            Write-Host " ok" -ForegroundColor Green
        } else {
            Write-Host " FALLITO (log: $pitLog)" -ForegroundColor Red
        }
        $pit = Get-PitStats $pitDst

        # ---------- JaCoCo (branch coverage + conferma indipendente) ---------
        $jac = $null
        if (-not $SkipJaCoCo) {
            Write-Host "  JaCoCo..." -NoNewline
            # CRITICO: l'agent ha append=true di default -> senza cancellare
            # jacoco.exec i dati si accumulano fra famiglie diverse.
            $exec = Join-Path $Module 'target\jacoco.exec'
            if (Test-Path $exec) { Remove-Item -Force $exec }
            $site = Join-Path $Module 'target\site\jacoco'
            if (Test-Path $site) { Remove-Item -Recurse -Force $site }

            $jacLog = Join-Path $dest 'mvn-jacoco.log'
            & mvn -f $Pom org.jacoco:jacoco-maven-plugin:prepare-agent test `
                org.jacoco:jacoco-maven-plugin:report `
                "-Dtest=$tests" "-DfailIfNoTests=false" "-Dmaven.test.failure.ignore=true" `
                "-Djacoco.append=false" *> $jacLog

            $csv = Join-Path $site 'jacoco.csv'
            $jac = Get-JaCoCoStats $csv $tg.JaCoCo
            $jacDst = Join-Path $dest 'jacoco'
            if (Test-Path $site) {
                if (Test-Path $jacDst) { Remove-Item -Recurse -Force $jacDst }
                Copy-Item -Recurse -Force $site $jacDst
            }
            if ($jac) {
                Write-Host " ok" -ForegroundColor Green
            } else {
                Write-Host " nessun dato (log: $jacLog)" -ForegroundColor Yellow
                Write-Host "    verifica che il pom includa <include>**/*M3*Test*.java</include>" -ForegroundColor Yellow
            }
        }

        $rows += [pscustomobject]@{
            Famiglia      = $fam
            Classe        = $cls
            Mutanti       = $pit.Mutanti
            Uccisi        = $pit.Uccisi
            NonCoperti    = $pit.NonCoperti
            'MutCov%'     = $pit.MutationCov
            'TestStr%'    = $pit.TestStrength
            'JaCoCoLine%' = $jac.LineCov
            'JaCoCoBr%'   = $jac.BranchCov
            Linee         = $jac.Linee
            Branch        = $jac.Branch
        }
    }
}

# --- riepilogo ---------------------------------------------------------------
$csvOut = Join-Path $OutBase 'riepilogo.csv'
$rows | Export-Csv -NoTypeInformation -Encoding UTF8 $csvOut

Write-Host "`n================ RIEPILOGO ================" -ForegroundColor Cyan
foreach ($cls in @('Schema', 'Symbol')) {
    Write-Host "`n--- $cls ---" -ForegroundColor Yellow
    $rows | Where-Object Classe -eq $cls |
        Sort-Object -Property 'MutCov%' -Descending |
        Format-Table Famiglia, Mutanti, Uccisi, NonCoperti, 'MutCov%', 'TestStr%',
                     'JaCoCoLine%', 'JaCoCoBr%' -AutoSize
}
Write-Host "`nCSV: $csvOut" -ForegroundColor Green
Write-Host "Report per famiglia: $OutBase\<famiglia>_<classe>\{pit,jacoco}" -ForegroundColor Green
