package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.Base_Test;
import static core.DriverFactory.getDriver;
import pages.Login_Page;

public class Login_Tests extends Base_Test {

	private Login_Page login;
	//private static WebDriver driver;
	
	@Before
	public void inicializaTeste() {
		getDriver().get("http://web1.qa.sambatech.com:10000");
		login = new Login_Page();		
	}
	
	
	/*@Test
	public void deveLogarComSucesso() throws InterruptedException{
		login.fazerLogin("avaliacao_qa_samba@sambatech.com.br", "123456789");
		
		Assert.assertTrue(login.verficarSeLogouComSucesso());			
	}*/
	
	@Test
	public void deveValidarLoginSemEmailESenha() throws InterruptedException{
		login.entrar();
		
		Assert.assertTrue(login.verificarAlerta("Email ou senha incorretos."));			
	}
	
	@Test
	public void deveValidarLoginSemEmail() throws InterruptedException{
		login.setSenha("ssssss");
		login.entrar();
		
		Assert.assertTrue(login.verificarAlerta("Email ou senha incorretos."));			
	}
	
	@Test
	public void deveValidarLoginSemSenha() throws InterruptedException{
		login.setEmail("avaliacao_qa_samba@sambatech.com.br");
		login.entrar();
		
		Assert.assertTrue(login.verificarAlerta("Email ou senha incorretos."));			
	}
	
	@Test
	public void deveValidarLoginComSenhaInvalida() throws InterruptedException{
		login.fazerLogin("avaliacao_qa_samba@sambatech.com.br", "123456789");
		login.entrar();
		
		Assert.assertTrue(login.verificarAlerta("Email ou senha incorretos."));			
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
		

