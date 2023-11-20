package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public AuthentificationStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}

	/* TC_01 */
	@Given("je me connecte sur l application nopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {
		seleniumUtils.get(configFileReader.getProperties("home.recette"));

	}

	@When("je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);

	}

	@When("je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);

	}

	@When("je clique sur le boton Log In")
	public void jeCliqueSurLeBotonLogIn() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());
	}

	@Then("je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		
		String message = AuthentificationPage.getDashboard().getText();
		Assert.assertEquals(message, text);

	}
	/* TC_02_invalid */

	@Then("je verifie le message {string}")
	public void jeVerifieLeMessage(String string) {

	}

	/* TC_03 Logout */

	@When("je clique sur le boton Logout")
	public void jeCliqueSurLeBotonLogout() {
		seleniumUtils.click(AuthentificationPage.getBtnLogin());
		
	

	}

}
