Feature: HomePage feature
  Background: A user Navigates to homepage page
    Given  A user Navigates to homepage URL
  @regression
  Scenario: As a user, I can add to cart successfully
    When A user click to add to wishlist&cart
    Then A product name is appeared