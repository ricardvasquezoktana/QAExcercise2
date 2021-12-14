Feature: Manage accounts
  As a customer
  I want to register an account with my email address
  To let me manage my products with my personal account

  Scenario: Create an account
    Given I am in the home page of Saga FalaBella Application
    When I create a new account whit my personal dates
    Then I should be able tu see my personal profile
