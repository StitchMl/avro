# Milestone 4 — Final Report

**Course:** Ingegneria del Software e Web 2
**Student:** Matteo Lagioia
**Date:** 21 April 2026
**Target project:** Apache Avro, Java module `lang/java/avro`
**Target class:** `org.apache.avro.Schema`
**Baseline (C0) tag:** `release-1.5.4`

---

## 1. Introduction

This report documents Milestone 3 (test generation and LLM-assisted
refactoring on a real Java class) and Milestone 4 (final delivery and
interpretation) for the course project *Ingegneria del Software e Web 2*.

The project continues the work started in Milestones 1 and 2, in which a
class-level dataset over several Avro releases was built and used to train a
defect-prediction classifier. The class-level dataset exposed `NSmells`,
`CodeSmells`, `Buggy` and static metrics per release. On the basis of that
dataset, `org.apache.avro.Schema` emerged as the strongest candidate for M3:
a historical hotspot, a class rich enough to exercise every test-design
technique required by the course (black-box, random, LLM, coverage-guided,
control-flow and mutation), and a class for which a Category Partition
specification was already available from earlier coursework.

M3 then implemented, on top of the C0 baseline of `Schema`:

1. a curated multi-technique regression suite,
2. four LLM-driven refactoring variants (C1, C2, C3, C4) obtained with
   progressively richer prompt specifications, and
3. a uniform quality matrix that compares C0–C4 on compile, pass/fail,
   coverage, mutation, smells, LOC and heuristic complexity.

M4 closes the campaign by consolidating the evidence, interpreting the
outcomes and delivering the final report.

## 2. Inputs from Milestones 1–2

The class-level dataset produced in the previous milestones contained, per
release, columns such as `ReleaseId`, static size/complexity metrics,
`CodeSmells`, `NSmells` and the label `Buggy`. The defect-prediction
evaluation favored classes that satisfy three conditions simultaneously:

- they are historical hotspots (recurrent `Buggy = 1` across releases),
- they carry a large enough smell footprint, and
- they are structurally rich enough to justify all six test-design
  techniques required by the assignment.

Among the Avro candidates inspected in the M1/M2 selection notes
(`avro_m3_candidate_selection.md`, `avro_m3_candidate_selection.csv`),
`org.apache.avro.Schema` is the class that best satisfies all three criteria
at once. The pre-existing Category Partition on `Schema` — which already
covered factory methods, validation, record/union/enum construction,
`setFields`, `parse`, `equals`, `toString` and several internal constraints —
was an additional practical factor that made `Schema` the most efficient
target for the black-box suite.

## 3. Target selection

### 3.1 Class choice

`org.apache.avro.Schema` was chosen because:

- it is a historical hotspot in the class-level dataset,
- it is large enough (hundreds of lines, several decision-heavy methods) to
  meaningfully differentiate the test-design techniques,
- it exposes multiple responsibility clusters (construction, validation,
  aliasing, parsing, serialization) that make LLM-assisted refactoring a
  relevant experiment, and
- its Category Partition specification was already mature and available from
  earlier coursework, which reduced the cost of the BB suite.

### 3.2 Baseline release

The C0 baseline uses tag `release-1.5.4`. This release is inside the same
historical perimeter used to build the dataset in M1/M2, which keeps the
experiment coherent with the dataset's notion of "buggy" and "smelly"
classes. The tag is available on the official Apache Avro GitHub repository
and contains the Maven module `lang/java/avro` with the expected class path
`lang/java/avro/src/main/java/org/apache/avro/Schema.java`.

A parallel `release-1.8.0` track is kept on `*-legacy-1.8` branches to
absorb any toolchain friction, but the reported experiment uses
`release-1.5.4` as C0.

## 4. Test generation on C0

The C0 baseline is the `release-1.5.4` content of `Schema.java` without any
refactoring. On top of this baseline, the following curated suites were
authored in `lang/java/avro/src/test/java/org/apache/avro/`:

