Feature: Search field
  As a User I want to check Search option

  Background:
    Given I am on web shop page

  @working_1
  Scenario:
    When I see Search field on the home page
    And I press "About Us" in footer
    And I see Search
    And I press "Tablets"
    Then I see Search field

  @working_2
  Scenario:
   When I type "HTC" in Search field
   And The result is shown: "HTC"
   And I push "Delivery information" in footer
    And type "HTC" in Searching field
   And I see the result: "HTC"
   And I press "Tablets"
    And I type "HTC" in Searching field
   Then I see: "HTC"

  @working_3
  Scenario:
   When I am on the home page I press Search button
   And I type "world’s thinnest tablet" in Search field
   And I tick "Product description" box
    And I press Search
   Then Result is not shown

  @working_4
  Scenario:
   When I press Search button
   And I type "HTC" in Search field
   And I tick "Subcategories" box
   And I press Search
   Then Result is shown: "HTC"

  @working_5
  Scenario:
    When I type "Desktops" in Search field
    And I press Search
    And I see the result: "HTC" with pagination plus with opportunity to sort
    And I press "Delivery information" in footer
    And I type "iMAC" in Searching field
    And I see the result: "iMAC" with pagination plus with opportunity to sort
    And I press "Software" in Search field
    And I type "iMAC" in Search field
    And I press Search
    Then I see the result: "iMAC" with pagination as well as opportunity to sort

  @working_6
  Scenario Outline:
    When I am on the home page
    And I type "iph" in Search field
    And I press Search
    Then Result is shown: "iphone"
    Examples:
      |  |