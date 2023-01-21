


Feature:  AddtoCart Functionality
Validate the working of addtocart functionality


Scenario: Verify adding the product to cart from product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed



Scenario: Verify adding the product to cart from wish list page
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
Then  Success message for'Product Added To Wishlist'should be displayed in product dispaly page 
And   User click on wishlist link from the success message of product dispaly page
Then  User should be taken to wishlist page and product "iMac" should be displayed 


Scenario: Verify adding the product to cart from search result page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on add to cart button of product from search results page 
Then  Success message of'Product Added To Shopping cart'should display in search results page
When  User click on shopping cart link from the success message of search results page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed



Scenario: Verify adding the product to cart from product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button of product from product display page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed



Scenario: Verify adding the product to cart from the products displayed in sub-category page
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
When  User select product "HP LP3065" displayed in desktops page
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button on product "HP LP3065" from product display page
Then  Success message of'Product Added To Shopping cart'should display in product display page
When  User click on shopping cart link from the success message of product display page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed



Scenario: Verify adding the product to cart from the products displayed in Featured section of homepage
Given User launchs chrome browser
When  User select product "MacBook" displayed in Featured section of homepage
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button on product "MacBook" from product display page
Then  Success message of'Product Added To Shopping cart'should display in product display page
When  User click on shopping cart link from the success message of product display page
Then  User should be taken to shoppingcart page and product "MacBook" should be successfully displayed



