| Suite | Technique | Tests |
| --- | --- | ---: |
| `SchemaM3BBTest` | Black-box (category partition) | 18 |
| `SchemaM3LLMTest` | LLM-assisted, manually curated | 8 |
| `SchemaM3CoverageTest` | Coverage-guided | 11 |
| `SchemaM3CFTest` | Control-flow | 17 |
| `SchemaM3MutationTest` | Mutation-guided | 16 |
| **Total** | | **70** |

The original Avro test suite was not deleted but excluded from Surefire so
that the experiment stays isolated. Surefire on the module is configured to
accept exactly the six filenames `*M3BBTest.java`, `*M3RandomTest.java`,
`*M3LLMTest.java`, `*M3CFTest.java`, `*M3CoverageTest.java` and
`*M3MutationTest.java`. The accepted filename `*M3RandomTest.java` is
intentionally left empty on disk, as discussed in section 4.2.

### 4.1 Black-box suite

`SchemaM3BBTest` covers factory methods (`create`, `createRecord`,
`createUnion`, `createEnum`, `createFixed`, `createMap`, `createArray`),
setter/getter flow (`setFields`, `getField`), deprecated parsing (`parse`)
and equality/representation (`equals`, `toString`). The tests follow the
rule of one behavior per test and exercise nominal / boundary / error cases
derived from the Category Partition.

### 4.2 Randoop / random suite (exploratory)

Randoop was invoked on `org.apache.avro.Schema` as documented in
`evidence/c0/randoop/README.md` and reproducible via
`scripts/run-schema-randoop.ps1`. The raw output was used only as an
exploratory source of corner cases, because the assignment favors small,
readable, single-behavior tests with explicit motivation for each assertion.

For this reason no `SchemaM3RandomTest.java` is committed on the
`C0`-derived branches. The policy is stated explicitly in
`evidence/c0/randoop/README.md` and reflected by the `Random` column of the
final matrix (`N/A` on every branch). The absence is a deliberate curation
decision, not a gap in the experiment.

### 4.3 LLM-assisted suite

`SchemaM3LLMTest` was produced from prompt rounds stored under
`prompts/c0/` (`schema_round1_records_named_types.md`,
`schema_round2_parser_validation.md`,
`schema_round3_unions_aliases_streams.md`). Model output was cleaned
manually; only compiling, deterministic and valuable tests were retained.

### 4.4 Coverage-guided suite

`SchemaM3CoverageTest` closes JaCoCo holes left by the BB/LLM suites. The
holes prioritized by this phase are validation paths, exception raising
branches and the record/enum/union/fixed branch families, as well as name
validation and primitive-vs-complex type dispatch.

### 4.5 Control-flow suite

`SchemaM3CFTest` targets 3–5 branch-rich methods (`createUnion`,
`createRecord`, `createEnum`, `setFields`, `equals`). Each test traces one
meaningful branch rather than chasing every possible path.

### 4.6 Mutation suite

PIT was run with the configuration captured in `evidence/c0/mutation-report.md`
(command `mvn test-compile org.pitest:pitest-maven:mutationCoverage`). The
surviving and uncovered mutants of C0 are concentrated in
`applyAliases`, `parse`, `hashCode`, `parseAliases`, `getAliases`,
`getFieldAlias`, `toJson` and `create`. `SchemaM3MutationTest` targets the
most interesting survivors (boundary conditions, null checks, boolean
returns, altered equality, validation branches) rather than attempting to
kill every mutant.

### 4.7 Quality baseline (C0 evidence)

All C0 metrics are stored under `evidence/c0/` with their raw logs under
`evidence/c0/logs/`. The key baseline numbers are:

- Compile: `SUCCESS` on Temurin 8 and Maven 3.9.13
- Full M3 suite: `70` tests, `PASS`, `0` failures / `0` errors / `0` skipped
- JaCoCo on `org.apache.avro.Schema`:
  instructions `62.15%`, branches `57.21%`, lines `66.67%`,
  methods `64.00%`, complexity `47.47%`
- PIT on `org.apache.avro.Schema*`: mutation score `47%`, test strength `78%`,
  `450` mutations generated, `211` killed, `179` no-coverage
