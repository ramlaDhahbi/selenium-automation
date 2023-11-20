package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.page_objects.CustomersPage;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CustomersPage customersPage;
	private SelectFromListUtils selectFromListUtils;

	public CustomersStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		customersPage = new CustomersPage();
		selectFromListUtils = new SelectFromListUtils();

	}

	@When("je clique sur le menu Costumers")
	public void jeCliqueSurLeMenuCostumers() throws InterruptedException {
		seleniumUtils.click(CustomersPage.getCustomersMenu());
		Thread.sleep(3000);

	}

	@When("Je ckique sur le sous menu Customers")
	public void jeCkiqueSurLeSousMenuCustomers() {
		seleniumUtils.click(CustomersPage.getCustomers());

	}

	@When("Je clique sur bouton Add new")
	public void jeCliqueSurBoutonAddNew() throws InterruptedException {
		seleniumUtils.click(CustomersPage.getAddCustomer());

		Thread.sleep(3000);

	}

	@When("Je saisis email {string}")
	public void jeSaisisEmail(String customerEmail) {
		seleniumUtils.writeText(CustomersPage.getCustomerEmail(), customerEmail);

	}

	@When("Je sais password {string}")
	public void jeSaisPassword(String customerPassword) {
		seleniumUtils.writeText(CustomersPage.getCustomerPassword(), customerPassword);
	}

	@When("Je coche {string}")
	public void jeCoche(String string) {

		WebElement inputElement = (CustomersPage.getMaleGender());
		inputElement.click();

	}

	@When("Je saisis date de naissance {string}")
	public void jeSaisDateDeNaissance(String birthDayDate) {
		seleniumUtils.writeText(CustomersPage.getBirthDayDate(), birthDayDate);

	}

	@When("Je vide le champs Customers roles")
	public void jeVideLeChampsCustomersRoles() throws InterruptedException {
		seleniumUtils.click(CustomersPage.getDeletCustomerRole());
		Thread.sleep(3000);

	}

	@When("Je selectionne le role {string}")
	public void jeSelectionneLeRole(String customerRole) {

		WebElement customerRoleDropdown = CustomersPage.getCustomerRole();
		selectFromListUtils.selectDropDownListByValue(customerRoleDropdown, "4");

	}

	@When("Je clique sur bouton Save")
	public void jeCliqueSurBoutonSave() {
		seleniumUtils.click(CustomersPage.getBtnSaveCustomer());

	}

	@Then("Je verifie le message ajout client {string}")
	public void jeVerifieLeMessageDAjoutClient(String texte) {
		String messageSuccessAdd = CustomersPage.getMessageAddCustomer().getText();
		Assert.assertTrue(messageSuccessAdd.contains(texte));

	}

}
