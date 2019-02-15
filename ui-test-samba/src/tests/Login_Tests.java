package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import core.Base_Test;
import core.DriverFactory;
import pages.Login_Page;

public class Login_Tests extends Base_Test {

	private Login_Page login;
	//private static WebDriver driver;
	
	@Before
	public void inicializaTeste() {
		//driver.get("http://www.google.com.br");
		DriverFactory.getDriver().get("http://web1.qa.sambatech.com:10000");
		 login = new Login_Page();
		
	}
	
	
	@Test
	public void deveLogarComSucesso(){
		login.setEmail("avaliacao_qa_samba@sambatech.com.br");
		login.setSenha("123456789");
		login.entrar();
		
		
	}
}





/*	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		/*WebDriver driver = new ChromeDriver(); //Cria uma nova instancia;
		driver.get("http://quatest.com.br"); //sintaxe para abrir FIREFOX (O único drive instalado no momento é do firefox);
		String i = driver.getCurrentUrl(); //Cria String i que é igual a getCurrentUrl: pega a url aberta no firefox;
		System.out.println(i); //Mostra resultado obtido pela String i;
		driver.close(); //Fecha navegador;
*/
		

