Feature: Check Registration Form


  @RegForm
  Scenario: I check if Register page contains necessary fields
    Given I go to web app
    When I navigate to Registration form
    Then I check if <field> is available
    |Field               |
    |FirstName           |
    |SecondName          |
    |Email               |
    |PhoneNumber         |
    |Password            |
    |PasswordConfirmation|
    |Radio button        |
    |Checkbox            |

