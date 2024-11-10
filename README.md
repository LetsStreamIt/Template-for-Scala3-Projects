# Template-for-Scala3-Projects

This is a template repository for kickstarting the development of Scala3 projects

## Requirements

- [sbt](https://www.scala-sbt.org/)
- [Scala 3](https://dotty.epfl.ch/)
- [npm](https://www.npmjs.com/)
- [node.js](https://nodejs.org/)

## Usage

### Run the project

```bash
sbt run
```

### Run the tests

```bash
sbt test
```

### Code formatting

**Check formatting**:

```bash
sbt scalafmtCheckAll
```

**Format code**:

```bash
sbt scalafmtAll
```

### Code linting

```bash
sbt scalafixAll
```

## Git hooks

The template comprises also two Git hooks, if at least one of these fails, a Git commit is not produced:

- `pre-commit` hook verifies that tests, code format and linter checks complete successfully before applying the commit;
- `commit-msg` ensures that the commit message follows the [Conventional Commit](https://www.conventionalcommits.org/en/v1.0.0/) specification.

## CI/CD

Navigate to the _Let's Stream It_ report to see the details of the CI/CD pipeline: [Report link](https://letsstreamit.github.io/documentation/report/devops/#version-control).
