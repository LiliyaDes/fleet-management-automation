@B28G21-101
Feature: Default

	Background:
		#@B28G21-97
		Given the user is on the login page

	@B28G21-98
	Scenario: US85AC01TC01 Sales manager access the Vehicle contracts page.
		Scenario: Sales manager access the Vehicle contracts page
		    When the user logged in as "sales manager"
		    When Click the Vehicle contracts under the Fleet
		    Then Verify manager can access the Vehicle contracts page	


	@B28G21-99
	Scenario: US85AC01TC02 Sales managers access the Vehicle contracts page.
		Scenario: Store manager access the Vehicle contracts page
		    When the user logged in as "store manager"
		    When Click the Vehicle contracts under the Fleet
		    Then Verify manager can access the Vehicle contracts page


	@B28G21-100
	Scenario: US85AC02TC01 Drivers should NOT able to access the Vehicle contracts page, the app should display “You do not have permission to perform this action.”
		Scenario: Drivers can NOT access the Vehicle contracts page
		    When the user logged in as "driver"
		    When Click the Vehicle contracts under the Fleet
		    Then Verify users see an error message: “You do not have permission to perform this action.”