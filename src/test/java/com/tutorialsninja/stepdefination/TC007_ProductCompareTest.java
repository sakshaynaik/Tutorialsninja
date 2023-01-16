package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Desktoppage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Productcomparisionpage;
import com.tutorialsninja.pageobject.Productpage;
import com.tutorialsninja.pageobject.Searchpage;
import com.tutorialsninja.pageobject.Shoppingcartpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC007_ProductCompareTest extends BaseClass {

	Productpage productpage;
	Searchpage searchpage;
	Homepage homepage;
	Desktoppage desktoppage;
	Productcomparisionpage productcomparisionpage;
	Shoppingcartpage shoppingcartpage;

	@Then("User click on the product compare button of product from product dispaly page")
	public void user_click_on_the_product_compare_button_of_product_from_product_dispaly_page() {

		productpage = new Productpage(driver);
		productpage.clickOnCompareProductButton();
	}

	@Then("Success message of'Product Added To Product Comparision'should displayed in product dispaly page")
	public void success_message_of_product_added_to_product_comparision_should_displayed_in_product_dispaly_page() {

		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.getComapreProductSuccessMessage().contains("to your product comparison!"));
	}

	@Then("Success message of'Product Added To Product Comparision'should displayed in search results page")
	public void success_message_of_product_added_to_product_comparision_should_displayed_in_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.getTextProductCompareMessage().contains("to your product comparison!"));
	}

	@When("User hover mouse on any menu say'Desktops'and select'show all desktops option'")
	public void user_hover_mouse_on_any_menu_say_and_select() {

		homepage = new Homepage(driver);
		homepage.hoverMouseOnDesktop();
		homepage.clickOnShowAllOptions();
	}

	@Then("User should be taken to desktops page")
	public void user_should_be_taken_to_desktops_page() {

		desktoppage = new Desktoppage(driver);
		Assert.assertEquals(desktoppage.getDeskTopPageTitle(), desktoppage.getDeskTopPageTitle());
	}

	@Then("User select list option from desktops page")
	public void user_select_list_option_from_desktops_page() {

		desktoppage = new Desktoppage(driver);
		desktoppage.clickOnListView();
	}

	@Then("User click on the product compare button of product from desktops page")
	public void user_click_on_the_product_compare_button_of_product_from_desktops_page() {

		desktoppage = new Desktoppage(driver);
		desktoppage.clickOnCompareListButton();
	}

	@Then("Success message of'Product Added To Product Comparision'should displayed in desktops page")
	public void success_message_of_product_added_to_product_comparision_should_displayed_in_desktops_page() {

		desktoppage = new Desktoppage(driver);
		Assert.assertTrue(desktoppage.getTextMessageForCompareProduct().contains("to your product comparison!"));
	}

	@Then("User select grid option from desktops page")
	public void user_select_grid_option_from_desktops_page() {

		desktoppage = new Desktoppage(driver);
		desktoppage.clickOnGridView();
	}

	@When("User click on the product compare button of product from home page")
	public void user_click_on_the_product_compare_button_of_product_from_home_page() {

		homepage = new Homepage(driver);
		homepage.clickOnCompareProductButton();
	}

	@Then("Success message of'Product Added To Product Comparision'should displayed in home page")
	public void success_message_of_product_added_to_product_comparision_should_displayed_in_home_page() {

		homepage = new Homepage(driver);
		Assert.assertTrue(homepage.getTextMessageForCompareProduct().contains("to your product comparison!"));
	}

	@Then("User click on product compare\\({int}) link from the desktops page")
	public void user_click_on_product_compare_link_from_the_desktops_page(Integer int1) {

		desktoppage = new Desktoppage(driver);
		desktoppage.clickOnProductCompareLink_0();
	}

	@Then("Proper text {string} should display in product comparision page")
	public void proper_text_should_display_in_product_comparision_page(String string) {

		productcomparisionpage = new Productcomparisionpage(driver);
		Assert.assertEquals(productcomparisionpage.getMsgProductNotChoosen(),
				"You have not chosen any products to compare.");
	}

	@When("User click on continue button from product comparision page")
	public void user_click_on_continue_button_from_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		productcomparisionpage.clickOnContinueButton();
	}

	@When("User will click random links from the breadcrumb of product compare page")
	public void user_will_click_random_links_from_the_breadcrumb_of_product_compare_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		productcomparisionpage.clickOnRandomBreadcrumLink();
	}

	@Then("User should be taken to their respective pages")
	public void user_should_be_taken_to_their_respective_pages() {

		log.info("User Is Navigated To Their Respective Pages");
	}

	@When("User click on {string} link of product from success message of product dispaly page")
	public void user_click_on_link_of_product_from_success_message_of_product_dispaly_page(String string) {
		
		productpage = new Productpage(driver);
		productpage.clickOnProductNameFromSuccessMsg();
	}

	@Then("User click on the product {string} link from search results page")
	public void user_click_on_the_product_link_from_search_results_page() {

		searchpage = new Searchpage(driver);
		searchpage.clickOnProductNameFromSuccessMsgHPLP();
	}

	@Then("User should be taken to product comparision page and verify two products added for comparision")
	public void user_should_be_taken_to_product_comparision_page_and_verify_two_products_added_for_comparision() {

		productcomparisionpage = new Productcomparisionpage(driver);
		Assert.assertEquals(productcomparisionpage.getProductComparePageTitle(), config.getCompareProductPageTitle());
		Assert.assertTrue(productcomparisionpage.isDisplayedHpLp3065());
		Assert.assertTrue(productcomparisionpage.isDisplayediMacLinkText());
	}

	@Then("User click on add to cart button from product comparision page")
	public void user_click_on_add_to_cart_button_from_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		productcomparisionpage.clickAddToCartButton();
	}

	@Then("Success message of'Product Added To Shopping cart'should display in product comparision page")
	public void success_message_of_product_added_to_shopping_cart_should_display_in_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		Assert.assertTrue(productcomparisionpage.getMsgForShoppingCart().contains("your shopping cart!"));
	}

	@When("User click on shopping cart link from the success message on product comparision page")
	public void user_click_on_shopping_cart_link_from_the_success_message_on_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		productcomparisionpage.clickOnShoppingCartLinkFromMsg();
	}

	@Then("User should be taken to shoppingcart page and product {string} should be successfully displayed")
	public void user_should_be_taken_to_shoppingcart_page(String prdt) {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.assertEquals(shoppingcartpage.getShoppingCartPageTitle(), config.getShoppingCartPageTitle());
		Assert.assertTrue(shoppingcartpage.isDisplayedDynamicWebElement(prdt));
	}

	@When("User click on remove button of products from product comparision page")
	public void user_click_on_remove_button_of_products_from_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		productcomparisionpage.clickOnRemoveButton();
	}

	@Then("The product should be successfully removed from the product comparision page")
	public void the_product_should_be_successfully_removed_from_the_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		Assert.assertTrue(productcomparisionpage.getMsgForProductCompareModified()
				.contains("Success: You have modified your product comparison!"));
	}

}
