 @FIDE-1510
Feature: As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  Background: Users login with valid credentials.
    Given user is on the login page of fidexio page
    When user enters username "posmanager27@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    @FIDE-1507
    Scenario: Verify that all buttons work as expected at the survey design stage
    When users click the button of Surveys on the top of page
      Then users land on the surveys page
      And users click the answers button on the left of the page
      Then users should be land on the answers page
      And users click the List button
      Then users see all the created surveys
      And users see import button on the page
      And users see the create button
      And users write one survey's name which is already created into the search box
      Then users see the related or matched surveys

      @FIDE-1508
      Scenario: Verify that the "Survey created" message appears under the survey form sheet
        When users click the button of Surveys on the top of page
        Then users click the create button
        And users write the title for the survey
        And users click the add an item button
        And users write the page title for the survey
        And users click one more time the add an item button
        And users write the question name for the survey
        And users click the save and close button
        And users click the save and close button again
        And users click the save button for the survey
        Then users see the created survey message under the survey form sheet

      @FIDE-1509
      Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module.
        When users click the button of Surveys on the top of page
        Then users see the survey which is already created
