package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Orderhistorypage;
import com.tutorialsninja.pageobject.Orderinformationpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC017_OrderhistoryTest extends BaseClass{
	
	Orderhistorypage orderhistorypage;
	Orderinformationpage orderinformationpage;
	
	@Then("User should be taken to orderhistory page")
	public void user_should_be_taken_to_orderhistory_page() {
	    
		 orderhistorypage = new Orderhistorypage(driver);
		 Assert.assertEquals(orderhistorypage.getOrderHistoryPageTitle(), config.getOrderHistoryPageTitle());
		 Assert.assertTrue(orderhistorypage.isDisplayedOrderHistoryOnBreadCrum());
	}

	@When("User click on continue button of orderhistory page")
	public void user_click_on_continue_button_of_orderhistory_page() {
	  
		orderhistorypage = new Orderhistorypage(driver);
		orderhistorypage.clickOnContinueButton();
	}

	@When("User click on view icon option in orderhistory table")
	public void user_click_on_view_icon_option_in_orderhistory_table() {
	   
		orderhistorypage = new Orderhistorypage(driver);
		orderhistorypage.clickOnViewOrderInfo();
	}

	@Then("User should be taken to orderinformation page")
	public void user_should_be_taken_to_orderinformation_page() {
	 
		 orderinformationpage = new Orderinformationpage(driver);
		 Assert.assertEquals(orderinformationpage.getOrderInfoPageTitle(), config.getOrderInfoPageTitle());
		 Assert.assertTrue(orderinformationpage.isDisplayedOrderInfoOnBreadCrum());
	}

}
