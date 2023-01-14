package com.tutorialsninja.stepdefination;

import org.junit.Assert;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Forgotyourpasswordpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Loginpage;

import io.cucumber.java.en.Then;

public class TC002_LoginTest extends BaseClass {

	Homepage homepage;
	Loginpage loginpage;
	Accountpage accountpage;
	Forgotyourpasswordpage forgotyourpasswordpage;

	@Then("Login option should display in myaccount dropmenu")
	public void login_option_should_display_in_myaccount_dropmenu() {

		homepage = new Homepage(driver);
		Assert.assertTrue(homepage.isDisplayedLoginOption());
	}

	@Then("User click on login option from myaccount dropmenu")
	public void user_click_on_login_option_from_myaccount_dropmenu() {

		homepage = new Homepage(driver);
		homepage.clickOnLoginLink();
	}

	@Then("User enter email field as {string} and password field as {string}")
	public void user_enter_email_field_as_and_password_field_as(String email, String password) {

		loginpage = new Loginpage(driver);
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
	}

	@Then("User click on loginbutton from loginpage")
	public void user_click_on_loginbutton_from_loginpage() {

		loginpage = new Loginpage(driver);
		loginpage.clickLoginButton();
	}

	@Then("User enter invalidemail as {string} and invalidpassword as {string}")
	public void user_enter_invalidemail_as_and_invalidpassword_as(String email, String password) {

		loginpage = new Loginpage(driver);
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
	}

	@Then("User should not get logged-in and warning message for invalid credentials should display")
	public void user_should_not_get_logged_in_and_warning_message_for_invalid_credentials_should_display() {

		loginpage = new Loginpage(driver);
		Assert.assertEquals(loginpage.getLoginPageTitle(), config.getLoginPageTitle());
		log.info(loginpage.getWarnInvalidLoginCredential());
		Assert.assertEquals(loginpage.getWarnInvalidLoginCredential(),
				"Warning: No match for E-Mail Address and/or Password.");
		Assert.assertTrue(loginpage.isDisplayedWarnInvalidLoginCredential());
	}

	@Then("User enter invalidemail as {string} and validpassword as {string}")
	public void user_enter_invalidemail_as_and_validpassword_as(String email, String password) {

		loginpage = new Loginpage(driver);
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
	}

	@Then("User should not enter any credentials in Email and Password Text fields")
	public void user_should_not_enter_any_credentials_in_email_and_password_text_fields() {

		log.info("User Will Not Enter Any Credentials Into Email And Password Fields");
	}

	@Then("User should be taken to account login page and forgotten password link should displayed")
	public void user_should_be_taken_to_account_login_page_and_forgotten_password_link_should_displayed() {

		loginpage = new Loginpage(driver);
		Assert.assertEquals(loginpage.getLoginPageTitle(), config.getLoginPageTitle());
		Assert.assertTrue(loginpage.isDisplayedForgotPasswordLink());
	}

	@Then("User click on forgotten password link from login page")
	public void user_click_on_forgotten_password_link_from_login_page() {

		loginpage = new Loginpage(driver);
		loginpage.clickOnForgotPasswordLink();
	}

	@Then("User should be taken to forgotten password page")
	public void user_should_be_taken_to_forgotten_password_page() {

		forgotyourpasswordpage = new Forgotyourpasswordpage(driver);
		Assert.assertEquals(forgotyourpasswordpage.getForgotPasswordPageTitle(), config.getForgotPasswrdPageTitle());
		Assert.assertTrue(forgotyourpasswordpage.isDisplayedForgetMsgContent());
	}

	@Then("User should get logged-in and taken to account page")
	public void user_should_get_logged_in_and_taken_to_account_page() {

		accountpage = new Accountpage(driver);
		Assert.assertEquals(accountpage.getAccountPageTitle(), config.getAccountPageTitle());
		Assert.assertTrue(accountpage.isDisplayedLogoutOption());
		Assert.assertTrue(accountpage.isDisplayedEditInfoLink());
		Assert.assertTrue(accountpage.isDisplayedAccountLinkOnBedcrum());
	}

	@Then("User click on browser back button")
	public void user_click_on_browser_back_button() {

		accountpage = new Accountpage(driver);
		accountpage.naviagteBack();
	}

	@Then("User should not get logged out from the application")
	public void user_should_not_get_logged_out_from_the_application() {

		homepage = new Homepage(driver);
		homepage.clickOnMyAccountDropMenu();
		Assert.assertTrue(homepage.isDisplayedLogoutOption());
	}

	@Then("User enter only password field as {string} and click on loginbutton")
	public void user_enter_only_password_field_as_and_click_on_loginbutton(String password) {

		loginpage = new Loginpage(driver);
		loginpage.enterRegisteredPassword(password);
		loginpage.clickLoginButton();
	}

	@Then("Password text should not be visible in pagesource")
	public void password_text_should_not_be_visible_in_pagesource() {

		loginpage = new Loginpage(driver);
		Assert.assertTrue(loginpage.getAttributeOfPasswordField("value") == null);
		log.info("Attribute for value:" + loginpage.getAttributeOfPasswordField("value"));

	}

	@Then("User clicks on login page link from right column options")
	public void user_clicks_on_login_page_link_from_right_column_options() {

		homepage = new Homepage(driver);
		homepage.clickOnLoginLink();
	}

}
