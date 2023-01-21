package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Specialofferspage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC027_SpecialOffersTest extends BaseClass {

	Homepage homepage;
	Specialofferspage specialofferspage;
	
	@When("User click on specials link from footer section")
	public void user_click_on_specials_link_from_footer_section() {
	    
		 homepage = new Homepage(driver);
		 homepage.clickOnSpecialsLink();
	}

	@Then("User should be taken to specialoffers page")
	public void user_should_be_taken_to_specialoffers_page() {
	    
		 specialofferspage = new Specialofferspage(driver);
		 Assert.assertEquals(specialofferspage.getSpecialOffersPageTitle(), config.getSpecialOffersPageTitle());
		 Assert.assertTrue(specialofferspage.isDisplayedSpecialOffersOnBreadCrum());
	}

	@Then("Product {string} should display in specialoffers page")
	public void product_should_display_in_specialoffers_page(String string) {
	    
		 specialofferspage = new Specialofferspage(driver);
		 specialofferspage.isDisplayedDynamicWebElement(string);
	}

	@When("User select the list view option in specialoffers page")
	public void user_select_the_list_view_option_in_specialoffers_page() {
	    
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnListView();
	}

	@Then("All products in specialoffers page should display in list view")
	public void all_products_in_specialoffers_page_should_display_in_list_view() {
	    
		 specialofferspage = new Specialofferspage(driver);
		 specialofferspage.isDisplayedCanonWebElement();
	}

	@When("User select the grid view option in specialoffers page")
	public void user_select_the_grid_view_option_in_specialoffers_page() {
	    
		 specialofferspage = new Specialofferspage(driver);
		 specialofferspage.isDisplayedCanonWebElement();
	}

	@Then("All products in specialoffers page should display in grid view")
	public void all_products_in_specialoffers_page_should_display_in_grid_view() {
	    
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnGridView();
	}

	@When("User click on add to cart button from specialoffers page")
	public void user_click_on_add_to_cart_button_from_specialoffers_page() {
	    
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnAddToCartButton();
	}

	@When("User click on the wishlist button of product from specialoffers page")
	public void user_click_on_the_wishlist_button_of_product_from_specialoffers_page() {
	 
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnAddToWishListButton();
	}

	@Then("Success message for'Product Added To Wishlist'should be displayed in specialoffers page")
	public void success_message_for_product_added_to_wishlist_should_be_displayed_in_specialoffers_page() {
	  
		specialofferspage = new Specialofferspage(driver);
		Assert.assertTrue(specialofferspage.isDisplayedWishListMessage());
		Assert.assertTrue(specialofferspage.getWishListMessage().contains("to your wish list!"));
	}

	@When("User click on wishlist link from the success message of specialoffers page")
	public void user_click_on_wishlist_link_from_the_success_message_of_specialoffers_page() {
	   
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnWishListLink();
	}

	@When("User click on the product comparison button of product from specialoffers page")
	public void user_click_on_the_product_comparison_button_of_product_from_specialoffers_page() {
	   
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnCompareThisProductButton();
	}

	@Then("Success message for'Product Added To product comparison'should be displayed in specialoffers page")
	public void success_message_for_product_added_to_product_comparison_should_be_displayed_in_specialoffers_page() {
	    
		specialofferspage = new Specialofferspage(driver);
		Assert.assertTrue(specialofferspage.isDisplayedCompareProductMessage());
		Assert.assertTrue(specialofferspage.getCompareProductMessage().contains("to your product comparison!"));
	}

	@When("User click on product comparison link from the success message of specialoffers page")
	public void user_click_on_product_comparison_link_from_the_success_message_of_specialoffers_page() {
	    
		specialofferspage = new Specialofferspage(driver);
		specialofferspage.clickOnProductCompareLink();
	}
}
