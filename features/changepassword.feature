


Feature: ChangePassword Functionality
Validate the working of changepassword functionalty


Scenario: Verify navigation to change password page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page



Scenario: Verify navigation to change password page using password link from right column options 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Password" link from right column options of account page
Then  User should be taken to changepassword page



Scenario: Verify navigation to change password page from sitemap page 
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
When  User click on "Password" link from sitemap page
Then  User should be taken to changepassword page


Scenario: Verify changing the password
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page
When  User enter old password "54321" into old password field of changepassword page
And   User enter new password "54321" into new password field of changepassword page
And   User click on continue button of changepassword page
Then  Success message of'Password successfully updated'should display in account page
When  User logout and login with email "kishore8@gmail.com" and old password "12345"
Then  User should not get logged-in and warning message for invalid credentials should display 
When  User logout and login with email "kishore8@gmail.com" and new password "54321"
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page
When  User enter old password "12345" into old password field of changepassword page
And   User enter new password "12345" into new password field of changepassword page
And   User click on continue button of changepassword page
Then  Success message of'Password successfully updated'should display in account page
When  User logout and login with email "kishore8@gmail.com" and old password "54321"
Then  User should not get logged-in and warning message for invalid credentials should display 
When  User logout and login with email "kishore8@gmail.com" and new password "12345"
Then  User should get logged-in and taken to account page



Scenario: Verify updating the password without entering anything into the fields of changepassword page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page
When  User click on continue button of changepassword page
Then  Warn message "Password must be between 4 and 20 characters!" should display in changepassword page



Scenario: Verify entering different password and confirm password fields in changepassword page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page
When  User enter password "12345" and confirm password "54321" fields of changepassword page
And   User click on continue button of changepassword page
Then  Warn message "Password confirmation does not match password!" should display in changepassword page



Scenario: Verify back button in the changepassword page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Change your password" link on account page
Then  User should be taken to changepassword page
When  User click on back button of changepassword page
Then  User should be taken to account page








