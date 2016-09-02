@test
Feature: eBay sample test

  Scenario: Open Menu
    Given Launch eBay application
    Then I click on home haburger menu
    And I select categories
    Then I open Books & Magazines category
