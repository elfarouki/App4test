package Formation_CAIT.Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeWebdriver {
  
  @Test
  public static void startChromeWebdriver() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\almahdi\\Desktop\\webdrivers\\chromedriver.exe");//Ajout chemin du driver
	  WebDriver driver = new ChromeDriver(); //Initialisation de l'instance du driver
	  driver.get("https://www.google.fr");//Démerrage du navigateur
	  driver.quit();//Fermeture du navigateur
  }
}
