@authentification
Feature: Je souhaite verifier la page de connexion
  En tant que utilisateur je souhaite verifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite verifier la page de connexion
    Given je me connecte sur l application nopCommerce
    When je saisis l email "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le boton Log In
    Then je me redirige vers la page Home "Dashboard"

  @authentification-invalid
  Scenario: Je souhaite verifier la page de connexion
    Given je me connecte sur l application nopCommerce
    When je saisis l email "example@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le boton Log In
    Then je verifie le message "Login was unsuccessful,Please correct the errors and try again"

  @logout
  Scenario: Je souhaite verifier la page de connexion
    Given je me connecte sur l application nopCommerce
    When je saisis l email "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le boton Log In
    And je clique sur le boton Logout
