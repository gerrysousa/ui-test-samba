package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.Base_Test;
import pages.Login_Page;
import pages.MenuSuperior_Page;
import pages.NovoProjeto_Page;

import static core.DriverFactory.getDriver;

public class NovoProjeto_Tests extends Base_Test {

	private NovoProjeto_Page projeto;
	private Login_Page login;
	private MenuSuperior_Page menu;
	//private static WebDriver driver;
	
	@Before
	public void inicializaTeste() throws InterruptedException {
		getDriver().get("http://web1.qa.sambatech.com:10000");
		login = new Login_Page();		
		menu = new MenuSuperior_Page();
		projeto = new NovoProjeto_Page();
		login.fazerLogin("avaliacao_qa_samba@sambatech.com.br", "123456789");
		login.verficarSeLogouComSucesso();
	}
	
	@After
	public void depois() {
		//fazer logout	
	}
	
	@Test
	public void deveCadastrarProjetoComSucesso() {
		menu.criarProjeto();
		esperar(3000);
		projeto.cadastrarProjeto("Projeto Nome", "Descricao do projeto");
		
		//Assert.assertTrue(login.verficarSeLogouComSucesso());			
	}
}
