package core;

import org.openqa.selenium.By;
import static core.DriverFactory.getDriver;

public class Base_Page {

	public String getUrlBase(){
		return "http://web1.qa.sambatech.com:10000";
	}
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarTexto(String texto) {
		clicar(By.xpath("//*[@text='"+texto+"']"));
	}
	
	public void selecionarCombo(By by, String valor) {
		getDriver().findElement(by).click();
		clicarTexto(valor);
	}
	
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");		
	}
	
		
	public String obterTituloAlerta() {
		return obterTexto(By.id("alertTitle"));
	}
	
	public String obterMensageAlerta() {
		return obterTexto(By.id("id/message"));
	}
	

	
}