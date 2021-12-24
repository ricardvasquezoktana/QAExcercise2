Feature: Manage accounts
  As a customer
  I want to register an account with my email address
  To let me manage my products with my personal account

  Scenario: Create an account
    Given  I am in the home page of Saga FalaBella Application
    When I create a new account whit my personal dates
    Then I should be able to see my personal profile

  Scenario Outline: Search products by filters
    Given  I am in the home page of Saga FalaBella Application
    When I select Zapatos category
    And I filter the search with <location>,<brand>,<minprice>,<maxprice>
    Then I should be able to see a list of products
    Examples:
      |location|brand|minprice|maxprice|
      |Amazonas|Nike |50      |200     |

  Scenario Outline: Search a product by name
    Given  I am in the home page of Saga FalaBella Application
    When I search a specific category
    And I filter the search by <brand>
    And I select a product randomly
    Then I should be able tu see the details about the product
    Examples:
      | brand |
      |Baraka home |