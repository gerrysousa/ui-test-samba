package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import core.Base_Test;
import pages.AlternarProjeto_Page;
import pages.Login_Page;
import pages.MenuSuperior_Page;
import pages.NovoProjeto_Page;
import static core.DriverFactory.getDriver;

public class Projeto_Tests extends Base_Test {

	private NovoProjeto_Page projeto;
	private Login_Page login;
	private MenuSuperior_Page menu;
	private AlternarProjeto_Page alternarProjeto;
	//private static WebDriver driver;
	
	@Before
	public void inicializaTeste() throws InterruptedException {
		getDriver().get("http://web1.qa.sambatech.com:10000");
		login = new Login_Page();		
		menu = new MenuSuperior_Page();
		projeto = new NovoProjeto_Page();
		alternarProjeto = new AlternarProjeto_Page();
		login.fazerLogin("avaliacao_qa_samba@sambatech.com.br", "123456789");
		login.verficarSeLogouComSucesso();
	}
	
	@After
	public void depois() {
		menu.fazerLogout();
	}
	
	@Test
	public void deveCadastrarProjetoComSucesso(){
		menu.criarProjeto();
		String projetoName = "Projeto Nome "+faker();
		projeto.cadastrarProjeto(projetoName, "Descricao do projeto");
		esperar(6000);
		menu.alternarProjeto();
		alternarProjeto.pesquisaNomeProjeto(projetoName);
		Assert.assertTrue(alternarProjeto.verficarSeProjetoExiste(projetoName));	
		alternarProjeto.botao_cancelarAlternar();
	}
	
	@Test
	public void deveAlternarDeProjetoComSucesso() throws InterruptedException {
		String projeto_um = menu.obterProjetoAtual();
		menu.alternarProjeto();
		alternarProjeto.pesquisaNomeProjeto("Projeto Nome 2019-02-16T12:17:37.41");//dadasdsadaaaaaaaaaaaaaaaaaaaaaaadas
		esperar(2000);
		getDriver().findElement(By.cssSelector("#project_819 > span")).click();
		alternarProjeto.botao_alternarProjeto();
		esperar(3000);

		Assert.assertNotEquals(projeto_um, menu.obterProjetoAtual());	
		Assert.assertEquals("Projeto Nome 2019-02-16T12:17:37.41", menu.obterProjetoAtual());
		
	}
}
