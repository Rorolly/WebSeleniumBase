package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CrearCuenta.feature",
		glue = "stepdefinitions",
		tags = "@CrearCuentaLibreria", snippets = SnippetType.CAMELCASE)

public class CrearCuentaRunner {

}
