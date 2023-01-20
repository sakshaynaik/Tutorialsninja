


Feature: Recurring Payment Functionality
Validate the working of recurring payment functionality



Scenario: Verify navigation to recurring payment page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Recurring payments" link on account page
Then  User should be taken to recurring payment page 




Scenario: Verify navigation to recurring payment page before logging-into application
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page
When  User click on "Recurring payments" link from right column options of account page
Then  User should be taken to account login page  
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage  
Then  User should be taken to recurring payment page 




Scenario: Verify navigation to recurring payment page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Recurring payments" link from right column options of account page
Then  User should be taken to recurring payment page 




Scenario: Verify recurring payment page when there are no recurring payment made
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Recurring payments" link on account page
Then  User should be taken to recurring payment page 
Then  Text "No recurring payments found!" should display in recurring payment page 



Scenario: Verify continue button on recurring payment page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Recurring payments" link on account page
Then  User should be taken to recurring payment page 
When  User click on continue button of recurring payment page 
Then  User should be taken to account page



Scenario: Verify recurring payment page when there are few recurring payments done by the user
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Recurring payments" link on account page
Then  User should be taken to recurring payment page 
Then  Details of recurring payments made by the user should display in recurring payment page












