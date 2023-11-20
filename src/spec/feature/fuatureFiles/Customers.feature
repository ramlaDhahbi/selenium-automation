@customers
Feature: Je souhaite ajouter un nouveau client

  Background: 
    Given je me connecte sur l application nopCommerce
    When je saisis l email "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le boton Log In
    Then je me redirige vers la page Home "Dashboard"
    When je clique sur le menu Costumers

  @ajouter-client
  Scenario: Je souhaite ajouter un nouveau client
    When Je ckique sur le sous menu Customers
    And Je clique sur bouton Add new
    And Je saisis email "CustomerTest@gmail.com"
    And Je sais password "customer"
    And Je coche "Male"
    And Je saisis date de naissance "03/23/2020"
    And Je vide le champs Customers roles
    And Je selectionne le role "Guest"
    And Je clique sur bouton Save
    Then Je verifie le message ajout client "successfully"
