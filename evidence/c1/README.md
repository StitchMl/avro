# C1 Refactoring Evidence for `org.apache.avro.Schema`

This directory stores the verification evidence collected after the
behavior-preserving C1 refactoring executed on branch `m3-c1-schema`.

Execution environment:

- Base branch: `m3-c0-schema`
- Refactoring branch: `m3-c1-schema`
- Module: `lang/java/avro`
- Runtime used for verification: Temurin 8 (`1.8.0_482`)
- Maven runtime used for verification: `3.9.13`
- Verification date: `2026-04-16`

Artifacts included:

- `refactor-summary.md`
- `compile-status.md`
- `test-suite-status.md`
- `coverage-report.md`
- `mutation-report.md`
- `smell-report.md`
- `loc-complexity.md`
- `run-status.properties`
- `logs/`

Related prompt artifact:

- `prompts/c1/schema_refactor_prompt.md`

Generated reports referenced by the summaries:

- JaCoCo HTML report: `lang/java/avro/target/site/jacoco/index.html`
- PIT HTML report: `lang/java/avro/target/pit-reports/index.html`
