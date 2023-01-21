package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recurringpaymentpage {

	WebDriver ldriver;

	public Recurringpaymentpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText = "Continue")
	private WebElement continuebttn;

	@FindBy(linkText = "Recurring Payments")
	private WebElement recurringpaymentslink;
	
	@FindBy(xpath = "//p[normalize-space()='No recurring payments found!']")
	private WebElement recurrngmsg;

	///////////////////////////////////////////////////////////////////////////////////

	public String getRecurringPaymentMsg() {

		return (recurrngmsg.getText());
	}
	
	public boolean isDisplayedRecurringPaymentOnBreadCrum() {

		return (recurringpaymentslink.isDisplayed());
	}

	public boolean isDisplayedRecurringPaymentMsg() {

		return (recurrngmsg.isDisplayed());
	}

	public Accountpage clickOnContinueButton() {

		continuebttn.click();
		return (new Accountpage(ldriver));
	}

	public String getRecurrigPaymentPageTitle() {

		return (ldriver.getTitle());
	}

}
