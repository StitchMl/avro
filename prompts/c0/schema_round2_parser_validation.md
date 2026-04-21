# C0 Prompt Round 2: Parser and Validation

```text
Generate JUnit 4 tests for org.apache.avro.Schema and org.apache.avro.Schema.Parser.

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
- parse(...)
- new Schema.Parser().parse(...)
- new Schema.Parser().setValidate(...)
- addTypes(...)

Category-partition constraints:
- valid schema text vs malformed schema text
- validation enabled vs validation disabled
- named type present in parser state vs missing named type
- valid alias metadata vs malformed alias metadata
- file/text/input-stream based parsing entry points

Testing style requirements:
- keep tests self-contained
- use temporary files only when the API requires files
- no random inputs
- assert the specific behavior protected by each test
```
