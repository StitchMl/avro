# C1 Refactoring Prompt for `org.apache.avro.Schema`

Use this prompt to request a behavior-preserving refactor of
`org.apache.avro.Schema` on branch `m3-c1-schema`.

## Context supplied to the model

**C1 context = source only + smell diagnostics (no test suites).**

---

## Smell diagnostics for `org.apache.avro.Schema` @ `release-1.5.4`

The following smell analysis was extracted from the class-level dataset built
in Milestones 1–2 (`avro_dataset_class.csv`, row `org.apache.avro.Schema`,
release `release-1.5.4`):

| Metric | Value |
| --- | --- |
| LOC | 1359 |
| StmtCount | 392 |
| Cyclomatic complexity | 136 |
| Cognitive complexity | 65 |
| MaxNestingDepth | 9 |
| CodeSmells (total) | 84 |
| NSmells | 87 |
| SmellDensity | 0.0640 |
| `isLongMethod` | **true** |
| `isGodClass` | **true** |
| `isFeatureEnvy` | **true** |
| `isDuplicatedCode` | false |

Active smells:

- **God class** — `Schema.java` handles construction, validation, aliasing,
  parsing, serialization and named-type registration in one file.
- **Long method** — `parse(JsonNode, Names)` and several factory helpers
  concentrate multi-step dispatch in single large method bodies. The parsing
  subsystem accounts for a disproportionate fraction of the 136-point
  cyclomatic total.
- **Feature envy** — Several inner-class methods access state of `Names` and
  `Field` more than their own class, suggesting misplaced responsibilities.

---

## Prompt

```text
Refactor the following Java class in a behavior-preserving way.

Context supplied:
- Full source of lang/java/avro/src/main/java/org/apache/avro/Schema.java
- Smell diagnostics (see above): God class (isGodClass=true), Long method
  (isLongMethod=true), Feature envy (isFeatureEnvy=true), Cyclomatic=136,
  LOC=1359, NSmells=87

Constraints:
- Use only the source and the smell diagnostics above as input context.
  No test suites are provided for this variant.
- Preserve the externally observable behavior of org.apache.avro.Schema.
- Reduce the smell footprint: decompose the god-class parsing subsystem,
  shorten the longest methods, and move misplaced responsibilities.
- Do not introduce unnecessary public API changes.
- Do not change public behavior unless strictly required to preserve correctness.
- Keep the code compilable on Java 8.
- Return only the complete refactored Java source for Schema.java.
- Do not add tests, prose, review notes, or extra files.
```

---

## Files to paste verbatim into the model session

1. `lang/java/avro/src/main/java/org/apache/avro/Schema.java` (full source)
2. The smell-diagnostics table above
