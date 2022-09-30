Feature: Basic Calculator
  As a user I want to use the basic functionality of a calculator.
  These functions are:
  * addition
  * subtraction
  * multiplication
  * division

  Scenario: Adding Positive Numbers
    Given the numbers 5 and 7
    When they are added
    Then they should equal 12

  Scenario: Adding Huge! Numbers
    Given the numbers 5000000 and 7000000
    When they are added
    Then they should equal 12000000

  Scenario: Adding Negative Numbers
    Given the numbers -5 and -7
    When they are added
    Then they should equal -12

