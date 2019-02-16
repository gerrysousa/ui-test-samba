package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base_Test;
import pages.AlternarProjeto_Page;
import pages.Login_Page;
import pages.MenuSuperior_Page;
import pages.NovoProjeto_Page;
import static core.DriverFactory.getDriver;

import java.util.List;


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
	public void deveCadastrarProjetoComSucesso() throws InterruptedException {
		menu.criarProjeto();
		esperar(3000);
		String projetoName = "Projeto Nome "+faker();
		
		projeto.cadastrarProjeto(projetoName, "Descricao do projeto");
		esperar(6000);
		menu.alternarProjeto();
		Assert.assertTrue(alternarProjeto.verficarSeProjetoExiste(projetoName));	
		alternarProjeto.botao_cancelarAlternar();
	}
	
	@Test
	public void deveAlternarDeProjetoComSucesso() throws InterruptedException {
		String projeto_um = menu.obterProjetoAtual();
		/*menu.criarProjeto();
		esperar(3000);
		String projetoName = "Projeto Nome "+faker();		
		projeto.cadastrarProjeto(projetoName, "Descricao do projeto");
		esperar(6000);*/
		menu.alternarProjeto();
		alternarProjeto.pesquisaNomeProjeto("Projeto Nome 2019-02-16T12:17:37.41");//dadasdsadaaaaaaaaaaaaaaaaaaaaaaadas
		esperar(2000);
		
		
		/*WebElement actionBtn=driver2.findElement(
				  By.xpath("//span[contains(@class,'v-menubar-menuitem-caption')
				  and contains(text(), 'Actions')]")
				);
				actionBtn.click();*/
		
		
		
		
		getDriver().findElement(By.cssSelector("#project_819 > span")).click();
		////*[@id="project_819"]/span
		
	
		
	//	WebElement element = getDriver().findElement(By.id("project_819"));//Enter ID for the element. You can use Name, xpath, cssSelector whatever you like
		//element.sendKeys(Keys.TAB);
			
		
		
		
		//element.sendKeys(Keys.ENTER);
		
		//alternarProjeto.clicarTexto("Novo Projeto");
		alternarProjeto.botao_alternarProjeto();
		esperar(3000);

		Assert.assertNotEquals(projeto_um, menu.obterProjetoAtual());	
		Assert.assertEquals("Projeto Nome 2019-02-16T12:17:37.41", menu.obterProjetoAtual());
		
	}
}
