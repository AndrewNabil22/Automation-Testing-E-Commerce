@smoke

Feature: Reset Password | User could reset his/her password successfully

Scenario: User could reset his/her password successfully
Given user go to login page
When user clicks on forget password button
And user enter an existing email
And user clicks on recover
Then confirmation message is displayed