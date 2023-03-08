@WIP
Feature: Marketing page filters
  US14: As a user, I want to manage filters on the Marketing page.

  #AC 1: Store and sales managers should see all 5 filter options are checked by default.
  Scenario Outline: managers see default checked filters on the campaigns page
    Given the user logged in as "<userType>"
    When Click the Campaigns under the Marketing
    And Click the Manage filters button
    Then Verify 5 options are checked by default
    Examples:
      | userType      |
      | store manager |
      | sales manager |


#AC 2: any amount of boxes should be unchecked. (can check only 1, or multiple)
  Scenario Outline: managers can uncheck any filter options
    Given the user logged in as "<userType>"
    When Click the Campaigns under the Marketing
    And Click the Manage filters button
    And Uncheck one or more filter options
    Then Verify one or more options are unchecked
    Examples:
      | userType             |
      | store manager |
      | sales manager |