Feature: Compare user account information with input data

  Scenario: As a logged in user I compare account information with input data at registration
    Given I log in to web app with e-mail "kasya1@mail.com" and password "qwerty"
    When I go to Edit Account section
    Then I compare first name with my input data "qwe"
    And I compare second name with my input data "qwe"
    And I compare e-mail  with my input data "kasya1@mail.com"
    And I compare telephone with my input data "1234567"

