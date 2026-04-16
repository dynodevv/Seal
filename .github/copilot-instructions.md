# Copilot instructions for Seal

## Project overview
- Seal is an Android project built with Gradle Kotlin DSL.
- Main modules:
  - `:app` (application)
  - `:color` (library)

## Environment and build
- Use Java 21 for Gradle commands.
- Prefer the Gradle wrapper (`./gradlew`) for all tasks.
- Keep changes minimal and scoped to the requested task.

## Validation commands
- Primary CI-aligned build:
  - `./gradlew buildGenericRelease`
- Common local validation:
  - `./gradlew testGenericReleaseUnitTest`
  - `./gradlew lintGenericRelease`

## Code and contribution expectations
- Do not change unrelated files or refactor broadly unless requested.
- Follow existing Kotlin and Compose patterns already used in nearby code.
- Avoid introducing new dependencies unless required for the task.
- If lint reports unrelated existing issues, do not fix them unless they are part of the requested change.
