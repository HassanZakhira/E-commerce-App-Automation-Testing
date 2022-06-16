@smoke
Feature: Guest User could search for any product
  Scenario: Guest User could search for any product by Name
    Given click on search field in Home page
    And search for any product like "Apple"
    Then Assertion Soft Go to URL
    And results size is more than zero

  Scenario: SKU search
    Given click on search field in Home page
    And search for any product By SKU Search "AP_MBP_13"
    Then See correct Product OF SKU

