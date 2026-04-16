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
| Mutations generated | 450 |
| Mutations killed | 211 |
| Mutation score | 47% |
| Mutations with no coverage | 179 |
| Test strength | 78% |
| Mutated-class line coverage | 468 / 700 (67%) |
| Tests examined by PIT | 5 |
| Tests executed during mutation analysis | 697 |

## Top-level `Schema` diagnostic subset

Source of numbers: `lang/java/avro/target/pit-reports/mutations.csv`, filtered on
`org.apache.avro.Schema`.

| Status | Count |
| --- | ---: |
| `KILLED` | 106 |
| `SURVIVED` | 8 |
| `NO_COVERAGE` | 41 |

Most recurrent surviving methods in the top-level class:

| Method | Survived mutations |
| --- | ---: |
| `applyAliases` | 3 |
| `parse` | 2 |
| `hashCode` | 2 |
| `parseAliases` | 1 |

Most recurrent no-coverage methods in the top-level class:

| Method | No-coverage mutations |
| --- | ---: |
| `applyAliases` | 10 |
| `getAliases` | 9 |
| `parse` | 6 |
| `getFieldAlias` | 5 |
| `toJson` | 4 |
| `create` | 4 |

Interpretation:

- The baseline suite kills a meaningful portion of high-value mutants, but the
  mutation score shows that alias handling and parsing branches still dominate
  the residual risk.
- The top-level diagnostics are useful for prioritizing future mutation-driven
  additions without chasing every surviving mutant.
