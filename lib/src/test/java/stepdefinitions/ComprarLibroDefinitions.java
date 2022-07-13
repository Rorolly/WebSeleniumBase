package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ComprarLibroStep;

public class ComprarLibroDefinitions {
	
	@Steps
	ComprarLibroStep comprarStep;
	
	@When("compro un libro")
	public void comproUnLibro() {
	    comprarStep.comprarLibro();
	    
	}

	@Then("valido la compra de un libro")
	public void validoLaCompraDeUnLibro() {
	  
	}


}
