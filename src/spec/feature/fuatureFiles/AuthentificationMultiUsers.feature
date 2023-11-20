@multiusers
Feature: Je souhaite verifier la connexion avec plusieurs utilisateurs
  ETQ utilisateur je souhaite verifier la connexion avec plusieurs utilisateurs

  Background: 
   Given je me connecte sur l application nopCommerce

  @authentificationmultiusers
  Scenario Outline: Je souhaite verifier la connexion avec plusieurs utilisateurs
     When je saisis l email "<name>"
    And je saisis le mot de passe "<value>"
    And je clique sur le boton Log In

    Examples: 
      | name                | value |
      | admin@yourstore.com | admin |
      | Ramla@yourstore.com | Ramla |
      | Hajer@yourstore.com | Hajer |
      | Amir@yourstore.com  | Amir  |