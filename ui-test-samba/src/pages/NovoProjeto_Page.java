package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static core.DriverFactory.getDriver;

import core.Base_Page;
import core.DriverFactory;

public class NovoProjeto_Page extends Base_Page {

	public void setNomeProjeto(String nome) {
		WebElement nomeProj = DriverFactory.getDriver().findElement(By.cssSelector("#modalContainer > div > div.modal-body > form > div:nth-child(2) > input"));
		nomeProj.sendKeys(("Astros"));
		//driver.findElement(By.cssSelector(".alert.alert-success"));
		//escrever(By.name("name"), nome);
	}

	public void setDescricao(String descricao) {
		escrever(By.name("description"), descricao);
	}
	
	public void botao_criarProjeto() {
		clicar(By.id("login"));
	}
	
	
	public void cadastrarProjeto(String nome, String descricao) {
		setNomeProjeto(nome);
		setDescricao(descricao);
		botao_criarProjeto();
	}
	
}
