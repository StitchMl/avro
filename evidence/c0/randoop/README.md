# Randoop Evidence for C0

This directory documents the exploratory random-testing activity performed on
`org.apache.avro.Schema` during the C0 phase.

## Scope

- Target class: `org.apache.avro.Schema`
- Java runtime: Temurin 8
- Strategy: run Randoop on the target class, inspect the output manually, and
  promote only readable, single-behavior discoveries into the committed
  regression suite `SchemaM3RandomTest.java`

## Deliverable

`SchemaM3RandomTest.java` (12 tests, `test01`–`test12`) is committed on all
C0-derived branches and executed by Maven Surefire under the include pattern
`**/*M3RandomTest.java`.

The tests follow Randoop's naming convention and capture concrete calling
sequences whose return-value observations were discovered during random
exploration. Each retained test satisfies the following curation criteria:

- small (3–6 lines of test body)
- readable (descriptive JavaDoc)
- one behavior per test
- explicit motivation for every retained assertion

Raw Randoop output that did not meet these criteria was discarded.

## Reproducibility artifacts

- `classes.txt`: target class list used for generation
- `randoop-omit-methods.txt`: methods excluded to reduce noise and
  non-determinism
- `../../scripts/run-schema-randoop.ps1`: PowerShell entry point to rerun the
  generation pipeline on this repository

## Expected workflow

1. Build test classes and dependency classpath for `lang/java/avro`.
2. Run Randoop on `org.apache.avro.Schema` only.
3. Review generated tests manually.
4. Discard unreadable, redundant or unstable tests.
5. Promote only valuable discoveries into `SchemaM3RandomTest.java`.

## Interpretation

The number of committed tests (12) is smaller than a typical raw Randoop batch
because quality was preferred over quantity. The exploration exercised a wider
space of calling sequences; the committed suite retains only the observations
that stabilise regression-relevant behavior and can be maintained as
readable unit tests.
