

Feature: RewardPoints Functionality
Validate the working of rewardpoints functionality


Scenario: Verify navigation to rewardpoints page from myaccount page  
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Reward Points" link on account page
Then  User should be taken to rewardpoints page


Scenario: Verify navigation to rewardpoints page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Reward Points" link from right column options of account page
Then  User should be taken to rewardpoints page



Scenario: Verify navigation to rewardpoints page before logging-into application
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page
When  User click on "Reward Points" link from right column options of account page
Then  User should be taken to account login page  
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage  
Then  User should be taken to rewardpoints page  




Scenario: Verify your reward point page when there are no reward point
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Reward Points" link on account page
Then  User should be taken to rewardpoints page 
Then  Text "Your total number of reward points is: 0." should display in rewardpoints page 




Scenario: Verify continue button in rewardpoints page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Your Reward Points" link on account page
Then  User should be taken to rewardpoints page 
When  User click on continue button of rewardpoints page 
Then  User should be taken to myaccount page



Scenario: Verify user purchases the product having rewardpoints and check rewardpoints page details
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User purchases few products having the rewards point
And   User click on "Reward Points" link from right column options of account page
Then  User should be taken to rewardpoints page 
Then  Table having the columns-date added, description and points should display in rewardpoints page 

















