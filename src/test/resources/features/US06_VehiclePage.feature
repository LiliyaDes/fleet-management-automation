@login
Feature: users see the car edited options on the Vehicle page
 US: As a user, I want to see edit car info icons from the
Vehicle page.
  AC:#1: users should see “view, edit, delete” when they hover
 the mouse over the 3 dots “…”.


  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in as "sales manager"

    Scenario:
  When Users are on the homepage and hover over to Fleet
  Then Click the Vehicles under the Fleet
  And Verify any car info has tree dots “...”, and there are  “view, edit, delete” icons
