# LOC and Complexity

Methodology:

- `TotalLOC`: physical lines in file
- `CodeLOC`: physical lines excluding blank lines and comment-only lines
- `CommentLOC`: lines used for comments and JavaDoc
- `TestMethods`: methods declared as public test/helper methods in the suite
- `HeuristicComplexity`: lightweight decision-point estimate based on Java
  control-flow tokens (`if`, `for`, `while`, `case`, `catch`, `?`, `&&`, `||`)

## Current M3 suite metrics

| File | TotalLOC | CodeLOC | CommentLOC | TestMethods | HeuristicComplexity |
| --- | ---: | ---: | ---: | ---: | ---: |
| `SchemaM3BBTest.java` | 267 | 137 | 94 | 18 | 10 |
| `SchemaM3CFTest.java` | 302 | 134 | 125 | 17 | 14 |
| `SchemaM3CoverageTest.java` | 161 | 81 | 56 | 11 | 9 |
| `SchemaM3LLMTest.java` | 141 | 71 | 49 | 8 | 4 |
| `SchemaM3MutationTest.java` | 246 | 131 | 79 | 16 | 5 |

## Aggregate view

| Aggregate metric | Value |
| --- | ---: |
| Number of executable M3 suite files | 5 |
| Total physical LOC across current suites | 1117 |
| Total code LOC across current suites | 554 |
| Total comment/JavaDoc LOC across current suites | 403 |
| Total current M3 tests | 70 |
| Maximum per-file heuristic complexity | 14 |

Interpretation:

- The suites are documentation-rich, which is expected after the explicit
  requirement to provide class-level and method-level JavaDoc.
- The complexity profile remains low for test code, and no suite approaches a
  level compatible with a god-file smell.
- `SchemaM3CFTest.java` is the densest file from a control-flow perspective,
  which is consistent with its purpose and still acceptable at this scale.
