@smoke
Feature: Guest user could filter with color

  Background: User select Euro Before select any product
    Given Select Euro

  Scenario: Select Apparel Category and filter with Random color

    When Select Apparel Category
    Then CategoryApparelAssertion

    And Select shoes SubCategory
    Then shoes SubCategory Assertion

    And filter Category with Random color