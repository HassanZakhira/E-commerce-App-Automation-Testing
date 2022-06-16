@smoke
Feature: Guest user could add different products to Shopping cart

  Background: User select Euro Before select any product
    Given Select Euro

  Scenario:User Add Random product to Shopping cart
    #check if cart empty or no
    Then Cart Overview
    When select random category
    #if category have subcategory select random subcategory
    And check if category have subcategory
    And Add Random Product to cart
    #check product added to cart and see Total price
    Then Cart Updated And prise is displayed
    And  Products in cart Greater than zero
