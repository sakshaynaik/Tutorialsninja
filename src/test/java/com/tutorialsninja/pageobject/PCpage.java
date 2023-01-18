package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PCpage {

	WebDriver ldriver;

	public PCpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement contbttn;

	@FindBy(xpath = "//p[normalize-space()='There are no products to list in this category.']")
	private WebElement pcpageemptytxt;
	
	///////////////////////////////////////////////////////////////
	
	public boolean isDisplayedPCPageEmptyMsg() {

		return (pcpageemptytxt.isDisplayed());
	}
	
	public String getPCPageEmptyMsg() {

		return (pcpageemptytxt.getText());
	}

	public Homepage clickOnContinueButton() {

		contbttn.click();
		return (new Homepage(ldriver));
	}

	public String getPCPageTitle() {

		return (ldriver.getTitle());
	}

}
