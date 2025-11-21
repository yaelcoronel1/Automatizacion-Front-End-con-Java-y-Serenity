package co.com.practica.yaelcoronel.stepdefinitions;

import co.com.practica.yaelcoronel.interactions.ClicBotonEnviarRegistro;
import co.com.practica.yaelcoronel.interactions.ClicBotonRegistroHome;
import co.com.practica.yaelcoronel.tasks.AbrirNavegadorUrlTask;
import co.com.practica.yaelcoronel.tasks.DatosDeRegistroUsuariosTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistroDeUsuariosStep {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("Estoy en la pagina de inicio de sesion")
    public void estoyEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(AbrirNavegadorUrlTask.Lapagina());
    }
    @When("Hago click en el boton de registrar")
    public void hagoClickEnElBotonDeRegistrar() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(ClicBotonRegistroHome.botonregistrarHome());
    }
    @And("Ingreso los datos del registro")
    public void ingresoLosDatosDelRegistro() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(DatosDeRegistroUsuariosTask.datosUsuarios());
    }
    @Then("Envio el formulario de registro de usuarios")
    public void envioElFormularioDeRegistroDeUsuarios() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(ClicBotonEnviarRegistro.enviarRegistro());

    }
}