- Smell review: no severe god-class/roulette/mystery-guest findings on the
  M3 test code itself, moderate intentional duplication between techniques
- Suite LOC/complexity:
  `SchemaM3BBTest` 267 LOC (HC 10),
  `SchemaM3CFTest` 302 LOC (HC 14),
  `SchemaM3CoverageTest` 161 LOC (HC 9),
  `SchemaM3LLMTest` 141 LOC (HC 4),
  `SchemaM3MutationTest` 246 LOC (HC 5),
  total code LOC `554`, total comment LOC `403`

## 5. LLM refactoring protocol

Four LLM-driven refactoring variants were derived from the C0 baseline.
Each variant:

- started from `m3-c0-schema` (each variant is a sibling of C0, not a
  follow-up of the previous variant),
- received a fixed prompt stored under `prompts/cN/schema_refactor_prompt.md`,
- produced a new `Schema.java` on branch `m3-cN-schema`,
- re-ran the full M3 pipeline,
- published the result under `evidence/cN/`.

Prompt specifications supplied to the model per variant:

| Variant | Source | BB suite | CF suite | Mutation survivor summary |
| --- | :---: | :---: | :---: | :---: |
| C1 | yes | no | no | no |
| C2 | yes | yes | no | no |
| C3 | yes | yes | yes | no |
| C4 | yes | yes | yes | yes |

All variants share the same behavior-preservation constraints:

- no public API change unless strictly required for compilation,
- preserved externally observable behavior,
- no modification of the test sources,
- Java 8 compilation,
- preference for extracted private helpers over rewriting validated public
  contracts,
- return of the refactored `Schema.java` only.

C0 is purposely not assigned a refactor prompt; `prompts/c0/` keeps only
the generative prompt rounds used to seed `SchemaM3LLMTest` and a
`schema_baseline_notes.md` file that documents why no refactor prompt
exists for C0.

## 6. Results

### 6.1 Quality matrix (C0–C4)

