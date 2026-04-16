# Test Suite Status

Command family used:

```text
mvn -f C:\Users\matte\IdeaProjects\avro\lang\java\avro\pom.xml -Dtest=<SuiteName> test
```

## Requested C0 suites

| Suite | Presence on branch | Result | Evidence |
| --- | --- | --- | --- |
| `SchemaM3BBTest` | Present | `PASS` (`18/18`) | `logs/bb-status.log` |
| `SchemaM3RandomTest` | Absent | `N/A` | file not present in `src/test/java/org/apache/avro` |
| `SchemaM3LLMTest` | Present | `PASS` (`8/8`) | `logs/llm-status.log` |
| `SchemaM3CoverageTest` | Present | `PASS` (`11/11`) | `logs/coverage-suite-status.log` |
| `SchemaM3MutationTest` | Present | `PASS` (`16/16`) | `logs/mutation-suite-status.log` |

## Additional M3 suite currently present on this branch

| Suite | Result | Evidence |
| --- | --- | --- |
| `SchemaM3CFTest` | `PASS` (`17/17`) | `logs/cf-suite-status.log` |

## Aggregate execution status

- Full current M3 suite executed by `mvn clean test jacoco:report`
- Result: `PASS`
- Total tests run on this branch: `70`
- Failures: `0`
- Errors: `0`
- Skipped: `0`

Notes:

- The branch `m3-c0-schema` currently contains five executable M3 suites.
- The Surefire configuration still accepts `*M3RandomTest.java`, but there is
  no accepted random suite file on this branch at the time of baseline capture.
