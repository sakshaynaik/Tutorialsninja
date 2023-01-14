

Feature: Forgot Password Functionality
Validate the working of forgot password functionality


Scenario: Verify user is able to reset the password
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
And   User click on forgotten password link from login page
Then  User should be taken to forgotten password page
When  User enter email address of an existing account "kishore8@gmail.com" for which password is forgotten
And   User click on continue button from forgot password page
Then  Success message with email confirmation link sent to email address should display



Scenario: Verify resetting the password for non-registered account
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
And   User click on forgotten password link from login page
Then  User should be taken to forgotten password page
When  User enter email address "zxy@gmail.com" for which account doesnot exist in appliction
And   User click on continue button from forgot password page
Then  Success message with email confirmation link sent to email address should display


Scenario: Verify resetting the password without providing email in email address textfield
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User click on forgotten password link from login page
Then  User should be taken to forgotten password page
And   User click on continue button from forgot password page
Then  Warn message for email address not found should display


Scenario: Verify placeholder test is displayed in email address textfield 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
And   User click on forgotten password link from login page
Then  User should be taken to forgotten password page
Then  Proper placeholder text should be displayed inside emailaddress textfield


Scenario Outline: Verify resetting the password with invalid email format in email textfield
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User click on forgotten password link from login page
Then  User should be taken to forgotten password page
And   User enter invalid email "<email@gmail>" into emailaddress textfield
And   User click on continue button from forgot password page
Then  Warn message for email address not found should display 
Examples:
| email@gmail   |  
|  xyz@gmail    |
|  xyz@.com     |



Scenario Outline: Verify the back button of forgotten password page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User click on forgotten password link from login page
Then  User should be taken to forgotten password page
And   User click on back button of forgotten password page
Then  User should be taken to account login page



Scenario Outline: Validate navigation to forgotten password page from right column option
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User click on forgotten password link from right column options
Then  User should be taken to forgotten password page









