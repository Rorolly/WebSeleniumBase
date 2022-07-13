package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utilidades {

	public static void bajarPantalla(WebDriver webDriver, WebElement txtFirstName) {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("arguments[0].scrollIntoView(true);", txtFirstName);
	}

	public static void wirte(WebDriver driver, By by, String string){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(by).sendKeys(string);
	}

	public static WebElement selectRandomOptionFromList(WebDriver driver, By by){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> listElements = driver.findElements(by);
		int elementPosition = (int) (Math.random()*listElements.size());
		return listElements.get(elementPosition);
	}
}
