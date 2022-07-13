package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Utilidades;

@DefaultUrl("https://librerianacional.com")
public class CrearCuentaPageObject extends PageObject {
	
	@SuppressWarnings("deprecation")
	WebDriverWait wait = new WebDriverWait(getDriver(), 30);
	String userName = "";
	By btnMiCuenta = By.xpath("(//*[@id='dropdownMenuLogin'])[2]");
	By btnRegistrarme = By.xpath("(//*[contains(text(),'Registrarme')])[2]");
	By txtCorreo = By.id("email");
	By txtNombres = By.id("nombres");
	By txtApellidos = By.id("apellidos");
	By cmbTipoDeDocumento = By.name("tipo_identificacion");
	By txtTipDoc = By.xpath("//*[@value='CC']");
	By txtNumDocumento = By.id("identificacion");
	By txtTelefonoCelular = By.id("telefono_movil");
	By txtTelefono = By.id("telefono");
	By txtContrasena = By.id("contrasena");
	By txtConfirmarContrasena = By.id("repeatContrasena");
	By chkTerminos = By.id("terminosCondiciones");
	By btnRegistro= By.xpath("//*[contains(text(),'Registrarme')]");
	String validarRegistro = "//*[contains(text(),'#')]";
	
	
	
	
	
	
	
	
	public void clickMiCuenta () {
		getDriver().findElement(btnMiCuenta).click();
		
	}
	public void clickRegistrarme() {
		getDriver().findElement(btnRegistrarme).click();
		
	}
	public void ingresarCorreo(String correo) {
		getDriver().findElement(txtCorreo).sendKeys(correo);;
		
	}
	public void ingresarNombres(String nombres) {
		this.userName = nombres;
		getDriver().findElement(txtNombres).sendKeys(nombres);;
		
	}
	public void ingresarApellidos(String apellidos) {
		getDriver().findElement(txtApellidos).sendKeys(apellidos);;
		
	}
	
	public void ingresarTipoDeDocumento() {
		getDriver().findElement(cmbTipoDeDocumento).click();
		getDriver().findElement(txtTipDoc).click();
		
	}
	
	public void ingresarNumDoc(String numDocumento) {
		getDriver().findElement(txtNumDocumento).sendKeys(numDocumento);;
		
	}
	public void ingresarTelefonoCelular(String telefonoCelular) {
		WebElement element =getDriver().findElement(txtTelefonoCelular);
		Utilidades.bajarPantalla(getDriver(), element);
		element.sendKeys(telefonoCelular);
		
	}
	public void ingresarTelefono(String telefono) {
		getDriver().findElement(txtTelefono).sendKeys(telefono);;
		
	}
	public void ingresarContrasena(String contrasena) {
		getDriver().findElement(txtContrasena).sendKeys(contrasena);;
		
	}
	public void ingresarConfirmarContrasena(String contrasena) {
		getDriver().findElement(txtConfirmarContrasena).sendKeys(contrasena);;
		
	}
	
	public void clickCheckBox() {
		getDriver().findElement(chkTerminos).click();;
		
	}
	public void clickRegistro() {
		getDriver().findElement(btnRegistro).click();
		
	}
	public void validarCreacion() {
		this.validarRegistro = validarRegistro.replaceAll("#", userName);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(validarRegistro)));
		String name=getDriver().findElement(By.xpath(validarRegistro)).getText();

		
		
		
	}
	
	

}
