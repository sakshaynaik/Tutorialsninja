package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Transactionhistorypage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC023_TransactionsTest extends BaseClass {

	Transactionhistorypage transactionhistorypage;
	Homepage homepage;

	@Then("User should be taken to yourtransaction page")
	public void user_should_be_taken_to_yourtransaction_page() {

		transactionhistorypage = new Transactionhistorypage(driver);
		Assert.assertEquals(transactionhistorypage.getTransactionHistoryPageTitle(),
				transactionhistorypage.getTransactionHistoryPageTitle());
		Assert.assertTrue(transactionhistorypage.isDisplayedTransactionOnBreadCrum());
	}

	@When("User click on myaccount dropmenu and select {string} option")
	public void user_click_on_myaccount_dropmenu_and_select_option(String string) {

		homepage = new Homepage(driver);
		homepage.clickOnMyAccountDropMenu();
		homepage.clickOnDynamicLinkInMyAccountMenu(string);
		
	}

	@Then("Text {string} should display in yourtransaction page")
	public void text_should_display_in_yourtransaction_page(String string) {

		transactionhistorypage = new Transactionhistorypage(driver);
		Assert.assertEquals(transactionhistorypage.getBalanceInTHpage(), string);
		
	}

	@When("User click on continue button of yourtransaction page")
	public void user_click_on_continue_button_of_yourtransaction_page() {

		transactionhistorypage = new Transactionhistorypage(driver);
		transactionhistorypage.clickOnContinueButton();
	}

	@When("User place few orders and complete the payment for the orders placed")
	public void user_place_few_orders_and_complete_the_payment_for_the_orders_placed() {

		log.info("No Products Available To Get Transaction History");
	}

	@Then("Table with column-date added, description and amount should display in yourtransaction page")
	public void table_with_column_date_added_description_and_amount_should_display_in_yourtransaction_page() {

		Assert.fail("No Products Available To Get Transaction History");
	}
}
