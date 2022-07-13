package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



@DefaultUrl("https://librerianacional.com")

public class ComprarLibroPageObject extends PageObject {
	
	
	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2000));
	By txtBuscarLibro = By.xpath("(//*[@formcontrolname='buscar'])[2]");
	By BtnLibro = By.xpath("//*[contains(text(),'ANDROID')]");
	By btnMas = By.xpath("//*[@data-dir='up']");
	By btnAnadirAlCarrito = By.xpath("//*[contains(text(),'A�adir')]");
	By btnVerCarrito = By.xpath("//*[contains(text(),'Ver Carrito de Compras')]");
	By txtValor = By.xpath("(//*[contains(text(),'112.000')])[3]");
	
	
	
	
	
	
	
	public void ingresarLibro () {
		getDriver().findElement(txtBuscarLibro).sendKeys("Android Manual Pr�ctico para todos los Niveles");
		getDriver().findElement(txtBuscarLibro).sendKeys(Keys.ENTER);
		
	}
	public void clickLibro () {
		getDriver().findElement(BtnLibro).click();
		
		
	}
	public void clickEnMas () {
		getDriver().findElement(btnMas).click();
		
		
	}
	public void clickAnadirAlCarrito () {
		getDriver().findElement(btnAnadirAlCarrito).click();
		
		
	}
	public void clickVerCarrito () {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(btnVerCarrito));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getDriver().findElement(btnVerCarrito).click();
		
		
	}
	public void txtValor () {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(txtValor));
		String name=getDriver().findElement(txtValor).getText();

		
		
	}
	

}
