package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Checkoutpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Loginpage;
import com.tutorialsninja.pageobject.Orderplacedpage;
import com.tutorialsninja.pageobject.PCpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC011_HomepageTest extends BaseClass {
	
	Checkoutpage checkoutpage;
	Loginpage loginpage;
	Orderplacedpage orderplacedpage;
	Homepage homepage;
	PCpage pcpage;
	
	@When("User enter email field as {string} and password field as {string} on checkout options tab")
	public void user_enter_email_field_as_and_password_field_as_on_checkout_options_tab(String email, String password) {
	    
		loginpage  = new Loginpage(driver);
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
	}

	@When("User click on loginbutton of checkout options tab")
	public void user_click_on_loginbutton_of_checkout_options_tab() {
	
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnLoginButton();
	}

	@Then("New tab of account and billing details should display in checkoutpage")
	public void new_tab_of_account_and_billing_details_should_display_in_checkoutpage() {
	   
		checkoutpage = new Checkoutpage(driver);
		log.info("New Tab For Account And Billing Details Were Displayed In Checkoutpage");
	}

	@When("User select'Existing Address'radio button and click continue button of billing details tab")
	public void user_select_existing_address_radio_button_and_click_continue_button_of_billing_details_tab() {
	    
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnAddressRadioButton("existing");
		checkoutpage.clickOnBillContinueButton();
	}

	@Then("New tab of delivery details should display in checkoutpage")
	public void new_tab_of_delivery_details_should_display_in_checkoutpage() {
	    
		checkoutpage = new Checkoutpage(driver);
		log.info("New Tab For Delivery Details Were Displayed In Checkoutpage");
	}

	@When("User select'Existing Address'radio button and click continue button of delivery details tab")
	public void user_select_existing_address_radio_button_and_click_continue_button_of_delivery_details_tab() {
	   
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnAddressRadioButton("existing");
		checkoutpage.clickOnShippingAddressContinueButton();
	}

	@Then("New tab of delivery method should display in checkoutpage")
	public void new_tab_of_delivery_method_should_display_in_checkoutpage() {
	
		checkoutpage = new Checkoutpage(driver);
		log.info("New Tab For Delivery Method Were Displayed In Checkoutpage");
	}

	@When("User click on continue button of delivery method tab")
	public void user_click_on_continue_button_of_delivery_method_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnShippingMethodContinueButton();
	}

	@Then("New tab of payment method should display in checkoutpage")
	public void new_tab_of_payment_method_should_display_in_checkoutpage() {
	    
		checkoutpage = new Checkoutpage(driver);
		log.info("New Tab For Payment Method Were Displayed In Checkoutpage");
	}

	@When("User click on'Cash On Delivery'radio button and select terms and conditions checkbox")
	public void user_click_on_cash_on_delivery_radio_button_and_select_terms_and_conditions_checkbox() {
	    
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnAgreeCheckBox();
	}

	@When("User click on continue button of payment method tab")
	public void user_click_on_continue_button_of_payment_method_tab() {
	    
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnPaymentButtonContinueButton();
	}

	@Then("New tab of confirm order should display in checkoutpage")
	public void new_tab_of_confirm_order_should_display_in_checkoutpage() {
	    
		checkoutpage = new Checkoutpage(driver);
		log.info("New Tab For Confirm order Were Displayed In Checkoutpage");
	}

	@When("User click on confirm order button of confirm order tab")
	public void user_click_on_confirm_order_button_of_confirm_order_tab() {
	   
		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnOrderConfirmButton();
	}

	@Then("User should be taken to orderhasbeenplaced page")
	public void user_should_be_taken_to_orderhasbeenplaced_page() {
	   
		orderplacedpage = new Orderplacedpage(driver);
		Assert.assertEquals(orderplacedpage.getOrderplacedPageTitle(), config.getOrderPlacedPageTitle());
		Assert.assertTrue(orderplacedpage.isDisplayedSuccessOnBedcrum());
	}

	@Then("Order success'Your order has been successfully processed!'text should display in orderhasbeenplaced page")
	public void order_success_your_order_has_been_successfully_processed_text_should_display_in_orderhasbeenplaced_page() {
	  
		orderplacedpage = new Orderplacedpage(driver);
		Assert.assertEquals(orderplacedpage.getOrderplacedMessage(), "Your order has been placed!");
	}

	@When("User click on continue button of orderhasbeenplaced page")
	public void user_click_on_continue_button_of_orderhasbeenplaced_page() {
	    
		orderplacedpage = new Orderplacedpage(driver);
		orderplacedpage.clickOnContinueButton();
	}

	@When("User hover mouse on any menu say'Desktops'and select 'PC\\({int})'option")
	public void user_hover_mouse_on_any_menu_say_desktops_and_select_pc_option(Integer int1) {
	   
		homepage = new Homepage(driver);
		homepage.hoverMouseOnDesktop();
		homepage.clickOnPCLink();
	}

	@Then("User should be taken to PC page")
	public void user_should_be_taken_to_pc_page() {
	   
		pcpage = new PCpage(driver);
		Assert.assertEquals(pcpage.getPCPageTitle(), config.getPCPageTitle());
	}

	@Then("Proper text'There are no products to list in this category.'should display in PC page")
	public void proper_text_there_are_no_products_to_list_in_this_category_should_display_in_pc_page() {
	    
		pcpage = new PCpage(driver);
		Assert.assertEquals(pcpage.getPCPageEmptyMsg(), "There are no products to list in this category.");
	}

	@When("User click on continue button of PC page")
	public void user_click_on_continue_button_of_pc_page() {
	    
		pcpage = new PCpage(driver);
		pcpage.clickOnContinueButton();
	}
	
}
