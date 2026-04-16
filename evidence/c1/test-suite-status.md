# Test Suite Status

Command family used:

```text
mvn -f C:\Users\matte\IdeaProjects\avro\lang\java\avro\pom.xml -Dtest=<SuiteName> test
```

## Current C1 suites

| Suite | Presence on branch | Result | Evidence |
| --- | --- | --- | --- |
| `SchemaM3BBTest` | Present | `PASS` (`18/18`) | `logs/bb-status.log` |
| `SchemaM3RandomTest` | Absent | `N/A` | `logs/random-status.log` reports no matching tests |
| `SchemaM3LLMTest` | Present | `PASS` (`8/8`) | `logs/llm-status.log` |
| `SchemaM3CFTest` | Present | `PASS` (`17/17`) | `logs/cf-status.log` |
| `SchemaM3CoverageTest` | Present | `PASS` (`11/11`) | `logs/coverage-suite-status.log` |
| `SchemaM3MutationTest` | Present | `PASS` (`16/16`) | `logs/mutation-suite-status.log` |

## Aggregate execution status

- Full current M3 suite executed by `mvn clean test jacoco:report`
- Result: `PASS`
- Total tests run on this branch: `70`
- Failures: `0`
- Errors: `0`
- Skipped: `0`

Notes:

- The random suite is not part of the checked-in C1 source tree, therefore its
  status is recorded as `N/A` rather than as a passing or failing suite.
- The behavior-preserving refactor did not break any executable M3 suite on the
  branch.
