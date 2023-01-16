

Feature: Register Functionality
Validate the working of register account functionality



Scenario: Verify Registering an account by providing only the mandatory fields
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
When   User click on continue button that is dispalyed on account success page
Then  User should be taken to account page



Scenario: Verify Registering an account by providing all the fields
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



Scenario: Verify Registering an account without providing any fields in Register Account page and Submitting
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page 
When  User will not enter any credentials in textfields 
And   User click on continue button
Then  A proper warning messages should be displayed for their respective textfields 



Scenario: Verify the different ways of navigation to Register Account page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page   
When  User click on myaccount dropmenu and click on login option
Then  User should be taken to account login page   
And   User click on continue button inside new customer box
Then  User should be taken to register account page  
When  User click on register link from right column options
Then  User should be taken to register account page  



Scenario: Verify Registering an account by entering different passwords in Password and Confirm Password Textfields
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields with different password and confirm password fields 
|firstname              |  Akshay                |
|lastname               |  Naik                  |
|email                  |  akshata63.n@gmail.com |
|telephone              |  9876543219            |
|password 			        |  12345                 |
|confrmpasswrd 	        |  54321                 |
And   User select privacypolicy checkbox and click on continue button
Then  Account should not be created and Confirm Password Field warning message should be displayed 



Scenario: Verify Registering an account by providing existing email address into E-Mail field
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields with already registered email
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  akshata1.n@gmail.com  |
|telephone        |  9876543219            |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User select privacypolicy checkbox and click on continue button
Then  Account should not be created and E-Mail field warning message should be displayed



Scenario: Verify Registering an account by providing invalid email address into E-Mail field
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields with invalid email
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  kishore8@gmail        |
|telephone        |  9876543219            |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User select privacypolicy checkbox and click on continue button
Then  Account should not be created and Invalid E-Mail warning message should be displayed 



Scenario: Verify Registering an account by providing invalid phone number into Telephone field
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields with invalid phone number
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  akshata66.n@gmail.com |
|telephone        |  abcde                 |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User select privacypolicy checkbox and click on continue button
Then  Account should not be created and Telephone field warning message should be displayed 



Scenario: Verify Registering an account by using the keyboard keys
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields 
|firstname        |  Akshay                |
|lastname         |  Naik                  |
|email            |  akshata67.n@gmail.com |
|telephone        |  9876543219            |
|password 			  |  12345                 |
|confrmpasswrd	  |  12345                 |
And   User select privacypolicy checkbox and click on continue button
Then  User should get logged in and taken to account success page with account success message 
When  User click on continue button that is dispalyed on account success page
Then  User should be taken to account page



Scenario: Verify Registering an account for mandatory fields with only spaces
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User select privacypolicy checkbox and click on continue button
Then  A proper warning messages should be displayed for their respective textfields 



Scenario: Verify Registering an account without selecting Privacy Policy checkbox option
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields without selecting privacy policy checkbox 
|firstname              |  Akshay                |
|lastname               |  Naik                  |
|email                  |  akshata68.n@gmail.com |
|telephone              |  9876543219            |
|password 			        |  12345                 |
|confrmpasswrd         	|  12345                 |
And   User should not select privacypolicy checkbox and click on continue button
Then  Account should not be created and Privacy Policy checkbox warning message should be displayed 



Scenario: Verify Registering an account by filling Password field and not filling Password Confirm fields
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Register option should display in myaccount dropmenu
And   User click on register option from myaccount dropmenu
Then  User should be taken to register account page  
When  User enters below details into textfields with password and without password confirm fields
|firstname              |  Akshay                |
|lastname               |  Naik                  |
|email                  |  akshata69.n@gmail.com |
|telephone              |  9876543219            |
|password 			        |  12345                 |
|confrmpasswrd         	|    _                   |
And   User select privacypolicy checkbox and click on continue button
Then  Account should not be created and Password Confirm field warning message should be displayed 











