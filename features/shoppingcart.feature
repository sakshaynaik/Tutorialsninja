


Feature: Shoppingcart Functionality
Validate the working of shoppingcart functionality


Scenario: Verify navigation to shoppingcart page from the success message
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


Scenario: Verify navigation to shoppingcart page from the header option
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on add to cart button of product from search results page 
Then  Success message of'Product Added To Shopping cart'should display in search results page
When  User click on shopping cart link from header option 
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed 


Scenario: Verify navigation to shoppingcart page from sitemap of footer option
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on add to cart button of product from search results page 
Then  Success message of'Product Added To Shopping cart'should display in search results page
And   User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on shopping cart link from sitemap page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed 



Scenario: Verify shoppingcart page when no products are added
Given User launchs chrome browser
When  User click on shopping cart link from header option 
Then  User should be taken to shoppingcart page and'Shopping Cart Empty'text should display


Scenario: Verify updating the quantity of product from shopping cart page
Given User launchs chrome browser
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on "HP LP3065" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed
When  User enter new quantity of "2" into quantity field of the product displayed in shoppingcart page
And   User click on update icon option on shoppingcart page
Then  Success message'You Have Modified Shopping Cart' should display in shoppingcart page



Scenario: Verify updating the quantity of product in shopping cart page with negative number 
Given User launchs chrome browser
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on "HP LP3065" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed
When  User enter negative value of "-1" into quantity field of the product displayed in shoppingcart page
And   User click on update icon option on shoppingcart page
Then  Warn message informing the user to provide a positive value should display in shoppingcart page




Scenario: Verify removing the item from shopping cart page
Given User launchs chrome browser
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on "HP LP3065" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed
When  User click on remove icon option on shoppingcart page
Then  Product "HP LP3065" should be removed from shoppingcart page



Scenario: Verify checkout from shopping cart page 
Given User launchs chrome browser
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on "HP LP3065" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed
When  User click on checkout button on shoppingcart page
Then  User should be taken to checkout page of the product


Scenario: Verify continueshopping from shopping cart page 
Given User launchs chrome browser
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on "HP LP3065" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button from product dispaly page 
Then  Success message of'Product Added To Shopping cart'should display in product dispaly page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "HP LP3065" should be successfully displayed
When  User click on continueshopping button on shoppingcart page
Then  User should be taken to homepage












