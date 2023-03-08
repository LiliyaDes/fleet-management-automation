@wip
Feature: Accessibility of manage filters functionality on the Vehicle Costs page
  US#13: As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)

  Background: User is already in the log in page
    Given the user is on the login page

#US#13, AC01, TC01

  Scenario:  Verify that Store manager sees 3 columns on the Vehicle Cost page
    Given the user logged in as "store manager"

   # Given the user logged in with username as "storemanager85" and password as "UserUser123"
    When store manager sees Fleet module name and clicks on it
    Then store manager clicks on Vehicle Costs dropdown
    And store manager sees TYPE column name
    And store manager sees TOTAL PRICE column name
    And store manager sees DATE column name

    #US#13, AC01, TC02

  Scenario:  Verify that Sales manager sees 3 columns on the Vehicle Cost page
    Given the user logged in as "sales manager"

   # Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When sales manager sees Fleet module name and clicks on it
    Then sales manager clicks on Vehicle Costs dropdown
    And sales manager sees TYPE column name
    And sales manager sees TOTAL PRICE column name
    And sales manager sees DATE column name

    #US#13, AC01, TC03

  Scenario:  Verify that Driver sees 3 columns on the Vehicle Cost page
    Given the user logged in as "driver"

   # Given the user logged in with username as "user1" and password as "UserUser123"
    When driver sees Fleet module name and clicks on it
    Then driver clicks on Vehicle Costs dropdown
    And driver sees TYPE column name
    And driver sees TOTAL PRICE column name
    And driver sees DATE column name


    #US#13, AC02, TC01

  Scenario:  Verify that Store manager is able to check the first checkbox to check all the Vehicle Costs
    Given the user logged in as "store manager"

   # Given the user logged in with username as "storemanager85" and password as "UserUser123"
    When store manager sees Fleet module name and clicks on it
    Then store manager clicks on Vehicle Costs dropdown
    And store manager locates and clicks the first checkbox
    Then all the vehicle costs are checked


        #US#13, AC02, TC02

  Scenario:  Verify that Sales manager is able to check the first checkbox to check all the Vehicle Costs
    Given the user logged in as "sales manager"

   # Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    When sales manager sees Fleet module name and clicks on it
    Then sales manager clicks on Vehicle Costs dropdown
    And sales manager locates and clicks the first checkbox
    Then all the vehicle costs are checked

 # Scenario:  Verify that driver is NOT able to check the first checkbox to check all the Vehicle Costs
  #  Given the user logged in as "driver"

   #US#13, AC02, TC03
   # Given the user logged in with username as "user1" and password as "UserUser123"
   #When driver sees Fleet module name and clicks on it
   #Then driver clicks on Vehicle Costs dropdown
   #And driver CANNOT locate and click the first checkbox
