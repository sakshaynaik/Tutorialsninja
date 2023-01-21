package com.tutorialsninja.stepdefination;

import java.util.Map;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Contactuspage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Orderplacedpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC026_ContactUsTest extends BaseClass {

	Homepage homepage;
	Contactuspage contactuspage;
	Orderplacedpage orderplacedpage;

	@When("User click on phone icon option from header options")
	public void user_click_on_phone_icon_option_from_header_options() {

		homepage = new Homepage(driver);
		homepage.clickOnTelephoneOption();

	}

	@Then("User should be taken to contact us page")
	public void user_should_be_taken_to_contact_us_page() {

		contactuspage = new Contactuspage(driver);
		Assert.assertEquals(contactuspage.getContactUsPageTitle(), config.getContactUsPageTitle());
		Assert.assertTrue(contactuspage.isDisplayedContactUsOnBedCrum());
	}

	@When("User click on contact us link from footer options")
	public void user_click_on_contact_us_link_from_footer_options() {

		homepage = new Homepage(driver);
		homepage.clickOnContactUsLink();
	}

	@When("User click on store owner link of orderhasbeenplaced page")
	public void user_click_on_store_owner_link_of_orderhasbeenplaced_page() {

		orderplacedpage = new Orderplacedpage(driver);
		orderplacedpage.clickOnStoreOwnerLink();
	}

	@When("User enter following details into field")
	public void user_enter_following_details_into_field(DataTable dataTable) {

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		contactuspage = new Contactuspage(driver);
		contactuspage.enterYourNameTextField(hMap.get("Firstname"));
		contactuspage.enterEmailAddressTextField(hMap.get("Emailaddress"));
		contactuspage.enterEnquiryTextField(hMap.get("Enquiry"));
	}

	@Then("Success message {string} should display in contact us page")
	public void success_message_should_display_in_contact_us_page(String string) {

		Assert.fail("Blank Contact Us Page Is Displayed On Submitting Form In Contact Us Page");
	}

	@Then("User click on submit button of contact us page")
	public void user_click_on_submit_button_of_contact_us_page() {

		contactuspage = new Contactuspage(driver);
		contactuspage.clickOnSubmittButton();
	}

	@Then("Field level warn message should display in contact us page")
	public void field_level_warn_message_should_display_in_contact_us_page() {

		contactuspage = new Contactuspage(driver);
		Assert.assertEquals(contactuspage.getInvalidEmailMsg(), "E-Mail Address does not appear to be valid!");
	}

	@Then("Enquiry warn message {string} should display in contact us page")
	public void Enquiry_warn_message_should_display_in_contact_us_page(String string) {

		contactuspage = new Contactuspage(driver);
		Assert.assertEquals(contactuspage.getInvalidEnquiryMsg(), string);
	}
	
	@When("User enter following details into enquiry field")
	public void user_enter_following_details_into_enquiry_field(DataTable dataTable) {
	    
		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		contactuspage = new Contactuspage(driver);
		contactuspage.enterEnquiryTextField(hMap.get("Enquiry"));
	}

	@When("User click on continue button of contact us page")
	public void user_click_on_continue_button_of_contact_us_page() {

		contactuspage = new Contactuspage(driver);
		contactuspage.clickOnContinueButton();
	}
}
