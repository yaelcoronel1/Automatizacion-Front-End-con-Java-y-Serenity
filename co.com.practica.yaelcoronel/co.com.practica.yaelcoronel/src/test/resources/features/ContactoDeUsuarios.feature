#Autor: Yael Coronel
Feature: Como gerente de la empresa yaelcoronel
  Necesito dar click en un articulo y posteriormente dar click en el apartado de contacto, llenar la información y posteriormente mandarla
    #Historia de usuario a trabajar


  @test2
  Scenario: Click en articulo e iformacion de contacto enviada correctamente
    Given Me encuentro en la pagina de inicio de sesion
    When  Click en el boton de articulo
    And   Click en el apartado de contacto y llenado de informacion
    Then  Enviado correcto de los datos de contacto
