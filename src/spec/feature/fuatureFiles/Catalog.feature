@catalog
Feature: je souhaite chercher un produit dans la liste des produits

  Background: 
    Given je me connecte sur l application nopCommerce
    When je saisis l email "admin@yourstore.com"
    And je saisis le mot de passe "admin"
    And je clique sur le boton Log In
    Then je me redirige vers la page Home "Dashboard"
    When je clique sur le menu Catalog

  @serachproduit-valid
  Scenario: je souhaite chercher un produit dans la liste des produit
    When je clique sur le sous menu produit
    And je saisis "Build your own computer"
    And je clique sur le bouton Search
    Then le produit affiche "Build your own computer"

  @ajouter-Categorie
  Scenario: je souhaite ajouter une categorie des produit
    And Je clique sur le sous menu Categories
    And Je clique sur le bouton Add new
    And Je saisis le nom "Categorie Test"
    And Je saisis une description "This is a description" "Description_ifr"
    And Je selctionne le parent category "Computers"
    And Je telecharge une image "C:\\Users\\Atef\\Desktop\\formation.png"
    And Je clique sur le boutton Save
    Then Je verifie le message d ajout "successfully"
