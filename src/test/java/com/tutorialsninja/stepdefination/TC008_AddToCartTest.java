package com.tutorialsninja.stepdefination;

import org.junit.Assert;

import com.tutorialsninja.pageobject.Desktoppage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Productpage;
import com.tutorialsninja.pageobject.Searchpage;
import com.tutorialsninja.pageobject.Wishlistpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC008_AddToCartTest extends BaseClass {

	Productpage productpage;
	Wishlistpage wishlistpage;
	Searchpage searchpage;
	Desktoppage desktoppage;
	Homepage homepage;
	
	@Then("User click on add to cart button from product dispaly page")
	public void user_click_on_add_to_cart_button_from_product_dispaly_page() {
		
		productpage = new Productpage(driver);
		productpage.clickOnAddToCartButton();
	}

	@Then("Success message of'Product Added To Shopping cart'should display in product dispaly page")
	public void success_message_of_product_added_to_shopping_cart_should_display_in_product_dispaly_page() {
		
		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.getTexOfWhishlistMsg().contains("to your shopping cart!"));
	}

	@When("User click on shopping cart link from the success message of product dispaly page")
	public void user_click_on_shopping_cart_link_from_the_success_message_of_product_dispaly_page() {
		
		productpage = new Productpage(driver);
		productpage.clickOnShopCartMsgLink();
	}

	@Then("Success message for'Product Added To Wishlist'should be displayed in product dispaly page")
	public void success_message_for_product_added_to_wishlist_should_be_displayed_in_product_dispaly_page() {
		
		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.getTexOfWhishlistMsg().contains("to your wish list!"));
	}

	@Then("User click on wishlist link from the success message of product dispaly page")
	public void user_click_on_wishlist_link_from_the_success_message_of_product_dispaly_page() {
		
		productpage = new Productpage(driver);
		productpage.clickOnWishListLink();
	}

	@Then("Success message of'Product Added To Shopping cart'should display in wishlist page")
	public void success_message_of_product_added_to_shopping_cart_should_display_in_wishlist_page() {
		
		wishlistpage = new Wishlistpage(driver);
		Assert.assertTrue(wishlistpage.getTextAddToCartMsg().contains("to your shopping cart!"));
	}

	@When("User click on shopping cart link from the success message of wishlist page")
	public void user_click_on_shopping_cart_link_from_the_success_message_of_wishlist_page() {
		
		wishlistpage = new Wishlistpage(driver);
		wishlistpage.clickOnShopCartMsgLink();
	}

	@Then("User click on add to cart button of product from search results page")
	public void user_click_on_add_to_cart_button_of_product_from_search_results_page() {
		
		searchpage = new Searchpage(driver);
		searchpage.clickOnAddToCartButton();
		
	}

	@Then("Success message of'Product Added To Shopping cart'should display in search results page")
	public void success_message_of_product_added_to_shopping_cart_should_display_in_search_results_page() {
		
		searchpage = new Searchpage(driver);
		Assert.assertTrue(searchpage.getAddToCartMsg().contains("to your shopping cart!"));
	}

	@When("User click on shopping cart link from the success message of search results page")
	public void user_click_on_shopping_cart_link_from_the_success_message_of_search_results_page() {
		
		searchpage = new Searchpage(driver);
		searchpage.clickOnShopCartMsgLink();
	}

	@Then("User click on add to cart button of product from product display page")
	public void user_click_on_add_to_cart_button_of_product_from_product_display_page() {
		
		productpage = new Productpage(driver);
		productpage.clickOnAddToCartButton();
	}
	
	@When("User select product {string} displayed in desktops page")
	public void user_select_product_displayed_in_desktops_page(String string) {
	    
		desktoppage = new Desktoppage(driver);
		desktoppage.clickOnDynamicProductLink(string);
	}

	@When("User click on add to cart button on product {string} from product display page")
	public void user_click_on_add_to_cart_button_on_product_from_product_display_page(String string) {
	  
		productpage = new Productpage(driver);
		productpage.clickOnAddToCartButton();
	}

	@Then("Success message of'Product Added To Shopping cart'should display in product display page")
	public void success_message_of_product_added_to_shopping_cart_should_display_in_product_display_page() {
		
		productpage = new Productpage(driver);
		Assert.assertTrue(productpage.getTexOfWhishlistMsg().contains("to your shopping cart!"));
	}

	@When("User select product {string} displayed in Featured section of homepage")
	public void user_select_product_displayed_in_featured_section_of_homepage(String string) {
	   
		homepage = new Homepage(driver);
		homepage.clickOnDynamicProductLink(string);
	}


	@Then("User click on shopping cart link from the success message of product display page")
	public void user_click_on_shopping_cart_link_from_the_success_message_of_product_display_page() {
		
		productpage = new Productpage(driver);
		productpage.clickOnShopCartMsgLink();
	}

}
