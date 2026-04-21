param(
  [string]$RepoRoot = (Resolve-Path (Join-Path $PSScriptRoot '..')).Path,
  [string]$JavaHome = 'C:\Program Files\Eclipse Adoptium\jdk-8.0.482.8-hotspot'
)

$ErrorActionPreference = 'Stop'
$modulePom = Join-Path $RepoRoot 'lang\java\avro\pom.xml'

$env:JAVA_HOME = $JavaHome
$filteredPath = $env:Path -split ';' | Where-Object {
  $_ -and ($_ -notmatch 'Eclipse Adoptium\\jdk-8') -and ($_ -notmatch 'Eclipse Adoptium\\jdk-25')
}
$env:Path = "$env:JAVA_HOME\bin;" + [string]::Join(';', $filteredPath)

mvn -f $modulePom test-compile org.pitest:pitest-maven:mutationCoverage
