Feature: Login Scenarios

  @PositiveCases
  Scenario: Success Login and Logout
    Given User is on landing page "https://www.lolaflora.com"
    And Navigate to login page
    Then Login with "ozankarademir.9292@gmail.com" and "qaz12345"
    And Logout the User

  @NegativeCases
  Scenario: Faulty Login
    Given User is on landing page "https://www.lolaflora.com"
    And Navigate to login page
    Then Login with wrong email "ozankarademir@gmail.com" and "qaz12345"
    And Login with wrong password "ozankarademir.9292@gmail.com" and "qaz123"
    Then Login with wrong email and password "ozankarademir@gmail.com" and "qaz123"