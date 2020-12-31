package Sophos.Reto.pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Sophos.Reto.utilidades.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.utest.com/")

public class Pageobject extends PageObject {

	Utilidades util;
	
	String correo;
	String JoinToday = "Join Today";
	//xpath formulario Tell Us
	String Name = "//input[@id='firstName']";
	String LastName = "//input[@id='lastName']";
	String Email = "//input[@id='email']";
	String Mes = "//select[@id='birthMonth']";
	String Dia = "//select[@id='birthDay']";
	String Año = "//select[@id='birthYear']";
	String NextLocation = "//span[contains(text(),'Next: Location')]";
	String NextDevices = "//span[contains(text(),'Next: Devices')]";
	String NextLastStep = "//span[contains(text(),'Next: Last Step')]";
	String Contraseña = "//input[@id='password']";
	String ConfirmarContraseña = "//input[@id='confirmPassword']";
	String CheckStay = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]";
	String CheckCode = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]";
	String CheckPrivacy = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]";
	String CompleteSetup = "//span[contains(text(),'Complete Setup')]";
	String Registro = "//h1[contains(text(),\"Welcome to the world's largest community of freela\")]";
	
	
	public void SeleccionarJoin () throws InterruptedException {
		Thread.sleep(2000);
		find(By.linkText(JoinToday)).click();
	}
	
	public void IngresarNombre (String arg1) {
		find(By.xpath(Name)).sendKeys(arg1);
	}
	
	public void IngresarApellido (String arg1) {
		find(By.xpath(LastName)).sendKeys(arg1);
	}
	
	public void IngresarEmail (String arg1) {
		correo = "correo" + util.correo_aleatorio()  + arg1;
		System.out.println(correo);
		find(By.xpath(Email)).sendKeys(correo);
	}
	
	public void IngresarMes (int arg1) {
		find(By.xpath(Mes)).selectByIndex(arg1);
	}
	
	public void IngresarDia (int arg1) {
		find(By.xpath(Dia)).selectByIndex(arg1);
	}
	
	public void IngresarAño (int arg1) {
		find(By.xpath(Año)).selectByVisibleText(String.valueOf(arg1));
	}
	
	public void SeleccionarNextLocation () {
		find(By.xpath(NextLocation)).click();
	}
	
	public void seleccionarNextMoviles () throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		while (find(By.xpath(NextDevices)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(NextDevices)).click();
	}
	
	public void SeleccionarLastStep () throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		while (find(By.xpath(NextLastStep)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(NextLastStep)).click();
	}
	
	public void DiligenciarContraseña (String arg1) {
		find(By.xpath(Contraseña)).sendKeys(arg1);
	}
	
	public void ConfirmarContraseña (String arg1) {
		find(By.xpath(ConfirmarContraseña)).sendKeys(arg1);
	}
	
	public void SeleccionarChecks () {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		while (find(By.xpath(CompleteSetup)).isVisible()==false) {
			js.executeScript("window.scrollBy(0,350)", "");
		}
		find(By.xpath(CheckStay)).click();
		find(By.xpath(CheckCode)).click();
		find(By.xpath(CheckPrivacy)).click();
	}
	
	public void SeleccionarCompleteSetup () throws InterruptedException {
		
		find(By.xpath(CompleteSetup)).click();
		Thread.sleep(5000);
	}
	
	public void VerificarRegistro () {
		boolean Resultado = find(By.xpath(Registro)).isVisible();
		assertTrue(Resultado);
	}
}
