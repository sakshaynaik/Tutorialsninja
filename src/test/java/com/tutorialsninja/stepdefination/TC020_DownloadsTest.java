package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Downloadspage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC020_DownloadsTest extends BaseClass {

	Downloadspage downloadspage;

	@Then("User should be taken to downloads page")
	public void user_should_be_taken_to_downloads_page() {

		downloadspage = new Downloadspage(driver);
		Assert.assertEquals(downloadspage.getDownloadsPageTitle(), config.getDownloadsPageTitle());
		Assert.assertTrue(downloadspage.isDisplayedDownloadsOnBedCrum());
	}

	@Then("Proper text for no downloadable orders should be displayed in downloads page")
	public void proper_text_for_no_downloadable_orders_should_be_displayed_in_downloads_page() {

		downloadspage = new Downloadspage(driver);
		Assert.assertEquals(downloadspage.gettxtOnDownloadsPage(),
				"You have not made any previous downloadable orders!");
	}

	@When("User click on continue button of downloads page")
	public void user_click_on_continue_button_of_downloads_page() {

		downloadspage = new Downloadspage(driver);
		downloadspage.clickOncontinuebutton();
	}

	@Then("User verify all the details of downloadable orders placed\\(order id, status, product)")
	public void user_verify_all_the_details_of_downloadable_orders_placed_order_id_status_product() {

		Assert.fail("There Are No Products In Website To Place A Downloadable Orders");
	}

}
