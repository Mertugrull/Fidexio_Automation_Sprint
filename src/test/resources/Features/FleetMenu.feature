
Feature: As a POSMANAGER, I should be able to see menus under "Fleet" module.

  Background: User is on the profile page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  Scenario: Verify that USER can see these menus on the left side under the Fleet Module.
    When posmanager clicks the More module
    And posmanager clicks Fleet button
    Then user is able to see Vehicles
    Then user should see Vehicles
    Then user is able to see Vehicles Odometer
    Then user is able to see Vehicle Costs
    Then user is able to see Vehicles Contracts
    Then user is able to see  Vehicles Fuel Logs
    Then user is able to see Vehicles Services Logs
    Then user is able to see Reporting
    Then user is able to see Costs
    Then user is able to see  Indicative Costs
    Then user is able to see Configuration
    Then user is able to see Vehicle Model
    Then user is able to see Model make of Vehicle
    Then user is able to see Service Types
    Then user is able to see Contract Types
    Then user is able to see Vehicle status
    Then user is able to see Vehicle Tags
