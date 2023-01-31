Feature: Get Requests

  Scenario: Verify one author of the post
    Given I perform Get operation for "http://localhost:3000/"
    And I perform a post number "1"
    Then I should see the author name "monday"


  Scenario: Get single
    Given I make a call 'endpoint'
    And http method ''
    Then I get the response