package pages;

import org.openqa.selenium.By;
import core.Base_Page;


public class MenuSuperior_Page extends Base_Page{

	public void acessarPainel() {
		clicar(By.id("mn-dashboard"));
	}

	public void acessarConteudos() {
		clicar(By.id("mn-content"));
	}
	
	public void acessarEnviar() {
		clicar(By.id("mn-upload"));
	}
	
	public void acessarEstatisticas() {
		clicar(By.id("mn-statistics"));
	}
	
	
	public void acessarMonetizacao() {
		clicar(By.id("mn-monetization"));
	}
	
	public void acessarAplicativos() {
		clicar(By.id("mn-apps"));
	}
	 
	public void acessarDropdownUsuario() {
		clicar(By.id("navbar-user-avatar"));
	}
	
	public void gerenciarConta() {
		acessarDropdownUsuario();
		clicar(By.id("accountHeader"));
	}
	
	public void fazerLogout() {
		acessarDropdownUsuario();		
		clicar(By.id("logout"));
	}
	
	public void acessarDropdownProjetos() {
		clicar(By.id("navbar-project-name"));
	}
	
	public void criarProjeto() {
		acessarDropdownProjetos();
		clicar(By.id("new_project"));
	}	
	
	public void alternarProjeto() {
		acessarDropdownProjetos();
		clicar(By.id("change_project"));
	}
	
	public String obterProjetoAtual() {
		String projetoAtual = obterTexto(By.id("navbar-project-name"));

		return projetoAtual;
	}
	
	public void criarCampanha() {
		acessarMonetizacao();
		clicar(By.id("create-campaign"));
	}
	
	
	
}
