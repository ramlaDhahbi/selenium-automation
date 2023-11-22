package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CatalogPage catalogPage;

	public CatalogStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
	}

	@When("je clique sur le menu Catalog")
	public void jeCliqueSurLeMenuCatalog() throws InterruptedException {
		seleniumUtils.click(CatalogPage.getCatalog());
		Thread.sleep(3000);

	}

	@When("je clique sur le sous menu produit")
	public void jeCliqueSurLeSousMenuProduit() {
		seleniumUtils.click(CatalogPage.getProduct());

	}

	@When("je saisis {string}")
	public void jeSaisis(String productName) {
		seleniumUtils.writeText(CatalogPage.getProductName(), productName);

	}

	@When("je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() throws InterruptedException {
		seleniumUtils.click(CatalogPage.getBtnSearch());
		Thread.sleep(3000);

	}

	@Then("le produit affiche {string}")
	public void leProduitAffiche(String text) {
		String message = CatalogPage.getProductNameSearch().getText();
		Assert.assertEquals(message, text);
	}

	@When("Je clique sur le sous menu Categories")
	public void jeCliqueSurLeSousMenuCategories() {
		seleniumUtils.click(CatalogPage.getCategorie());

	}

	@When("Je clique sur le bouton Add new")
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CatalogPage.getAddCategorie());

	}

	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String categorieName) throws InterruptedException {
		seleniumUtils.writeText(CatalogPage.getNameCategorie(), categorieName);
		Thread.sleep(3000);
	}

	@When("Je saisis une description {string} {string}")
	public void jeSaisisUneDescription(String champDescription, String descriptionFrameID) {
		seleniumUtils.click(CatalogPage.getChampDescription());
		seleniumUtils.switchToNewWindow(Setup.getDriver(), descriptionFrameID);
		Setup.getDriver().switchTo().activeElement().sendKeys(champDescription);
		Setup.getDriver().switchTo().defaultContent();
	}

	@When("Je selctionne le parent category {string}")
	public void jeSelctionneLeParentCategory(String string) {
		Select select = new Select(CatalogPage.getParentCategorie());
		select.selectByIndex(2);

	}

	@When("Je telecharge une image {string}")
	public void jeTelechargeUneImage(String filePath) throws InterruptedException {
		CatalogPage.getUploadCategorie().sendKeys(filePath);
		Thread.sleep(3000);
	}

	@When("Je clique sur le boutton Save")
	public void jeCliqueSurLeBouttonSave() throws InterruptedException {
		seleniumUtils.click(CatalogPage.getSaveCategorie());
		Thread.sleep(3000);

	}

	@Then("Je verifie le message d ajout {string}")
	public void jeVerifieLeMessageDAjout(String texte) {
		String messageSuccessAdd = CatalogPage.getMessageAddCategorie().getText();
		Assert.assertTrue(messageSuccessAdd.contains(texte));

	}

}
