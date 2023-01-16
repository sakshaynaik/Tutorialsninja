


Feature: Product Compare Functionality
Validate the working of product compare functionality



Scenario: Verify adding the product for comparission from product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page  
Then  User should be taken to product dispaly page of the product
And   User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page 



Scenario: Verify adding the product for comparission from list view of search result page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User select list option from search results page
Then  Single product "iMac" should be displayed in list view
And   User click on the product compare button of product from search results page
Then  Success message of'Product Added To Product Comparision'should displayed in search results page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page 



Scenario: Verify adding the product for comparission from grid view of search result page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User select grid option from search results page
Then  Single product "iMac" should be displayed in grid view 
And   User click on the product compare button of product from search results page
Then  Success message of'Product Added To Product Comparision'should displayed in search results page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page 



Scenario: Verify adding the product for comparission from list view of product category page
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
And   User select list option from desktops page
Then  Multiple product should be displayed in list view
And   User click on the product compare button of product from desktops page
Then  Success message of'Product Added To Product Comparision'should displayed in desktops page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page



Scenario: Verify adding the product for comparission from grid view of product category page
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
And   User select grid option from desktops page
Then  Multiple product should be displayed in grid view
And   User click on the product compare button of product from desktops page
Then  Success message of'Product Added To Product Comparision'should displayed in desktops page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page



Scenario: Verify adding the product for comparission from featured section on homepage
Given User launchs chrome browser
When  User click on the product compare button of product from home page
Then  Success message of'Product Added To Product Comparision'should displayed in home page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page




Scenario: Verify product compare page when no products are added for comparision
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
When  User click on product compare(0) link from the desktops page
Then  User should be taken to product comparision page
Then  Proper text "You have not chosen any products to compare." should display in product comparision page


Scenario: Verify product compare page when no products are added for comparision
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
And   User click on product compare(0) link from the desktops page
Then  User should be taken to product comparision page
Then  Proper text "You have not chosen any products to compare." should display in product comparision page
When  User click on continue button from product comparision page
Then  User should be taken to homepage



Scenario: Verify the breadcrumb that is displayed on product compare page 
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select'show all desktops option'
Then  User should be taken to desktops page
And   User click on product compare(0) link from the desktops page
Then  User should be taken to product comparision page
Then  Proper text "You have not chosen any products to compare." should display in product comparision page
When  User will click random links from the breadcrumb of product compare page
Then  User should be taken to their respective pages




Scenario: Verify the success message which will be displayed after adding the product for comparision
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
When  User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User click on "iMac" link of product from success message of product dispaly page 
Then  User should be taken to product dispaly page of the product


@dev
Scenario: Verify the product comparision page when two products are added for comparision
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
When  User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User enter existing product name "HP LP3065" into search textfield
And   User click on the button having search icon 
Then  Searched product "HP LP3065" should be displayed in the search results page
And   User click on the product "HP LP3065" link from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page and verify two products added for comparision


Scenario: Verify adding the product to cart from product comparision page 
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page 
And   User click on add to cart button from product comparision page 
Then  Success message of'Product Added To Shopping cart'should display in product comparision page 
When  User click on shopping cart link from the success message on product comparision page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed 




Scenario: Verify removing the product from product comparision page 
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on the product compare button of product from product dispaly page 
Then  Success message of'Product Added To Product Comparision'should displayed in product dispaly page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page 
When  User click on remove button of products from product comparision page
Then  The product should be successfully removed from the product comparision page





























