<p align="center"> <img src="/clonecorp.png" width="200" height="200" /> </p>

# CloneCorp

Data corpus for the evaluation of cross-language clone detection algorithms.
The corpus is divided into four datasets:

- Clone scenarios (taken from teh BigCloneBench)
- Basic language features
- Sorting Algorithms
- Mobile apps

## Clone Scenarios

This dataset presents the 4 original clone scenarios from BigCloneBench (with its versions, for a total of 18 scenarios), extended with implementation of the scenarios in different programming languages (C/C++, Dart, Java, JavaScript, Kotlin, Modula-2, Swift, Scheme).

## Basic Language Features

This dataset contains basic implementations for the main language features for different programming languages (e.g., conditionlas, loop structures, objects, etc).

The dataset contains 7 features evaluated in the mobile app languages (kotlin, dart, swift, with additional implementations in c++, java).

## Sorting Algorithms

This dataset consist of 7 sorting algorithms extracted from rosetacode.org. The algorithms are implemented in c++, dart, kotlin, java, and swift.

## Mobile Apps

This dataset is further divided into two sets.

### Student projects

The first part is built from a set of course work projects created for the capstone course at Univerisdad de los Andes. All projects are extracted from public GitLab and GitHub repositories.

This dataset contains 43 applications with 86 repositories combining dart-kotlin, kotlin-swift, or dart-swift versions of the app.

### GitHub projects

The second part of the mobile apps comes from repositories mined from GitHub. The repositories are based on the owner organization/developer for the repositories. The names of the repositories are required to be the same name (with the -androd, -ios, -flutter tag).

This dataset contains 58 applications with 149 repositories combining dart-kotlin, kotlin-swift, dart-swift, or all three versions of the apps.

## Currently supported languages

- C/C++
- Dart
- Java
- JavaScript
- Kotlin
- Modula-2
- Swift
- Scheme
