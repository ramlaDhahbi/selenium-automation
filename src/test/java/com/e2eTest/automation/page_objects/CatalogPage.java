package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage {

	/* Retrieve web elements */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement catalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement product;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement productName;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearchProduct;

	@FindBy(how = How.XPATH, using = "//td[normalize-space()='Build your own computer']")
	private static WebElement productNameSearch;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categorie;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNewCategorie;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement categorieName;

	/*
	 * @FindBy(how = How.XPATH, using = "//iframe[@id='Description_ifr']") private
	 * static WebElement categorieDescription;
	 */

	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement parentCategorie;

	@FindBy(how = How.XPATH, using = "//input[@title='file input']")
	private static WebElement uploadCategorie;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSaveCategorie;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messageSuccessAdd;

	public CatalogPage() {
		super(Setup.getDriver());
	}

	public static WebElement getCatalog() {
		return catalog;
	}

	public static WebElement getProduct() {
		return product;
	}

	public static WebElement getProductName() {
		return productName;
	}

	public static WebElement getBtnSearch() {
		return btnSearchProduct;
	}

	public static WebElement getProductNameSearch() {
		return productNameSearch;
	}

	public static WebElement getCategorie() {
		return categorie;
	}

	public static WebElement getAddCategorie() {
		return btnAddNewCategorie;
	}

	public static WebElement getNameCategorie() {
		return categorieName;
	}

	/*
	 * public static WebElement getDescriptionCategorie() { return
	 * categorieDescription; }
	 */

	public static WebElement getParentCategorie() {

		return parentCategorie;
	}

	public static WebElement getUploadCategorie() {
		return uploadCategorie;
	}

	public static WebElement getSaveCategorie() {

		return btnSaveCategorie;
	}

	public static WebElement getMessageAddCategorie() {

		return messageSuccessAdd;
	}
}
