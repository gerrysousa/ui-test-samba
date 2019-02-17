package pages;

import org.openqa.selenium.By;

import core.Base_Page;

public class NovaCampanha_Page extends Base_Page {

	public void btn_criarCampanha() {
		clicar(By.name("name"));
	}
	
	public void setNomeCampanha(String nome) {
		escrever(By.name("name"), nome);
	}

	public void setUrlDestino(String url) {
		escrever(By.name("urlClickThrough"), url);
	}
	
	public void setUrlRastreamento(String url) {
		escrever(By.name("urlTracker"), url);
	}
	
	public void btn_SelecionarCategorias() {
		clicar(By.id("select-existing-channels"));
	}
	
	
	public void setDataInicio(String data) {
		escrever(By.id("publishDate"), data);
	}
	
	public void setDataFim(String data) {
		escrever(By.id("unpublishDate"), data);
	}
	
	
	public void selecionarPorCliques() {
		clicar(By.name("isImpression"));
	}
	
	public void selecionarPorImpressao() {
		clicar(By.name("isImpression"));
	}
	
	public void setMeta(String meta) {
		escrever(By.name("target"), meta);
	}
	
	
	public void setValor(String valor) {
		escrever(By.name("grossValue"), valor);
	}
		
	/*
	public void AAAAAAA(String AAAA) {
		escrever(By.name("AAAAAA"), AAAA);
	}
	*/
		
		
	public void cadastrarCampanha(String nomeCampanha, String urlDestino, String urlRatrea, String dataInicio, String dataFim, String meta, String valor) {
		setNomeCampanha(nomeCampanha);
		setUrlDestino(urlDestino);
		setUrlRastreamento(urlRatrea);
		
		btn_SelecionarCategorias();
		
		setDataInicio(dataInicio);
		setDataFim(dataFim);
		setMeta(meta);
		setValor(valor);
		
		btn_criarCampanha();
	}
	
	//
}
