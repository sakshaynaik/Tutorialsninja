


Feature: Newsletter Functionality
Validate the working of newsletter functionality

Scenario: Verify navigation to newsletter subscription page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Subscribe / unsubscribe to newsletter" link on account page
Then  User should be taken to newsletter subscription page



Scenario: Verify navigation to newsletter subscription page before logging-into application
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page
When  User click on "Newsletter" link from right column options of account page
Then  User should be taken to account login page  
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage  
Then  User should be taken to newsletter subscription page 




Scenario: Verify navigation to newsletter subscription page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Newsletter" link from right column options of account page
Then  User should be taken to newsletter subscription page



Scenario: Verify navigation to newsletter subscription page from footer options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
When  User click on "Newsletter" link from footer options
Then  User should be taken to account login page  
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage  
Then  User should be taken to newsletter subscription page 



Scenario: Verify Registering account by selecting newsletter radio button and check newsletter page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields  
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  akshata62.n@gmail.com |
|telephone        |  9876543219            |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User clicks on yes radio option for newsletter selects privacypolicy checkbox and click on continue button
Then  User should get logged in and taken to account success page with account success message 
When  User click on continue button that is dispalyed on account success page
Then  User should be taken to account page
When  User click on "Subscribe / unsubscribe to newsletter" link on account page
Then  User should be taken to newsletter subscription page
Then  Yes radio option should be displayed as selected by default in newsletter subscription page 




Scenario: Verify Registering account by not selecting newsletter radio button and check newsletter page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields 
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  akshata61.n@gmail.com |
|telephone        |  9876543219            |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User select privacypolicy checkbox and click on continue button
Then  User should get logged in and taken to account success page with account success message 
When  User click on continue button that is dispalyed on account success page
Then  User should be taken to account page
When  User click on "Subscribe / unsubscribe to newsletter" link on account page
Then  User should be taken to newsletter subscription page
Then  No radio option should be displayed as selected by default in newsletter subscription page 



Scenario: Verify continue button on newsletter subscription page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Subscribe / unsubscribe to newsletter" link on account page
Then  User should be taken to newsletter subscription page
When  User click on continue button of newsletter subscription page
Then  Success message "Success: Your newsletter subscription has been successfully updated!" should display in account page



Scenario: Verify back button on newsletter subscription page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Subscribe / unsubscribe to newsletter" link on account page
Then  User should be taken to newsletter subscription page
When  User click on back button of newsletter subscription page
Then  User should be taken to account page


































