package com.tutorialsninja.stepdefination;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Accountlogoutpage;
import com.tutorialsninja.pageobject.Accountpage;
import com.tutorialsninja.pageobject.Changepasswordpage;
import com.tutorialsninja.pageobject.Loginpage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC015_ChangePasswordTest extends BaseClass {

	Changepasswordpage changepasswordpage;
	Accountpage accountpage;
	Accountlogoutpage accountlogoutpage;
	Loginpage loginpage;

	@Then("User should be taken to changepassword page")
	public void user_should_be_taken_to_changepassword_page() {

		changepasswordpage = new Changepasswordpage(driver);
		Assert.assertEquals(changepasswordpage.getChangePasswordPageTitle(), config.getChangePasswordPageTitle());
	}

	@When("User enter old password {string} into old password field of changepassword page")
	public void user_enter_old_password_into_old_password_field_of_changepassword_page(String string) {

		changepasswordpage = new Changepasswordpage(driver);
		changepasswordpage.enterNewPasswordTextField(string);
	}

	@When("User enter new password {string} into new password field of changepassword page")
	public void user_enter_new_password_into_new_password_field_of_changepassword_page(String string) {

		changepasswordpage = new Changepasswordpage(driver);
		changepasswordpage.enterNewConfirmPasswordTextField(string);
	}

	@When("User click on continue button of changepassword page")
	public void user_click_on_continue_button_of_changepassword_page() {

		changepasswordpage = new Changepasswordpage(driver);
		changepasswordpage.clickOnConfirmButton();
	}

	@Then("Success message of'Password successfully updated'should display in account page")
	public void success_message_of_password_successfully_updated_should_display_in_account_page() {

		accountpage = new Accountpage(driver);
		Assert.assertTrue(accountpage.isDisplayedUpdatedPasswordSuccessMsg());
	}

	@When("User logout and login with email {string} and old password {string}")
	public void user_logout_and_login_with_email_and_old_password(String email, String password) {

		accountpage = new Accountpage(driver);
		accountlogoutpage = accountpage.clickLogoutOption();
		loginpage = accountlogoutpage.clickOnLoginLink();
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
		loginpage.clickLoginButton();
	}

	@When("User logout and login with email {string} and new password {string}")
	public void user_logout_and_login_with_email_and_new_password(String email, String password) {

		accountpage = new Accountpage(driver);
		accountlogoutpage = new Accountlogoutpage(driver);
		loginpage = accountlogoutpage.clickOnLoginLink();
		loginpage.enterRegisteredEmail(email);
		loginpage.enterRegisteredPassword(password);
		loginpage.clickLoginButton();
	}

	@When("User enter password {string} and confirm password {string} fields of changepassword page")
	public void user_enter_password_and_confirm_password_fields_of_changepassword_page(String oldpass, String newpass) {

		changepasswordpage = new Changepasswordpage(driver);
		changepasswordpage.enterNewPasswordTextField(oldpass);
		changepasswordpage.enterNewConfirmPasswordTextField(newpass);
	}

	@Then("Warn message {string} should display in changepassword page")
	public void warn_message_should_display_in_changepassword_page(String string) {

		changepasswordpage = new Changepasswordpage(driver);
		Assert.assertEquals(changepasswordpage.getInvalidPassMsg(), string);
	}

	@When("User click on back button of changepassword page")
	public void user_click_on_back_button_of_changepassword_page() {

		changepasswordpage = new Changepasswordpage(driver);
		changepasswordpage.clickOnBackButton();
	}

}
