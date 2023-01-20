package com.tutorialsninja.stepdefination;

import org.junit.Assert;

import com.tutorialsninja.pageobject.Homepage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC029_HeaderFooterOptionTest extends BaseClass {

	Homepage homepage;

	@When("User click on about us link from footer section")
	public void user_click_on_about_us_link_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnAboutUsLink();
	}

	@Then("User should be taken to about us page")
	public void user_should_be_taken_to_about_us_page() {

		Assert.fail("Page Text Is Not Displayed In WebPage");
	}

	@When("User click on delivery information link from footer section")
	public void user_click_on_delivery_information_link_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnDeliveryInfoLink();
	}

	@Then("User should be taken to delivery information page")
	public void user_should_be_taken_to_delivery_information_page() {

		Assert.fail("Page Text Is Not Displayed In WebPage");
	}

	@When("User click on privacy policy link from footer section")
	public void user_click_on_privacy_policy_link_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnPrivercyAndPolicyLinkLink();
	}

	@Then("User should be taken to privacy policy page")
	public void user_should_be_taken_to_privacy_policy_page() {

		Assert.fail("Page Text Is Not Displayed In WebPage");
	}

	@When("User click on terms and condition link from footer section")
	public void user_click_on_terms_and_condition_link_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnTermsAndConditionLink();
	}

	@Then("User should be taken to terms and condition page")
	public void user_should_be_taken_to_terms_and_condition_page() {

		Assert.fail("Page Text Is Not Displayed In WebPage");
	}

	@When("User randomly click on menu bar")
	public void user_randomly_click_on_menu_bar() {

		homepage = new Homepage(driver);
		homepage.clickOnRandomTopHeaderLink();
	}

	@Then("User should be taken to appropiate pages")
	public void user_should_be_taken_to_appropiate_pages() {

		log.info("User Taken To Appropriate Test");
	}

	@When("User randomly click on footer options")
	public void user_randomly_click_on_footer_options() {

		homepage = new Homepage(driver);
		homepage.clickOnRandomFooterInfoLinks();
	}

}
