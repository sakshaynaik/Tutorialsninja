package com.tutorialsninja.pageobject;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ElementUtils;
import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Productcomparisionpage {

	WebDriver ldriver;
	ElementUtils element;

	public Productcomparisionpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		element = new ElementUtils(rdriver);
	}

	@FindBy(linkText = "iMac")
	private WebElement imaclink;

	@FindBy(linkText = "Remove")
	private WebElement remove;

	@FindBy(xpath = "//*[@id='content']/table/tbody[2]/tr/td[2]/input")
	private WebElement addtocart;

	@FindBy(xpath = "//input[@value='Add to Cart']")
	private WebElement addtocarthplp;

	@FindBy(linkText = "HP LP3065")
	private WebElement hplp3065;

	@FindBy(linkText = "Product Comparison")
	private WebElement productcomparisonlink;
	
	@FindBy(linkText = "Canon EOS 5D")
	private WebElement prdtimg;

	@FindBy(xpath = "//*[@id='content']/table/tbody[2]/tr/td[2]/input")
	private WebElement whishlistbttn;

	@FindBy(linkText = "Remove")
	private WebElement removelink;

	@FindBy(linkText = "Continue")
	private WebElement continuebttn;

	@FindBy(linkText = "iPhone")
	private WebElement ipadimg;
	
	@FindBy(linkText = "shopping cart")
	private WebElement shopcartlink;

	@FindBy(xpath = "//*[@id='content']/table/tbody[2]/tr/td[3]/input")
	private WebElement ipadaddtocart;

	@FindBy(xpath = "//div[contains(text(),'Success: You have modified')]")
	private WebElement modifiedmsg;

	@FindBy(xpath = "//div[1][contains(.,'to your shopping cart!')]")
	private WebElement shopcartmsg;

	@FindBy(xpath = "//*[@id='content']/p")
	private WebElement nonchosemsg;

	@FindBy(xpath = "//div[@id='content']//table[@class='table table-bordered']//tbody[1]/tr[1]/td/a")
	private List<WebElement> listprdtfrmpage;

	@FindBy(xpath = "//ul[@class='breadcrumb']/li/a")
	private List<WebElement> bedcrumlink;

	///////////////////////////////////////////////////////////////////////////

	public void clickOnRandomBreadcrumLink() {

		Random random = new Random();
		int num = random.nextInt(bedcrumlink.size());

		WebElement link = ldriver.findElement(By.xpath("//ul[@class='breadcrumb']/li[" + (num + 1) + "]/a"));
		ReadJavascriptExecutor.clickElementByJavaScript(link, ldriver);
	}

	public boolean isDisplayedDynamicProductNameLink(String text) {

		return (element.isDisplayedDynamicElement(listprdtfrmpage, text));
	}

	public void clickDynamicProductNameLink(String text) {

		element.clickOnDynamicElement(listprdtfrmpage, text);

	}

	public String getMsgProductNotChoosen() {

		return (nonchosemsg.getText());
	}
	
	public void clickOnShoppingCartLinkFromMsg() {

		ReadJavascriptExecutor.clickElementByJavaScript(shopcartlink, ldriver);
	}

	public boolean isDisplyedMsgProductNotChoosen() {

		return (nonchosemsg.isDisplayed());
	}

	public String getMsgForProductCompareModified() {

		return (modifiedmsg.getText());
	}

	public String getMsgForShoppingCart() {

		return (shopcartmsg.getText());
	}

	public boolean isDisplyedMsgForShoppingCart() {

		return (shopcartmsg.isDisplayed());
	}

	public boolean isDisplyedMsgForProductCompareModified() {

		return (modifiedmsg.isDisplayed());
	}

	public void clickOnRemoveButton() {

		remove.click();
	}

	public boolean isDisplayediPhoneAddToCart() {

		return (ipadaddtocart.isDisplayed());
	}

	public String getTextiPhoneLinkText() {

		return (ipadimg.getText());
	}

	public boolean isDisplayediPhoneLinkText() {

		return (ipadimg.isDisplayed());
	}

	public Homepage clickOnContinueButton() {

		continuebttn.click();
		return (new Homepage(ldriver));
	}

	public String getTextRemoveButtonProductComaprePage() {

		return (removelink.getText());
	}

	public boolean isDisplayedRemoveButtonInProductComaprePage() {

		return (removelink.isDisplayed());
	}

	public String getTextWhishlistButtonProductComaprePage() {

		return (whishlistbttn.getText());
	}

	public boolean isDisplayedWhishlistButtonInProductComaprePage() {

		return (whishlistbttn.isDisplayed());
	}

	public String getTextForProductInProductComaprePage() {

		return (prdtimg.getText());
	}

	public boolean isDisplayedLinkForProductInProductComaprePage() {

		return (prdtimg.isDisplayed());
	}

	public String getTextHpLp3065() {

		return (hplp3065.getText());
	}

	public boolean isDisplayedHpLp3065() {

		return (hplp3065.isDisplayed());
	}

	public String getTextAddToCartHpLp() {

		return (addtocarthplp.getText());
	}

	public boolean isDisplayedAddToCartHpLp() {

		return (addtocarthplp.isDisplayed());
	}

	public String getProductComparePageTitle() {

		return (ldriver.getTitle());
	}

	public Productpage clickOniMacLinkText() {

		imaclink.click();
		return (new Productpage(ldriver));
	}

	public String getTextiMacLinkText() {

		return (imaclink.getText());
	}

	public boolean isDisplayediMacLinkText() {

		return (imaclink.isDisplayed());
	}

	public String getTextAddToCartButton() {

		return (addtocart.getText());
	}

	public boolean isDisplayedAddToCartButton() {

		return (addtocart.isDisplayed());
	}

	public void clickAddToCartButton() {

		addtocart.click();
	}

	public String getTextRemoveButton() {

		return (remove.getText());
	}

	public boolean isDisplayedRemoveButton() {

		return (remove.isDisplayed());
	}
	
	public boolean isDisplayedProductComparisonOnBreadCrum() {

		return (productcomparisonlink.isDisplayed());
	}

	public void clickRemoveButton() {

		remove.click();
	}

}
