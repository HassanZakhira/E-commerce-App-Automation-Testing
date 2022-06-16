@smoke
Feature: Guest user could add different products to compare list

  Background: User select  Before All Compare
    Given Select Euro
    Then see Euro sign

  Scenario:add different products to CompareList

    When select random category

    #if category have subcategory select random subcategory
    Then check if category have subcategory
    And Add Random Product to CompareList

    #check product added to CompareList
    And CompareList updated