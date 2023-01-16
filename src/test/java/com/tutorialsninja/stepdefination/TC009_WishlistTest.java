package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Productpage;
import com.tutorialsninja.pageobject.Wishlistpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC009_WishlistTest extends BaseClass {

	Homepage homepage;
	Productpage productpage;
	Wishlistpage wishlistpage;
	Accountpage accountpage;

	@Then("User should navigate to homepage by clicking on your store link")
	public void user_should_navigate_to_homepage_by_clicking_on_your_store_link() {

		homepage = new Homepage(driver);
		homepage.clickOnYourStoreLogo();
	}

	@Then("User click on the wishlist button of product {string} from product display page")
	public void user_click_on_the_wishlist_button_of_product_from_product_display_page(String string) {

		productpage = new Productpage(driver);
		productpage.clickOnAddToWishlistButton();
	}

	@When("User click on wishlist link from header option")
	public void user_click_on_wishlist_link_from_header_option() {

		homepage = new Homepage(driver);
		homepage.clickOnWishlistHeaderLink();
	}

	@Then("User should be taken to wishlist page and'Wishlist Empty'text should display")
	public void user_should_be_taken_to_wishlist_page_and_wishlist_empty_text_should_display() {

		wishlistpage = new Wishlistpage(driver);
		Assert.assertEquals(wishlistpage.getWishListPageTitle(), config.getWishlistPageTitle());
		Assert.assertEquals(wishlistpage.getEmptyTextOnWishListPage(), "Your wish list is empty.");
	}

	@When("User click on remove icon option of product {string} from wishlist page")
	public void user_click_on_remove_icon_option_of_product_from_wishlist_page(String string) {

		wishlistpage = new Wishlistpage(driver);
		wishlistpage.clickOnRemoveButton();
	}

	@Then("Success message of'Successfully Modified Wishlist'should display on wishlist page")
	public void success_message_of_successfully_modified_wishlist_should_display_on_wishlist_page() {

		wishlistpage = new Wishlistpage(driver);
		Assert.assertTrue(wishlistpage.getWishlistChangesMsg().contains("Success: You have modified your wish list!"));
	}

	@Then("User click on continue button of wishlist page")
	public void user_click_on_continue_button_of_wishlist_page() {

		wishlistpage = new Wishlistpage(driver);
		wishlistpage.clickOnContinueButton();
	}

	@Then("User should be taken to myaccount page")
	public void user_should_be_taken_to_myaccount_page() {

		accountpage = new Accountpage(driver);
		Assert.assertEquals(accountpage.getAccountPageTitle(), config.getAccountPageTitle());
		Assert.assertTrue(accountpage.isDisplayedEditInfoLink());
	}
}
