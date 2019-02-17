package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.Base_Page;

public class AlternarProjeto_Page extends Base_Page {

	public void pesquisaNomeProjeto(String nome) {
		escrever(By.id("project-search"), nome);
	}
	
	public void botao_alternarProjeto() {
		clicar(By.xpath("//*[@id=\"modalContainer\"]/div/div[3]/button"));		
	}
	
	public void botao_cancelarAlternar() {
		clicar(By.xpath("//*[@id=\"modalContainer\"]/div/div[3]/a"));		
	}
	
	public boolean verficarSeProjetoExiste(String nomeProjeto){
		
		boolean existe = getDriver().getPageSource().contains(nomeProjeto);
		
		return	existe;
	}
	
	
	
}
