


Feature: MyAccountInformation Functionaliy
Validate the working of myaccountinfo functionality


Scenario: Verify navigation to myaccountinfo page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit your account information" link on account page
Then  User should be taken to myaccountinfo page



Scenario: Verify navigation to myaccountinfo page using edit account link from right column options 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit Account" link from right column options of account page
Then  User should be taken to myaccountinfo page


Scenario: Verify navigation to myaccountinfo page from sitemap page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
And   User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Account Information" link from sitemap page
Then  User should be taken to myaccountinfo page


Scenario: Verify updating the account details in myaccountinfo page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit your account information" link on account page
Then  User should be taken to myaccountinfo page
When  User enters following data into fields
| Firstname  |    Akshay           |
| Lastname   |    Naik             |
| Email      | kishore8@gmail.com  |
| Telephone  |    9876543211       |
And   User click on continue button of myaccountinfo page
Then  Success message of'Account Updated'Should display in accountpage




Scenario: Verify updating the account details with empty spaces in myaccountinfo page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit your account information" link on account page
Then  User should be taken to myaccountinfo page
When  User will clear all the existing credentials from myaccountinfo page
And   User click on continue button of myaccountinfo page
Then  Warn message informing user to enter the mandatory fields should display in myaccountinfo page


@dev
Scenario: Verify providing invalid email format into email address field
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit your account information" link on account page
Then  User should be taken to myaccountinfo page
When  User enters following data into fields
| Firstname  |    Akshay           |
| Lastname   |    Naik             |
| Email      |    kishore8.com     |
| Telephone  |    9876543211       |
And   User click on continue button of myaccountinfo page
Then  Warn message informing user to provide valid email format should display in myaccountinfo page




Scenario: Verify back button in the myaccountinfo page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Edit your account information" link on account page
Then  User should be taken to myaccountinfo page
When  User enters following data into fields
| Firstname  |    Akshay           |
| Lastname   |    Naik             |
| Email      |    kishore8.com     |
| Telephone  |    9876543211       |
And   User click on back button of myaccountinfo page
Then  User should be taken to account page













