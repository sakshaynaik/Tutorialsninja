


Feature: Wish List Functionality
Validate the working of wishlist functionality


Scenario: Verify adding a product to wishlist page from product display page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product  
When  User click on the wishlist button of product from product dispaly page 
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
When  User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "iMac" should be displayed



Scenario: Verify adding a product to wishlist page from featured section of homepage
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
And   User should navigate to homepage by clicking on your store link
When  User select product "MacBook" displayed in Featured section of homepage
Then  User should be taken to product dispaly page of the product
And   User click on the wishlist button of product "MacBook" from product display page
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
When  User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "MacBook" should be displayed




Scenario: Verify adding a product to wishlist page from sub-category page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
When  User select product "HP LP3065" displayed in desktops page
Then  User should be taken to product dispaly page of the product
And   User click on the wishlist button of product "HP LP3065" from product display page
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
When  User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "HP LP3065" should be displayed


Scenario: Verify adding the product to wishlist page from search result page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on the wishlist button of product from search results page 
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
When  User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "iMac" should be displayed



Scenario: Verify adding the product to wishlist page from header option
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "prajwal8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on wishlist link from header option 
Then  User should be taken to wishlist page and'Wishlist Empty'text should display




Scenario: Verify my wishlist page when there are no products added 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "prajwal8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on wishlist link from header option 
Then  User should be taken to wishlist page and'Wishlist Empty'text should display



Scenario: Verify removing the product from my wishlist page 
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "prajwal8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
And   User should navigate to homepage by clicking on your store link
When  User select product "MacBook" displayed in Featured section of homepage
Then  User should be taken to product dispaly page of the product
And   User click on the wishlist button of product "MacBook" from product display page
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
And   User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "MacBook" should be displayed
When  User click on remove icon option of product "MacBook" from wishlist page
Then  Success message of'Successfully Modified Wishlist'should display on wishlist page
And   User click on continue button of wishlist page
Then  User should be taken to myaccount page 




















