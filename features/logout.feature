

Feature: Logout Functionality
Validate the working of logout functionality



Scenario: Verify logging out by selecting logout option from 'My Account' dropmenu
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on myaccont drop menu and select logout option
Then  User should be taken to account logout page and login option should display in myaccount dropmenu
When  User click on continue button from account logout page
Then  User should be taken to homepage



Scenario: Verify logging out by selecting logout option from right column 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on logout option from the right column
Then  User should be taken to account logout page and login option should display in right options column
When  User click on continue button from account logout page
Then  User should be taken to homepage


Scenario: Verify logging out and browsing back
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on logout option from the right column
Then  User should be taken to account logout page and login option should display in right options column
When  User click on browser back button
Then  User should not get logged-in 



Scenario: Verify logging out and logging in immediately after logout
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on logout option from the right column
Then  User should be taken to account logout page and login option should display in right options column
And   User click on login option from right cloumn
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page


@Test
Scenario: Verify logout is not displayed before logging-in
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
But   Logout option should not be dispalyed before logging-in











