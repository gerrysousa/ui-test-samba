package tests;

import static core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import core.Base_Test;
import pages.Login_Page;
import pages.MenuSuperior_Page;
import pages.NovaCampanha_Page;

public class Campanha_Tests extends Base_Test {

	private NovaCampanha_Page campanha;
	private Login_Page login;
	private MenuSuperior_Page menu;
	
	@Before
	public void inicializaTeste() throws InterruptedException {
		getDriver().get("http://web1.qa.sambatech.com:10000");
		login = new Login_Page();		
		menu = new MenuSuperior_Page();
		campanha = new NovaCampanha_Page();
		login.fazerLogin("avaliacao_qa_samba@sambatech.com.br", "123456789");
		login.verficarSeLogouComSucesso();
	}
	
	@After
	public void depois() {
		menu.fazerLogout();
	}
	
	@Test
	public void deveCadastrarCampanhaComSucesso() throws InterruptedException {
		
		menu.criarCampanha();
		//esperar(1000);
		String campanhaNome = "Campanha de "+faker();
		
		String urlDestino = "https://globoesporte.globo.com/futebol/brasileirao-serie-a/", 
		urlRatrea = "https://globoesporte.globo.com/futebol/brasileirao-serie-a/", 
		dataInicio= "18/05/2019", 
		dataFim="18/10/2019", 
		meta="20", 
		valor="2";
		
		//campanha.cadastrarCampanha(campanhaNome, urlDestino, urlRatrea, dataInicio, dataFim, meta, valor);
		campanha.setNomeCampanha(campanhaNome);
		campanha.setUrlDestino(urlDestino);
		campanha.setUrlRastreamento(urlRatrea);
		//campanha.anexarVideo("teste.mp4");
		campanha.btn_SelecionarCategorias();
		campanha.setDataInicio(dataInicio);
		campanha.setDataFim(dataFim);
		campanha.setMeta(meta);
		campanha.setValor(valor);
		campanha.btn_criarCampanha();
		
		esperar(6000);
		
		//Assert.assertTrue(alternarProjeto.verficarSeProjetoExiste(projetoName));	
		//
	}
}
