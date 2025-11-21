package co.com.practica.yaelcoronel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BotonContactoHome extends PageObject {
    public static final Target BOTON_CONTACTO_HOME = Target.the("Clic en el apartado contacto informacion").locatedBy("//*[@id=\"navbarExample\"]/ul/li[2]/a");
}