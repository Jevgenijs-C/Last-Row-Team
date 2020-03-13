Feature: Compare user account information with input data

  Scenario: As a logged in user I compare account information with input data at registration
    Given I log in to web app with e-mail "kasya1@mail.com", password "qwerty"
    When I go to Edit Account section
    Then I compare first name "qwe", second name "qwe", e-mail "kasya1@mail.com", phone "1234567"

