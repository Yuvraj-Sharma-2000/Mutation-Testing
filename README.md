# Mutation-Testing
Applied mutation testing on coding questions of top tech companies like -
### Amazon
### Intuit
### Google
### Adobe
### Walmart
### Golman Sachs
### Microsoft

## Framework 
PiTest :- PIT is a state of the art mutation testing system, providing gold standard test coverage for Java and the jvm. It's fast, scalable and integrates with modern test and build tooling.
JUnit5 :- JUnit 5 is the current generation of the JUnit testing framework, which provides a modern foundation for developer-side testing on the JVM. This includes focusing on Java 8 and above, as well as enabling many different styles of testing.

## What is mutation testing ?
Faults (or mutations) are automatically seeded into your code, then your tests are run. If your tests fail then the mutation is killed, if your tests pass then the mutation lived.
The quality of your tests can be gauged from the percentage of mutations killed.

## Mutators Applied

1. CONDITIONALS_BOUNDARY: Modifies boundaries in conditional statements (e.g.,
changing < to <= or > to >=) to test boundary conditions.
2. INCREMENTS: Alters increment/decrement operations (e.g., ++ to --) to assess the impact
on arithmetic operations.
3. INVERT_NEGS: Inverts unary negation (e.g., -x to +x) to examine the impact on arithmetic
and logic.
4. MATH: Modifies arithmetic operations (e.g., + to -) to test mathematical calculations and their
effects.
5. NON_VOID_METHOD_CALLS: Converts method calls expecting a return value to void to
evaluate handling of returned data.
6. VOID_METHOD_CALLS: Converts void method calls to non-void to test handling of side
effects and returned data in code.
7. EXPERIMENTAL_ARGUMENT_PROPAGATION: Modifies method arguments to evaluate
how changes propagate within the code.
8. EXPERIMENTAL_NAKED_RECEIVER:Manipulates method calls without their object
references to test method independence.

## Results

We analyze the mutation score and the nature of survived mutants to identify weaknesses in
the test suite.We also identify patterns in the types of mutations that were survived, indicating
potential areas of improvement in test coverage or test quality.

![image](https://github.com/Yuvraj-Sharma-2000/Mutation-Testing/assets/111169758/ccfcc3cf-7571-4426-9e5a-46db14c8095c)


## Contributions

Yuvraj Sharma - Amazon , Intuit , Goldman Sachs , Microsoft (Solution and Testcase Generation for Maximum Coverage)
Samir Ahmed Ghouri - Google , Adobe , Walmart (Solution and Testcase Generation for Maximum Coverage)
