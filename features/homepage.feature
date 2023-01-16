



Feature: Homepage Functionality
Validate the working of homepage functionality


Scenario: Verify navigation to hompage from shoppingcart page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
When  User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on add to cart button of product from product display page 
Then  Success message of'Product Added To Shopping cart'should display in product display page 
When  User click on shopping cart link from the success message of product dispaly page
Then  User should be taken to shoppingcart page and product "iMac" should be successfully displayed 
When  User click on continueshopping button on shoppingcart page
Then  User should be taken to homepage



Scenario: Verify navigation to hompage from ordersuccess page
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
And   User click on checkout button on shoppingcart page
Then  User should be taken to checkout page of the product 
When  User enter email field as "ravi8@gmail.com" and password field as "12345" on checkout options tab 
And   User click on loginbutton of checkout options tab   
Then  New tab of account and billing details should display in checkoutpage
When  User select'Existing Address'radio button and click continue button of billing details tab
Then  New tab of delivery details should display in checkoutpage
When  User select'Existing Address'radio button and click continue button of delivery details tab
Then  New tab of delivery method should display in checkoutpage
When  User click on continue button of delivery method tab 
Then  New tab of payment method should display in checkoutpage
When  User click on'Cash On Delivery'radio button and select terms and conditions checkbox
And   User click on continue button of payment method tab  
Then  New tab of confirm order should display in checkoutpage
When  User click on confirm order button of confirm order tab 
Then  User should be taken to orderhasbeenplaced page 
Then  Order success'Your order has been successfully processed!'text should display in orderhasbeenplaced page 
When  User click on continue button of orderhasbeenplaced page 
Then  User should be taken to homepage




Scenario: Verify navigation to hompage from sub-category page
Given User launchs chrome browser
When  User hover mouse on any menu say'Desktops'and select 'PC(0)'option
Then  User should be taken to PC page
Then  Proper text'There are no products to list in this category.'should display in PC page
When  User click on continue button of PC page
Then  User should be taken to homepage




  





















