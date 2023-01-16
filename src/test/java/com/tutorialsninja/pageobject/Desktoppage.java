package com.tutorialsninja.pageobject;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ElementUtils;
import com.tutorialsninja.utilities.ReadJavascriptExecutor;



public class Desktoppage {

	WebDriver ldriver;
	ElementUtils element;

	public Desktoppage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		element = new ElementUtils(rdriver);
	}

	@FindBy(id = "list-view")
	private WebElement listview;

	@FindBy(id = "grid-view")
	private WebElement gridview;

	@FindBy(xpath = "//*[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement comparelistbutton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement compareprdtmsg;
	
	@FindBy(linkText = "shopping cart")
	private WebElement shopcartmsglink;

	@FindBy(linkText = "product comparison")
	private WebElement productcomparelink;

	@FindBy(linkText = "Product Compare (0)")
	private WebElement productlink;

	@FindBy(css = "a:nth-child(3)")
	private WebElement subimac;
	
	@FindBy(xpath = "//div[@id='content']//div[@class='row'][4]/div//h4//a")
	private List<WebElement> multiprdt;

	///////////////////////////////////////////////////////////////////
	
	public Productpage clickOnDynamicProductLink(String txt) {

		element.clickOnDynamicElement(multiprdt, txt);
		return (new Productpage(ldriver));
	}

	public Productpage clickOnSubiMacLink() {

		subimac.click();
		return (new Productpage(ldriver));
	}

	public Productcomparisionpage clickOnProductCompareLink_0() {

		productlink.click();
		return (new Productcomparisionpage(ldriver));
	}
	
	public Shoppingcartpage clickOnShopCartMsgLink() {

		try {
			ReadJavascriptExecutor.clickElementByJavaScript(shopcartmsglink, ldriver);
		} catch (StaleElementReferenceException e) {
			ReadJavascriptExecutor.clickElementByJavaScript(shopcartmsglink, ldriver);
		}
		return (new Shoppingcartpage(ldriver));
	}

	public boolean isDisplayedMessageForCompareProduct() {

		return (compareprdtmsg.isDisplayed());
	}

	public String getTextMessageForCompareProduct() {

		return (compareprdtmsg.getText());
	}

	public String getAttributeForCompareListButton(String txt) {

		return (comparelistbutton.getAttribute(txt));
	}

	public String getDeskTopPageTitle() {

		return (ldriver.getTitle());
	}

	public Productcomparisionpage clickOnProductComapreLink() {

		ReadJavascriptExecutor.clickElementByJavaScript(productcomparelink, ldriver);
		return (new Productcomparisionpage(ldriver));
	}

	public String getCompareProductMsg() {

		return (compareprdtmsg.getText());
	}

	public boolean isDispalyedCompareProductMsg() {

		return (compareprdtmsg.isDisplayed());
	}

	public void clickOnGridView() {

		gridview.click();
	}

	public void clickOnListView() {

		listview.click();
	}

	public void clickOnCompareListButton() {

		comparelistbutton.click();
	}

}
