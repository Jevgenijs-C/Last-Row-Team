Feature: Coupons test
  Background: User is on webshop page and logged in
    Given I login using credential email: "fakemail@fakehost.lol" password: "fakepassword"

  Scenario Outline: As end user i test discount coupons
    Given I go to monitors category
    And I add monitor to cart
    And I navigate to shopping cart
    When I apply coupon "<coupon>"
    And I check price "<price>"
    Then I remove item from cart
    Examples:
  | coupon | price |
  | 2222   | 180   |
  | 1111   | 190   |
