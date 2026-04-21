# M3 Schema Results Interpretation

This document interprets the comparison matrix in
[m3-schema-variant-matrix.md](/C:/Users/matte/IdeaProjects/avro/docs/m3-schema-variant-matrix.md:1)
and answers the key analytical questions for variants `C0` to `C4`.

## Premise

The main empirical facts are stable across the campaign:

- every variant compiles on Temurin 8
- every variant passes the current executable M3 suites (`BB`, `LLM`,
  `Coverage-guided`, `CF`, `Mutation`)
- the accepted random suite is absent from the final `C0`-derived branches, so
  `Random` is consistently `N/A`

This means the interpretation must focus less on binary pass/fail and more on
the tradeoff between:

- structural invasiveness
- smell reduction
- mutation robustness
- size and complexity growth

## Question 1: Does C1 break more easily?

**Answer: not according to the measured test evidence, but it is more invasive
than the best alternatives.**

Evidence:

- `C1` passes all executable suites, exactly like `C2`, `C3` and `C4`
- `C1` improves mutation score from `47%` to `48%`
- `C1` is the broadest structural decomposition of the parsing subsystem
- `C1` grows `Schema.java` by `+89` LOC, which is larger than `C2` (`+27`) and
  `C3` (`+42`)

Interpretation:

- There is no observed fragility in the available regression data.
- However, `C1` touches a wider parsing surface than `C2` and `C3`, so it is
  less conservative from a change-risk perspective.
- In other words, `C1` does **not** empirically break more easily, but it
  requires a larger trust leap than the more focused refactorings.

## Question 2: Does C2 protect better than C1?

**Answer: yes, if "protect better" means achieving the same external safety
with less structural disruption.**

Evidence:

- `C1` mutation score: `48%`
- `C2` mutation score: `48%`
- `C1` test strength: `78%`
- `C2` test strength: `78%`
- `C1` LOC delta: `+89`
- `C2` LOC delta: `+27`
- `C1` reduces heuristic complexity by `-3`
- `C2` keeps heuristic complexity unchanged

Interpretation:

- `C2` matches `C1` on all pass/fail outcomes and on global mutation score.
- `C2` obtains that result with a much smaller footprint and a more explicit
  focus on BB-relevant contracts (`setFields`, union validation).
- Therefore `C2` is the safer choice if the goal is **behavior preservation
  under minimal intervention**.
- `C1` still has value because it improves the parsing hotspot more deeply, but
  it is not the best protection/per-change tradeoff.

## Question 3: Does C3 improve over C2?

**Answer: yes, slightly but meaningfully.**

Evidence:

- `C2` mutation score: `48%`
- `C3` mutation score: `48%`
- `C2` test strength: `78%`
- `C3` test strength: `79%`
- `C2` LOC delta: `+27`
- `C3` LOC delta: `+42`

Interpretation:

- `C3` preserves all the strengths of `C2` and improves the observed mutation
  test strength by one point.
- The extra cost is modest: `+42` LOC is still far below `C1` and much lower
  than `C4`.
- The smell reports also show that `C3` is the first variant whose cleanup is
  clearly aligned with branch-heavy internals rather than only public-contract
  hotspots.

Conclusion:

- `C3` is a genuine improvement over `C2`, although the improvement is
  incremental rather than dramatic.

## Question 4: Is C4 really the most robust variant?

**Answer: no.**

Evidence:

- `C4` passes all suites, but so do `C1`, `C2` and `C3`
- `C4` mutation score drops to `45%`, below both `C0` (`47%`) and
  `C1`/`C2`/`C3` (`48%`)
- `C4` test strength returns to `78%`, below `C3`
- `C4` has the largest size increase: `+132` LOC
- `C4` does not reduce heuristic complexity (`0` delta)

Interpretation:

- `C4` is the most explicitly survivor-guided refactor, but that does not make
  it the most robust outcome.
- The evidence shows the opposite: `C4` improves diagnosability of alias-related
  internals, yet it does not convert that structural cleanup into stronger
  mutation resistance.
- The helper extraction around alias handling also increases the code surface
  that PIT can mutate, which partly explains the weaker score.

Conclusion:

- `C4` is useful as an exploratory refactoring, not as the strongest final
  candidate.

## Question 5: Did the LLM remove smells without worsening size/complexity?

**Answer: only partially.**

### What improved

- `C1` reduces the long-method smell in parsing and is the only variant that
  also lowers whole-file heuristic complexity (`-3`)
- `C2` and `C3` reduce mixed-responsibility smells in targeted hotspots with
  moderate size growth
- `C4` reduces local long-method and mixed-responsibility smells in alias
  handling

### What did not improve

- none of the variants removes the inherited large-file smell of `Schema.java`
- every refactoring increases physical LOC
- only `C1` lowers complexity at file level; `C2`, `C3` and `C4` leave it
  unchanged
- `C4` is the clearest case where smell reduction comes with a significant size
  penalty and no complexity benefit

Conclusion:

- The LLM **did** remove local smells.
- The LLM **did not** remove smells "for free".
- The best compromise is not the most aggressively decomposed variant, but the
  variant that reduces local smell while keeping the code growth controlled.

## Final synthesis

The results suggest the following ranking:

1. `C3` is the best overall variant.
   It preserves all tests, matches the top mutation score, achieves the best
   test strength and improves branch-heavy internals with moderate growth.
2. `C2` is the best conservative variant.
   It offers almost the same benefits as `C3` with the smallest code growth.
3. `C1` is a valid but broader refactor.
   It improves parsing quality and slightly reduces complexity, but it is more
   invasive than necessary for the observed gain.
4. `C4` is not the strongest final candidate.
   It improves readability of survivor-prone areas, but the evidence does not
   support calling it the most robust variant.

## Recommended statement for the report

An accurate summary for the final report is:

> Increasing the amount of guidance given to the LLM does not monotonically
> improve refactoring quality. In this study, the best result was obtained by
> combining behavioral and control-flow specifications (`C3`), while the
> survivor-guided refactoring (`C4`) improved local readability but did not
> improve mutation robustness.
