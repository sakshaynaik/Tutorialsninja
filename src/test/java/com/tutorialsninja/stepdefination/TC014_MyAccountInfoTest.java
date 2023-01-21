package com.tutorialsninja.stepdefination;

import java.util.Map;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Myaccountinfopage;
import com.tutorialsninja.pageobject.Sitemappage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC014_MyAccountInfoTest extends BaseClass {

	Accountpage accountpage;
	Myaccountinfopage myaccountpageinfo;
	Sitemappage sitemappage;

	@When("User click on {string} link on account page")
	public void user_click_on_link_on_account_page(String string) {

		accountpage = new Accountpage(driver);
		accountpage.clickOnDynamicLinksOnAccountPage(string);
	}

	@Then("User should be taken to myaccountinfo page")
	public void user_should_be_taken_to_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		Assert.assertEquals(myaccountpageinfo.getMyAccountInfoPageTitle(), config.getMyAccountInfoPageTitle());
		Assert.assertTrue(myaccountpageinfo.isDisplayedEditInfoLinkOnBreadCrum());
	}

	@When("User click on {string} link from right column options of account page")
	public void user_click_on_link_from_right_column_options_of_account_page(String string) {

		accountpage = new Accountpage(driver);
		accountpage.clickOnDynamicRightColumnOptions(string);
	}

	@When("User click on {string} link from sitemap page")
	public void user_click_on_link_from_sitemap_page(String string) {

		sitemappage = new Sitemappage(driver);
		sitemappage.clickOnDynamicLinksOnSiteMapPage(string);
	}

	@When("User enters following data into fields")
	public void user_enters_following_data_into_fields(DataTable dataTable) {

		myaccountpageinfo = new Myaccountinfopage(driver);
		Map<String, String> hMap = dataTable.asMap(String.class, String.class);
		myaccountpageinfo.enterNewEmail(hMap.get("Email"));
		myaccountpageinfo.enterNewFirstName(hMap.get("Firstname"));
		myaccountpageinfo.enterNewLastName(hMap.get("Lastname"));
		myaccountpageinfo.enterNewTelephoneNumber(hMap.get("Telephone"));
	}

	@When("User click on continue button of myaccountinfo page")
	public void user_click_on_continue_button_of_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		myaccountpageinfo.clickOnContinueButton();
	}

	@Then("Success message of'Account Updated'Should display in accountpage")
	public void success_message_of_account_updated_should_display_in_accountpage() {

		accountpage = new Accountpage(driver);
		Assert.assertTrue(
				accountpage.getUpdatedSuccessMsg().contains("Success: Your account has been successfully updated."));

	}

	@When("User will clear all the existing credentials from myaccountinfo page")
	public void user_will_clear_all_the_existing_credentials_from_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		myaccountpageinfo.enterNewEmail("");
		myaccountpageinfo.enterNewFirstName("");
		myaccountpageinfo.enterNewLastName("");
		myaccountpageinfo.enterNewTelephoneNumber("");
	}

	@Then("Warn message informing user to enter the mandatory fields should display in myaccountinfo page")
	public void warn_message_informing_user_to_enter_the_mandatory_fields_should_display_in_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		Assert.assertTrue(
				myaccountpageinfo.getTextInvalidEmailMsg().contains("E-Mail Address does not appear to be valid!"));
		Assert.assertTrue(myaccountpageinfo.getTextInvalidFirstNameMsg()
				.contains("First Name must be between 1 and 32 characters!"));
		Assert.assertTrue(myaccountpageinfo.getTextInvalidLastNameMsg()
				.contains("Last Name must be between 1 and 32 characters!"));
	}

	@Then("Warn message informing user to provide valid email format should display in myaccountinfo page")
	public void warn_message_informing_user_to_provide_valid_email_format_should_display_in_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		Assert.assertTrue(myaccountpageinfo.getTextInvalidEmailMsg()
				.contains("E-Mail Address does not appear to be valid!"));
	}


	@When("User click on back button of myaccountinfo page")
	public void user_click_on_back_button_of_myaccountinfo_page() {

		myaccountpageinfo = new Myaccountinfopage(driver);
		myaccountpageinfo.clickOnBackButton();
	}

}
