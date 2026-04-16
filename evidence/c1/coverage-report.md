# Coverage Report

Command executed:

```text
mvn -f C:\Users\matte\IdeaProjects\avro\lang\java\avro\pom.xml clean test jacoco:report
```

Overall execution result:

- Status: `SUCCESS`
- Total M3 tests run: `70`
- JaCoCo HTML/XML/CSV generated successfully
- Raw log: `logs/coverage-report.log`

## `org.apache.avro.Schema` coverage summary

Source of numbers: `lang/java/avro/target/site/jacoco/jacoco.csv`

| Metric | Covered | Missed | Coverage |
| --- | ---: | ---: | ---: |
| Instructions | 1169 | 660 | 63.91% |
| Branches | 115 | 82 | 58.38% |
| Lines | 224 | 104 | 68.29% |
| Methods | 48 | 19 | 71.64% |
| Complexity | 92 | 81 | 53.18% |

## C0 to C1 reading guide

Compared with the C0 baseline:

- the refactoring extracts internal helper methods, so method and line totals
  change even though the public behavior is preserved
- therefore the percentages are informative, but not perfectly apples-to-apples
  with C0

Still, the C1 numbers show that the refactored implementation remains well
exercised by the same regression suite and slightly improves the measurable
coverage surface of `Schema`.

Generated artifact:

- `lang/java/avro/target/site/jacoco/index.html`
