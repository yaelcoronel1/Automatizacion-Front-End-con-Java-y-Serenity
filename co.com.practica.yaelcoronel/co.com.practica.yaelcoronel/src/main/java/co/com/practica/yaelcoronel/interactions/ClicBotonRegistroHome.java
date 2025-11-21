package co.com.practica.yaelcoronel.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.practica.yaelcoronel.userinterfaces.BotonRegistrarUsuariosHome;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.practica.yaelcoronel.userinterfaces.BotonRegistrarUsuariosHome.BOTON_REGISTRO_HOME;

public class ClicBotonRegistroHome implements Task {

    private  BotonRegistrarUsuariosHome  BotonRegistrarUsuariosHome;
    public static ClicBotonRegistroHome botonregistrarHome(){
        return Tasks.instrumented(ClicBotonRegistroHome.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_REGISTRO_HOME)
        );
    }
}
