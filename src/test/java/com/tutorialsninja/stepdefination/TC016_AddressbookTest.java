package com.tutorialsninja.stepdefination;

import java.util.Map;

import org.testng.Assert;

import com.tutorialsninja.pageobject.Addressbookpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC016_AddressbookTest extends BaseClass {

	Addressbookpage addressbookpage;

	@Then("User should be taken to address book page")
	public void user_should_be_taken_to_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		Assert.assertEquals(addressbookpage.getAddressBookPageTitle(), config.getAddressBookPageTitle());
	}

	@When("User click on edit button on Address Book Entries")
	public void user_click_on_edit_button_on_address_book_entries() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnEditButton();
	}

	@Then("User should be taken to edit tab of address book page")
	public void user_should_be_taken_to_edit_tab_of_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		log.info("User Shoud be taken to Edit Tab Of Address Book Page");
	}

	@When("User enters following details into fields")
	public void user_enters_following_details_into_fields(DataTable dataTable) {

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.enterFirstName(hMap.get("Firstname"));
		addressbookpage.enterLastName(hMap.get("Lastname"));
		addressbookpage.enterCompanyName(hMap.get("Company"));
		addressbookpage.enterAddress1(hMap.get("Address1"));
		addressbookpage.enterAddress2(hMap.get("Address2"));
		addressbookpage.enterPostalCode(hMap.get("postcode"));
		addressbookpage.entercityName(hMap.get("city"));
		addressbookpage.selectByTextCountry(hMap.get("country"));
		addressbookpage.selectByIndexZone(Integer.parseInt(hMap.get("state")));
	}

	@When("User enters following mandatory details into fields")
	public void user_enters_following_mandatory_details_into_fields(DataTable dataTable) {

		Map<String, String> hMap = dataTable.asMap(String.class, String.class);

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.enterFirstName(hMap.get("Firstname"));
		addressbookpage.enterLastName(hMap.get("Lastname"));
		addressbookpage.enterAddress1(hMap.get("Address1"));
		addressbookpage.entercityName(hMap.get("city"));
		addressbookpage.selectByTextCountry(hMap.get("country"));
		addressbookpage.selectByIndexZone(Integer.parseInt(hMap.get("state")));
	}

	@When("User click on continue button in edit tab of address book page")
	public void user_click_on_continue_button_in_edit_tab_of_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnContinueButton();
	}

	@Then("Success message {string} should display in address book page")
	public void success_message_should_display_in_address_book_page(String string) {

		addressbookpage = new Addressbookpage(driver);
		Assert.assertEquals(addressbookpage.getUpdateAddressBookSuccessMsg(), string);
	}


	@Then("Address book entries table should be successfully updated with updated address entries")
	public void address_book_entries_table_should_be_successfully_updated_with_updated_address_entries() {

		
	}

	@When("User click on delete button of default address book entries")
	public void user_click_on_delete_button_of_default_address_book_entries() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnDefaltAddressDeleteButton();
	}

	@Then("Warn message {string} should display in address book page")
	public void warn_message_should_display_in_address_book_page(String string) {

		addressbookpage = new Addressbookpage(driver);
		Assert.assertEquals(addressbookpage.getDeleteWarnMsg(), string);
		
	}

	@When("User click on new address button on Address Book page")
	public void user_click_on_new_address_button_on_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnNewAddressButton();
	}

	@Then("User should be taken to new address tab of address book page")
	public void user_should_be_taken_to_new_address_tab_of_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		log.info("User Is Taken To New Address Tab In Address Book Page");
		
	}

	@When("User click on continue button in new address tab of address book page")
	public void user_click_on_continue_button_in_new_address_tab_of_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnContinueButton();
	}

	@When("User click on delete button of new address book entries")
	public void user_click_on_delete_button_of_new_address_book_entries() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnNewAddressDeleteButton();
	}

	@When("User click on back button of address book page")
	public void user_click_on_back_button_of_address_book_page() {

		addressbookpage = new Addressbookpage(driver);
		addressbookpage.clickOnBackButton();
	}

}
