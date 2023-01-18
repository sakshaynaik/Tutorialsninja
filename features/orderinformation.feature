


Feature: OrderInformation Functionality
Validate the working of orderinformation functionality


Scenario: Verify the working of reorder icon option in orderinformation page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "View your order history" link on account page
Then  User should be taken to orderhistory page
When  User click on view icon option in orderhistory table
Then  User should be taken to orderinformation page
When  User click on reorder icon option in the displayed orderinformation page
And   User click on shopping cart link from the success message of orderinformation page
Then  User should be taken to shoppingcart page and product should be successfully displayed



Scenario: Verify the working of return icon option in orderinformation page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "View your order history" link on account page
Then  User should be taken to orderhistory page
When  User click on view icon option in orderhistory table
Then  User should be taken to orderinformation page
When  User click on return icon option in the displayed orderinformation page
Then  User should be taken to productreturns page


Scenario: Verify the working of continue button in orderinformation page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "View your order history" link on account page
Then  User should be taken to orderhistory page
When  User click on view icon option in orderhistory table
Then  User should be taken to orderinformation page
When  User click on continue button of orderinformation page
Then  User should be taken to orderhistory page


Scenario: Verify the product details in orderinformation page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "View your order history" link on account page
Then  User should be taken to orderhistory page
When  User click on view icon option in orderhistory table
Then  User should be taken to orderinformation page
Then  Proper product order details should be displayed in orderinformation page


