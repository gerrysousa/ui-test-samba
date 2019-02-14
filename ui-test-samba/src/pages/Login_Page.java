package pages;
import org.openqa.selenium.WebDriver; //biblioteca do WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //biblioteca do WebDriver;


public class Login_Page {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //Cria uma nova instancia;
		driver.get("http://quatest.com.br"); //sintaxe para abrir FIREFOX (O único drive instalado no momento é do firefox);
		String i = driver.getCurrentUrl(); //Cria String i que é igual a getCurrentUrl: pega a url aberta no firefox;
		System.out.println(i); //Mostra resultado obtido pela String i;
		driver.close(); //Fecha navegador;

		}
}