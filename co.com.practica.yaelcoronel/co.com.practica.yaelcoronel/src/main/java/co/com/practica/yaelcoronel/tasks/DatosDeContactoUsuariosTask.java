package co.com.practica.yaelcoronel.tasks;

import co.com.practica.yaelcoronel.userinterfaces.DatosContactoUsuarios;
import co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.practica.yaelcoronel.userinterfaces.BotonContactoHome.BOTON_CONTACTO_HOME;
import static co.com.practica.yaelcoronel.userinterfaces.DatosContactoUsuarios.*;
import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.CONTRASEÑA;
import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.USERNAME;

public class DatosDeContactoUsuariosTask implements Task {

    private DatosContactoUsuarios DatosContactoUsuarios;
    public static DatosDeContactoUsuariosTask datosContacto(){
        return Tasks.instrumented(DatosDeContactoUsuariosTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CONTACTO_HOME),
                Enter.theValue("yaelcoronel9998@gmail.com").into(EMAIL),
                Enter.theValue("YIRC").into(NOMBRE),
                Enter.theValue("REST IN PEACE, MY BELOVED WITCH BEATRICE").into(MESSAGE)
        );
    }
}