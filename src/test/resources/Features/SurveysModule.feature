Feature: As a Posmanager, I should be able to create and design a new survey from "Surveys" module

  1. Verify that all buttons work as expected at the survey design stage

  2. Verify that the "Survey created" message appears under the survey form sheet

  3. Verify that the user should be able to see created survey is listed after clicking the Surveys module.

  Background: Users login with valid credentials.
    Given user is on the login page of fidexio page
    When user enters username "posmanager27@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    Scenario: Verify that all buttons work as expected at the survey design stage
    When users click the button of Surveys on the top of page
      Then users land on the surveys page
      And users click the answers button on the left of the page
      Then users should be land on the answers page
      And users click the List button
      Then users see all the created surveys
      And users click the import button on the page
      Then users are directed to the import section
      And users click the create button
      Then users see New-Survey part on the creation section
      And users write one survey's name which is already created into the search box
      Then users see the related or matched surveys