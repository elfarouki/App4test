package Formation_CAIT.Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoWebdriver {

	

		  @Test
		  public static void startGeckodriver() {
			  
			  System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");//Ajout chemin du driver
			  WebDriver driver = new FirefoxDriver(); //Initialisation de l'instance du driver
			  driver.get("https://www.google.fr");//Démerrage du navigateur
			  driver.quit();//Fermeture du navigateur
		  }
	}


