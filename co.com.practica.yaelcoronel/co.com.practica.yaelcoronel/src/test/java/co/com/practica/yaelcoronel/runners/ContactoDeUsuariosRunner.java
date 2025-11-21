package co.com.practica.yaelcoronel.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ContactoDeUsuarios.feature",

        tags = ("@test2"),
        glue = "co.com.practica.yaelcoronel.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)

public class ContactoDeUsuariosRunner {
}