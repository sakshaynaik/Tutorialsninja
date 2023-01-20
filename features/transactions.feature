

Feature: Transactions Functionality
Validate the working of transactions functionality


Scenario: Verify navigation to transactions page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Transactions" link on account page
Then  User should be taken to yourtransaction page


Scenario: Verify navigation to transactions page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Transactions" link from right column options of account page
Then  User should be taken to yourtransaction page


Scenario: Verify navigation to transactions page from myaccount dropmenu
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on myaccount dropmenu and select "Transactions" option
Then  User should be taken to yourtransaction page


Scenario: Verify navigation to transactions page before logging-into application
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page 
When  User click on "Transactions" link from right column options of account page
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should be taken to yourtransaction page




Scenario: Verify your transaction page when user has not placed any orders
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Transactions" link on account page
Then  User should be taken to yourtransaction page
Then  Text "Your current balance is: $0.00." should display in yourtransaction page



Scenario: Verify continue button on yourtransaction page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Transactions" link on account page
Then  User should be taken to yourtransaction page
When  User click on continue button of yourtransaction page
Then  User should be taken to myaccount page


Scenario: Verify your transaction page when user has placed few orders and have completed the payment
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User place few orders and complete the payment for the orders placed
And   User click on "Transactions" link from right column options of account page
Then  User should be taken to yourtransaction page
Then  Table with column-date added, description and amount should display in yourtransaction page













