#Story 14: As a user, I want to manage filters on the Marketing
#page.
#AC #1: Store and sales managers should see all 5 filter options
#are checked by default.
#AC #2: any amount of boxes should be unchecked. (can check
#only 1, or multiple)
  #Test cases #1
  #Description: managers see default checked filters on the
  #Campaigns page
  #Environment: https://qa2.vytrack.com/user/login
  #Steps:
  #1. Users are on the homepage
  #2. Click the Campaigns under the Marketing
  #3. Click the Manage filters button
  #4. Verify 5 options are checked by default
  #Test cases #2
  #Description: managers can uncheck any filter options
  #Environment: https://qa2.vytrack.com/user/login
  #Steps:
  #1. Users are on the homepage
  #2. Click the Campaigns under the Marketing
  #3. Click the Manager filters button
  #4. Uncheck one or more filter options
  #5. Verify one or more options are unchecked