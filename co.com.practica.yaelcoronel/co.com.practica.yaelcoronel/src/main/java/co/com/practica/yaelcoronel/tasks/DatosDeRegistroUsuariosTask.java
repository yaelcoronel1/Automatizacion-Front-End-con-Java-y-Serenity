package co.com.practica.yaelcoronel.tasks;

import co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.CONTRASEÑA;
import static co.com.practica.yaelcoronel.userinterfaces.DatosRegistroUsuarios.USERNAME;

public class DatosDeRegistroUsuariosTask implements Task {

    private DatosRegistroUsuarios DatosRegistroUsuarios;
    public static DatosDeRegistroUsuariosTask datosUsuarios(){
        return Tasks.instrumented(DatosDeRegistroUsuariosTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("YaelCoronel").into(USERNAME),
                Enter.theValue("Yael12345").into(CONTRASEÑA)
        );
    }
}
