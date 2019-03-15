@ActivateSegment
Feature: Feature for ExampleSparkJobIvan

  Scenario Outline:  Test example Ivan
    Given varx1 is <Var1> and varx2 is <Var2> values
    When make the sum Varx1 and Varx2
    Then result is <Result>

    Examples:
      |Var1 | Var2 | Result |
      |  5  |   6  |   11   |