| Variant | Compile | BB | Random | LLM | Coverage | CF | Mutation | Smells | LOC Δ | HC Δ |
| ------- | ------- | -- | ------ | --- | -------- | -- | -------- | ------ | ----: | ----: |
| `C0` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `47%` (`TS 78%`) | No severe test smells; residual gaps in alias/parsing behavior | `+0` | `+0` |
| `C1` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 78%`) | Parsing hotspot smell reduced; large-file smell remains | `+89` | `-3` |
| `C2` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 78%`) | BB-relevant hotspots simplified; large-file smell remains | `+27` | `+0` |
| `C3` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 79%`) | Branch-heavy hotspots simplified; large-file smell remains | `+42` | `+0` |
| `C4` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `45%` (`TS 78%`) | Alias/parsing hotspots decomposed; size tradeoff increases | `+132` | `+0` |

Notes:

- The `Random` column is consistently `N/A` because the Randoop phase is
  intentionally exploratory (see 4.2).
- `LOC Δ` is computed uniformly on
  `lang/java/avro/src/main/java/org/apache/avro/Schema.java` for every
  branch against C0, so the deltas are directly comparable.
- `HC Δ` is a heuristic Halstead-style decision-point count delta. Values
  of `+0` indicate that the refactor redistributed, not simplified,
  decisions.

### 6.2 Coverage, mutation and smell evidence

Per-variant evidence is stored under `evidence/c0/` and `evidence/c4/`
(baseline and the most refactor-intensive variant), plus per-branch
`evidence/cN/` directories captured on the respective refactoring branch.
The comparison document `docs/m3-schema-variant-matrix.md` consolidates the
metrics shown in the matrix above, and `docs/m3-schema-results-interpretation.md`
provides the analytical commentary referenced in section 7.

## 7. Discussion

### 7.1 Does C1 break more easily?

No, according to the available executable evidence: C1 passes every suite
and improves the mutation score by one point over C0. However C1 touches a
much wider parsing surface than C2 or C3, so it is more invasive and less
conservative in change-risk terms.

### 7.2 Does C2 protect better than C1?

Yes, if "protect better" means matching C1's quality outcomes with a much
smaller structural footprint. C2 obtains the same `48%` mutation score and
`78%` test strength as C1 with a `+27` LOC growth instead of `+89`, and
does so while focusing on the BB-relevant contracts (`setFields`, union
validation).

### 7.3 Does C3 improve over C2?

Yes, incrementally. C3 matches the `48%` mutation score of C2 and improves
the test-strength indicator from `78%` to `79%`, at the cost of only `+42`
LOC and without regressing heuristic complexity. C3 is also the first
variant whose smell cleanup is clearly aligned with branch-heavy internals
rather than with only public-contract hotspots.

### 7.4 Is C4 really the most robust?

No. Although C4 is the only variant that has access to the mutation-survivor
summary, its mutation score actually **regresses** to `45%` (below C0's
`47%`), its test strength drops back to `78%` and its LOC cost is the
largest (`+132`). C4 still has value — it decomposes the alias-handling
subsystem and makes it more auditable — but the survivor summary alone did
not translate into stronger mutation resistance, partly because the new
private helpers expand the code surface that PIT can mutate.

### 7.5 Did the LLM remove smells without worsening size/complexity?

Only partially. C1 is the only variant that reduces heuristic complexity
(`-3`); C2, C3 and C4 leave it unchanged. Every variant grows the physical
LOC of `Schema.java`, and none of them removes the inherited large-file
smell of the class. The local long-method and mixed-responsibility smells
targeted by each prompt are visibly reduced, but the reduction comes with a
non-trivial size cost.

### 7.6 Overall ranking

The empirical ranking that emerges from C0–C4 is:

1. **C3** — best overall. Preserves all tests, shares the top mutation
   score, achieves the best test-strength indicator and improves
   branch-heavy internals with moderate growth.
2. **C2** — best conservative choice. Essentially matches C3 on external
   quality with the smallest code growth.
3. **C1** — valid but broader. Improves parsing and slightly lowers
   complexity, but invasiveness exceeds its measured gain.
4. **C4** — exploratory refactor. Improves diagnosability of
   alias-handling, but regresses mutation score.

An accurate one-line summary for the report is:

> Increasing the amount of guidance given to the LLM does not
> monotonically improve refactoring quality. In this study, the best result
> was obtained by combining behavioral and control-flow specifications
> (C3), while the survivor-guided refactoring (C4) improved local
> readability but did not improve mutation robustness.

## 8. Threats to validity

**Internal validity.** Only one class (`Schema`) has been refactored and
evaluated. Prompt responses are stochastic and were not re-sampled multiple
times per variant, so per-variant numbers carry an unmodeled variance.
Manual curation of the LLM output (acceptance/rejection of tests, light
post-editing of refactored sources) introduces a human factor that is not
blind.

**External validity.** `release-1.5.4` is a legacy Avro release. Results
may not generalize to modern releases, modern JDKs or codebases with
radically different size/style. The `org.apache.avro.Schema` class has its
own coding style and aliasing model, which affects how the LLM attacks
it.

**Construct validity.** The `Randoop` axis is reported as `N/A` by design,
not as `FAIL`; this reduces the granularity of the matrix on that
dimension. Heuristic complexity is an approximation (lightweight token
count) rather than a full cyclomatic measurement. The smell report is
qualitative and based on manual inspection of the test code.

**Tooling.** PIT's mutation operators and Randoop's generation strategy
both bias the adequacy picture: a different mutation operator set or a
different random generator would change the absolute numbers, even if the
relative ordering of C0–C4 is likely to remain stable.

## 9. Conclusions

The experiment targeted the question *"Do the tests we hand to the LLM
actually improve its refactoring?"*. The answer found on
`org.apache.avro.Schema` is **yes, but not monotonically**: adding
behavioral (C2) and then control-flow (C3) guidance does improve
refactoring quality over the source-only prompt (C1), while adding a
mutation-survivor summary (C4) degrades the measured mutation score and
inflates code size. The best tradeoff observed in this campaign is C3.

M4 is therefore closed with:

- a stable C0 baseline with a curated 70-test M3 suite,
- four LLM-driven variants (C1–C4) reproducible from committed prompts,
- a uniform matrix comparing all five variants on compile, test pass/fail,
  coverage, mutation, smells, LOC and complexity,
- a written interpretation that supports C3 as the strongest variant, and
- a reproducible pipeline (GitHub Actions + Maven + JaCoCo + PIT).

## 10. Deliverables

**Repository layout (key artifacts)**

- `classes.txt`: `org.apache.avro.Schema`
- Schema source (per branch):
  `lang/java/avro/src/main/java/org/apache/avro/Schema.java`
- M3 test suites (per branch):
  `lang/java/avro/src/test/java/org/apache/avro/SchemaM3*Test.java`
- Evidence (per variant):
  `evidence/c0/`, `evidence/c1/`, `evidence/c2/`, `evidence/c3/`, `evidence/c4/`
- Prompts:
  `prompts/c0/`, `prompts/c1/`, `prompts/c2/`, `prompts/c3/`, `prompts/c4/`
- CI: `.github/workflows/m3-ci.yml`
- Helper scripts: `scripts/run-schema-pitest.ps1`,
  `scripts/run-schema-randoop.ps1`, `scripts/verify-schema-m3.ps1`
- Consolidated analysis: `docs/m3-schema-variant-matrix.md`,
  `docs/m3-schema-results-interpretation.md`
- This report: `docs/m4-final-report.md`

**Branches**

- `m3-c0-schema` (baseline), `m3-c1-schema`, `m3-c2-schema`, `m3-c3-schema`,
  `m3-c4-schema`, with sibling `*-legacy-1.8` branches kept for toolchain
  robustness.

## Appendix A — Category partition excerpt (C0 BB seed)

The Category Partition used to seed `SchemaM3BBTest` covers:

- factory methods: `create(Type)`, `createRecord(name, doc, namespace,
  isError)`, `createUnion(types)`, `createEnum(name, doc, namespace,
  symbols)`, `createFixed(name, doc, namespace, size)`, `createMap(values)`,
  `createArray(elementType)`
- record lifecycle: `setFields(fields)` (including double-call and null),
  `getField(name)` (including missing-name and non-record)
- deprecated API: `parse(String)` and `parse(File)` for well-formed,
  malformed and null inputs
- equality and representation: `equals(...)` vs non-`Schema` and vs
  structurally different schemas; `toString()` roundtrip expectations
- internal constraints: duplicate symbol detection, duplicate union member
  detection, invalid names, nested union rejection

## Appendix B — Prompt skeleton used for C1–C4

```text
Refactor org.apache.avro.Schema in a behavior-preserving way.

