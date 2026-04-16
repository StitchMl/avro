# LOC and Complexity

Scope:

- `lang/java/avro/src/main/java/org/apache/avro/Schema.java`

Methodology:

- `TotalLOC`: physical lines in file
- `CodeLOC`: physical lines excluding blank lines and comment-only lines
- `CommentLOC`: lines used for comments and JavaDoc
- `HeuristicComplexity`: lightweight decision-point estimate based on Java
  control-flow tokens (`if`, `for`, `while`, `case`, `catch`, `?`, `&&`, `||`)
- Method hotspot comparison is reported for `parse(JsonNode, Names)`

## File-level comparison

| Version | TotalLOC | CodeLOC | CommentLOC | HeuristicComplexity |
| --- | ---: | ---: | ---: | ---: |
| `C0` | 1435 | 1123 | 184 | 236 |
| `C1` | 1524 | 1187 | 189 | 233 |

## Parsing hotspot comparison

| Version | Method span | SpanLOC | HeuristicComplexity |
| --- | --- | ---: | ---: |
| `C0` | `parse(JsonNode, Names)` | 117 | 46 |
| `C1` | `parse(JsonNode, Names)` | 9 | 4 |

## Interpretation

- The file becomes slightly longer because complexity is redistributed from one
  monolithic parsing method into multiple explicit helpers.
- The whole-file heuristic complexity decreases marginally (`236` to `233`).
- The main gain is local rather than global: the parsing dispatcher shrinks from
  `117` lines to `9`, and its estimated control-flow complexity drops from `46`
  to `4`.
- This is consistent with a behavior-preserving maintainability refactor rather
  than a redesign of the class responsibilities.
