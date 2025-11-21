#Autor: Yael Coronel
  Feature: Como gerente de la empresa yaelcoronel
    Necesito ver una funcionalidad de registro de usuarios en la pagina
    Para darle acceso a la plataforma de administracion a mis clientes mayoristas
    #Historia de usuario a trabajar


    @test1
    Scenario: Registro exitoso de un nuevo usuario
       Given Estoy en la pagina de inicio de sesion
       When  Hago click en el boton de registrar
       And   Ingreso los datos del registro
       Then  Envio el formulario de registro de usuarios
