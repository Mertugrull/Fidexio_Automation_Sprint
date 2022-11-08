
Feature: As a POSMANAGER, I should be able to create a new Vehicle.


  Background:  User logged in with valid credentials
    Given user is on the login page of fidexio page
    When user enters username "posmanager15@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that USER can create a new VEHICLE with at least filling Model and License Plate.
    When user clicks on the MORE button
    And user clicks on the FLEET option
    And user clicks on the CREATE module
    And user types "FOCUS" in the model input
    And user clicks on the CREATE FOCUS option
    #And user clicks on the SAVE button
    #And user clicks on the MAKE DROPDOWN module
    #And user types "FORD" in the MAKE input box
    #And user clicks on the CREATE AND EDIT option
    #And user cqlicks on the SAVE button to create the make of the vehicle
    #And user clicks on the Save button to create model and make
    #And user enters "SB10" in the LICENSE PLATE input
    #And user clicks on the SAVE button to create only with MODEL and LICENSE PLATE
    #And user sees the "FOCUS SB10 has been added to the fleet!" message displayed
