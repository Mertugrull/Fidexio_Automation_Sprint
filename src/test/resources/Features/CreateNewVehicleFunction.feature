@wip
Feature: As a POSMANAGER, I should be able to create a new Vehicle.


  Background:  User logged in with valid credentials
    Given user is logged in with username "posmanager15@info.com" and password "posmanager"


  Scenario: Verify that USER can create a new VEHICLE with at least filling Model and License Plate.

    When user clicks on the MORE button
    And user clicks on the FLEET option
    And user clicks on the CREATE module
    And user types "FOCUS" in the model input
    And user clicks on the CREATE FOCUS option
    And user types "FORD" in the MAKE input box
    And user clicks on the CREATE and EDIT button
    And user clicks on the SAVE button for the make of the car
    And user clicks on the SAVE button to create the make of the vehicle
    And user enters "SB10" in the LICENSE PLATE input
    And user clicks on the SAVE button to create only with MODEL and LICENSE PLATE
    And user sees the new vehicle created message is displayed


  Scenario Outline: Verify that USER can enter a Make and Model with creating if it doesn't exist.

    When user clicks on the MORE button
    Then user clicks on the FLEET option
    Then user clicks on the CREATE module

    Examples:
      |  |
