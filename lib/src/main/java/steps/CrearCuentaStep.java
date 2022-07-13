package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.CrearCuentaPageObject;

public class CrearCuentaStep {
	
	CrearCuentaPageObject crearObj = new CrearCuentaPageObject();
	
	@Step
	public void abrirAplicacion() {
		crearObj.open();
	}
	
	@Step
	public void crearCuenta(String correo,String nombres, String apellidos, String numDoc,String telefonoCelular,
			String telefono, String contrasena) {
		crearObj.clickMiCuenta();
		crearObj.clickRegistrarme();
		crearObj.ingresarCorreo(correo);
		crearObj.ingresarNombres(nombres);
		crearObj.ingresarApellidos(apellidos);
		crearObj.ingresarTipoDeDocumento();
		crearObj.ingresarNumDoc(numDoc);
		crearObj.ingresarTelefonoCelular(telefonoCelular);
		crearObj.ingresarTelefono(telefono);
		crearObj.ingresarContrasena(contrasena);
		crearObj.ingresarConfirmarContrasena(contrasena);
		crearObj.clickCheckBox();
		crearObj.clickRegistro();
		crearObj.validarCreacion();
	}

}
