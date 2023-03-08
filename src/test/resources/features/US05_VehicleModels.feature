@wip555
Feature: Vehicle models page accessibility
  US05: As a user, I want to view columns on the Vehicle models page.
  Background: the user is on the login page for all scenarios
    Given the user is on the login page


    #US05, AC1: TC1

  Scenario: Sales manager access the Vehicle models page
    Given the user logged in as "sales manager"
       # Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    Then Click the Vehicle models under the Fleet
    #And Verify manager can access the Vehicle models page
    And Verify sales manager sees the column: MODEL NAME on the Vehicle models page
    And Verify sales manager sees the column: MAKE on the Vehicle models page
    And Verify sales manager sees the column: CAN BE REQUESTED on the Vehicle models page
    And Verify sales manager sees the column: CVVI on the Vehicle models page
    And Verify sales manager sees the column: COTwo Fee on the Vehicle models page
    And Verify sales manager sees the column: COST DEPRECIATED on the Vehicle models page
    And Verify sales manager sees the column: COTwo Emissions on the Vehicle models page
    And Verify sales manager sees the column: FUEL TYPE on the Vehicle models page
    And Verify sales manager sees the column: VENDORS on the Vehicle models page

       #US05, AC1: TC2

  Scenario: Store manager access the Vehicle models page
    Given the user logged in as "store manager"
       # Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Then StMgr Click the Vehicle models under the Fleet
    #And Verify manager can access the Vehicle models page
    And Verify store manager sees the column: MODEL NAME on the Vehicle models page
    And Verify store manager sees the column: MAKE on the Vehicle models page
    And Verify store manager sees the column: CAN BE REQUESTED on the Vehicle models page
    And Verify store manager sees the column: CVVI on the Vehicle models page
    And Verify store manager sees the column: COTwo Fee on the Vehicle models page
    And Verify store manager sees the column: COST DEPRECIATED on the Vehicle models page
    And Verify store manager sees the column: COTwo Emissions on the Vehicle models page
    And Verify store manager sees the column: FUEL TYPE on the Vehicle models page
    And Verify store manager sees the column: VENDORS on the Vehicle models page

           #US05, AC2: TC1

  Scenario: Drivers can NOT access the Vehicle Models page
    Given the user logged in as "driver"
    #Then Click the Vehicle Model under the Fleet
    And Verify users see an error message: You do not have permission to perform this action




