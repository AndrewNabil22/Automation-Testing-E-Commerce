@smoke
  Feature: Search | Logged User could search for any product

    Scenario: Logged User could search for any product
      Given user go to login page
      When user enter an existing email
      And user enter an valid password
      And user clicks on login button
      And user login to the system successfully
      And user enter a product name in the search bar
      And user clicks on search button
      Then the product shows up