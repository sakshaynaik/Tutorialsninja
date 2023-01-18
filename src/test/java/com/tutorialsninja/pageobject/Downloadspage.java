package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Downloadspage {

	WebDriver ldriver;

	public Downloadspage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'You have not made any')]")
	private WebElement downmsg;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement continuebttn;

	//////////////////////////////////////////////////////////////////

	public Accountpage clickOncontinuebutton() {

		continuebttn.click();
		return (new Accountpage(ldriver));
	}

	public String gettxtOnDownloadsPage() {

		return (downmsg.getText());
	}

	public boolean isDisplayedtxtOnDownloadsPage() {

		return (downmsg.isDisplayed());
	}

	public String getDownloadsPageTitle() {

		return (ldriver.getTitle());
	}

}
