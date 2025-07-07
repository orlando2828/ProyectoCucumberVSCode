@Login
Feature: Login al sistema

  Scenario: Inicio de sesión exitoso
    Given el usuario accede a la página de login
    When ingresa credenciales validas : usuario "nvivas" y password "qanova"
    Then debería ver la pantalla principal del sistema