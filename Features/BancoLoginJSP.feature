Feature: Realizacion de casos ingresando nombre de usuario y contraseña

  Scenario: Ingresar nombre de usuario y password correctos.
    Given Abrir Chrome
    When el usuario ingresa Username "vikruzdavid" y Password "12345" correctos.
    Then Entonces se le da la bienvenida al sitio "dashboard"
		And Cierra el navegador

  Scenario: Ingresar nombre de usuario y password incorrecto.
    Given Abrir Chrome
    When el usuario ingresa Username "userincorrecto" y Password "passwordincorrecto" incorrectos
    Then Entonces mostrar error de "Usuario o Password invalidos!"
		And Cierra el navegador

  Scenario: Ingresar valores invalidos.
    Given Abrir Chrome
    When el usuario ingresa ingresa Username y Password vacios
    Then Entonces mostrar error de "Inserte Username y Password!"
		And Cierra el navegador
		