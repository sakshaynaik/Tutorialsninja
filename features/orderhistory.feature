

Feature: OrderHistory Functionality
Validate the working of orderhistory functionality

Scenario: Verify navigation to orderhistory page from myaccount page
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



Scenario: Verify navigation to orderhistory page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Order History" link from right column options of account page
Then  User should be taken to orderhistory page



Scenario: Verify navigation to orderhistory page from sitemap page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Order History" link from sitemap page
Then  User should be taken to orderhistory page


Scenario: Verify continue button on orderhistory page
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
When  User click on continue button of orderhistory page
Then  User should be taken to account page



Scenario: Verify navigation to orderinformation page from orderhistory page using view icon option
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



Scenario: Verify navigation to orderhistory page without logging-in 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User click on "Order History" link from right column options of account page
Then  User should be taken to account login page































