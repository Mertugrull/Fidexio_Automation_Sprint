
Feature:As a POSMANAGER, I should be able to create a new Vehicle Model.

  Background:  User logged in with valid credentials
    Given user is on the login page of fidexio page
    When user enters username "posmanager11@info.com"
    And user enters password "posmanager"
    And user clicks to login button
@FIDE-1517 @Oguzhan
    Scenario: Verify that USER can create a new Vehicle Model
      When User cliks on the More button
      And User cliks on the Fleet button
      And User cliks on the Vehicle Model button which is based on the Configuration section
      And User clicks Create button
      And User types "Ozzy'sFire" into Model Name input
      And User types "OZZ" into make section
      And user clicks Save button
      Then user verify created Vehicle Function Model





