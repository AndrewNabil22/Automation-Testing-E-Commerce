@smoke
  Feature: Categories | Logged user could select different Categories

    Scenario: Logged user could select different Categories & Sub-categories
      Given user go to login page
      When user enter an existing email
      And user enter an valid password
      And user clicks on login button
      And user hover "Computers" category
      And user click on sub-category
      Then page of sub-category name shows up