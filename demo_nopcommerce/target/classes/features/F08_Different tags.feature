@smoke
Feature:Logged user could select different tags
  Background: User select  Before All Compare
    Given Select Euro
    Then see Euro sign

  Scenario:Logged user could select Random tags
    #select Random Category
    When user hover random category
    Then CategoryNameAssertion
    #select random tag
    Given Guest select random tag
    Then user should see relative products to the selected tag
