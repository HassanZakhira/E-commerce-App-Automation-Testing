@smoke
Feature: guest user could Login with valid credentials
  Scenario: guest user could Login with valid credentials
    Given Click on Login Tab
    And Enter valid Email And Password
    Then Click on Login Button
    Then Go to correct URl
    Then MYAccount Displayed