Feature: User Change his Password
  Scenario:User login
    Given Click on Login Tab
    And Enter valid Email And Password
    Then Click on Login Button
   # User reset password
    Given Click on MyAccount
    And Click on ChangePassword
    And Enter old Password
    And Enter New Password
    And Enter Confirm New Password
    Then ClickChangePasswordButton
    Then Password Was Changed