Constraints:
- Do not change the public API unless a change is strictly required to preserve compilation.
- Preserve externally observable behavior.
- Reduce local implementation smell in branch-heavy internal logic.
- Keep the code compilable on Java 8.
- Do not modify test sources.
- Prefer extracting private helpers over rewriting validated public contracts.
- Return only the new Schema.java source.

Context files supplied verbatim to the model:
- lang/java/avro/src/main/java/org/apache/avro/Schema.java
[C2+] - lang/java/avro/src/test/java/org/apache/avro/SchemaM3BBTest.java
[C3+] - lang/java/avro/src/test/java/org/apache/avro/SchemaM3CFTest.java
[C4 ] - evidence/c0/mutation-report.md  # mutation-survivor summary
```

The exact per-variant prompts are stored under `prompts/cN/schema_refactor_prompt.md`.

## Appendix C — Reproducibility

**Build the module**

```
mvn -f lang/java/avro/pom.xml -DskipTests clean test
```

**Run the full M3 suite + JaCoCo**

```
mvn -f lang/java/avro/pom.xml clean test jacoco:report
```

**Run PIT on `org.apache.avro.Schema*`**

```
mvn -f lang/java/avro/pom.xml test-compile org.pitest:pitest-maven:mutationCoverage
```

**CI**

The GitHub Actions workflow `.github/workflows/m3-ci.yml` runs the same
Maven commands on Temurin 8 and uploads the JaCoCo and PIT reports as
artifacts on every push and pull request.
