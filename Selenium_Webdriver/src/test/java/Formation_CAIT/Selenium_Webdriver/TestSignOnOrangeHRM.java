package Formation_CAIT.Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSignOnOrangeHRM {

protected static WebDriver driver;
	
	@BeforeTest
	public static void Chrome_Options() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");//Ajout chemin du driver
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-extensions");
	    options.addArguments("start-maximized");//prendre la taille de ecran
	    driver = new ChromeDriver(options);
	}
	@Test
	public static void ConnectAccount() throws InterruptedException {
		driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/auth/login/");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("addmin");
		driver.findElement(By.name("txtPassword")).sendKeys("Phd@20172018");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_admin_Organization")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("btnSaveGenInfo")).click();
		//driver.findElement(By.id("systemUser_userType")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("organization[name]")).sendKeys("FITEC");
		Thread.sleep(1000);
		driver.findElement(By.id("btnSaveGenInfo")).click();
		Thread.sleep(1000);
		//driver.findElement(By.name("menu_pim_addEmployee")).click();
		//driver.findElement(By.name("firstName")).sendKeys("Rym");
		//driver.findElement(By.name("lastName")).sendKeys("Skhiri");
		//driver.findElement(By.name("chkLogin")).click();
		//driver.findElement(By.name("user_name")).sendKeys("rym03");
		//driver.findElement(By.name("user_password")).sendKeys("tatatata");
		//driver.findElement(By.name("re_password")).sendKeys("tatatata");
		//driver.findElement(By.name("status")).click();
		//driver.findElement(By.name("btnSave")).click();
		//driver.findElement(By.name("welcome")).click();
		//driver.findElement(By.linkText("Logout")).click();
	//	driver.findElement(By.xpath("//*[@id="welcome-menu"]/ul/li[2]/a")).click();
		driver.quit();

}
}
