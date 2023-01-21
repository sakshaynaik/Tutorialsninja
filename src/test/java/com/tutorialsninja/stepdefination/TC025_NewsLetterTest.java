package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.NewsletterSubscriptionpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC025_NewsLetterTest extends BaseClass {

	NewsletterSubscriptionpage newslettersubscriptionpage;
	Homepage homepage;
	Accountpage accountpage;

	@Then("User should be taken to newsletter subscription page")
	public void user_should_be_taken_to_newsletter_subscription_page() {

		newslettersubscriptionpage = new NewsletterSubscriptionpage(driver);
		Assert.assertEquals(newslettersubscriptionpage.getNewsletterPageTitle(), config.getNewsletterPageTitle());
		Assert.assertTrue(newslettersubscriptionpage.isDisplayedNewsLetterOnBreadCrum());
	}

	@When("User click on {string} link from footer options")
	public void user_click_on_link_from_footer_options(String string) {

		homepage = new Homepage(driver);
		homepage.clickOnFooterNewsLetterLink();
	}

	@Then("Yes radio option should be displayed as selected by default in newsletter subscription page")
	public void yes_radio_option_should_be_displayed_as_selected_by_default_in_newsletter_subscription_page() {

		newslettersubscriptionpage = new NewsletterSubscriptionpage(driver);
		Assert.assertTrue(newslettersubscriptionpage.isSelectedNewsletterRadioOption());
	}

	@Then("No radio option should be displayed as selected by default in newsletter subscription page")
	public void no_radio_option_should_be_displayed_as_selected_by_default_in_newsletter_subscription_page() {

		newslettersubscriptionpage = new NewsletterSubscriptionpage(driver);
		Assert.assertTrue(newslettersubscriptionpage.isSelectedNewsletterRadioOptionForNo());
	}

	@When("User click on continue button of newsletter subscription page")
	public void user_click_on_continue_button_of_newsletter_subscription_page() {

		newslettersubscriptionpage = new NewsletterSubscriptionpage(driver);
		newslettersubscriptionpage.clickOnContinueButton();
	}

	@Then("Success message {string} should display in account page")
	public void success_message_should_display_in_account_page(String string) {

		  accountpage = new Accountpage(driver);
		  Assert.assertEquals(accountpage.getNewsLetterSuccessMsg(), string);
	}

	@When("User click on back button of newsletter subscription page")
	public void user_click_on_back_button_of_newsletter_subscription_page() {

		newslettersubscriptionpage = new NewsletterSubscriptionpage(driver);
		newslettersubscriptionpage.clickOnBackButton();
	}
}
