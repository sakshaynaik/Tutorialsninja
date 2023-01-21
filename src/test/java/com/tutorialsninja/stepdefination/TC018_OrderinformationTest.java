package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Orderinformationpage;
import com.tutorialsninja.pageobject.Productreturnpage;
import com.tutorialsninja.pageobject.Shoppingcartpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC018_OrderinformationTest extends BaseClass {

	Orderinformationpage orderinformationpage;
	Shoppingcartpage shoppingcartpage;
	Productreturnpage productreturnpage;

	@When("User click on reorder icon option in the displayed orderinformation page")
	public void user_click_on_reorder_icon_option_in_the_displayed_orderinformation_page() {

		orderinformationpage = new Orderinformationpage(driver);
		orderinformationpage.clickOnReorderButton();
	}

	@When("User click on shopping cart link from the success message of orderinformation page")
	public void user_click_on_shopping_cart_link_from_the_success_message_of_orderinformation_page() {

		orderinformationpage = new Orderinformationpage(driver);
		orderinformationpage.clickOnShoppingCartLink();
	}

	@Then("User should be taken to shoppingcart page and product should be successfully displayed")
	public void user_should_be_taken_to_shoppingcart_page_and_product_should_be_successfully_displayed() {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.assertEquals(shoppingcartpage.getShoppingCartPageTitle(), config.getShoppingCartPageTitle());
	}

	@When("User click on return icon option in the displayed orderinformation page")
	public void user_click_on_return_icon_option_in_the_displayed_orderinformation_page() {

		orderinformationpage = new Orderinformationpage(driver);
		orderinformationpage.clickOnReturnOrderLink();
	}

	@Then("User should be taken to productreturns page")
	public void user_should_be_taken_to_productreturns_page() {

		productreturnpage = new Productreturnpage(driver);
		Assert.assertEquals(productreturnpage.getProductReturnPageTitle(), config.getProductReturnPageTitle());
		Assert.assertTrue(productreturnpage.isDisplayedProductReturnOnBreadCrum());
	}

	@When("User click on continue button of orderinformation page")
	public void user_click_on_continue_button_of_orderinformation_page() {

		orderinformationpage = new Orderinformationpage(driver);
		orderinformationpage.clickOnContinueButton();
	}

	@Then("Proper product order details should be displayed in orderinformation page")
	public void proper_product_order_details_should_be_displayed_in_orderinformation_page() {

		orderinformationpage = new Orderinformationpage(driver);
		log.info("Product Details: " + orderinformationpage.getOrderDetailsContent() + " "
				+ orderinformationpage.getOrderDetailsContent2());
	}
}
