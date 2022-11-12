Feature: Prueba Tecnica

  Scenario: 001 Registro de usuario de manera exitosa
    Given el usuario se encuentra en la pagina
    When  el usuario se registre
    Then podra ingresar el usuario

  Scenario: 002 Ingreso de usuario de manera exitosa
    Given el usuario se encuentra en la pagina
    When  el usuario se loguea
    Then podra validar que esta logueado

  Scenario: 003 Creacion de un articulo de manera exitosa
    Given el usuario se encuentra en la pagina
    When  el usuario se loguea
    And podra validar que esta logueado
    And el usuario cree un articulo
    Then podra validar la creacion del articulo
