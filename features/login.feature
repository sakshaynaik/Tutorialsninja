

Feature: Login Functionality
Validate the working of login functionality


Scenario: Verify logging into application using valid credentials
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page



Scenario Outline: Verify logging into application using Invalid credentials
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter invalidemail as "<email@gmail>" and invalidpassword as "<password12>"
And   User click on loginbutton from loginpage
Then  User should not get logged-in and warning message for invalid credentials should display
Examples:
|   email@gmail          |     password12     |
|   xyz@gmail.com        |     67890          |
|           _            |       _            |



Scenario Outline: Verify logging into application using Invalid email and valid password
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter invalidemail as "<email@gmail>" and validpassword as "<password12>"
And   User click on loginbutton from loginpage
Then  User should not get logged-in and warning message for invalid credentials should display
Examples:
|   email@gmail          |     password12     |
|   kishore8@gmail       |     12345          |
|   @gmail.com           |     12345          |



Scenario Outline: Verify logging into application using valid email and Invalid password
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter invalidemail as "<email@gmail>" and validpassword as "<password12>"
And   User click on loginbutton from loginpage
Then  User should not get logged-in and warning message for invalid credentials should display
Examples:
|   email@gmail          |     password12     |
|   kishore8@gmail.com   |     abcde          |
|   kishore8@gmail.com   |     54321          |



Scenario: Verify logging into application without providing any credentials
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User should not enter any credentials in Email and Password Text fields
And   User click on loginbutton from loginpage
Then  User should not get logged-in and warning message for invalid credentials should display



Scenario: Verify Forgot Password link available and working in loginpage
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page and forgotten password link should displayed
And   User click on forgotten password link from login page
Then  User should be taken to forgotten password page



Scenario: Verify logging into application using keyboard keys
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu 
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page



Scenario: Verify logging into application and browsing back using browser back button
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
And   User click on browser back button
Then  User should not get logged out from the application



Scenario: Verify password is not visible in the Account Login pagesource
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter only password field as "12345" and click on loginbutton 
Then  Password text should not be visible in pagesource



Scenario: Verify the different ways of navigation to the login page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User clicks on login page link from right column options
Then  User should be taken to account login page

 












