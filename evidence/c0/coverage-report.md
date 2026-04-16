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
| Instructions | 1087 | 662 | 62.15% |
| Branches | 115 | 86 | 57.21% |
| Lines | 208 | 104 | 66.67% |
| Methods | 32 | 18 | 64.00% |
| Complexity | 75 | 83 | 47.47% |

Interpretation:

- Line coverage is solid enough to support subsequent targeted refactoring.
- Branch coverage remains the more relevant gap, which is coherent with a class
  rich in validation paths and named-type special cases.
- The complexity coverage value confirms that several decision-heavy paths are
  still only partially exercised.

Generated artifact:

- `lang/java/avro/target/site/jacoco/index.html`
