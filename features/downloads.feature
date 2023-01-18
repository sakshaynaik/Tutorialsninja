


Feature: Downloads Functionality
Validate working of downloads functionality


Scenario: Verify navigation to downloads page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Downloads" link on account page
Then  User should be taken to downloads page



Scenario: Verify navigation to downloads page from right column options
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Downloads" link from right column options of account page
Then  User should be taken to downloads page



Scenario: Verify navigation to downloads page from sitemap page
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
When  User click on "Downloads" link from sitemap page
Then  User should be taken to downloads page



Scenario: Verify downloads page when the user has not made any downloadable orders
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Downloads" link from sitemap page
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage 
Then  User should be taken to downloads page
Then  Proper text for no downloadable orders should be displayed in downloads page 


Scenario: Verify navigation to downloads page before logging-in into application
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Downloads" link from sitemap page
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should be taken to downloads page



Scenario: Verify continue button in downloads page
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Downloads" link from sitemap page
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should be taken to downloads page
When  User click on continue button of downloads page
Then  User should be taken to account page


Scenario: Verify downloads page where the user has placed few downloadable orders
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Downloads" link from sitemap page
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should be taken to downloads page 
Then  User verify all the details of downloadable orders placed(order id, status, product)


