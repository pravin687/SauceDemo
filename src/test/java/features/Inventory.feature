Feature: Inventory

  Background: 
    Given I land on the login page
    When I enter username and password
    When I click on login button

  Scenario: Add to cart
    When I click on add to cart button for backpack
    Then I verify button appears with "Remove" tag
