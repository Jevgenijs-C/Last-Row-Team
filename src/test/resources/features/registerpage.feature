Feature: Check Registration Form

  @RegForm
  Scenario: I check if Register page contains necessary fields
    Given I go to web app
    When I navigate to Registration form
    Then I check if fields is available



