package co.com.practica.yaelcoronel.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.BOTON_ENVIAR_REGISTRO;

public class ClicBotonEnviarRegistro implements Task {
    private DatosRegistroUsuarios DatosRegistroUsuarios;
    public static ClicBotonEnviarRegistro enviarRegistro(){
        return Tasks.instrumented(ClicBotonEnviarRegistro.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ENVIAR_REGISTRO)
        );

    }
}
