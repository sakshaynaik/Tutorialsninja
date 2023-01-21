package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rewardspointpage {

	WebDriver ldriver;

	public Rewardspointpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement continuebttn;

	@FindBy(linkText = "Order History")
	private WebElement orderhistorylink;
	
	@FindBy(linkText = "Reward Points")
	private WebElement rewardpointslink;

	@FindBy(xpath = "//div[@id='account-reward']//p[1]")
	private WebElement gettxtmsg;

	///////////////////////////////////////////////////////////////////////////////////
	
	public boolean isDisplayedRewardPointsOnBreadCrum() {

		return (rewardpointslink.isDisplayed());
	}

	public String getTextRewardsTextMsg() {

		return (gettxtmsg.getText());
	}

	public boolean isDisplayedRewardsTextMsg() {

		return (gettxtmsg.isDisplayed());
	}

	public Orderhistorypage clickOnOrderHistoryLink() {

		orderhistorylink.click();
		return (new Orderhistorypage(ldriver));
	}

	public Accountpage clickOnContinueButton() {

		continuebttn.click();
		return (new Accountpage(ldriver));
	}

	public String getRewardsPointPageTitle() {

		return (ldriver.getTitle());
	}
}
