@B28G21-121
Feature: Default


	@B28G21-120
	Scenario: US1AC1 users access the Oronic Documentation page
		Given User is already in the log in page
		      When user enters "user1" username and "UserUser123" password
		      And user clicks to login button
		      When Click the question icon on the right top of the homepage
		      Then Verify the user's access to the Oronic Documentation page