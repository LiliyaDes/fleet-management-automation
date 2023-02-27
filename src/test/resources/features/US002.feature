@wipMila
Feature: Users should be access to the Oroinc Documentation page
  User Story 2: As a user, I should be access to the Oroinc Documentation page.


    Scenario: users access the Oronic Documentation page
      Given User is already in the log in page
      When user enters "user1" username and "UserUser123" password
      And user clicks to login button
      When Click the question icon on the right top of the homepage
      Then Verify the user's access to the Oronic Documentation page