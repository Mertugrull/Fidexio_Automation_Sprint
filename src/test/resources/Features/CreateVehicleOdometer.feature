@FIDE-1369
Feature: As a POSMANAGER, I should be able to create a new Odometer.

  Background: User is on the profile page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button


    Scenario: Verify that USER can create a new Odometer.
      When user clicks More Module
      And user clicks Fleet button
      When user cliks the Vehicle Odometer
      And user cliks the create button;
      And user click the vehicle dropdown
      And users clicks the create and edit button
      And users inputs model "Micra" and press tab
      And user input "64ee124"
      And user inputs "555"
      And user clicks  the save button

