@CargaInfo
Feature: Carga de Información

  Background:
    Given el usuario está logueado correctamente

  Scenario: Cargar datos validos en todos los campos y enviar el formulario
    When ingresa "Orlando" en el campo texto
    And escribe "orlando@mail.com" en el campo mail
    And agrega "Este es un texto de prueba" en el área de texto
    And selecciona la fecha "2025-07-15"
    And selecciona "selección 1" y "selección 3" en las opciones múltiples
    And elige "cr 2" en las opciones radio
    And selecciona el valor "Opción X" del combo lista
    And presiona el botón Enviar
    Then debería ver un mensaje de confirmación
