package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CustomersPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	private static WebElement customersMenu;

	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement customers;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement addCustomer;

	@FindBy(how = How.ID, using = "Email")
	private static WebElement customerEmail;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement customerPassword;

	@FindBy(how = How.ID, using = "Gender_Male")
	private static WebElement maleGender;

	@FindBy(how = How.ID, using = "DateOfBirth")
	private static WebElement birthDayDate;

	@FindBy(how = How.XPATH, using = "//span[@title='delete']")
	private static WebElement deletCustomerRole;

	@FindBy(how = How.XPATH, using = "span[normalize-space()='Guests']")
	private static WebElement customerRole;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSaveCustomer;

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messageAddCustomer;
	
	public CustomersPage() {
		super(Setup.getDriver());

	}

	public static WebElement getCustomersMenu() {
		return customersMenu;
	}

	public static WebElement getCustomers() {
		return customers;
	}

	public static WebElement getAddCustomer() {
		return addCustomer;
	}

	public static WebElement getCustomerEmail() {
		return customerEmail;
	}

	public static WebElement getCustomerPassword() {
		return customerPassword;
	}

	public static WebElement getMaleGender() {
		return maleGender;
	}

	public static WebElement getBirthDayDate() {
		return birthDayDate;
	}

	public static WebElement getDeletCustomerRole() {
		return deletCustomerRole;
	}

	public static WebElement getCustomerRole() {
		return customerRole;
	}

	public static WebElement getBtnSaveCustomer() 
		{
			return btnSaveCustomer ;
		}
		public static WebElement getMessageAddCustomer() {
			{
				return messageAddCustomer;
			}
	}
}
