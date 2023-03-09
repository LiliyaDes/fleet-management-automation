
Feature: Accessibility of main modules of the app
  US#01: As a user, I want to access all the main modules

  Background: User is already in the log in page
    Given the user is on the login page

#US#01, AC01, TC01, TC02

  Scenario:  Verify Menu Options for Store manager
    Given the user logged in as "store manager"
   # Given the user logged in with username as "storemanager85" and password as "UserUser123"
    Then store manager sees Dashboards module name
    And store manager sees Fleet module name
    And store manager sees Customers module name
    And store manager sees Sales module name
    And store manager sees Activities module name
    And store manager sees Marketing module name
    And store manager sees Reports & Segments module name
    And store manager sees System module name

  Scenario:  Verify Menu Options for Sales manager
    Given the user logged in as "sales manager"
   # Given the user logged in with username as "salesmanager101" and password as "UserUser123"
    Then sales manager sees Dashboards module name
    And sales manager sees Fleet module name
    And sales manager sees Customers module name
    And sales manager sees Sales module name
    And sales manager sees Activities module name
    And sales manager sees Marketing module name
    And sales manager sees Reports & Segments module name
    And sales manager sees System module name

#US#01, AC02, TC 01

  Scenario:  Verify Menu Options for Drivers
    Given the user logged in as "driver"
    And driver sees Fleet module name
    And driver sees Customers module name
    And driver sees Activities module name
    And driver sees System module name