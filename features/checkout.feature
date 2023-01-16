


Feature: Checkout Functionalty
Validate the working of checkout functionality


Scenario: Verify navigation to checkout page when there are no products added to shopping cart
Given User launchs chrome browser
When  User click on checkout link from header option 
Then  User should be taken to shoppingcart page and'Shopping Cart Empty'text should display
When  User click on continue button of shoppingcart page
Then  User should be taken to homepage


Scenario: Verify navigation to checkout page from shopping cart page
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


 Scenario: Verify navigation to checkout page using checkout option in cart block
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
And   User click on checkout option in the displayed cart block
Then  User should be taken to checkout page of the product 



Scenario: Verify checkout as signedin user by using an existing address during checkout
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "ravi8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
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



Scenario: Verify checkout as signedin user by using an new address during checkout
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "ravi8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
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
When  User select'New Address'radio button and enter below details into textfield of billing details tab
|  Firstname  |      Akshay      |
|  Lastname   |      Naik        |
|  Company    |      ltp inc     |
|  Address1   |      Priyanivas  |
|  Address2   |      Dharwad     |
|  city       |      Bangalore   |
|  Postcode   |      560034      |
|  Country    |      Turkey      |
|  State      |      Angus       |
And   User click continue button of billing details tab
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



Scenario: Verify checkout as guest user
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
When  User select'Guest Checkout'radio button and click on continue button of checkout options tab
And   User enter following details into text field of billing details tab
|  Firstname  |      Akshay      |
|  Lastname   |      Naik        |
|  Email      | akshy4@gmail.com |
|  Telephone  |   9876543210     |
|  Company    |      ltp inc     |
|  Address1   |      Priyanivas  |
|  Address2   |      Dharwad     |
|  city       |      Bangalore   |
|  Postcode   |      560034      |
|  Country    |      Turkey      |
|  State      |      Angus       |
And   User click continue button of billing details tab
Then  New tab of delivery method should display in checkoutpage
When  User click on continue button of delivery method tab 
Then  New tab of payment method should display in checkoutpage
When  User click on'Cash On Delivery'radio button and select terms and conditions checkbox
And   User click on continue button of payment method tab  
Then  New tab of confirm order should display in checkoutpage
When  User click on confirm order button of confirm order tab 
Then  User should be taken to orderhasbeenplaced page 
Then  Order success'Your order has been successfully processed!'text should display in orderhasbeenplaced page 




Scenario: Verify checkout as new user
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
When  User select'Register Account'radio button and click on continue button of checkout options tab
And   User enter following details into text field of account and billing details tab
|  Firstname  |      Akshay      |
|  Lastname   |      Naik        |
|  Email      | akshy4@gmail.com |
|  Telephone  |   9876543210     |
|  password   |      12345       |
|  conpasswd  |      12345       |
|  Company    |      ltp inc     |
|  Address1   |      Priyanivas  |
|  Address2   |      Dharwad     |
|  city       |      Bangalore   |
|  Postcode   |      560034      |
|  Country    |      Turkey      |
|  State      |      Angus       |
And   User select'Privacy Policy'checkbox and click on continue button of account and billing details tab
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



Scenario: Verify checkout by using login credentials from checkoutpage
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

























 
 