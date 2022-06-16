@smoke
Feature: User could reset his/her password successfully
  Scenario:User could reset his/her password successfully
    Given Click on Login Tab
    And Click on forgot Password
    And Enter Your email address
    And Click on Recover Button
    Then Email with instructions has been sent to you