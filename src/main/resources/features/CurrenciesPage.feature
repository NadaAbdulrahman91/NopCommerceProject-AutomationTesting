Feature: CurrenciesPage feature
  Background: A user Navigates to currenciesPage page
    Given  A user Navigates to The website URL
  @regression
  Scenario: As a user, I can change currency successfully
    When A user changed currency successfully
    Then The currencies of all products  is changed to Euro
