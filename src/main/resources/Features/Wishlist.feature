@smoke
Feature: Wishlist | Logged user could add different products to Wishlist

  Scenario: Logged user could add different products to Wishlist
    Given user go to login page
    When user enter an existing email
    And user enter an valid password
    And user clicks on login button
    And user hover "Computers" category
    And user click on sub-category
    And  user clicks on "Add To Wishlist" button2
    And  user clicks on "Add To Wishlist" button1
    Then add wishlist message is displayed