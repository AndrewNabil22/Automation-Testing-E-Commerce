@smoke
Feature: Compare List | Logged user could add different products to compare list

  Scenario: Logged user could add different products to compare list
    Given user go to login page
    When user enter an existing email
    And user enter an valid password
    And user clicks on login button
    And user hover "Computers" category
    And user click on sub-category
    And user clicks on compare list 1
    And user clicks on compare list 2
    Then compare message is displayed
