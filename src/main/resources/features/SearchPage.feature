Feature: SearchPage feature
  Background: A user Navigates to Search page
    Given  A user Navigates to The Search URL
  @regression
  Scenario Outline: : As a user, I can Find the product after searching successfully
    When A user searching to <productname> successfully
    Then The result of searching contains <keyword>


    Examples:
      | productname | keyword |
      | "lap"       | "lap"   |
      | "book"      | "book"  |