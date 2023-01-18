package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Productreturnpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC019_ProductreturnTest extends BaseClass {

	Productreturnpage productreturnpage;
	Homepage homepage;

	@When("User select the reason for return as {string} and click on submit button")
	public void user_select_the_reason_for_return_as_and_click_on_submit_button(String string) {

		productreturnpage = new Productreturnpage(driver);
		productreturnpage.clickResonOfReturnRadioButton(string);
		productreturnpage.clickOnSubmittbutton();
	}

	@Then("Successfull product return text should display in productreturns page")
	public void successfull_product_return_text_should_display_in_productreturns_page() {

		productreturnpage = new Productreturnpage(driver);
		Assert.assertTrue(productreturnpage.getProductReturnSuccessMsg()
				.contains("Thank you for submitting your return request."));
	}

	@When("User click on back button of productreturns page")
	public void user_click_on_back_button_of_productreturns_page() {

		productreturnpage = new Productreturnpage(driver);
		productreturnpage.clickOnBackButton();
	}

	@When("User click on returns option from footer section")
	public void user_click_on_returns_option_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnReturnsLink();
	}

}
