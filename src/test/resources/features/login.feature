
@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@wip
  Scenario: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"






















 # Scenario: Verify Menu Options for Store Manager
 #   Given the user logged in as "store manager"
 #   Then the user should see following options
 #     | Dashboards         |
 #     | Fleet              |
 #     | Customers          |
 #     | Sales              |
 #     | Activities         |
 #     | Marketing          |
 #     | Reports & Segments |
 #     | System             |


 # Scenario:  Verify Menu Options for Driver
 #   Given the user logged in as "driver"
 #   Then the user should see following options
 #     | Fleet      |
 #     | Customers  |
 #     | Activities |
 #     | System     |