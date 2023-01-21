package com.tutorialsninja.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ElementUtils;
import com.tutorialsninja.utilities.ReadAction;
import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Sitemappage {

	WebDriver ldriver;
	ElementUtils element;

	public Sitemappage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		element = new ElementUtils(rdriver);
	}

	@FindBy(linkText = "Search")
	private WebElement searchlink;

	@FindBy(linkText = "Address Book")
	private WebElement addressbook;

	@FindBy(linkText = "Order History")
	private WebElement orderhistorylink;

	@FindBy(linkText = "Downloads")
	private WebElement downloadlink;

	@FindBy(linkText = "Reward Points")
	private WebElement rewardpointlink;

	@FindBy(linkText = "Special Offers")
	private WebElement specialoffer;

	@FindBy(linkText = "Shopping Cart")
	private WebElement shopacrtlink;

	@FindBy(linkText = "My Account")
	private WebElement myaccountlink;
	
	@FindBy(linkText = "Site Map")
	private WebElement sitemaplink;

	@FindBy(xpath = "//div[@id='content']//a")
	private List<WebElement> listlinkonsitemap;

	///////////////////////////////////////////////////////

	public boolean isDisplayedDynamicLinksOnSiteMapPage(String txt) {

		return (element.isDisplayedDynamicElement(listlinkonsitemap, txt));
	}

	public void clickOnDynamicLinksOnSiteMapPage(String txt) {

		element.clickOnDynamicElement(listlinkonsitemap, txt);
	}

	public Accountpage clickOnMyAccountLink() {

		ReadJavascriptExecutor.clickElementByJavaScript(myaccountlink, ldriver);
		return (new Accountpage(ldriver));
	}

	public Shoppingcartpage clickOnShoppingcartLink() {

		shopacrtlink.click();
		return (new Shoppingcartpage(ldriver));
	}

	public Specialofferspage clickOnSpecialOffersLink() {

		specialoffer.click();
		return (new Specialofferspage(ldriver));
	}
	
	public boolean isDisplayedSiteMapOnBedCrum() {
		
		return (sitemaplink.isDisplayed());
	}

	public Rewardspointpage clickOnRewardPointsLink() {

		rewardpointlink.click();
		return (new Rewardspointpage(ldriver));
	}

	public Downloadspage clickOnDownloadsLink() {

		downloadlink.click();
		return (new Downloadspage(ldriver));
	}

	public Orderhistorypage clickOnOrderHistoryLink() {

		ReadAction.JSClick(ldriver, orderhistorylink);
		return (new Orderhistorypage(ldriver));
	}

	public Addressbookpage clickOnAddressBookLink() {

		addressbook.click();
		return (new Addressbookpage(ldriver));
	}

	public Searchpage clickOnSearchLink() {

		searchlink.click();
		return (new Searchpage(ldriver));
	}

	public void navigateToBackPage() {

		ldriver.navigate().back();
	}

	public String getSiteMapPageTitle() {

		return (ldriver.getTitle());
	}

}
