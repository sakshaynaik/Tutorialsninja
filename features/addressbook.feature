

Feature: AddressBook Functionality
Validate the working of addressbook functionality


Scenario: Verify navigation to addressbook page from myaccount page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page



Scenario: Verify navigation to addressbook page from from right column options 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Address Book" link from right column options of account page
Then  User should be taken to address book page



Scenario: Verify navigation to addressbook page from sitemap page 
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
When  User click on "Address Book" link from sitemap page
Then  User should be taken to address book page


Scenario: Verify editing the default address in the address book page  
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on edit button on Address Book Entries
Then  User should be taken to edit tab of address book page
When  User enters following details into fields
|   Firstname   |   Akshay   |
|   Lastname    |   Naik     |
|   Company     |   Calcu    |
|   Address1    |SurayaAptmnt|
|   Address2    |Indranagar  |
|   city        |Bangalore   |
|   postcode    |   54321    |
|   country     |   Benin    |
|   state       |    5       |
And   User click on continue button in edit tab of address book page
Then  Success message "Your address has been successfully updated" should display in address book page
Then  Address book entries table should be successfully updated with updated address entries


Scenario: Verify editing the default address in the address book page with only mandatory fields
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on edit button on Address Book Entries
Then  User should be taken to edit tab of address book page
When  User enters following mandatory details into fields
|   Firstname   |   Akshay   |
|   Lastname    |   Naik     |
|   Address1    |SurayaAptmnt|
|   city        |Bangalore   |
|   country     |   Benin    |
|   state       |    4       |
And   User click on continue button in edit tab of address book page
Then  Success message "Your address has been successfully updated" should display in address book page
Then  Address book entries table should be successfully updated with updated address entries


Scenario: Verify deleting the default address in the address book page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on delete button of default address book entries
Then  Warn message "Warning: You can not delete your default address!" should display in address book page
Then  Address book entries table should be successfully updated with updated address entries



Scenario: Verify adding new address in the address book page with only mandatory fields
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on new address button on Address Book page
Then  User should be taken to new address tab of address book page
When  User enters following details into fields
|   Firstname   |   Akshay   |
|   Lastname    |   Naik     |
|   Address1    |SurayaAptmnt|
|   city        |Bangalore   |
|   postcode    |    54321   |
|   country     |   Benin    |
|   state       |    3       |
And   User click on continue button in new address tab of address book page
Then  Success message "Your address has been successfully added" should display in address book page
Then  Address book entries table should be successfully updated with updated address entries



Scenario: Verify deleting new address in the address book page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on delete button of new address book entries
Then  Success message "Your address has been successfully deleted" should display in address book page
Then  Address book entries table should be successfully updated with updated address entries



Scenario: Verify back button in new address book page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on "Modify your address book entries" link on account page
Then  User should be taken to address book page
When  User click on back button of address book page
Then  User should be taken to myaccount page










