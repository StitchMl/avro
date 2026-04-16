# Mutation Report

Command executed:

```text
mvn -f C:\Users\matte\IdeaProjects\avro\lang\java\avro\pom.xml test-compile org.pitest:pitest-maven:mutationCoverage
```

Overall execution result:

- Status: `SUCCESS`
- Target scope: `org.apache.avro.Schema*`
- Raw log: `logs/mutation-report.log`
- Generated artifact: `lang/java/avro/target/pit-reports/index.html`

## PIT global summary

Source of numbers: PIT console summary for the configured target scope.

| Metric | Value |
| --- | ---: |
| Mutations generated | 469 |
| Mutations killed | 227 |
| Mutation score | 48% |
| Mutations with no coverage | 179 |
| Test strength | 78% |
| Mutated-class line coverage | 484 / 716 (68%) |
| Tests examined by PIT | 5 |
| Tests executed during mutation analysis | 777 |

## Top-level `Schema` diagnostic subset

Source of numbers: `lang/java/avro/target/pit-reports/mutations.csv`, filtered on
`org.apache.avro.Schema`.

| Status | Count |
| --- | ---: |
| `KILLED` | 122 |
| `SURVIVED` | 11 |
| `NO_COVERAGE` | 41 |

Most recurrent surviving methods in the top-level class:

| Method | Survived mutations |
| --- | ---: |
| `applyAliases` | 3 |
| `parseField` | 2 |
| `parseObjectSchema` | 2 |
| `hashCode` | 2 |
| `parseAliases` | 1 |
| `parseFieldOrder` | 1 |

Most recurrent no-coverage methods in the top-level class:

| Method | No-coverage mutations |
| --- | ---: |
| `applyAliases` | 10 |
| `getAliases` | 9 |
| `getFieldAlias` | 5 |
| `parse` | 4 |
| `toJson` | 4 |
| `create` | 4 |

Interpretation:

- The C1 refactoring preserves and slightly improves the mutation score versus
  the C0 baseline (`48%` vs `47%`).
- The remaining high-value survivors are still concentrated around alias
  rewriting and parsing helper branches, which is consistent with the most
  delicate control flow in the class.
