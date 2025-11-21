package co.com.practica.yaelcoronel.interactions;

import co.com.practica.yaelcoronel.userinterfaces.DatosContactoUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.practica.yaelcoronel.userinterfaces.DatosContactoUsuarios.BOTON_ENVIAR_CONTACTO;
import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.BOTON_ENVIAR_REGISTRO;

public class ClicBotonEnviarContacto implements Task {
    private DatosContactoUsuarios DatosContactoUsuarios;
    public static ClicBotonEnviarContacto enviarContacto(){
        return Tasks.instrumented(ClicBotonEnviarContacto.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ENVIAR_CONTACTO)
        );

    }
}
