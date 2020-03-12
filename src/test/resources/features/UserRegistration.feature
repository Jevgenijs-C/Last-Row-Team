Feature: Registration of User

  Background:
    Given I go to web app
    And I navigate to Registration form
    And I input "Cat" in First name, input "Red" in Second name, check agreement checkbox

  Scenario Outline: I register user with negative result
   Given I input "<email>" in email field
   Then I input "<phone>" in phone number field
   And I input "<pass>" in password field
    And I input "<passConf>" in confirm password field
  And I click on Continue button
   Then I expect <negativeResult> stays on register page
    Examples:
      | email           | phone                             | pass                  | passConf              |
      | kasya1lvcom     | 1234567890                        | qwerty                | qwerty                |
      | kasya1@mail.com | 123456                            | qwerty                | qwerty                |
      | kasya1@mail.com | 111111111111111111111111111111111 | qwerty                | qwerty                |
      | kasya1@mail.com | 1234567890                        | qwe                   | qwe                   |
      | kasya1@mail.com | 1234567890                        | qqqqqqqqqqqqqqqqqqqqq | qqqqqqqqqqqqqqqqqqqqq |
      | kasya1@mail.com | 1234567890                        | qqqqqqqqqqqqqqqqqqqqq | qqqqqqqq              |


  Scenario Outline: I register user with positive result
    Given I input "<email>" in email field
    Then I input "<phone>" in phone number field
    And I input "<pass>" in password field
    And I input "<passConf>" in confirm password field
    And I click on Continue button
    Then I expect <positiveResult> redirects to success page
   Examples:
     | email           | phone                            | pass                 | passConf             |
     | kasya1@mail.com | 1234567                          | qwerty               | qwerty               |
     | kasya1@mail.com | 12345678                         | qwerty               | qwerty               |
     | kasya1@mail.com | 11111111111111111111111111111111 | qwerty               | qwerty               |
     | kasya1@mail.com | 1234567890                       | qwer                 | qwer                 |
     | kasya1@mail.com | 1234567890                       | qwert                | qwert                |
     | kasya1@mail.com | 1234567890                       | qqqqqqqqqqqqqqqqqqqq | qqqqqqqqqqqqqqqqqqqq |