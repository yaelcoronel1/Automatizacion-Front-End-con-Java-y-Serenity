package co.com.practica.yaelcoronel.stepdefinitions;

import co.com.practica.yaelcoronel.interactions.ClicBotonArticulo;
import co.com.practica.yaelcoronel.interactions.ClicBotonEnviarContacto;
import co.com.practica.yaelcoronel.interactions.ClicBotonEnviarRegistro;
import co.com.practica.yaelcoronel.tasks.AbrirNavegadorUrlTask;
import co.com.practica.yaelcoronel.tasks.DatosDeContactoUsuariosTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ContactoDeUsuariosStep {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("Me encuentro en la pagina de inicio de sesion")
    public void meEncuentroEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(AbrirNavegadorUrlTask.Lapagina());
    }
    @When("Click en el boton de articulo")
    public void clickEnElBotonDeArticulo() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(ClicBotonArticulo.botonArticulo());
    }
    @And("Click en el apartado de contacto y llenado de informacion")
    public void clickEnElApartadoDeContactoYLlenadoDeInformacion() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(DatosDeContactoUsuariosTask.datosContacto());
    }
    @Then("Enviado correcto de los datos de contacto")
    public void enviadoCorrectoDeLosDatosDeContacto() {
        OnStage.theActorCalled("Yael Coronel").wasAbleTo(ClicBotonEnviarContacto.enviarContacto());

    }
}