
Feature: Verify Calculator Operations
@addsub
  Scenario Outline: Verify addition and subtraction  of two numbers
    Given I am on Calculator page
    When I enter number <number>
    And I click on operator '<operator>'
    And I enter number <number1>
    Then I verify the result as <expectedResult>
    Examples:
      | number | operator | number1 | expectedResult |
      | 5      | +        | 2       | 7              |
      | 9      | -        | 3       | 6              |

@muldiv
  Scenario Outline: Verify multiplication and division  of two numbers
    Given I am on Calculator page
    When I enter number <number>
    And I click on operator '<operator>'
    And I enter number <number1>
    Then I verify the result as <expectedResult>
    Examples:
      | number | operator | number1 | expectedResult |
      | 6      | *        | 4       | 24             |
      | 2      | /        | 2       | 1              |