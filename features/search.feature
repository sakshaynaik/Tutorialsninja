

Feature: Search Functionality
Validate the working of search functionality



Scenario: Verify searching with an existing product name
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page



Scenario: Verify searching with an non-existing product name
Given User launchs chrome browser
When  User enter non existing product name "oppo" into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page



Scenario: Verify searching without providing any product name
Given User launchs chrome browser
When  User will not enter any product name into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page



Scenario: Verify searching for a product after login to the application
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



Scenario: Verify searching by providing search criteria which results in multiple products
Given User launchs chrome browser
When  User will enter product "mac" into search textfield which will result in multiple products 
And   User click on the button having search icon 
Then  More than one product should be displayed in search results page



Scenario: Verify searching using search criteria field from search results page of existing product
Given User launchs chrome browser
When  User will enter product "mac" into search textfield which will result in multiple products 
And   User click on the button having search icon 
Then  More than one product should be displayed in search results page
When  User enter existing product name "iMac" into search criteria field from search results page
And   User select search in product descriptions checkbox option from search results page
And   User click on the button having search icon from search results page
Then  Searched product "iMac" should be displayed in the search results page



Scenario: Verify searching using search criteria field from search results page of non-existing product
Given User launchs chrome browser
When  User will not enter any product name into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page
When  User enter non existing product name "oppo" into search criteria field from search results page
And   User select search in product descriptions checkbox option from search results page
And   User click on the button having search icon from search results page
Then  There is no product that matches the search text should be displayed in search results page




Scenario: Verify searching using the text fom the product description  
Given User launchs chrome browser
When  User will not enter any product name into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page
When  User enter text "iLife" of product description into search criteria field
And   User select search in product descriptions checkbox option from search results page 
And   User click on the button having search icon from search results page
Then  Product having the given text in its description should be displayed in search results page




Scenario: Verify search by selecting the correct category of product
Given User launchs chrome browser
When  User will not enter any product name into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page
When  User enter existing product name "iMac" into search criteria field from search results page
And   User select correct category as "Mac" into category dropdown field from search results page
And   User click on the button having search icon from search results page
Then  Searched product "iMac" should be displayed in the search results page



Scenario: Verify search by selecting the incorrect category of product
Given User launchs chrome browser
When  User will not enter any product name into search textfield
And   User click on the button having search icon 
Then  There is no product that matches the search text should be displayed in search results page
When  User enter existing product name "iMac" into search criteria field from search results page
And   User select incorrect category as "PC" into category dropdown field from search results page
And   User click on the button having search icon from search results page
Then  There is no product that matches the search text should be displayed in search results page



Scenario: Verify list view when only one product is displayed in search results page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User select list option from search results page
Then  Single product "iMac" should be displayed in list view 
When  User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product



Scenario: Verify grid view when only one product is displayed in search results page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User select grid option from search results page
Then  Single product "iMac" should be displayed in grid view
When  User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product


Scenario: Verify list view when multiple products are displayed in search results page
Given User launchs chrome browser
When  User will enter product "mac" into search textfield which will result in multiple products 
And   User click on the button having search icon 
Then  More than one product should be displayed in search results page
And   User select list option from search results page
Then  Multiple product should be displayed in list view 
When  User click on the "iMac" product name from search results page 
Then  User should be taken to product dispaly page of the product



Scenario: Verify grid view when multiple products are displayed in search results page
Given User launchs chrome browser
When  User will enter product "mac" into search textfield which will result in multiple products 
And   User click on the button having search icon 
Then  More than one product should be displayed in search results page
And   User select grid option from search results page
Then  Multiple product should be displayed in grid view
When  User click on the "iMac" product name from search results page 
Then  User should be taken to product dispaly page of the product



Scenario: Verify navigation to product compare page from search results page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on the product compare button of product from search results page 
Then  Success messsage of'Product Added To Product Comparision'should displayed in search results page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page   


Scenario: Verify navigation to wishlist page from search results page
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



Scenario: Verify random activity from search results page 
Given User launchs chrome browser
When  User will enter product "mac" into search textfield which will result in multiple products 
And   User click on the button having search icon 
Then  More than one product should be displayed in search results page
And   User will click on random product "iMac" link from search results page
Then  User should be taken to product dispaly page of the product 




