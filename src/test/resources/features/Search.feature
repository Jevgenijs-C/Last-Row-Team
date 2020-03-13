Feature: Search field
  As a User I want to check Search option

  Background:
    Given I am on webshop page

  @working_1
  Scenario: Search field is existing
    When I see Search field
    And I see Search on "About Us" page
    Then I see Search field on "Tablets" page

  @working_2
  Scenario: Search can be done from any page
    When I input "HTC" in Search field
    And The result is shown
    And I enter "HTC" in Search while on "Delivery information" page
    And I see the result: "HTC"
    And I type "HTC" in Searching field while on "Tablets" page
    Then I see: "HTC"

  @working_3
  Scenario:  Search can be done by Product description
    When I press Search
    And I type "world’s thinnest tablet" in Searching
    And I tick Product description box
    Then Result is not shown

  @working_4
  Scenario: Search can be done by Subcategories
    When I press Search button
    And I write "HTC" in Search
    And I choose Category
    And I tick Subcategories
    And I click Search
    Then Result is "HTC"

  @working_5
  Scenario: Search list has page number and sorting option
    When I Search "iMAC"
    And I see the result: "iMAC" with pagination plus with opportunity to sort
    And I type "iMAC" in Search while on "Delivery information" page
    Then Result is "iMAC" with pagination as well as opportunity to sort

  @working_6
  Scenario: Short search
    When I text "ip"
    And Get result "ipod, iphone"
    And I type "iph"
    Then Result is shown "iphone"

