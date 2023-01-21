


Feature: MyAccount Functionality
Validate the working of myaccount functionality


Scenario: Verify navigation to myaccount page from ordersuccesspage
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
When  User click on myaccount page link displayed in orderhasbeenplaced page  
Then  User should be taken to account page


Scenario: Verify navigation to myaccount page on login
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page



Scenario: Verify navigation to myaccount page using myaccount option
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on myaccount dropmenu and click on myaccount option
Then  User should be taken to account page



Scenario: Verify navigation to myaccount page from right column option
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on myaccount link from right column options of any page
Then  User should be taken to account page





