@Demo
Feature: Ejemplo de Request
  #Pruebas API

  @API
  Scenario: Prueba GET al endpoint.
    Given I send a GET request to the endpoint
    Then I get a 200 status code

  @API
  Scenario: Prueba GET al endpoint Fail.
    Given I send a GET request to the endpoint
    Then I get a 400 status code