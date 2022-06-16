@smoke
Feature:Guest user could select different Categories

  Background: User select Euro Before select any product
    Given Select Euro

  Scenario: user could hover categories

    When user hover random category
    Then CategoryNameAssertion

    When select random subcategory
    Then subCategoryNameAssertion