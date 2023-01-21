package com.tutorialsninja.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ReadAction;
import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Specialofferspage {

	WebDriver ldriver;

	public Specialofferspage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "grid-view")
	private WebElement gridview;

	@FindBy(id = "list-view")
	private WebElement listview;

	@FindBy(linkText = "wish list")
	private WebElement wishlistlink;

	@FindBy(linkText = "product comparison")
	private WebElement productcomparelink;

	@FindBy(linkText = "Special Offers")
	private WebElement specialofferslink;
	
	@FindBy(xpath = "//div[@class='button-group']/button[1]")
	private WebElement addtocartbutton;

	@FindBy(xpath = "//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[2]")
	private WebElement addtowishlistbuton;

	@FindBy(xpath = "//div[@class='button-group']/button[3]")
	private WebElement compareprdtbutton;

	@FindBy(xpath = "//div[contains(text(), 'You must')]")
	private WebElement wishlstmsg;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishlst;

	@FindBy(xpath = "//div[contains(text(),'Success: You have added')]")
	private WebElement compareprdtmsg;

	@FindBy(xpath = "//div[@class='row']/div/div[@class='product-thumb']//h4/a")
	private List<WebElement> elements;

	@FindBy(xpath = "//div[@class='row']/div[2]/div[@class='product-thumb']//h4/a")
	private WebElement element;

	///////////////////////////////////////////////////////////////////////////////////

	public void clickOnProductCompareLink() {

		productcomparelink.click();
	}

	public void clickOnWishListLink() {

		wishlistlink.click();
	}

	public boolean isDisplayedCanonWebElement() {

		return (element.isDisplayed());
	}
	
	public boolean isDisplayedSpecialOffersOnBreadCrum() {

		return (specialofferslink.isDisplayed());
	}

	public boolean isDisplayedDynamicWebElement(String text) {

		return (ReadAction.isDisplayedDynamicElement(elements, text));
	}

	public Productpage clickOnDynamicWebElement(String text) {

		ReadAction.clickOnDynamicElement(elements, text);
		return (new Productpage(ldriver));
	}

	public String getCompareProductMessage() {

		return (compareprdtmsg.getText());
	}

	public boolean isDisplayedCompareProductMessage() {

		return (compareprdtmsg.isDisplayed());
	}

	public String getWishListMessage() {

		return (wishlst.getText());
	}

	public boolean isDisplayedWishListMessage() {

		return (wishlst.isDisplayed());
	}

	public void clickOnCompareThisProductButton() {

		ReadJavascriptExecutor.clickElementByJavaScript(compareprdtbutton, ldriver);
	}

	public void clickOnAddToWishListButton() {

		ReadJavascriptExecutor.clickElementByJavaScript(addtowishlistbuton, ldriver);
	}

	public Productpage clickOnAddToCartButton() {

		addtocartbutton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return (new Productpage(ldriver));
	}

	public void clickOnListView() {

		listview.click();
	}

	public void clickOnGridView() {

		gridview.click();
	}

	public String getSpecialOffersPageTitle() {

		return (ldriver.getTitle());
	}
}
