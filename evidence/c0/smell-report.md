# Smell Report — C0 Baseline

---

## Part 1 — Production class: `org.apache.avro.Schema`

Scope: `lang/java/avro/src/main/java/org/apache/avro/Schema.java`  
Release baseline: `release-1.5.4`  
Source of metrics: class-level dataset from Milestones 1–2 (`avro_dataset_class.csv`)

### Static metrics at C0

| Metric | Value |
| --- | ---: |
| LOC | 1359 |
| StmtCount | 392 |
| Cyclomatic complexity | 136 |
| Cognitive complexity | 65 |
| MaxNestingDepth | 9 |
| CodeSmells (total) | 84 |
| NSmells | 87 |
| SmellDensity | 0.0640 |

### Smell flags

| Smell | Present |
| --- | --- |
| `isLongMethod` | **yes** |
| `isGodClass` | **yes** |
| `isFeatureEnvy` | **yes** |
| `isDuplicatedCode` | no |

### Commentary

`Schema.java` exhibits three active smell flags at the C0 baseline:

- **God class** — The class manages schema construction, validation, aliasing,
  parsing, serialization, and named-type registration in a single compilation
  unit. All four variant-prompt contexts (C1–C4) target this entanglement.
- **Long method** — `parse(JsonNode, Names)` and several factory helpers
  concentrate multiple responsibilities in long method bodies with high
  cyclomatic complexity. The parsing subsystem alone accounts for a
  disproportionate share of the 136-point cyclomatic total.
- **Feature envy** — Several inner-class methods access fields of `Names`
  and `Field` more heavily than their own class state, suggesting misplaced
  responsibilities.

These findings directly motivated the four LLM-assisted refactoring variants
(C1–C4). The smell diagnostics were supplied verbatim to the LLM as context
in the C1 prompt so that the model had an explicit quality target beyond
"preserve behavior".

---

## Part 2 — Test suites: M3 regression code

Scope reviewed:

- `SchemaM3BBTest.java`
- `SchemaM3RandomTest.java`
- `SchemaM3LLMTest.java`
- `SchemaM3CoverageTest.java`
- `SchemaM3CFTest.java`
- `SchemaM3MutationTest.java`
- `SchemaM3IT.java`

Review method:

- Manual inspection of all suites
- Cross-check with file size and heuristic complexity metrics
- Verification of class-level and method-level JavaDoc presence

### No god class / god file smell detected

- The largest suite is `SchemaM3CFTest.java` at 302 physical lines.
- No suite file exceeds a level compatible with a god-file smell.

### No severe assertion roulette detected

- Test names are explicit and requirement-oriented.
- Assertions are grouped around a single behavioral property per test.
- Multi-assert tests describe one coherent public contract.

### No severe mystery guest smell detected

- No hidden shared fixture or opaque external dependency.
- File-based interactions (e.g., `it08` in `SchemaM3IT`) create their
  resources locally inside the test body.

### Low fixture coupling

- Suites rely on small helpers or direct API calls instead of broad mutable
  fixtures.
- No class-level mutable `@Before` setup that obscures the state under test.

### Moderate intentional duplication across techniques

- Some overlap exists between BB, CF, coverage-guided and mutation suites.
- This overlap is driven by different adequacy criteria, not copy-paste growth,
  and is methodologically acceptable.

### Documentation quality satisfied

- Every M3 test class has class-level JavaDoc.
- Every test method has method-level JavaDoc stating the protected behavior.

### Integration suite smell assessment

- `SchemaM3IT` uses `@RunWith(MockitoJUnitRunner.class)` and Mockito
  `spy()`/`mock()` appropriately.
- No excessive stubbing: mocks are used only for contract verification
  (`never().close()`, `verifyZeroInteractions`) or default-value injection.
- The real-file test (`it08`) uses a temp-file scoped within the test body
  with `deleteOnExit()`; no mystery guest.

---

## Overall assessment

The production class `Schema.java` exhibits three active smells (god class,
long method, feature envy) that provided the refactoring motivation for C1–C4.
The M3 test code does not exhibit high-severity smells. The primary quality
risk in the test suite is moderate intentional duplication across techniques,
which is expected and should be monitored during future increments.
