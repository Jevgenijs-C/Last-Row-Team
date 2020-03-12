Feature:
  As I user,
  I should be able to checkout for purchasing completion
  Background:
    Given I am on web shop page

  Scenario: Checkout link in Top Menu
    Then Checkout link should be accessable

  Scenario: Finding Checkout button on Checkout page
    When Add any product to cart
    And Pressing shopping cart
    Then Blue checkout button should be seen in right bottom corner

  Scenario: Checkout link in black popur window
    When Pick any product(s)
    And Click on black window (Top right corner)
    And Get popur window
    Then On right side should be Checkout button

  Scenario: User press checkout without logging in system - guest case
    When Adding any product in cart
    And Press checkout on top right corner
    Then <Guest Checkout> option should be available

  Scenario: User press checkout without logging in system - sign in case
    When Add any product in cart
    And Press checkout in top right corner
    Then <Returning Customer> subtitle should be available

  Scenario:  Using existing adress during purchasing process
    When Press My Account in top menu
    And Choose Login
    And Enter E-Mail Address
    And Enter Password
    And Press Login
    And Press Phones&PDAs on top panel
    And Add any product to cart
    And Press checkout
    And User is on Billing address
    Then Should be option use existing address

  Scenario: Adding NEW address during purchasing process
    When Press My Account in top menu
    And Choose Login
    And Enter E-Mail Address
    And Enter Password
    And Press Login
    And Press Phones&PDAs on top panel
    And Add any product to cart
    And Press checkout
    Then User is on Billing address
    Then Should be option to add new address

  Scenario: Choosing payment method
    When Press My Account in top menu
    And Choose Login
    And Enter E-Mail Address
    And Enter Password
    And Press Login
    And Press Phones&PDAs on top panel
    And Add any product to cart
    And Press checkout
    Then User is on Billing address
    And Press Continue
    And On step three press continue
    And On step four press continue
    And User is on Payment Method step(5th Step)
    Then Should be option to choose payment method (only one - cash)

  Scenario: Marking "I have read and agree to the Terms & Conditions" box
    When Press My Account in top menu
    And Choose Login
    And Enter E-Mail Address
    And Enter Password
    And Press Login
    And Press Phones&PDAs on top panel
    And Add any product to cart
    And Press checkout
    Then User is on Billing address
    And Press Continue
    And On step three press continue
    And On step four press continue
    And User is on Payment Method step(5th Step)
    And User pressing Continue without toggling  "Terms & Conditions"
    Then Getting error

  Scenario: Checkout process with out of stock products
    When Press Tablets in top bar menu
    And Choose "Samsung Galaxy Tab 10.1" and add it to cart
    And Press checkout on top right side of menu
    Then Getting error "Products marked with *** are not available in the desired quantity or not in stock!"