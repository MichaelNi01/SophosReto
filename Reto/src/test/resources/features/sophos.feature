
@tag
Feature: Prueba de ingreso sophos

@tag1
  Scenario Outline: CP0010 Registrarse en la pagina utest.com
 
    Given Ingresar a la pagina web
    When seleccionar Join Today
    And Diligenciar Teel us <Name> <LastName> <Email> <Mes> <Dia> <Año>
    And Seleccionar Nextdevices 
    And Diligenciar Movil
    And Diligenciar contraseña <Contraseña>
    Then Verificar que se ha registrado

    Examples: 
      | Name | LastName| Email   			| Mes | Dia |Año 	 | Contraseña  |	
			|"Juan"|"Niño"	 |"@pruebas.com"| 11	| 25	| 1990 |"Juanc12345*"|