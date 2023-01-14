package com.tutorialsninja.stepdefination;

import org.junit.Assert;

import com.tutorialsninja.pageobject.Productcomparisionpage;
import com.tutorialsninja.pageobject.Productpage;
import com.tutorialsninja.pageobject.Wishlistpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC006_ProductDisplayTest extends BaseClass {

	Productpage productpage;
	Wishlistpage wishlistpage;
	Productcomparisionpage productcomparisionpage;

	@Then("User click on main bigger sized thumbnail image displayed on product display page")
	public void user_click_on_main_bigger_sized_thumbnail_image_displayed_on_product_display_page() {

		productpage = new Productpage(driver);
		productpage.clickOniMacImg();
	}

	@Then("Light box view of the main thumnail should be displayed on product display page")
	public void light_box_view_of_the_main_thumnail_should_be_displayed_on_product_display_page() {

		productpage = new Productpage(driver);
		log.info("Thumbnail Image Of Product Displayed");
	}

	@When("User click on left and right options from main thumnail")
	public void user_click_on_left_and_right_options_from_main_thumnail() {

		productpage = new Productpage(driver);
		productpage.clickOnLeftArrowKey();
		productpage.clickOnLeftArrowKey();
		productpage.clickOnRightArrowKey();
	}

	@Then("User should be able to navigate to other thumnail image in light box view")
	public void user_should_be_able_to_navigate_to_other_thumnail_image_in_light_box_view() {

		productpage = new Productpage(driver);
		log.info("User Navigated To Other Thumbnail Image In The Light Box");
	}

	@Then("User click on close option from the thumnail displayed on light box")
	public void user_click_on_close_option_from_the_thumnail_displayed_on_light_box(String string) {

		productpage = new Productpage(driver);
		productpage.clickOnXCloseButton();
	}

	@Then("Light box view should close and focus should go to product display page")
	public void light_box_view_should_close_and_focus_should_go_to_product_display_page() {

		productpage = new Productpage(driver);
		log.info("Light Box Closed From Page And Focus Back To Initial Page");
	}

	@When("User click on the normal sized thumbnail image displayed on product display page")
	public void user_click_on_the_normal_sized_thumbnail_image_displayed_on_product_display_page() {

		productpage = new Productpage(driver);
		productpage.clickOnSubiMacImg_1();
	}

	@Then("Light box view of the selected thumbnail should be displayed on product display page")
	public void light_box_view_of_the_selected_thumbnail_should_be_displayed_on_product_display_page() {

		productpage = new Productpage(driver);
		log.info("Sub Thumbnail Image Of Product Displayed");
	}

	@When("User click on left and right options from selected thumnail")
	public void user_click_on_left_and_right_options_from_selected_thumnail() {

		productpage = new Productpage(driver);
		productpage.clickOnLightBoxImg();
		productpage.clickOnLightBoxImg();
		productpage.clickOnXCloseButton();
	}

	@Then("User should verify product name, brand name and product code dispalyed on product display page")
	public void user_should_verify_product_name_brand_name_and_product_code_dispalyed_on_product_display_page() {

		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.getTexOfProductCode() != null);
		log.info("Product Code :" + productpage.getTexOfProductCode());

		Assert.assertTrue(productpage.getTexOfProductAvailabity() != null);
		log.info("Product Availabity Status :" + productpage.getTexOfProductAvailabity());
	}

	@Then("User will update quantity in qty textfield by providing a {string} value and click on addtocart button")
	public void user_will_update_quantity_in_qty_textfield_by_providing_a_value_and_click_on_addtocart_button(
			String qty) {

		productpage = new Productpage(driver);
		productpage.enterNumberOfProductInQtyTextField(qty);
		productpage.clickOnAddToCartButton();
	}

	@Then("A field level warn message'Quantity should be a positive number'should display on product display page")
	public void a_field_level_warn_message_quantity_should_be_a_positive_number_should_display_on_product_display_page() {

		productpage = new Productpage(driver);
		Assert.fail("Field Level Warn Message For 'Quantity should be a positive number' was not displayed");
	}

	@Then("User click on reviews tab of product in the displayed product display page")
	public void user_click_on_reviews_tab_of_product_in_the_displayed_product_display_page() {

		productpage = new Productpage(driver);
		productpage.clickOnWriteReviewLinkTest();
	}

	@Then("Review tab should be opened in product display page")
	public void review_tab_should_be_opened_in_product_display_page() {

		productpage = new Productpage(driver);
		log.info("Review Tab Opened On Product Display Page");
	}

	@Then("User enter {string} textfield and {string} textfield and select radio button for ratings")
	public void user_enter_textfield_and_textfield_and_select_radio_button_for_ratings(String name, String review) {

		productpage = new Productpage(driver);
		productpage.enterReviewNameField(name);
		productpage.enterReviewBoxField("ReviewReviewReviewReviewReviewReviewReviewReviewReviewReviewReview");
		productpage.clickRandomReviewRadioButton();
	}

	@Then("User click on continue button of review from product display page")
	public void user_click_on_continue_button_of_review_from_product_display_page() {

		productpage = new Productpage(driver);
		productpage.clickOnReviewContinueButton();
	}

	@Then("Success message with text {string} should be displayed on product display page")
	public void success_message_with_text_should_be_displayed_on_product_display_page(String string) {

		productpage = new Productpage(driver);
		Assert.assertEquals(productpage.getTextReviewMsg(), "Thank you for your review. It has been submitted to the webmaster for approval.");
	}

	@Then("User will not enter any review text fields from product display page")
	public void user_will_not_enter_any_review_text_fields_from_product_display_page() {

		productpage = new Productpage(driver);
		log.info("User Will Not Enter Any Reviews In Review Fields");
		
	}

	@Then("Proper message of {string} should display on product display page")
	public void proper_message_of_should_display_on_product_display_page(String string) {

		productpage = new Productpage(driver);
		Assert.assertEquals(productpage.getEmptyFieldRevieMsg(), "Warning: Please select a review rating!");
	}

	@Then("User click on the wishlist button of product from product dispaly page")
	public void user_click_on_the_wishlist_button_of_product_from_product_dispaly_page() {

		productpage = new Productpage(driver);
		productpage.clickOnAddToWishlistButton();
	}

	@Then("User click on the product compare button of product from product display page")
	public void user_click_on_the_product_compare_button_of_product_from_product_display_page() {

		productpage = new Productpage(driver);
		productpage.clickOnCompareProductButton();
	}

	@Then("Success message of'Product Added To Product Comparision'should displayed in product display page")
	public void success_message_of_product_added_to_product_comparision_should_displayed_in_product_display_page() {

		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.isDisplayedComapreProductSuccessMessage());
	}

	@Then("User click on the product {string} link from wishlist page")
	public void user_click_on_the_product_link_from_wishlist_page(String prdt) {
	
		wishlistpage = new Wishlistpage(driver);
		wishlistpage.clickDynamicProductNameLink(prdt);
		
	}

	@Then("User click on the product {string} link from product compare page")
	public void user_click_on_the_product_link_from_product_compare_page(String prdt) {
	   
		 productcomparisionpage = new Productcomparisionpage(driver);
		 productcomparisionpage.clickDynamicProductNameLink(prdt);
	}
}
