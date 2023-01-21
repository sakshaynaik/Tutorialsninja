package com.tutorialsninja.stepdefination;

import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Loginpage;
import com.tutorialsninja.pageobject.Registerationpage;
import com.tutorialsninja.pageobject.Successpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_RegistrationTest extends BaseClass {

	Homepage homepage;
	Loginpage loginpage;
	Registerationpage registerationpage;
	Successpage successpage;
	Accountpage accountpage;

	@Before
	public void setUp() {

		setBrowserAndNavigateToWebPage();
	}

	@After
	public void tearDown(Scenario scenario) {

		String scenarioname = scenario.getName().replaceAll(" ", "_");
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenarioname);
		}
		quitBrowser();
	}

	@Given("User launchs chrome browser")
	public void user_launchs_chrome_browser() {

		log.info("User Has Launched Chrome Browser");
	}

	@When("User enter URL and click on myaccount dropmenu")
	public void user_enters_url_and_clicks_on_myaccount_dropmenu() {

		homepage = new Homepage(driver);
		homepage.clickOnMyAccountDropMenu();
	}

	@Then("Register option should display in myaccount dropmenu")
	public void register_option_should_display_in_myaccount_dropmenu() {

		homepage = new Homepage(driver);
		Assert.assertTrue(homepage.isDisplayedRegisterOption());
	}

	@Then("User click on register option from myaccount dropmenu")
	public void user_clicks_on_register_option_from_myaccount_dropmenu() {

		homepage = new Homepage(driver);
		homepage.clickOnRegisterLink();
	}

	@Then("User should be taken to register account page")
	public void user_should_be_taken_to_register_account_page() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getRegPageTitle(), config.getRegisterationPageTitle());
		Assert.assertTrue(registerationpage.isDisplayedRegisterOnBreadCrum());
	}

	@When("User enters below details into textfields")
	public void user_enters_below_details_into_textfields(DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(getRandomStringValue(5) + "@gmail.com");
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

	@When("User select privacypolicy checkbox and click on continue button")
	public void user_selects_privacypolicy_checkbox_and_clicks_on_continue_button() {

		registerationpage = new Registerationpage(driver);
		registerationpage.clickOnPriveryPolicyField();
		registerationpage.clickOnContinueButton();
	}

	@Then("User should get logged in and taken to account success page with account success message")
	public void user_should_be_logged_in_and_taken_to_account_success_page_with_proper_success_message() {

		successpage = new Successpage(driver);
		Assert.assertEquals(successpage.getSuccessPageTitle(), config.getSuccessPageTitle());
		Assert.assertEquals(successpage.getHeadingAccountSuccessMsg(), "Your Account Has Been Created!");
	}

	@Then("User click on continue button that is dispalyed on account success page")
	public void user_clicks_on_continue_button_that_is_dispalyed_on_account_success_page() {

		successpage = new Successpage(driver);
		successpage.clickOnContinueButton();
	}

	@Then("User should be taken to account page")
	public void user_should_be_taken_to_account_page() {

		accountpage = new Accountpage(driver);
		Assert.assertEquals(accountpage.getAccountPageTitle(), config.getAccountPageTitle());
		Assert.assertTrue(accountpage.isDisplayedAccountLinkOnBedcrum());
		Assert.assertTrue(accountpage.isDisplayedEditInfoLink());
	}

	@When("User clicks on yes radio option for newsletter selects privacypolicy checkbox and click on continue button")
	public void user_clicks_on_yes_radio_option_for_newsletter_selects_privacypolicy_checkbox_and_clicks_on_continue_button() {

		registerationpage = new Registerationpage(driver);
		registerationpage.clickOnNewsLetterRadioButton();
		registerationpage.clickOnPriveryPolicyField();
		registerationpage.clickOnContinueButton();
	}

	@When("User click on continue button")
	public void user_clicks_on_continue_button() {

		registerationpage = new Registerationpage(driver);
		registerationpage.clickOnContinueButton();
	}

	@Then("A proper warning messages should be displayed for their respective textfields")
	public void a_proper_warning_messages_should_be_displayed_for_their_respective_textfields() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnFirstNameMsg(), "First Name must be between 1 and 32 characters!");
		Assert.assertEquals(registerationpage.getWarnLastNameMsg(), "Last Name must be between 1 and 32 characters!");
		Assert.assertEquals(registerationpage.getWarnEmailMsg(), "E-Mail Address does not appear to be valid!");
		Assert.assertEquals(registerationpage.getWarnTelephonemsg(), "Telephone must be between 3 and 32 characters!");
		Assert.assertTrue(
				registerationpage.getWarnPasswordMsg().contains("Password must be between 4 and 20 characters!"));
	}

	@Then("User click on myaccount dropmenu and click on login option")
	public void user_clicks_on_myaccount_dropmenu_and_clicks_on_login_option() {

		homepage = new Homepage(driver);
		homepage.clickOnMyAccountDropMenu();
		homepage.clickOnLoginLink();
	}

	@Then("User should be taken to account login page")
	public void user_should_be_taken_to_account_login_page() {

		loginpage = new Loginpage(driver);
		Assert.assertEquals(loginpage.getLoginPageTitle(), config.getLoginPageTitle());
		Assert.assertTrue(loginpage.isDisplayedLoginOnBedCrum());
	}

	@Then("User click on continue button inside new customer box")
	public void user_clicks_on_continue_button_inside_new_customer_box() {

		loginpage = new Loginpage(driver);
		loginpage.clickOnNewCustomerContinueButton();
	}

	@When("User will not enter any credentials in textfields")
	public void user_will_not_enter_any_credentials_in_textfields() {

		log.info("User Has Not Given Any Credentials");
	}

	@Then("User click on register link from right column options")
	public void user_clicks_on_register_link_from_right_column_options() {

		registerationpage = new Registerationpage(driver);
		registerationpage.clickOnRegisterLinkRightOption();
	}

	@Then("Account should not be created and Confirm Password Field warning message should be displayed")
	public void account_should_not_be_created_and_confirm_password_field_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnForPasswordDiffer(),
				"Password confirmation does not match password!");
	}

	@Then("Account should not be created and E-Mail field warning message should be displayed")
	public void account_should_not_be_created_and_e_mail_field_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnForAlredyRegisteredEmail(),
				"Warning: E-Mail Address is already registered!");
	}

	@Then("Account should not be created and Invalid E-Mail warning message should be displayed")
	public void account_should_not_be_created_and_invalid_e_mail_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnForInvalidEmail(), "E-Mail Address does not appear to be valid!");
	}

	@Then("Account should not be created and Telephone field warning message should be displayed")
	public void account_should_not_be_created_and_telephone_field_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.fail(
				"Warning Message Is Not Getting Displayed Instead An Account Is Getting Created With The Given Invalid Phone Number");
	}

	@When("User should not select privacypolicy checkbox and click on continue button")
	public void user_should_not_select_privacypolicy_checkbox_and_clicks_on_continue_button() {

		registerationpage = new Registerationpage(driver);
		registerationpage.clickOnContinueButton();
	}

	@Then("Account should not be created and Privacy Policy checkbox warning message should be displayed")
	public void account_should_not_be_created_and_privacy_policy_checkbox_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnPriveryMsg(), "Warning: You must agree to the Privacy Policy!");
	}

	@Then("Account should not be created and Password Confirm field warning message should be displayed")
	public void account_should_not_be_created_and_password_confirm_field_warning_message_should_be_displayed() {

		registerationpage = new Registerationpage(driver);
		Assert.assertEquals(registerationpage.getWarnForPasswordDiffer(),
				"Password confirmation does not match password!");
	}

	@When("User enters below details into textfields with different password and confirm password fields")
	public void user_enters_below_details_into_textfields_with_different_password_and_confirm_password_fields(
			DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(getRandomStringValue(5) + "@gmail.com");
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));

	}

	@When("User enters below details into textfields with already registered email")
	public void user_enters_below_details_into_textfields_with_already_registered_email(DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(hMap.get("email"));
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

	@When("User enters below details into textfields with invalid email")
	public void user_enters_below_details_into_textfields_with_invalid_email(DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(hMap.get("email"));
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

	@When("User enters below details into textfields with invalid phone number")
	public void user_enters_below_details_into_textfields_with_invalid_phone_number(DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(getRandomStringValue(5) + "@gmail.com");
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

	@When("User enters below details into textfields without selecting privacy policy checkbox")
	public void user_enters_below_details_into_textfields_without_selecting_privacy_policy_checkbox(
			DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(getRandomStringValue(5) + "@gmail.com");
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

	@When("User enters below details into textfields with password and without password confirm fields")
	public void user_enters_below_details_into_textfields_with_password_and_without_password_confirm_fields(
			DataTable dataTable) {

		registerationpage = new Registerationpage(driver);

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		registerationpage.enterFirstNameTextField(hMap.get("firstname"));
		registerationpage.enterLastNameTextField(hMap.get("lastname"));
		registerationpage.enterEmialTextField(getRandomStringValue(5) + "@gmail.com");
		registerationpage.enterTelephoneTextField(hMap.get("telephone"));
		registerationpage.enterPasswordTextField(hMap.get("password"));
		registerationpage.enterConfirmPasswordTextField(hMap.get("confrmpasswrd"));
	}

}
