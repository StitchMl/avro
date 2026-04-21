param(
  [string]$RepoRoot = (Resolve-Path (Join-Path $PSScriptRoot '..')).Path,
  [string]$JavaHome = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.482.8-hotspot',
  [string]$RandoopJar,
  [int]$TimeLimitSeconds = 60,
  [string]$OutputDir = ''
)

$ErrorActionPreference = 'Stop'

if (-not $RandoopJar) {
  throw 'Provide -RandoopJar with the full path to a Randoop all-in-one jar.'
}

if (-not $OutputDir) {
  $OutputDir = Join-Path $RepoRoot 'evidence\c0\randoop\generated'
}

$modulePom = Join-Path $RepoRoot 'lang\java\avro\pom.xml'
$classesTxt = Join-Path $RepoRoot 'classes.txt'
$omitMethods = Join-Path $RepoRoot 'evidence\c0\randoop\randoop-omit-methods.txt'
$classpathFile = Join-Path $RepoRoot 'evidence\c0\randoop\cp.txt'

$env:JAVA_HOME = $JavaHome
$filteredPath = $env:Path -split ';' | Where-Object {
  $_ -and ($_ -notmatch 'Eclipse Adoptium\\jdk-8') -and ($_ -notmatch 'Eclipse Adoptium\\jdk-25')
}
$env:Path = "$env:JAVA_HOME\bin;" + [string]::Join(';', $filteredPath)

New-Item -ItemType Directory -Force -Path $OutputDir | Out-Null

mvn -f $modulePom -DskipTests test-compile dependency:build-classpath `
  -Dmdep.outputFile=$classpathFile

$depCp = Get-Content $classpathFile -Raw
$testClasses = Join-Path $RepoRoot 'lang\java\avro\target\test-classes'
$mainClasses = Join-Path $RepoRoot 'lang\java\avro\target\classes'
$fullCp = "$testClasses;$mainClasses;$depCp"

& java -cp "$RandoopJar;$fullCp" randoop.main.Main gentests `
  --classlist=$classesTxt `
  --omit-methods-file=$omitMethods `
  --time-limit=$TimeLimitSeconds `
  --junit-output-dir=$OutputDir `
  --junit-package-name=org.apache.avro
