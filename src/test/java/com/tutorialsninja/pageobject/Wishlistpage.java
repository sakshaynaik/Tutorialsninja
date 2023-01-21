package com.tutorialsninja.pageobject;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ElementUtils;
import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Wishlistpage {

	WebDriver ldriver;
	ElementUtils element;

	public Wishlistpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		element = new ElementUtils(rdriver);
	}

	@FindBy(xpath = "//a[@class='btn btn-danger']")
	private WebElement removebttn;

	@FindBy(xpath = "//div[contains(text(),'Success: You have modified your wish list!')]")
	private WebElement wishlistmsg;

	@FindBy(linkText = "Continue")
	private WebElement continuebttn;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement addtocartbttn;

	@FindBy(xpath = "//div[contains(text(),'Success: You have added')]")
	private WebElement addtocartmsg;

	@FindBy(xpath = "//img[@title='iMac']")
	private WebElement iMacimg;

	@FindBy(linkText = "iMac")
	private WebElement iMaclink;
	
	@FindBy(linkText = "shopping cart")
	private WebElement shopcartmsglink;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
	private WebElement iphoneimg;

	@FindBy(xpath = "//p[normalize-space()='Your wish list is empty.']")
	private WebElement emptytxtonwishlst;

	@FindBy(xpath = "//div[@class='table-responsive']//tbody/tr/td[2]")
	private List<WebElement> whishlistprdt;
	

//////////////////////////////////////////////////////////////////////////////////
	
	public boolean isDisplayedDynamicProductNameLink(String text) {

		return (element.isDisplayedDynamicElement(whishlistprdt, text));
	}
	
	public void clickDynamicProductNameLink(String text) {

		element.clickOnDynamicElement(whishlistprdt, text);
	}

	public String getEmptyTextOnWishListPage() {

		return (emptytxtonwishlst.getText());

	}

	public boolean isDisplayedEmptyTextOnWishListPage() {

		return (emptytxtonwishlst.isDisplayed());

	}
	
	public Shoppingcartpage clickOnShopCartMsgLink() {

		try {
			ReadJavascriptExecutor.clickElementByJavaScript(shopcartmsglink, ldriver);
		} catch (StaleElementReferenceException e) {
			ReadJavascriptExecutor.clickElementByJavaScript(shopcartmsglink, ldriver);
		}
		return (new Shoppingcartpage(ldriver));
	}

	public boolean isDisplayedOniPhoneImg() {

		return (iphoneimg.isDisplayed());

	}

	public boolean isDisplayedOniMacImg() {

		return (iMaclink.isDisplayed());

	}

	public String getTextAddToCartMsg() {

		return (addtocartmsg.getText());

	}

	public boolean isDisplayedAddToCartMsg() {

		return (addtocartmsg.isDisplayed());

	}

	public void clickOnAddToCartButton() {

		element.click(addtocartbttn);
	}

	public Accountpage clickOnContinueButton() {

		continuebttn.click();
		return (new Accountpage(ldriver));
	}

	public String getWishlistChangesMsg() {

		return (wishlistmsg.getText());
	}

	public boolean isDisplayedWishlistChangesMsg() {

		return (wishlistmsg.isDisplayed());
	}

	public void clickOnRemoveButton() {

		removebttn.click();
	}

	public String getWishListPageTitle() {

		return (ldriver.getTitle());
	}

}
