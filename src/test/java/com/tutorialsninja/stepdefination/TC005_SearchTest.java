package com.tutorialsninja.stepdefination;

import org.junit.Assert;

import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Productcomparisionpage;
import com.tutorialsninja.pageobject.Productpage;
import com.tutorialsninja.pageobject.Searchpage;
import com.tutorialsninja.pageobject.Wishlistpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC005_SearchTest extends BaseClass {

	Homepage homepage;
	Searchpage searchpage;
	Productpage productpage;
	Productcomparisionpage productcomparisionpage;
	Wishlistpage wishlistpage;

	@When("User enter existing product name {string} into search textfield")
	public void user_enter_existing_product_name_into_search_textfield(String existprdt) {

		homepage = new Homepage(driver);
		homepage.enterSearchTextField(existprdt);
	}

	@When("User click on the button having search icon")
	public void user_click_on_the_button_having_search_icon() {

		homepage = new Homepage(driver);
		homepage.clickOnSearchButton();
	}

	@Then("Searched product {string} should be displayed in the search results page")
	public void searched_product_should_be_displayed_in_the_search_results_page(String prdtname) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.isDisplayedDynamicWebElement(prdtname));
	}

	@When("User enter non existing product name {string} into search textfield")
	public void user_enter_non_existing_product_name_into_search_textfield(String nonexist) {

		homepage = new Homepage(driver);
		homepage.enterSearchTextField(nonexist);
	}

	@Then("There is no product that matches the search text should be displayed in search results page")
	public void there_is_no_product_that_matches_the_search_text_should_be_displayed_in_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.isDispalyedSearchNoProductMsg());
		Assert.assertEquals(searchpage.getSearchNoProductMsg(),
				"There is no product that matches the search criteria.");

	}

	@When("User will not enter any product name into search textfield")
	public void user_will_not_enter_any_product_name_into_search_textfield() {

		searchpage = new Searchpage(driver);
		log.info("No Product Entered Into Search TextField");
	}

	@When("User will enter product {string} into search textfield which will result in multiple products")
	public void user_will_enter_product_into_search_textfield_which_will_result_in_multiple_products(String multiprd) {

		homepage = new Homepage(driver);
		homepage.enterSearchTextField(multiprd);

	}

	@Then("More than one product should be displayed in search results page")
	public void more_than_one_product_should_be_displayed_in_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.isDispalyedIMacProductThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacProThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacThumb());

	}

	@When("User enter existing product name {string} into search criteria field from search results page")
	public void user_enter_existing_product_name_into_search_criteria_field_from_search_results_page(String existprdt) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.enterSearchCriteriaField(existprdt);
	}

	@When("User select search in product descriptions checkbox option from search results page")
	public void user_select_search_in_product_descriptions_checkbox_option_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickPorductDescriptionCheckBox();
	}

	@When("User click on the button having search icon from search results page")
	public void user_click_on_the_button_having_search_icon_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnSearchButtonOfSearchCriteria();
	}

	@When("User enter non existing product name {string} into search criteria field from search results page")
	public void user_enter_non_existing_product_name_into_search_criteria_field_from_search_results_page(
			String nonexist) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.enterSearchCriteriaField(nonexist);
	}

	@When("User enter text {string} of product description into search criteria field")
	public void user_enter_text_of_product_description_into_search_criteria_field(String discrip) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.enterSearchCriteriaField(discrip);

	}

	@Then("Product having the given text in its description should be displayed in search results page")
	public void product_having_the_given_text_in_its_description_should_be_displayed_in_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.isDispalyedProductMacThumb());
	}

	@When("User select correct category as {string} into category dropdown field from search results page")
	public void user_select_correct_category_as_into_category_dropdown_field_from_search_results_page(String string) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.selectSearchSubCategoryByIndex(3);
	}

	@When("User select incorrect category as {string} into category dropdown field from search results page")
	public void user_select_incorrect_category_as_into_category_dropdown_field_from_search_results_page(String string) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.selectSearchSubCategoryByIndex(2);
	}

	@Then("User select list option from search results page")
	public void user_select_list_option_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnListView();
	}

	@Then("Single product {string} should be displayed in list view")
	public void single_product_should_be_displayed_in_list_view(String singleprdt) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.isDisplayedDynamicWebElement(singleprdt));
	}

	@Then("User click on {string} link of product from search results page")
	public void user_click_on_link_of_product_from_search_results_page(String imgprdt) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnDynamicWebElement(imgprdt);
	}

	@Then("User should be taken to product dispaly page of the product")
	public void user_should_be_taken_to_product_dispaly_page_of_the_product() {

		productpage = new Productpage(driver);
		log.info("User Navigated To Product Page Title: " + productpage.getProductPageTitle());
	}

	@Then("User select grid option from search results page")
	public void user_select_grid_option_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnGridView();
	}

	@Then("Single product {string} should be displayed in grid view")
	public void single_product_should_be_displayed_in_grid_view(String string) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.isDisplayedDynamicWebElement(string));
	}

	@Then("Multiple product should be displayed in list view")
	public void multiple_product_should_be_displayed_in_list_view() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.isDispalyedIMacProductThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacProThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacThumb());
	}

	@Then("Multiple product should be displayed in grid view")
	public void multiple_product_should_be_displayed_in_grid_view() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.isDispalyedIMacProductThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacProThumb());
		Assert.assertTrue(searchpage.isDispalyedProductMacThumb());
	}

	@Then("User click on the {string} product name from search results page")
	public void user_click_on_the_product_name_from_search_results_page(String name) {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnDynamicWebElement(name);
	}

	@Then("User click on the product compare button of product from search results page")
	public void user_click_on_the_product_compare_button_of_product_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnCompareListButton();
	}

	@Then("Success messsage of'Product Added To Product Comparision'should displayed in search results page")
	public void success_messsage_of_product_added_to_product_comparision_should_displayed_in_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		Assert.assertTrue(searchpage.getTextProductCompareMessage()
				.contains("Success: You have added"));
	}

	@Then("User click on product comparision link from the success message")
	public void user_click_on_product_comparision_link_from_the_success_message() {

		searchpage = new Searchpage(driver);
		searchpage.clickOnCompareProductLink_1();
	}

	@Then("User should be taken to product comparision page")
	public void user_should_be_taken_to_product_comparision_page() {

		productcomparisionpage = new Productcomparisionpage(driver);
		Assert.assertEquals(productcomparisionpage.getProductComparePageTitle(), config.getCompareProductPageTitle());
		Assert.assertTrue(productcomparisionpage.isDisplayedProductComparisonOnBreadCrum());
	}

	@Then("User click on the wishlist button of product from search results page")
	public void user_click_on_the_wishlist_button_of_product_from_search_results_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getSearchPageTitle().contains("Search"));
		searchpage.clickOnAddToWhishlistButton();
	}

	@Then("Success message for'Product Added To Wishlist'should be displayed in product display page")
	public void Success_message_for_Product_Added_To_Wishlist_should_be_displayed_in_product_display_page() {

		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getTextProductCompareMessage()
				.contains("Success: You have added"));
	}

	@Then("User click on wishlist link from the success message of product display page")
	public void user_click_on_wishlist_link_from_the_success_message_of_product_display_page() {

		searchpage = new Searchpage(driver);
		searchpage.clickOnWishListLink();
	}

	@Then("User should be taken to wishlist page and product {string} should be displayed")
	public void user_should_be_taken_to_wishlist_page_and_product_should_be_displayed(String prdt) {

		wishlistpage = new Wishlistpage(driver);
		Assert.assertEquals(wishlistpage.getWishListPageTitle(), config.getWishlistPageTitle());
		Assert.assertTrue(wishlistpage.isDisplayedDynamicProductNameLink(prdt));
	}

	@Then("User will click on random product {string} link from search results page")
	public void user_will_click_on_random_product_link_from_search_results_page(String string) {
	  
		searchpage = new Searchpage(driver);
		searchpage.clickOnDynamicWebElement(string);
	}
}
