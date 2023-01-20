

Feature: ContactUs Functionality
Validate working of contactus functionality


Scenario: Verify navigation to contactus page from headeroption
Given  User launchs chrome browser
When   User click on phone icon option from header options
Then   User should be taken to contact us page



Scenario: Verify navigation to contactus page from footeroption
Given  User launchs chrome browser
When   User click on contact us link from footer options
Then   User should be taken to contact us page



Scenario: Verify navigation to contactus page from ordersuccesspage
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
When  User click on store owner link of orderhasbeenplaced page
Then  User should be taken to contact us page 




Scenario: Verify submitting the contact form in contact us page by providing all details
Given  User launchs chrome browser
When   User click on phone icon option from header options
Then   User should be taken to contact us page
When   User enter following details into field
|  Firstname      |      Akshay                                                    |
|  Emailaddress   |     akshaysnaik1111@gmail.com                                  |
|  Enquiry        | Greatings The product added to cart are not getting approved   |
And    User click on submit button of contact us page
Then   Success message "Your Enquiry Has Been Submitted" should display in contact us page




Scenario: Verify submitting the contact form in contact us page by not providing any details
Given  User launchs chrome browser
When   User click on phone icon option from header options
Then   User should be taken to contact us page
And    User click on submit button of contact us page
Then   Field level warn message should display in contact us page



Scenario: Verify submitting the contact form in contact us page by not providing any details after login
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on phone icon option from header options
Then  User should be taken to contact us page
And   User click on submit button of contact us page
Then  Enquiry warn message "Enquiry must be between 10 and 3000 characters!" should display in contact us page



Scenario: Verify submitting the contact form in contact us page by providing all details after login
Given User launchs chrome browser
When  User enter URL and click on myaccount dropmenu
Then  Login option should display in myaccount dropmenu
And   User click on login option from myaccount dropmenu
Then  User should be taken to account login page
When  User enter email field as "kishore8@gmail.com" and password field as "12345"
And   User click on loginbutton from loginpage
Then  User should get logged-in and taken to account page
When  User click on phone icon option from header options
Then  User should be taken to contact us page
When  User enter following details into enquiry field
|  Enquiry        | Greatings The product added to cart are not getting approved   |
And   User click on submit button of contact us page




Scenario: Verify continue button on contact us page
Given  User launchs chrome browser
When   User click on phone icon option from header options
Then   User should be taken to contact us page
When   User enter following details into field
|  Firstname      |      Akshay                                                    |
|  Emailaddress   |     akshaysnaik1111@gmail.com                                  |
|  Enquiry        | Greatings The product added to cart are not getting approved   |
And    User click on submit button of contact us page
When   User click on continue button of contact us page
Then   User should be taken to homepage











