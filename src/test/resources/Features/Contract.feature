Feature: As a POSMANAGER, I should be able to create a new Vehicle Contract.

  Background:
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    Scenario:  Verify that USER can create a new contract
     entering only Vehicle, Type, Activation Cost, Recurring Cost Amount
    When user clicks on the MORE module
    Then user clicks on the FLEET option
    Then clicks on the Vehicles Contracts option