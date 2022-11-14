@alkan
Feature: As a Posmanager, I should be able to use all functionalities on employees stage.

  Background: Users login with valid credentials.
    Given user is on the login page of fidexio page
    When user enters username "posmanager74@info.com"
    And user enters password "posmanager"
    And user clicks to login button
@fb
  Scenario: Verify that all buttons work as expected at the Employees stage
    When users click the button of Employees on the top of pages
    Then users land on the Employees page
    And users click the EmployeesLeft button on the left of the page
    Then users should be landing on the Employees page
    And users click the Badges button on the left of the page
    Then users see all the Badges
    And users click the Challenges button on the left of the page
    Then users are directed to the Challenges section
    And users click the Goals History button
    Then users see the related Goals History page
    And users click the Departments button
    Then users see the related Departments on Departments page
    And users click the create button.
    Then user should be able to direct to create page


@16
  Scenario: Verify that the "Employee Created" message appears under full profile
    When users click the button of Employees on the top of page.
    Then users click the create button on top
    And users write the name on Employee's Name
    And users click the save button
    Then users see the Employee Created message under the Employee form sheet

  @17
  Scenario: Verify that the user should be able to see created Employee is listed after clicking the Employees module.
    When users click the button of Employees on the top of pages
    Then users see the new Employee which is already created