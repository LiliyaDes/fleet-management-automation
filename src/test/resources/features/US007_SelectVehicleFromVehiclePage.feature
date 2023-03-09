@Mila1
Feature: User should be able to select any vehicle from the Vehicle page
  User Story 7: As a user, I should be able to select any vehicle from the Vehicle page

  Background: User is already in the log in page
    Given the user is on the login page

    # US7 AC1/Test cases 1
  Scenario: Verify that Store manager view unchecked checkboxes on the Vehicle page
    Given the user logged in as "store manager"
    When store manager sees Fleet module name and clicks on it
    Then store manager click on Vehicles dropdown
    And  store manager verify all the checkboxes are unchecked


  Scenario: Verify that Sales manager view unchecked checkboxes on the Vehicle page
    Given the user logged in as "sales manager"
    When sales manager sees Fleet module name and clicks on it
    Then sales manager click on Vehicles dropdown
    And  sales manager verify all the checkboxes are unchecked

    ###############################################################

    # US7 AC2/Test cases 2
  Scenario: Verify that Store manager checks the first checkbox to check all the cars on the Vehicle page
    Given the user logged in as "store manager"
    When store manager sees Fleet module name and clicks on it
    Then store manager click on Vehicles dropdown
    And  store manager click the 1st checkbox in the web-table
    And store manager Verify all the checkboxes also checked


  Scenario: Verify that Sales manager checks the first checkbox to check all the cars on the Vehicle page
    Given the user logged in as "sales manager"
    When sales manager sees Fleet module name and clicks on it
    Then sales manager click on Vehicles dropdown
    And  sales manager click the 1st checkbox in the web-table
    And sales manager Verify all the checkboxes also checked

    ####################################################################

   # US7 AC3/Test Cases 3

  Scenario: Verify that Store manager check any car’s checkbox on the Vehicle page
    Given the user logged in as "store manager"
    When store manager sees Fleet module name and clicks on it
    Then store manager click on Vehicles dropdown
    And  store manager check any car’s checkbox
    And store manager verify the box is checked


  Scenario: Verify that Sales manager check any car’s checkbox on the Vehicle page
    Given the user logged in as "sales manager"
    When sales manager sees Fleet module name and clicks on it
    Then sales manager click on Vehicles dropdown
    And  sales manager check any car’s checkbox
    And sales manager verify the box is checked



