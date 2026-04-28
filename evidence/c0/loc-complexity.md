# LOC and Complexity

Methodology:

- `TotalLOC`: physical lines in file
- `CodeLOC`: physical lines excluding blank lines and comment-only lines
- `CommentLOC`: lines used for comments and JavaDoc
- `TestMethods`: methods declared as public test/helper methods in the suite
- `HeuristicComplexity`: lightweight decision-point estimate based on Java
  control-flow tokens (`if`, `for`, `while`, `case`, `catch`, `?`, `&&`, `||`)

## Current M3 suite metrics

| File | Runner | TotalLOC | CodeLOC | CommentLOC | TestMethods | HeuristicComplexity |
| --- | --- | ---: | ---: | ---: | ---: | ---: |
| `SchemaM3BBTest.java` | Surefire | 267 | 137 | 94 | 18 | 10 |
| `SchemaM3RandomTest.java` | Surefire | 238 | 87 | 113 | 12 | 0 |
| `SchemaM3LLMTest.java` | Surefire | 141 | 71 | 49 | 8 | 4 |
| `SchemaM3CoverageTest.java` | Surefire | 161 | 81 | 56 | 11 | 9 |
| `SchemaM3CFTest.java` | Surefire | 302 | 134 | 125 | 17 | 14 |
| `SchemaM3MutationTest.java` | Surefire | 246 | 131 | 79 | 16 | 5 |
| `SchemaM3IT.java` | Failsafe | 283 | 143 | 108 | 8 | 2 |

## Aggregate view

| Aggregate metric | Value |
| --- | ---: |
| Number of Surefire (unit) suite files | 6 |
| Number of Failsafe (integration) suite files | 1 |
| Total physical LOC across all suites | 1638 |
| Total code LOC across all suites | 784 |
| Total comment/JavaDoc LOC across all suites | 624 |
| Total Surefire (unit) tests | 82 |
| Total Failsafe (integration) tests | 8 |
| Total M3 tests | 90 |
| Maximum per-file heuristic complexity | 14 |

Interpretation:

- The suites are documentation-rich, which is expected after the explicit
  requirement to provide class-level and method-level JavaDoc.
- The complexity profile remains low for test code, and no suite approaches a
  level compatible with a god-file smell.
- `SchemaM3CFTest.java` is the densest file from a control-flow perspective,
  which is consistent with its purpose and still acceptable at this scale.
- `SchemaM3RandomTest.java` has zero heuristic complexity, which is expected
  for a Randoop-style regression suite with no conditional logic.
- `SchemaM3IT.java` has minimal complexity (2 points from the `try`/`finally`
  block in `it08`), consistent with its role as a Mockito interaction-contract
  suite rather than a branch-coverage suite.
