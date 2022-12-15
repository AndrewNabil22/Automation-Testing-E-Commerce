@smoke

Feature: Login | User could log in with valid email and password

  Scenario: User could log in with valid email and password successfully
    Given user go to login page
    When user enter an existing email
    And user enter an valid password
    And user clicks on login button
    Then user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login with "invalid"
    And user clicks on login button
    Then user could not login to the system