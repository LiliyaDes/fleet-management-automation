@B28G21-108
Feature: Default

	Background:
		#@B28G21-105
		 Given the user is on the home page "https://qa.fleetapps.io/user/login"
		

	#{color:#de350b}*User Story* :  {color}As a user, I want to learn how to use the pinbar. 
	#
	# 
	#
	#{color:#de350b}*AC1:*{color} when users click the “Learn how to use this space” link on the homepage, users should see: 
	#
	#“How To Use Pinbar”  and
	#
	#“Use the pin icon on the right top corner of the page to create fast access link in the pinbar.” 
	#
	#{color:#de350b}*AC2:* {color}users should see an image on the page. 
	#
	#[\{*}in automation testing\{*},  just verify the image source.]
	#
	#Expected source:
	#
	#/bundles/oronavigation/images/pinbar-location.jpg
	#
	# 
	@B28G21-107
	Scenario: US3AC2 Verify you can see images on the pinbar page
		Scenario: Verify user can see image on the pinbar page
		    Given the user logged in as "sales manager"
		    #Given the user is on the login page "https://qa.fleetapps.io/user/login"
		    #When the user logged in with username as "user50" and password as "UserUser123"
		    And the user on the page "https://qa.fleetapps.io/"
		    And the user can click on the message Learn how to use this space
		    Then the user should see  image pin	

	#{color:#de350b}*User Story* :  {color}As a user, I want to learn how to use the pinbar. 
	#
	# 
	#
	#{color:#de350b}*AC1:*{color} when users click the “Learn how to use this space” link on the homepage, users should see: 
	#
	#“How To Use Pinbar”  and
	#
	#“Use the pin icon on the right top corner of the page to create fast access link in the pinbar.” 
	#
	#{color:#de350b}*AC2:* {color}users should see an image on the page. 
	#
	#[\{*}in automation testing\{*},  just verify the image source.]
	#
	#Expected source:
	#
	#/bundles/oronavigation/images/pinbar-location.jpg
	#
	# 
	@B28G21-106
	Scenario: US3AC1 Verify that user can see "How User Pinbar" and "Use the pin iconon the right top corner of the page to create fast access link in the pinbar.” 
		Scenario: Verify How To Use Pinbar
		    Given the user logged in as "sales manager"
		    #Given the user is on the login page "https://qa.fleetapps.io/user/login"
		    #When the user logged in with username as "user50" and password as "UserUser123"
		    And the user on the page "https://qa.fleetapps.io/"
		    And the user can click on the message Learn how to use this space
		    Then the user should see 2 messages "How To Use Pinbar" and "Use pin icon on the right top corner of page to create fast access link in the pinbar."