package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Recurringpaymentpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC024_RecurringPaymentTest extends BaseClass {

	Recurringpaymentpage recurringpaymentpage;

	@Then("User should be taken to recurring payment page")
	public void user_should_be_taken_to_recurring_payment_page() {

		recurringpaymentpage = new Recurringpaymentpage(driver);
		Assert.assertEquals(recurringpaymentpage.getRecurrigPaymentPageTitle(), config.getRecurringPaymentPageTitle());
	}

	@Then("Text {string} should display in recurring payment page")
	public void text_should_display_in_recurring_payment_page(String string) {

		recurringpaymentpage = new Recurringpaymentpage(driver);
		Assert.assertEquals(recurringpaymentpage.getRecurringPaymentMsg(), string);
	}

	@When("User click on continue button of recurring payment page")
	public void user_click_on_continue_button_of_recurring_payment_page() {

		recurringpaymentpage = new Recurringpaymentpage(driver);
		recurringpaymentpage.clickOnContinueButton();
	}

	@Then("Details of recurring payments made by the user should display in recurring payment page")
	public void details_of_recurring_payments_made_by_the_user_should_display_in_recurring_payment_page() {

		Assert.fail("There Are No Functionality In The Application For Doing Recurring Payments");
	}

}
