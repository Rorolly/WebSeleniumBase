package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CrearCuentaStep;


public class CrearCuentaDefinition {
	
	@Steps
	CrearCuentaStep crearStep;
	
	@Given("entro a la pagina de la libreria")
	public void entroALaPaginaDeLaLibreria() {
		crearStep.abrirAplicacion();
	    
	}
	@When("crear un usuario en la libreria {string}{string}{string}{string}{string}{string}{string}")
	public void crearUnUsuarioEnLaLibreria(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    crearStep.crearCuenta(string, string2, string3, string4, string5, string6, string7);
	}

	@Then("valido la creacion de la cuenta")
	public void validoLaCreacionDeLaCuenta() {
	   
	}



}
