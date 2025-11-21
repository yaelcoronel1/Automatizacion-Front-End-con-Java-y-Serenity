package co.com.practica.yaelcoronel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BotonRegistrarUsuariosHome extends PageObject {
public static final Target BOTON_REGISTRO_HOME = Target.the("Hacer clic en el boton de registrar usuarios del home").located(By.id("signin2"));
}
