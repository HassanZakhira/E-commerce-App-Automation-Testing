@smoke
Feature:Guest could register with valid data

  Scenario:Guest could register with valid data
    Given Click on Register Tab
    And Click on any Gender "male"
    And Fill First Name "Hassan"
    And Fill Second Name "Zakhira"
    And Select Day "1"
    And Select Month "6"
    And Select Year "1999"
    And Enter any email "HassanAutomation77@gmail.com"
    And Enter any company name "Automation Company"
    And Enter password "P@ssw0rd"
    And Enter Confirm password "P@ssw0rd"
    And Click on REGISTER button
    Then userShouldSeeMessage