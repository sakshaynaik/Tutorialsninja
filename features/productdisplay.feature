

Feature: Product Display Functionality
Validate the working of product display functionality


Scenario: Validate the thumbnalis of the product displayed in product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page  
Then  User should be taken to product dispaly page of the product
And   User click on main bigger sized thumbnail image displayed on product display page
Then  Light box view of the main thumnail should be displayed on product display page
When  User click on left and right options from main thumnail
Then  User should be able to navigate to other thumnail image in light box view
And   User click on close option from the thumnail displayed on light box
Then  Light box view should close and focus should go to product display page
When  User click on the normal sized thumbnail image displayed on product display page
Then  Light box view of the selected thumbnail should be displayed on product display page
When  User click on left and right options from selected thumnail
Then  User should be able to navigate to other thumnail image in light box view
And   User click on close option from the thumnail displayed on light box
Then  Light box view should close and focus should go to product display page



Scenario: Validate the product name, brand name and product code dispalyed on product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
When  User click on "iMac" link of product from search results page  
Then  User should be taken to product dispaly page of the product
Then  User should verify product name, brand name and product code dispalyed on product display page



Scenario: Validate the quantity field should not accept zero or negative value in product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
When  User will update quantity in qty textfield by providing a "-1" value and click on addtocart button
Then  A field level warn message'Quantity should be a positive number'should display on product display page



Scenario: Validate the user is able to write a review for product from reviews tab of product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
When  User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
And   User click on reviews tab of product in the displayed product display page
Then  Review tab should be opened in product display page
When  User enter "your name" textfield and "your review" textfield and select radio button for ratings
And   User click on continue button of review from product display page 
Then  Success message with text 'Thank you for your review' should be displayed on product display page 



Scenario: Validate the reviews tab when there are no reviews or zero reviews added
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page  
Then  User should be taken to product dispaly page of the product
When  User click on reviews tab of product in the displayed product display page
Then  Review tab should be opened in product display page
When  User will not enter any review text fields from product display page 
And   User click on continue button of review from product display page 
Then  Proper message of 'There are no reviews for this product' should display on product display page  



Scenario: Validate adding the product to wishlist from product display page
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



Scenario: Validate adding the product to product comparision page from product display page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
When  User click on the product compare button of product from product display page
Then  Success message of'Product Added To Product Comparision'should displayed in product display page
When  User click on product comparision link from the success message
Then  User should be taken to product comparision page  



Scenario: Validate navigating to product display page from wishlistpage
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
And   User click on the wishlist button of product from product dispaly page 
Then  Success message for'Product Added To Wishlist'should be displayed in product display page
When  User click on wishlist link from the success message of product display page
Then  User should be taken to wishlist page and product "iMac" should be displayed
When  User click on the product "iMac" link from wishlist page
Then  User should be taken to product dispaly page of the product



Scenario: Validate navigating to product display page from product compare page
Given User launchs chrome browser
When  User enter existing product name "iMac" into search textfield
And   User click on the button having search icon 
Then  Searched product "iMac" should be displayed in the search results page
And   User click on "iMac" link of product from search results page 
Then  User should be taken to product dispaly page of the product
When  User click on the product compare button of product from product display page 
Then  Success message of'Product Added To Product Comparision'should displayed in product display page
And   User click on product comparision link from the success message
Then  User should be taken to product comparision page 
When  User click on the product "iMac" link from product compare page
Then  User should be taken to product dispaly page of the product





   