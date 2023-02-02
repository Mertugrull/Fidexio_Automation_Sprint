@FIDE-1505 @regression
Feature: As a POSMANAGER, I should be able to create a new Vehicle.


  Background:  User logged in with valid credentials
    Given user is logged in with username "posmanager15@info.com" and password "posmanager"

@FIDE-1501 @smoke
  Scenario: Verify that USER can create a new VEHICLE with at least filling Model and License Plate.
    When user clicks on the MORE button
    And user clicks on the FLEET option
    And user clicks on the CREATE module
    And user types "FOCUS" in the model input
    And user clicks on the CREATE option
    And user types "FORD" in the MAKE input box
    And user clicks on the CREATE and EDIT button
    And user clicks on the SAVE button for the make of the car
    And user clicks on the SAVE button to create the make of the vehicle
    And user enters "SB10" in the LICENSE PLATE input
    And user clicks on the SAVE button to create only with MODEL and LICENSE PLATE
    And user sees the new vehicle created message is displayed

  @FIDE-1502 @smoke
  Scenario Outline: Verify that USER can enter a Make and Model with creating if it doesn't exist.


    When user clicks on the MORE button
    Then user clicks on the FLEET option
    Then user clicks on the CREATE module
    Then user types "<model>" in the model input and clicks Enter on the keyboard
    Then user types "<make>" in the MAKE input box and clicks Enter on the keyboard
    #Then user clicks on the SAVE button for the make of the car
    Then user clicks on the SAVE button to create the make of the vehicle
    And save button should be displayed
    Examples:
      | model | make   |
      | ziya  | arslan |

  @FIDE-1503 @smoke
  Scenario Outline: After creating a new vehicle, verify that the USER can see the page of the vehicle and Edit button on the page.

    When user clicks on the MORE button
    And user clicks on the FLEET option
    And user clicks on the CREATE module
    And user types "FOCUS" in the model input
    And user clicks on the CREATE option
    And user types "FORD" in the MAKE input box
    And user clicks on the CREATE and EDIT button
    And user clicks on the SAVE button for the make of the car
    And user clicks on the SAVE button to create the make of the vehicle
    And user enters "<number plate>" in the LICENSE PLATE input
    And user clicks on the SAVE button to create only with MODEL and LICENSE PLATE
    Then user can see the newly created car's make "FOCUS" is displayed
    Then user can see the newly created car's model "FORD" is displayed
    And user can see the edit button
    Examples:
      | number plate |
      | toto         |


  @FIDE-1504 @smoke
  Scenario Outline: After creating a new vehicle, verify that the USER can see the vehicle in the vehicle page list.
    When user clicks on the MORE button
    And user clicks on the FLEET option
    When user types they the number plate "<number plate>" of the newly created vehicle
    Then user press the ENTER button on the Keyboard
    And user sees the newly created vehicle "<number plate>" is displayed
    Examples:
      | number plate |
      | toto         |

