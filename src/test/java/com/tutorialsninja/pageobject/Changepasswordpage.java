package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Changepasswordpage {

	WebDriver ldriver;

	public Changepasswordpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "input-password")
	private WebElement oldpasswrd;

	@FindBy(id = "input-confirm")
	private WebElement newpasswrd;
	
	@FindBy(linkText = "Back")
	private WebElement backbutton;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement confrmbttn;

	@FindBy(xpath = "//div[@class='text-danger']")
	private WebElement passinvalidmsg;
	
	/////////////////////////////////////////////////////////////////////////
	
	public Accountpage clickOnBackButton() {

		ReadJavascriptExecutor.clickElementByJavaScript(backbutton, ldriver);
		return (new Accountpage(ldriver));
	}
	
	public String getInvalidPassMsg() {

		return (passinvalidmsg.getText());
	}

	public boolean isDisplayedInvaildPassMsg() {

		return (passinvalidmsg.isDisplayed());
	}

	public void enterNewPasswordTextField(String oldpass) {

		oldpasswrd.sendKeys(oldpass);
	}

	public void enterNewConfirmPasswordTextField(String newpass) {

		newpasswrd.sendKeys(newpass);
	}

	public String getAttributeForNewPasswordTextField(String attribute) {

		return (newpasswrd.getAttribute(attribute));
	}

	public Accountpage clickOnConfirmButton() {

		confrmbttn.click();
		return (new Accountpage(ldriver));
	}

	public String getChangePasswordPageTitle() {

		return (ldriver.getTitle());
	}

}
