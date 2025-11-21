package co.com.practica.yaelcoronel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import co.com.practica.yaelcoronel.userinterfaces.AbrirUrlNavegador;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegadorUrlTask implements Task {
    private  AbrirUrlNavegador  AbrirUrlNavegador;
    public static  AbrirNavegadorUrlTask Lapagina(){
        return Tasks.instrumented(AbrirNavegadorUrlTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(AbrirUrlNavegador)

        );
    }
}
