Feature:As a POSMANAGER, I should be able to create a new Vehicle Model.

  Background:  User logged in with valid credentials
    Given user is on the login page of fidexio page
    When user enters username "posmanager11@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    Scenario: Verify that USER can create a new Vehicle Model
      When User cliks on the More button
      And User cliks on the Fleet button
      And User cliks on the Vehicle Model button which is based on the Configuration section
      And User clicks Create button
      And User types "Ozzy'sFire" into Model Name input
      And User types "OZZ" into make section
      And User cliks Add Vendors button
      And user clicks Create
      And user select individual
      And user types "Oguzhan" into Name section
      And user types "Oguzhan" into company section
      And user clicks create button after company section
      And user select Other address
      And user types "Bridge" into street input
      And user types "Dublin" into city input
      And user types "Dublin" into state section and press enter
      And user types "0000" into state code input
      And user types "Ireland" into country input and press enter
      And user clicks Save button
      And user types "0000" into ZIP input
      And user types "Ireland" into Country input
      And user types "Fast and Furious" into tags and press enter
      And user types "Sales Director" into Job Position input
      And user types "123456789" into mobile input
      And user types "ozi@gmail.com" into mail input
      And user types "www.thefastestozi.com" into website input
      And user types "Coordinator" into title input
      And user select English language from language section
      And user clicks Internal Notes
      And user types "Ozzy" into Internal Notes input
      And user select is a customer option
      And user types "Administrator" into sales person input and press enter
      And user types "Oguzhan" into Internal Referance input
      And user types "0000" Barcode input
      And user clicks Save and Close button
      And user clicks Save button
      And user clicks create button after save
      Then user search created vehicle and verify that





