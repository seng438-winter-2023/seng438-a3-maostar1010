**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \#:      |  14   |
| -------------- | --- |
| Student Names: |   Mary  |
|                |   Nicola  |
|                |   Tyler  |
|                |   Jaxon  |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1 Introduction

In this lab, we will be running coverage tests on the test suite developed in the previous lab. First, we will collect various coverage data such as line, branch, and method coverage. Eclipse and EclEmma will be used to collect the coverage information. Using this coverage information, we will use white box testing techniques to go back and refine the test suite in order to meet the minimum coverage requirements. To remain consistent with the previous lab, we will again be using JUnit 4 to write and run our software tests. 

# 2 Manual data-flow coverage calculations for X and Y methods

## 2.1 Contains - method from Range

### 2.1.1 Def-use Sets

| Line \#:      |  Code   | Def-use sets |
| -------------- | --- | |
| 1 |   public boolean contains(double value) { | Def(1) = {value} |
|  2              |   if (value < this.lower) { | Use(2) = {value, this.lower} |
|   3             |   return false;  | - |
|    4            |   }  | Use(5) = {value, this.upper} |
|    5            |   if (value  > this.upper) { | - |
|    6            |   return false; | - |
|    7            |   }  | - |
|    8            |   return (value >= this.lower && value <= this.upper);  | Use(8) = {value, this.lower, this.upper} |
|    9            |   }  | - |

# 3 A detailed description of the testing strategy for the new unit test

Text…

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

Text…

# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

Text…

# 6 Pros and Cons of coverage tools used and Metrics you report

Text…

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

Text…

# 8 A discussion on how the team work/effort was divided and managed

Text…

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Text…

# 10 Comments/feedback on the lab itself

Text…
