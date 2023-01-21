package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Rewardspointpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC022_RewardPointsTest extends BaseClass{
	
	Rewardspointpage rewardspointpage;

	@Then("User should be taken to rewardpoints page")
	public void user_should_be_taken_to_rewardpoints_page() {
	    
		rewardspointpage = new Rewardspointpage(driver);
		Assert.assertEquals(rewardspointpage.getRewardsPointPageTitle(), config.getRewardsPointPageTitle());
		Assert.assertTrue(rewardspointpage.isDisplayedRewardPointsOnBreadCrum());
	}

	@Then("Text {string} should display in rewardpoints page")
	public void text_should_display_in_rewardpoints_page(String string) {
	    
		rewardspointpage = new Rewardspointpage(driver);
		Assert.assertEquals(rewardspointpage.getTextRewardsTextMsg(), string);
		
	}

	@When("User click on continue button of rewardpoints page")
	public void user_click_on_continue_button_of_rewardpoints_page() {
	  
		rewardspointpage = new Rewardspointpage(driver);
		rewardspointpage.clickOnContinueButton();
	}

	@When("User purchases few products having the rewards point")
	public void user_purchases_few_products_having_the_rewards_point() {
	    
		log.info("User Will Purchase Products Having Reward Points");
	}

	@Then("Table having the columns-date added, description and points should display in rewardpoints page")
	public void table_having_the_columns_date_added_description_and_points_should_display_in_rewardpoints_page() {
	    
		Assert.fail("Order Placed Are Not Getting Approved And Hence We Are Not Able To Test");
	}

}
