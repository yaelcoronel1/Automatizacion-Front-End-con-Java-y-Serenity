package co.com.practica.yaelcoronel.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class BotonArticulo extends PageObject {
    public static final Target BOTON_ARTICULO = Target.the("Clic en el articulo").located(By.className("hrefch"));
}