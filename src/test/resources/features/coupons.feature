Feature: Coupons test
  Background: User is on webshop page and logged in
    Given I login using credential email: "fakemail@fakehost.lol" password: "fakepassword"

 @couponstatic
  Scenario Outline: As end user i test discount coupons
    Given I am in shopping cart with added monitor
    When I apply coupon "<coupon>"
    And I check price "<price>"
    Then Clear cart
    Examples:
  | coupon | price     |
  | 2222   | $180.00   |
  | 1111   | $190.00   |

  @categorycoupon
    Scenario: I test category coupon
    Given I am in shopping cart with added monitor
    When  I apply coupon "8888"
    And I check price "$198.00"
    Then Clear cart

  @shipcoupon
    Scenario: I test free shipping coupon
    Given I am in shopping cart with added monitor
    When I apply coupon "3333"
    And I check that shipping is free
    Then Clear cart


    @clearcart
    Scenario: Clearing cart
      Given Clear cart