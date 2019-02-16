package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static WebDriver driver;

   	public static WebDriver getDriver() {
		if (driver == null) {
			 createDrive();
		}
		return driver;
	}

	private static void createDrive() {
		try {			
				System.setProperty("webdriver.gecko.driver", "C:\\workspace\\Ambiente\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				driver = new ChromeDriver();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}	

	public static void killDriver() 	{
		if (driver != null) 
		{
			driver.quit();
			driver = null;
		}
	}

}
