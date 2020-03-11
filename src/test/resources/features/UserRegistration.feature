# new feature
# Tags: optional

Feature: Registration of User

Background:
Given I go to web app
And I navigate to Registration form
  And I input "Cat" in First name, input "Red" in Second name, check agreement checkbox

#  Scenario: I register user with valid email address in email field
#    Given I input "1234567890" in phone number field
#    And I input "zxcvb" in password field
#    And I input "zxcvb" in confirm password field
#    And I input "redcat@mail.com" in email field
#    When I click on Continue button
#    Then User is registered

#  Scenario: I register user with invalid confirmed pass
#    Given I input "1" in phone number field
#    And I input "zxcvb" in password field
#    And I input "zxcvbk" in confirm password field
#    And I input "redcat1@mail.com" in email field
#    When I click on Continue button
#    Then I See Error pass message ""

  Scenario: I register user with invalid phone
    Given I input "1" in phone number field
    And I input "zxcvb" in password field
    And I input "zxcvb" in confirm password field
    And I input "redcat1@mail.com" in email field
    When I click on Continue button
    Then I See Error message "Telephone must be between 3 and 32 characters!"
