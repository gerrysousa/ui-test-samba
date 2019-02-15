package pages;
import org.openqa.selenium.By;
import core.Base_Page;
import static core.DriverFactory.getDriver;

public class Login_Page extends Base_Page {
	
	public void setEmail(String email) {
		escrever(By.id("inputEmail"), email);
	}

	public void setSenha(String senha) {
		escrever(By.id("inputPassword"), senha);
	}
	
	public void entrar() {
		clicar(By.id("login"));
	}

	public void fazerLogin(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}
	
	public boolean verficarSeLogouComSucesso() throws InterruptedException {
		Thread.sleep(15000);
		boolean existe = getDriver().getPageSource().contains("Processo Seletivo");
		return	existe;
	}
	
	public boolean verificarAlerta(String alerta) throws InterruptedException {
		
		//Thread.sleep(15000);Incorrect email or password. 
		boolean existe = getDriver().getPageSource().contains(alerta);
		return	existe;
	}
	
}
