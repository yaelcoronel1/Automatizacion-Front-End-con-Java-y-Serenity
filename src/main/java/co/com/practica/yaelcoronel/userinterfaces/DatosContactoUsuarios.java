package co.com.practica.yaelcoronel.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosContactoUsuarios extends PageObject {
    public static final Target EMAIL = Target.the("Escribir email").located(By.id("recipient-email"));
    public static final Target NOMBRE = Target.the("Meter nombre").located(By.id("recipient-name"));
    public static final Target MESSAGE = Target.the("Redactar mensaje").located(By.id("message-text"));
    public static final Target BOTON_ENVIAR_CONTACTO = Target.the("Seleccionar boton envio contacto").locatedBy("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

}