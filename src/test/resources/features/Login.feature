@ui
Feature: Login

  Scenario: Username is visible upon signing in
    Given User is logged in
    Then Username "Automated Test" is displayed

  Scenario Outline: User is not logged using incorrect credentials
    When Go to Sign In section
    And User Signs In with email "<email>" and password "<password>"
    Then Auth error is displayed
    Examples:
      | email                 | password     |
      | test@test.com         | QA_Automated |
      | automatowo5@gmail.com | test123      |
      | test@test.com         | test123      |