# C0 Prompt Round 1: Records and Named Types

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
- create(Schema.Type)
- createRecord(...)
- setFields(...)
- getField(...)
- equals(...)
- toString(...)

Category-partition constraints:
- primitive type vs complex type in create(Type)
- named record vs anonymous record
- setFields called once vs twice
- record lookup on existing field vs missing field vs non-record schema
- equal schemas vs different schemas vs non-schema comparison

Testing style requirements:
- one behavior per test
- descriptive test names
- no helper mocking
- no randomized values
```
