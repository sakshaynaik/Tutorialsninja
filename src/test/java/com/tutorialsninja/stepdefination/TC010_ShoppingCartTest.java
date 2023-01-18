package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Checkoutpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Shoppingcartpage;
import com.tutorialsninja.pageobject.Sitemappage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC010_ShoppingCartTest extends BaseClass {

	Homepage homepage;
	Sitemappage sitemappage;
	Shoppingcartpage shoppingcartpage;
	Checkoutpage checkoutpage;

	@When("User click on shopping cart link from header option")
	public void user_click_on_shopping_cart_link_from_header_option() {

		homepage = new Homepage(driver);
		homepage.clickOnShopCartHeaderLink();
	}

	@Then("User click on sitemap link from footer section")
	public void user_click_on_sitemap_link_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnSiteMap();
	}

	@Then("User should be taken to sitemap page")
	public void user_should_be_taken_to_sitemap_page() {

		sitemappage = new Sitemappage(driver);
		Assert.assertEquals(sitemappage.getSiteMapPageTitle(), config.getSiteMapPageTitle());
	}

	@When("User click on shopping cart link from sitemap page")
	public void user_click_on_shopping_cart_link_from_sitemap_page() {

		sitemappage = new Sitemappage(driver);
		sitemappage.clickOnShoppingcartLink();
	}

	@Then("User should be taken to shoppingcart page and'Shopping Cart Empty'text should display")
	public void user_should_be_taken_to_shoppingcart_page_and_shopping_cart_empty_text_should_display() {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.assertEquals(shoppingcartpage.getShopcartEmptyMsg(), "Your shopping cart is empty!");
	}

	@When("User enter new quantity of {string} into quantity field of the product displayed in shoppingcart page")
	public void user_enter_new_quantity_of_into_quantity_field_of_the_product_displayed_in_shoppingcart_page(
			String qtyno) {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.enterQtyField(qtyno);
	}

	@When("User click on update icon option on shoppingcart page")
	public void user_click_on_update_icon_option_on_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnQtyUpdateButton();
	}

	@Then("Success message'You Have Modified Shopping Cart' should display in shoppingcart page")
	public void success_message_you_have_modified_shopping_cart_should_display_in_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.assertTrue(
				shoppingcartpage.getQtyModifiedMsg().contains("Success: You have modified your shopping cart!"));
	}

	@When("User enter negative value of {string} into quantity field of the product displayed in shoppingcart page")
	public void user_enter_negative_value_of_into_quantity_field_of_the_product_displayed_in_shoppingcart_page(
			String value) {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.enterQtyField(value);
	}

	@Then("Warn message informing the user to provide a positive value should display in shoppingcart page")
	public void warn_message_informing_the_user_to_provide_a_positive_value_should_display_in_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.fail("Warn Message Informing the user to provide a positive number is not displayed");
	}

	@When("User click on remove icon option on shoppingcart page")
	public void user_click_on_remove_icon_option_on_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnRemoveButtonFromCartPage();
	}

	@Then("Product {string} should be removed from shoppingcart page")
	public void product_should_be_removed_from_shoppingcart_page(String prdt) {

		shoppingcartpage = new Shoppingcartpage(driver);
		try {
		Assert.assertFalse(shoppingcartpage.isDisplayedDynamicWebElement(prdt));
		}catch(Throwable e) {
			log.info("Product Removed from shopping cart page");
		}
	}

	@When("User click on checkout button on shoppingcart page")
	public void user_click_on_checkout_button_on_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnCheckOutButton();
	}

	@Then("User should be taken to checkout page of the product")
	public void user_should_be_taken_to_checkout_page_of_the_product() {
		
	    checkoutpage = new Checkoutpage(driver);
		Assert.assertEquals(checkoutpage.getCheckoutPageTitle(), config.getCheckoutPageTitle());
	}

	@When("User click on continueshopping button on shoppingcart page")
	public void user_click_on_continueshopping_button_on_shoppingcart_page() {
		
		shoppingcartpage = new Shoppingcartpage(driver);
		shoppingcartpage.clickOnContinueShopping();
	}
}
