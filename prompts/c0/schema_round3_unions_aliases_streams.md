# C0 Prompt Round 3: Unions, Aliases and Streams

```text
Generate JUnit 4 tests for org.apache.avro.Schema.

Constraints:
- Do not modify production code.
- Generate only compilable tests.
- Prefer deterministic tests.
- Cover nominal, boundary, and invalid-input cases.
- Avoid unnecessary mocking.
- Keep package visibility constraints valid.
- Use package org.apache.avro.
- Return only Java test code.

Class under test:
- lang/java/avro/src/main/java/org/apache/avro/Schema.java

Focus methods:
- createUnion(...)
- addAlias(...)
- applyAliases(...)
- createEnum(...)
- createFixed(...)
- Parser.parse(InputStream)

Category-partition constraints:
- union with distinct branches vs duplicate primitive branches
- union with duplicate named branches vs nested union branches
- valid alias vs invalid alias
- alias rewrite on record, enum and fixed schemas
- parser input stream on valid JSON vs malformed alias metadata

Testing style requirements:
- no mocks unless strictly required
- prefer explicit schema literals over generated helpers
- tests must be readable in about 10 lines of body
- each test must name the regression it protects
```
