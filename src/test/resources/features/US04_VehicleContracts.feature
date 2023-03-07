@wip
Feature: Vehicle contracts page accessibility
  US04: As a user, I want to access to Vehicle contracts page
  Background: the user is on the login page for all scenarios
    Given the user is on the login page

  Scenario: Sales manager access the Vehicle contracts page
    When the user logged in as "sales manager"
    When Click the Vehicle contracts under the Fleet
   Then Verify manager can access the Vehicle contracts page

  Scenario: Store manager access the Vehicle contracts page
    When the user logged in as "store manager"
    When Click the Vehicle contracts under the Fleet
    Then Verify manager can access the Vehicle contracts page

  Scenario: Drivers can NOT access the Vehicle contracts page
    When the user logged in as "driver"
    When Click the Vehicle contracts under the Fleet
    Then Verify users see an error message: “You do not have permission to perform this action.”