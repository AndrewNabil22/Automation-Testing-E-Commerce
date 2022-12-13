@smoke
  Feature:Filter | Logged user could filter with color

    Scenario: Logged user could filter with color
      Given user go to login page
      When user enter an existing email
      And user enter an valid password
      And user clicks on login button
      And user hover "Apparel" category
      And user click on sub-category "Shoes"
      And user click on "Red" filter
      Then only Red shoes shows up