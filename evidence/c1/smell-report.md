# Smell Report

Scope reviewed:

- `lang/java/avro/src/main/java/org/apache/avro/Schema.java`

Review method:

- direct code inspection of the C1 refactoring
- diff inspection against `m3-c0-schema`
- cross-check with compilation, regression, coverage and mutation results

## Findings

### Reduced long-method smell in the parsing hotspot

In C0, `parse(JsonNode, Names)` concentrated dispatch, metadata extraction,
field parsing, property copying and alias attachment in one large method body.
In C1, this responsibility is decomposed into dedicated private helpers, which
substantially lowers the cognitive load of the dispatcher itself.

### Reduced duplicated parsing logic

The refactoring removes repeated loops for copying JSON properties into schema
and field properties by centralizing them in `addProperties(...)`. This is a
useful smell reduction because the reserved-property filter now lives in one
place instead of being repeated across parsing branches.

### Reduced mixed-responsibility smell

Named-schema context creation is now explicit through `ParseContext`, while
record, enum, array, map, fixed and union parsing have dedicated helper
methods. The file still contains multiple nested classes because that is part
of Avro's original design, but the parsing subsystem is less entangled.

### No public API churn introduced

No public or protected method signature changes were detected relative to
`m3-c0-schema`. This is important because the C1 goal was refactoring, not
behavioral redesign.

### Residual large-file smell remains

`Schema.java` is still a large file in absolute terms. The C1 work does not
eliminate that baseline characteristic, and the file becomes slightly longer in
physical LOC due to helper extraction. However, this is not a new god-file
generation; it is a controlled decomposition inside an already large class.

### Behavioral risk contained by regression suite

All executable M3 suites pass after the refactoring, and the mutation score does
not regress. This materially lowers the risk that the internal restructuring
altered externally observable behavior.

## Overall assessment

The C1 refactoring achieves a real smell reduction at the method and subsystem
level, especially around parsing. The main residual issue is the inherent size
of `Schema.java`, which predates the refactoring and is only partially mitigated
by the new helper structure.
