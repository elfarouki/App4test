package Formation_CAIT.Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeOp {

protected static WebDriver driver;
	
	@BeforeTest
	public static void Chrome_Options() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");//Ajout chemin du driver
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-extensions");
	    options.addArguments("start-maximized");
	    driver = new ChromeDriver();
	}
	@Test
	public static void Exo1() {
		
	}
	
}
