@smoke
  Feature: Shopping Cart | Logged user could add different products to Shopping cart

    Scenario: Logged user could add different products to Shopping cart
      Given user go to login page
      When user enter an existing email
      And user enter an valid password
      And user clicks on login button
      And user hover "Computers" category
      And user click on sub-category
      And  user clicks on "Add To Cart" button2
      And  user clicks on "Add To Cart" button1
      Then add to cart message is displayed