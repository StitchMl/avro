# M3 Schema Variant Matrix

This matrix consolidates the quality results for the five campaign variants:

- `C0` baseline on `m3-c0-schema`
- `C1` refactor guided by source only
- `C2` refactor guided by source + BB suite
- `C3` refactor guided by source + BB + CF suites
- `C4` refactor guided by source + BB + CF + mutation-survivor summary

## Sources

Behavioral and quality outcomes are taken from the branch-specific evidence
directories:

- `m3-c0-schema:evidence/c0/*`
- `m3-c1-schema:evidence/c1/*`
- `m3-c2-schema:evidence/c2/*`
- `m3-c3-schema:evidence/c3/*`
- `m3-c4-schema:evidence/c4/*`

`LOC delta` and `Complexity delta` are recomputed uniformly from
`lang/java/avro/src/main/java/org/apache/avro/Schema.java` on each branch, so
the deltas are directly comparable against the C0 baseline.

## Matrix

| Variant | Compile | BB | Random | LLM | Coverage | CF | Mutation | Smells | LOC delta | Complexity delta |
| ------- | ------- | -- | ------ | --- | -------- | -- | -------- | ------ | -----: | -----------: |
| `C0` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `47%` (`TS 78%`) | No severe test smells; residual gaps in alias/parsing behavior | `+0` | `+0` |
| `C1` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 78%`) | Parsing hotspot smell reduced; residual large-file smell remains | `+89` | `-3` |
| `C2` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 78%`) | BB-relevant hotspots simplified; residual large-file smell remains | `+27` | `+0` |
| `C3` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `48%` (`TS 79%`) | Branch-heavy hotspots simplified; residual large-file smell remains | `+42` | `+0` |
| `C4` | `PASS` | `PASS` | `N/A` | `PASS` | `PASS` | `PASS` | `45%` (`TS 78%`) | Alias/parsing hotspots decomposed; residual large-file smell remains and size tradeoff increases | `+132` | `+0` |

## Reading the matrix

- All variants compile successfully on Temurin 8 and preserve the current
  executable M3 suites.
- The accepted random suite is absent from every `C0`-derived branch in the
  final campaign, so the `Random` column is consistently `N/A`.
- The best mutation score is shared by `C1`, `C2` and `C3` at `48%`.
- `C3` achieves the best observed test strength at `79%`, making it the most
  favorable branch when considering branch-sensitive refactoring pressure.
- `C2` is the smallest successful refactor in structural terms (`+27 LOC`),
  which makes it the most conservative behavior-preserving cleanup.
- `C4` is the most explicit survivor-guided cleanup, but it pays the highest
  LOC cost and does not improve PIT outcomes over `C0`.

## Overall assessment

The campaign shows that adding better specifications to the refactoring prompt
does not automatically improve mutation score. In this study:

- `C1` benefits from broad parsing-oriented decomposition
- `C2` provides the leanest BB-guided cleanup
- `C3` offers the best balance between preserved behavior, branch-oriented
  maintainability and mutation resilience
- `C4` improves diagnosability of alias-related internals, but without a
  corresponding test expansion it does not translate that structural gain into a
  better mutation score
