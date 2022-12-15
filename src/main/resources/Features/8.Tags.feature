@smoke
  Feature: Tags | Logged user could select different tags

    Scenario: Logged user could select different tags
      Given user go to login page
      When user enter an existing email
      And user enter an valid password
      And user clicks on login button
      And user clicks on "Electronics" category
      And user clicks on "Awesome" tag
      And user clicks on "game" tag
      Then tags shows up
