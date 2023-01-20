

Feature: SpecialOffers Functionality
Validate the working of specialoffer functionality


Scenario: Verify navigation to specialoffer page from footer options
When  User click on specials link from footer section
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page


Scenario: Verify navigation to specialoffer page from sitemap page 
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
When  User click on "Special Offers" link from sitemap page
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page



Scenario: Verify viewing the products in specialoffers page in list view
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Special Offers" link from sitemap page
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page
When  User select the list view option in specialoffers page
Then  All products in specialoffers page should display in list view 




Scenario: Verify viewing the products in specialoffers page in grid view
Given User launchs chrome browser
When  User click on sitemap link from footer section
Then  User should be taken to sitemap page
When  User click on "Special Offers" link from sitemap page
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page
When  User select the grid view option in specialoffers page
Then  All products in specialoffers page should display in grid view




Scenario: Verify adding the product to product display page from specialoffers page
Given User launchs chrome browser
When  User click on specials link from footer section
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page
When  User click on add to cart button from specialoffers page 
Then  User should be taken to product dispaly page of the product


Scenario: Verify adding the product to wishlist page from specialoffers page
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on specials link from footer section
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page
When  User click on the wishlist button of product from specialoffers page 
Then  Success message for'Product Added To Wishlist'should be displayed in specialoffers page
When  User click on wishlist link from the success message of specialoffers page
Then  User should be taken to wishlist page and product "Canon EOS 5D" should be displayed


Scenario: Verify adding the product to product comparison page from specialoffers page
Given User launchs chrome browser
When  User click on specials link from footer section
Then  User should be taken to specialoffers page
And   Product "Canon EOS 5D" should display in specialoffers page
When  User click on the product comparison button of product from specialoffers page 
Then  Success message for'Product Added To product comparison'should be displayed in specialoffers page
When  User click on product comparison link from the success message of specialoffers page
Then  User should be taken to product comparision page 













