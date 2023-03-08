
Feature: create a calendar event with Description
  US10: As a user, I want to write the “Description” when I create a calendar event. (Iframe)

  #AC1: users should be able to write messages in the Description field on the calendar event page.

  Scenario: users write a description to create a calendar event

    Given the user logged in as "driver"
    When Click the “Calendar Events” under the Activities
    And Click the “Create Calendar Event” button
    And Write a message in the Description field
    Then Verify the message is written in the input box