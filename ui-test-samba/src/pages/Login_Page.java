package pages;
import org.openqa.selenium.By;
import core.Base_Page;

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

}

/*public class Login_Page {

public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver(); //Cria uma nova instancia;
	driver.get("http://quatest.com.br"); //sintaxe para abrir FIREFOX (O único drive instalado no momento é do firefox);
	String i = driver.getCurrentUrl(); //Cria String i que é igual a getCurrentUrl: pega a url aberta no firefox;
	System.out.println(i); //Mostra resultado obtido pela String i;
	driver.close(); //Fecha navegador;

	}
}
*/