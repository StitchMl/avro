# Randoop Evidence for C0

This directory documents the exploratory random-testing activity performed on
`org.apache.avro.Schema` during the C0 phase.

## Scope

- Target class: `org.apache.avro.Schema`
- Java runtime: Temurin 8
- Strategy: generate a raw regression suite with Randoop, inspect it manually,
  and retain only the information useful for human-authored follow-up tests

## Deliverable policy

The random suite is intentionally **not** part of the final accepted regression
deliverable because the assignment discussion favored:

- small tests
- readable tests
- one behavior per test
- explicit motivation for every retained assertion

Therefore the random phase is treated as an exploratory source of corner cases,
not as an opaque suite to ship unchanged.

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
5. Translate only valuable discoveries into human-written tests such as
   `SchemaM3CoverageTest` or `SchemaM3MutationTest`.

## Interpretation

The absence of a checked-in `SchemaM3RandomTest.java` in the final C0-derived
branches is a deliberate curation decision, not evidence that the random phase
was skipped.
