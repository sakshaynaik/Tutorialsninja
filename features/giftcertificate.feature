


Feature: GiftCertificate Functionality
Validate the working of giftcertificate functionality

Scenario: Verify navigation to purchase a gift certificate page
Given User launchs chrome browser
When  User click on gift certificates option from footer section
Then  User should be taken to purchase a gift certificate page



Scenario: Verify gift certificate page with mandatory fields
Given User launchs chrome browser
When  User click on gift certificates option from footer section
Then  User should be taken to purchase a gift certificate page
When  User enters mandatory details into fields of gift certificate page
|   receiptname   |     Akshay          |
|   receiptemail  | akshay@gmail.com    |
|   yourname      |     suresh          |
|   youremail     | suresh@gmail.com    |
|   gifttheme     |     General         |
And   select non-refundable checkbox and click on continue button of gift certificate page
Then  Text "Thank you for purchasing a gift certificate!" should display in gift certificate page




Scenario: Verify gift certificate page with all the fields
Given User launchs chrome browser
When  User click on gift certificates option from footer section
Then  User should be taken to purchase a gift certificate page
When  User enters following details into fields of gift certificate page
|   receiptname   |     Akshay          |
|   receiptemail  | akshay@gmail.com    |
|   yourname      |     suresh          |
|   youremail     | suresh@gmail.com    |
|   gifttheme     |   Christmas         |
|   amount        |     500             |
And   select non-refundable checkbox and click on continue button of gift certificate page
Then  Text "Thank you for purchasing a gift certificate!" should display in gift certificate page




Scenario Outline: Verify gift certificate page with invalid data
Given User launchs chrome browser
When  User click on gift certificates option from footer section
Then  User should be taken to purchase a gift certificate page
When  User enters receiptname "<receiptname>" and receiptemail "<receiptemail>"
And   User enters yourname "<yourname>" and youremail "<youremail>"
And   User select gifttheme "<gifttheme>" and enter amount "<amount>"
And   select non-refundable checkbox and click on continue button of gift certificate page
Then  Warn Message "E-Mail Address does not appear to be valid!" should display in gift certificate page
Examples:
|   receiptname   |   receiptemail      |   yourname   |   youremail         | gifttheme   |   amount |
|   Akshay        | akshay@gmail.com    |   Praveen    |   praveen@gmail     | Christmas   |   10     |
|   Akshay        |   akshay@gmail      |   Praveen    | praveen@gmail.com   | General     |   100    |



Scenario: Verify continue button on gift certificate page
Given User launchs chrome browser
When  User click on gift certificates option from footer section
Then  User should be taken to purchase a gift certificate page
When  User enters following details into fields of gift certificate page
|   receiptname   |     Akshay          |
|   receiptemail  | akshay@gmail.com    |
|   yourname      |     suresh          |
|   youremail     | suresh@gmail.com    |
|   gifttheme     |   Christmas         |
|   amount        |     500             |
And   select non-refundable checkbox and click on continue button of gift certificate page
Then  Text "Thank you for purchasing a gift certificate!" should display in gift certificate page
When  User click on continue of gift certificate page
Then  User should be taken to shoppingcart page











