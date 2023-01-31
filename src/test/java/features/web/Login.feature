Feature: Login
  Scenario: Validate login credentials
    Given User launch app
    And User enter username and password
    |user|user123|
    |pass|user!@#123|
    And User click login
    Then login is successful