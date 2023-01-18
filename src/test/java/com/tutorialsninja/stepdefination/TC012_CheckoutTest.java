package com.tutorialsninja.stepdefination;

import java.util.Map;

import com.tutorialsninja.pageobject.Checkoutpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Shoppingcartpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC012_CheckoutTest extends BaseClass {

	Homepage homepage;
	Shoppingcartpage shoppingcartpage;
	Checkoutpage checkoutpage;

	@When("User click on checkout link from header option")
	public void user_click_on_checkout_link_from_header_option() {

		homepage = new Homepage(driver);
		homepage.clickOnCheckoutHeaderOption();
	}

	@When("User click on continue button of shoppingcart page")
	public void user_click_on_continue_button_of_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnContinueButton();
	}

	@Then("User click on checkout option in the displayed cart block")
	public void user_click_on_checkout_option_in_the_displayed_cart_block() {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnCartBlackBoxButton();
		shoppingcartpage.clickOnCartBlackBoxCheckoutlink();
	}

	@When("User select'New Address'radio button and enter below details into textfield of billing details tab")
	public void user_select_new_address_radio_button_and_enter_below_details_into_textfield_of_billing_details_tab(
			DataTable dataTable) {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnAddressRadioButton("new");
		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		checkoutpage.enterFirstName(hMap.get("Firstname"));
		checkoutpage.enterLastName(hMap.get("Lastname"));
		checkoutpage.enterCompanyName(hMap.get("Company"));
		checkoutpage.enterAddress1(hMap.get("Address1"));
		checkoutpage.enterAddress2(hMap.get("Address2"));
		checkoutpage.enterCityName(hMap.get("city"));
		checkoutpage.enterPostalCode(hMap.get("Postcode"));
		checkoutpage.selectCountry(hMap.get("Country"));
		checkoutpage.selectZone(Integer.parseInt(hMap.get("State")));
	}

	@When("User click continue button of billing details tab")
	public void user_click_continue_button_of_billing_details_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnBillContinueButton();
	}

	@When("User click guest continue button of billing details tab")
	public void user_click_guest_continue_button_of_billing_details_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnGuestContinueButton();
	}

	@When("User select'Guest Checkout'radio button and click on continue button of checkout options tab")
	public void user_select_guest_checkout_radio_button_and_click_on_continue_button_of_checkout_options_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnGuestCheckoutRadioButton();
		checkoutpage.clickOnGuestCheckoutContinueButton();

	}

	@When("User enter following details into text field of billing details tab")
	public void user_enter_following_details_into_text_field_of_billing_details_tab(DataTable dataTable) {

		checkoutpage = new Checkoutpage(driver);
		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		checkoutpage.enterFirstName(hMap.get("Firstname"));
		checkoutpage.enterLastName(hMap.get("Lastname"));
		checkoutpage.enterEmailForPayment(hMap.get("Email"));
		checkoutpage.enterTelephoneForPayment(hMap.get("Telephone"));
		checkoutpage.enterCompanyName(hMap.get("Company"));
		checkoutpage.enterAddress1(hMap.get("Address1"));
		checkoutpage.enterAddress2(hMap.get("Address2"));
		checkoutpage.enterCityName(hMap.get("city"));
		checkoutpage.enterPostalCode(hMap.get("Postcode"));
		checkoutpage.selectCountry(hMap.get("Country"));
		checkoutpage.selectZone(Integer.parseInt(hMap.get("State")));
	}

	@When("User select'Register Account'radio button and click on continue button of checkout options tab")
	public void user_select_register_account_radio_button_and_click_on_continue_button_of_checkout_options_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnRegisterCheckoutRadioButton();
		checkoutpage.clickOnGuestCheckoutContinueButton();
	}

	@When("User enter following details into text field of account and billing details tab")
	public void user_enter_following_details_into_text_field_of_account_and_billing_details_tab(DataTable dataTable) {

		checkoutpage = new Checkoutpage(driver);
		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		checkoutpage.enterFirstName(hMap.get("Firstname"));
		checkoutpage.enterLastName(hMap.get("Lastname"));
		checkoutpage.enterEmailForPayment(hMap.get("Email"));
		checkoutpage.enterPasswordInTextField(hMap.get("password"));
		checkoutpage.enterConfirmPasswordInTextField(hMap.get("conpasswd"));
		checkoutpage.enterTelephoneForPayment(hMap.get("Telephone"));
		checkoutpage.enterCompanyName(hMap.get("Company"));
		checkoutpage.enterAddress1(hMap.get("Address1"));
		checkoutpage.enterAddress2(hMap.get("Address2"));
		checkoutpage.enterCityName(hMap.get("city"));
		checkoutpage.enterPostalCode(hMap.get("Postcode"));
		checkoutpage.selectCountry(hMap.get("Country"));
		checkoutpage.selectZone(Integer.parseInt(hMap.get("State")));
	}

	@When("User select'Privacy Policy'checkbox and click on continue button of account and billing details tab")
	public void user_select_privacy_policy_checkbox_and_click_on_continue_button_of_account_and_billing_details_tab() {

		checkoutpage = new Checkoutpage(driver);
		checkoutpage.clickOnPrivercyPolicy();
		checkoutpage.clickOnRegisterContinueButton();
	}

}
