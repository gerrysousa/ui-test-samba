package pages;

import org.openqa.selenium.By;

import core.Base_Page;


public class NovoProjeto_Page extends Base_Page {

	public void setNomeProjeto(String nome) {
		//WebElement webElement = DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"modalContainer\"]/div/div[2]/form/div[2]/input"));
		//webElement.sendKeys("Astros");
		//driver.findElement(By.cssSelector(".alert.alert-success"));
		escrever(By.name("name"), nome);
	}

	public void setDescricao(String descricao) {
		escrever(By.name("description"), descricao);
	}
	
	public void botao_criarProjeto() {
		clicar(By.xpath("//*[@id=\"modalContainer\"]/div/div[3]/button"));
	}
	
	
	public void cadastrarProjeto(String nome, String descricao) {
		setNomeProjeto(nome);
		setDescricao(descricao);
		botao_criarProjeto();
	}
	
}
