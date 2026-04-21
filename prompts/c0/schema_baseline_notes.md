# C0 Baseline Notes for `org.apache.avro.Schema`

C0 is the **unchanged baseline** of `Schema.java` at tag `release-1.5.4`. No
refactoring prompt was submitted to an LLM for this branch. This file exists
so that every campaign variant (C0..C4) has a matching entry under
`prompts/` and so that readers of the repository can see at a glance why C0
has no `schema_refactor_prompt.md`.

## Scope

- Branch: `m3-c0-schema`
- Tag used for C0: `release-1.5.4`
- Source under test: `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
- Refactoring action: **none**
- LLM involvement: **none**

## Activities performed on C0

1. Freeze the baseline by checking out `release-1.5.4` into `m3-c0-schema`.
2. Build the `lang/java/avro` module on Temurin 8.
3. Disable the original Surefire defaults so that only the M3 suites run.
4. Author the M3 test suites on top of the baseline source:
   - `SchemaM3BBTest` (black-box from category partition)
   - `SchemaM3LLMTest` (LLM-assisted, curated)
   - `SchemaM3CoverageTest` (coverage-guided)
   - `SchemaM3CFTest` (control-flow)
   - `SchemaM3MutationTest` (mutation-guided)
5. Run a raw Randoop exploration on `org.apache.avro.Schema` (see
   `evidence/c0/randoop/README.md`). The Randoop output was treated as an
   exploratory source of corner cases, not as a committed suite, so no
   `SchemaM3RandomTest.java` is kept on disk.
6. Collect quality evidence under `evidence/c0/` (compile, coverage, PIT,
   smells, LOC/complexity, raw Maven logs).

## Why there is no prompt for C0

- C0 is defined as the unmodified reference variant.
- The variants that actually receive an LLM prompt are `C1`, `C2`, `C3`, `C4`,
  and each of those has its own `prompts/cN/schema_refactor_prompt.md` with
  the exact text submitted to the model.
- Keeping `prompts/c0/` present but prompt-free makes the directory layout
  uniform across all five variants.

## Cross-references

- Baseline metrics: `evidence/c0/`
- Variant comparison: `docs/m3-schema-variant-matrix.md`
- Interpretation: `docs/m3-schema-results-interpretation.md`
- Randoop policy: `evidence/c0/randoop/README.md`
