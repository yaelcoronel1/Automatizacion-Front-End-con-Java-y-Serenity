package co.com.practica.yaelcoronel.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosRegistroUsuarios extends PageObject {
    public static final Target USERNAME = Target.the("Ingreso el nombre de usuario").located(By.id("sign-username"));
    public static final Target CONTRASEÑA = Target.the("Ingreso la contraseña").located(By.id("sign-password"));
    public static final Target BOTON_ENVIAR_REGISTRO = Target.the("Clic en boton de enviar formulario de registro").locatedBy("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");


}
