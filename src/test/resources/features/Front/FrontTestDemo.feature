@Demo
Feature: Ejemplo de Front
  #Pruebas Front

  Background: Navigate to Amazon page
    Given I am on the Amazon search page

  @Front
  Scenario: As a user I enter a search criteria in Amazon
    When I enter a search criteria
    And click on the search button
#    Then the result match the criteria