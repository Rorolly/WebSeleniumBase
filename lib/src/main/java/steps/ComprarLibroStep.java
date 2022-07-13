package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.ComprarLibroPageObject;

public class ComprarLibroStep {
	
	ComprarLibroPageObject comprarObj = new ComprarLibroPageObject();
	
	@Step
	public void abrirAplicacion() {
		comprarObj.open();
	}
	
	@Step
	public void comprarLibro() {
		comprarObj.ingresarLibro();
		comprarObj.clickLibro();
		comprarObj.clickEnMas();
		comprarObj.clickAñadirAlCarrito();
		comprarObj.clickVerCarrito();
	}
	
	@Step
	public void validarLibro() {
		comprarObj.txtValor();
	}

}
