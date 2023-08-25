Feature: Login

  Scenario: Login with correct credenatils
    Given I land on the login page
    When I enter username and password
    When I click on login button
    Then I verify home page

  Scenario: Login scenario with negative username
    Given I land on the login page
    When I enter username and password
    When I click on login button
    Then I verify home page
