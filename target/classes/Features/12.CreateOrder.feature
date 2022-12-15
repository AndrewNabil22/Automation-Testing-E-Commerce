@smoke
Feature: Create Order | Create successful Order

  Scenario: Create successful Order
    Given user go to login page
    When user enter an existing email
    And user enter an valid password
    And user clicks on login button
    And user hover "Computers" category
    And user click on sub-category
    And  user clicks on "Add To Cart" button2
    And  user clicks on "Add To Cart" button1
    And user hover "Shopping cart"
    And user clicks on "Go To Cart" button
    And user check to agree the terms of service
    And user clicks on "Checkout" button
    And user select the country
    And user enter the city
    And user enter the address1
    And user enter zip
    And user enter phone number
    And user clicks on "Continue" to shipping method
    And user clicks on "Next Day Air"
    And user clicks on "Continue" to payment method
    And user clicks on "Credit Card" option
    And user clicks on "Continue" to payment info
    And user select credit card type
    And user enter cardholder name
    And user enter card number
    And user enter expiration month
    And user enter expiration year
    And user enter card code
    And user clicks on "Continue" to confirm order
    And user clicks on "confirm" to final confirm order
    Then Your order has been successfully processed!


