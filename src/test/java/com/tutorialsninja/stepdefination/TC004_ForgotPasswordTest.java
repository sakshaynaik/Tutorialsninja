package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Forgotyourpasswordpage;
import com.tutorialsninja.pageobject.Loginpage;

import io.cucumber.java.en.Then;

public class TC004_ForgotPasswordTest extends BaseClass {

	Forgotyourpasswordpage forgotyourpasswordpage;
	Loginpage loginpage;

	@Then("User enter email address of an existing account {string} for which password is forgotten")
	public void user_enter_email_address_of_an_existing_account_for_which_password_is_forgotten(String existemail) {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		forgotyourpasswordpage.enterEmailOfForgotenPassword(existemail);
	}

	@Then("User click on continue button from forgot password page")
	public void user_click_on_continue_button_from_forgot_password_page() {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		forgotyourpasswordpage.clickOnContinueButton();
	}

	@Then("Success message with email confirmation link sent to email address should display")
	public void success_message_with_email_confirmation_link_sent_to_email_address_should_display() {

		loginpage = new Loginpage(driver);
		Assert.assertEquals(loginpage.getEmailSentMsgForFP(),
				"An email with a confirmation link has been sent your email address.");
	}

	@Then("User enter email address {string} for which account doesnot exist in appliction")
	public void user_enter_email_address_for_which_account_doesnot_exist_in_appliction(String unregemail) {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		forgotyourpasswordpage.enterEmailOfForgotenPassword(unregemail);
	}

	@Then("Warn message for email address not found should display")
	public void warn_message_for_email_address_not_found_should_display() {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		Assert.assertTrue(forgotyourpasswordpage.isDisplayedWarnForUnregisteredEmail());
		Assert.assertEquals(forgotyourpasswordpage.getWarnForUnregisteredEmail(),
				"Warning: The E-Mail Address was not found in our records, please try again!");
	}

	@Then("Proper placeholder text should be displayed inside emailaddress textfield")
	public void proper_placeholder_text_should_be_displayed_inside_emailaddress_textfield() {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		Assert.assertTrue(forgotyourpasswordpage.getAttributeForEmailTextField("value") != null);
	}

	@Then("User enter invalid email {string} into emailaddress textfield")
	public void user_enter_invalid_email_into_emailaddress_textfield(String invalidemail) {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		forgotyourpasswordpage.enterEmailOfForgotenPassword(invalidemail);
	}

	@Then("User click on back button of forgotten password page")
	public void user_click_on_back_button_of_forgotten_password_page() {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		forgotyourpasswordpage.clickOnBackButton();
	}

	@Then("User click on forgotten password link from right column options")
	public void user_click_on_forgotten_password_link_from_right_column_options() {

		loginpage = new Loginpage(driver);
		loginpage.clickOnForgotPasswordLink();
	}

}
