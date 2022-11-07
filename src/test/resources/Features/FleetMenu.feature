@wip
Feature: As a POSMANAGER, I should be able to see menus under "Fleet" module.

  Background: User is on the profile page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that USER can see these menus on the left side under the Fleet Module.
    When posmanager clicks the More module
    And posmanager clicks Fleet button
  Then user sees menu
#    Then posmanager sees "<menuText>"
#    Examples:
#    |menuText|
#      | Vehicles               |
#      | Vehicles               |
#      | Vehicles Odometer      |
#      | Vehicle Costs          |
#      | Vehicles Contracts     |
#      | Vehicles Fuel Logs     |
#      | Vehicles Services Logs |
#      | Reporting              |
#      | Costs                  |
#      | Indicative Costs       |
#      | Configuration          |
#      | Vehicle Model          |
#      | Model make of Vehicle  |
#      | Service Types          |
#      | Contract Types         |
#      | Vehicle status         |
#      | Vehicle Tags           |