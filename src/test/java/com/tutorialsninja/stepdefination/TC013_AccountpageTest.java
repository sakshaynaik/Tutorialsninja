package com.tutorialsninja.stepdefination;

import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Orderplacedpage;
import com.tutorialsninja.pageobject.Sitemappage;

import io.cucumber.java.en.When;

public class TC013_AccountpageTest extends BaseClass {

	Orderplacedpage orderplacedpage;
	Accountpage accountpage;
	Sitemappage sitemappage;

	@When("User click on myaccount page link displayed in orderhasbeenplaced page")
	public void user_click_on_myaccount_page_link_displayed_in_orderhasbeenplaced_page() {

		orderplacedpage = new Orderplacedpage(driver);
		orderplacedpage.clickOnMyAccountLink();
	}

	@When("User click on myaccount dropmenu and click on myaccount option")
	public void user_click_on_myaccount_dropmenu_and_click_on_myaccount_option() {

		accountpage = new Accountpage(driver);
		accountpage.clickOnMyAccountDropMenu();
		accountpage.clickOnMyAccountLinkFromDropMenu();
	}

	@When("User click on myaccount link from sitemap page")
	public void user_click_on_myaccount_link_from_sitemap_page() {

		sitemappage = new Sitemappage(driver);
		sitemappage.clickOnMyAccountLink();
	}

	@When("User click on myaccount link from right column options of any page")
	public void user_click_on_myaccount_link_from_right_column_options_of_any_page() {

		accountpage = new Accountpage(driver);
		accountpage.clickOnMyAccountLinkFromDropMenu();
	}
}
