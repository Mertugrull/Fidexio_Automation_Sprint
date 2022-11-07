Feature: Fidexio Login feature







  Scenario Outline: Positive Login Scenarios
    Given user is on the login page of fidexio page
    When user enters username "<Username>"
    And user enters password "<Password>"
    And user clicks to login button
    Then user sees "<Url>" in the title


    Examples: Search values we are going to be using in this scenario is as below table
      | Username                | Password     | Url  |
      | salesmanager10@info.com | salesmanager | menu |
      | posmanager10@info.com   | posmanager   | menu |