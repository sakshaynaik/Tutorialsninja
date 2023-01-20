package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Productreturnpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC021_ReturnsTest extends BaseClass{
	
	Productreturnpage productreturnpage;

	@When("User click on continue button of productreturns page")
	public void user_click_on_continue_button_of_productreturns_page() {
	    
		productreturnpage = new Productreturnpage(driver);
		productreturnpage.clickOnSubmittbutton();
	}

	@Then("Field level warn message should be displayed in productreturns page")
	public void field_level_warn_message_should_be_displayed_in_productreturns_page() {
	  
		productreturnpage = new Productreturnpage(driver);
		Assert.assertEquals(productreturnpage.getInvalidMsgForEmail(), "E-Mail Address does not appear to be valid!");
	}

}
