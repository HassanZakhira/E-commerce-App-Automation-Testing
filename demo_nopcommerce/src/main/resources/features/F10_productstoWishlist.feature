@smoke
Feature: Guest could add different products to Wishlist

  Background: User select Euro Before All
    Given Select Euro

  Scenario: add different products to Wishlist
    #check if cart Wishlist or no
    Given Wishlist Overview

    When select random category
    #if category have subcategory select random subcategory
    Then check if category have subcategory
    And Add Random Product to Wishlist
    #check product added to Wishlist
    And user get number of items Wishlist after adding product
    Then number of Wishlist items increased



