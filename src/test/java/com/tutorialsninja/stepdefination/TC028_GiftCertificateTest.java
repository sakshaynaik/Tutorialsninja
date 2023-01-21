package com.tutorialsninja.stepdefination;

import java.util.Map;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Giftcertificatepage;
import com.tutorialsninja.pageobject.Homepage;
import com.tutorialsninja.pageobject.Shoppingcartpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC028_GiftCertificateTest extends BaseClass {

	Homepage homepage;
	Giftcertificatepage giftcertificatepage;
	Shoppingcartpage shoppingcartpage;

	@When("User click on gift certificates option from footer section")
	public void user_click_on_gift_certificates_option_from_footer_section() {

		homepage = new Homepage(driver);
		homepage.clickOnGiftCertificateLink();
	}

	@Then("User should be taken to purchase a gift certificate page")
	public void user_should_be_taken_to_purchase_a_gift_certificate_page() {

		giftcertificatepage = new Giftcertificatepage(driver);
		Assert.assertEquals(giftcertificatepage.getGiftCertificatePageTitle(), config.getGiftCertificatePageTitle());
		Assert.assertTrue(giftcertificatepage.isDisplayedGiftCertificateOnBedCrum());
	}

	@When("User enters mandatory details into fields of gift certificate page")
	public void user_enters_mandatory_details_into_fields_of_gift_certificate_page(DataTable dataTable) {

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.enterRecipientsNameTextField(hMap.get("receiptname"));
		giftcertificatepage.enterRecipientsEmailTextField(hMap.get("receiptemail"));
		giftcertificatepage.enterSenderNameTextField(hMap.get("yourname"));
		giftcertificatepage.enterSenderEmailTextField(hMap.get("youremail"));
		giftcertificatepage.clickOnGiftCertifacteTheme(hMap.get("gifttheme"));
	}

	@When("select non-refundable checkbox and click on continue button of gift certificate page")
	public void select_non_refundable_checkbox_and_click_on_continue_button_of_gift_certificate_page() {

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.clickOnAgreeCheckBox();
		giftcertificatepage.clickOnContinueButton();
	}

	@Then("Text {string} should display in gift certificate page")
	public void text_should_display_in_gift_certificate_page(String string) {

		giftcertificatepage = new Giftcertificatepage(driver);
		Assert.assertTrue(giftcertificatepage.getGiftCertificateMsg().contains(string));
	}

	@When("User enters following details into fields of gift certificate page")
	public void user_enters_following_details_into_fields_of_gift_certificate_page(DataTable dataTable) {

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.enterRecipientsNameTextField(hMap.get("receiptname"));
		giftcertificatepage.enterRecipientsEmailTextField(hMap.get("receiptemail"));
		giftcertificatepage.enterSenderNameTextField(hMap.get("yourname"));
		giftcertificatepage.enterSenderEmailTextField(hMap.get("youremail"));
		giftcertificatepage.enterAmountTextField(hMap.get("amount"));
		giftcertificatepage.clickOnGiftCertifacteTheme(hMap.get("gifttheme"));
	}

	@When("User enters receiptname {string} and receiptemail {string}")
	public void user_enters_receiptname_and_receiptemail(String string, String string2) {

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.enterRecipientsNameTextField(string);
		giftcertificatepage.enterRecipientsEmailTextField(string2);
	}

	@When("User enters yourname {string} and youremail {string}")
	public void user_enters_yourname_and_youremail(String string, String string2) {

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.enterSenderNameTextField(string);
		giftcertificatepage.enterSenderEmailTextField(string2);
	}

	@When("User select gifttheme {string} and enter amount {string}")
	public void user_select_gifttheme_and_enter_amount(String string, String string2) {

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.clickOnGiftCertifacteTheme(string);
		giftcertificatepage.enterAmountTextField(string2);
	}

	@Then("Warn Message {string} should display in gift certificate page")
	public void warn_message_should_display_in_gift_certificate_page(String string) {

		giftcertificatepage = new Giftcertificatepage(driver);
		Assert.assertEquals(giftcertificatepage.getInvalidEmailMsg(), "E-Mail Address does not appear to be valid!");
	}

	@When("User click on continue of gift certificate page")
	public void user_click_on_continue_of_gift_certificate_page() {

		giftcertificatepage = new Giftcertificatepage(driver);
		giftcertificatepage.clickOnContinueButtonFromSuccessGiftPage();
	}

	@Then("User should be taken to shoppingcart page")
	public void user_should_be_taken_to_shoppingcart_page() {

		shoppingcartpage = new Shoppingcartpage(driver);
		Assert.assertEquals(shoppingcartpage.getShoppingCartPageTitle(), config.getShoppingCartPageTitle());
	}

}
