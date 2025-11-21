package co.com.practica.yaelcoronel.interactions;

import co.com.practica.yaelcoronel.userinterfaces.BotonArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.practica.yaelcoronel.userinterfaces.BotonArticulo.BOTON_ARTICULO;


public class ClicBotonArticulo implements Task {

    private BotonArticulo BotonArticulo;
    public static ClicBotonArticulo botonArticulo(){
        return Tasks.instrumented(ClicBotonArticulo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ARTICULO)
        );
    }
}
