package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountlogoutpage;
import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Loginpage;

import io.cucumber.java.en.Then;

public class TC003_LogoutTest extends BaseClass {

	Accountpage accountpage;
	Accountlogoutpage accountlogoutpage;
	Homepage homepage;
	Loginpage loginpage;

	@Then("User click on myaccont drop menu and select logout option")
	public void user_click_on_myaccont_drop_menu_and_select_logout_option() {

		accountpage = new Accountpage(driver);
		accountpage.clickOnMyAccountDropMenu();
		accountpage.clickLogoutOption();
	}

	@Then("User should be taken to account logout page and login option should display in myaccount dropmenu")
	public void user_should_be_taken_to_account_logout_page_and_login_option_should_display_in_myaccount_dropmenu() {

		accountlogoutpage = new Accountlogoutpage(driver);
		Assert.assertEquals(accountlogoutpage.getAccountLogoutPageTitle(), config.getAccountLogoutPageTitle());

		accountpage = new Accountpage(driver);
		accountpage.clickOnMyAccountDropMenu();
		Assert.assertTrue(accountpage.isDisplayedLoginOption());
	}

	@Then("User click on continue button from account logout page")
	public void user_click_on_continue_button_from_account_logout_page() {

		accountlogoutpage = new Accountlogoutpage(driver);
		accountlogoutpage.clickOnContinueButton();
	}

	@Then("User should be taken to homepage")
	public void user_should_be_taken_to_homepage() {

		homepage = new Homepage(driver);
		Assert.assertEquals(homepage.getHomePageTitle(), config.getHomePageTitle());
		Assert.assertTrue(homepage.isDisplayedYourStoreLogo());
	}

	@Then("User click on logout option from the right column")
	public void user_click_on_logout_option_from_the_right_column() {

		accountpage = new Accountpage(driver);
		accountpage.clickLogoutOption();
	}

	@Then("User should be taken to account logout page and login option should display in right options column")
	public void user_should_be_taken_to_account_logout_page_and_login_option_should_display_in_right_options_column() {

		accountlogoutpage = new Accountlogoutpage(driver);
		Assert.assertEquals(accountlogoutpage.getAccountLogoutPageTitle(), config.getAccountLogoutPageTitle());

		accountpage = new Accountpage(driver);
		Assert.assertTrue(accountpage.isDisplayedLoginOption());
	}

	@Then("User should not get logged-in")
	public void user_should_not_get_logged_in() {

		accountpage = new Accountpage(driver);
		accountpage.refreshByJavascript();
		Assert.assertTrue(accountpage.isDisplayedLoginOption());
	}

	@Then("User click on login option from right cloumn")
	public void user_click_on_login_option_from_right_cloumn() {

		accountpage = new Accountpage(driver);
		accountpage.clickOnLoginOption();
	}

	@Then("Logout option should not be dispalyed before logging-in")
	public void logout_option_should_not_be_dispalyed_before_logging_in() {

		accountpage = new Accountpage(driver);
		Assert.assertTrue(accountpage.isDisplayedLoginOption());
	}

}
