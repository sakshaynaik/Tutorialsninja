package com.tutorialsninja.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.utilities.ReadJavascriptExecutor;

public class Accountlogoutpage {

	WebDriver ldriver;

	public Accountlogoutpage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText = "Continue")
	private WebElement continebttn;

	@FindBy(linkText = "Login")
	private WebElement loginlink;

	///////////////////////////////////////////////////////////////////////

	public Loginpage clickOnLoginLink() {

		ReadJavascriptExecutor.clickElementByJavaScript(loginlink, ldriver);
		return (new Loginpage(ldriver));
	}

	public void refreshByJavascript() {

		ReadJavascriptExecutor.refreshBrowserByJS(ldriver);
	}

	public void refreshPage() {

		ldriver.navigate().refresh();
	}

	public void navigateBack() {

		ldriver.navigate().back();
	}

	public Homepage clickOnContinueButton() {

		continebttn.click();
		return (new Homepage(ldriver));
	}

	public String getAccountLogoutPageTitle() {

		return (ldriver.getTitle());
	}

	public void closeWindowPage() {

		ldriver.close();
	}

}
