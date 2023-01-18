


Feature: ProductReturns Functionality
Validate the working of product returns functionality


Scenario: Verify navigation to product returns page from accountpage
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Returns" link from right column options of account page
Then  User should be taken to productreturns page 



Scenario: Verify submit the product for return by selecting all the options in productreturns page
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
When  User select the reason for return as "Faulty, please supply details" and click on submit button
Then  Successfull product return text should display in productreturns page



Scenario: Verify back button in productreturns page
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
When  User click on back button of productreturns page
Then  User should be taken to myaccount page



Scenario: Verify navigation to productreturns page from returns option of footersection
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on returns option from footer section
Then  User should be taken to productreturns page








