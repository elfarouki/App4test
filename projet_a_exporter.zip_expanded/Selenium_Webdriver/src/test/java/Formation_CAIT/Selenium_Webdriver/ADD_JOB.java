package Formation_CAIT.Selenium_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ADD_JOB {
	
protected static WebDriver driver;
	
	@BeforeTest
	public static void Chrome_Options() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tafsir\\workspace\\chromedriver.exe");//Ajout chemin du driver
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-extensions");
	    options.addArguments("start-maximized");//prendre la taille de ecran
	    driver = new ChromeDriver(options);
	}
	@Test
	public static void ConnectAccount() throws InterruptedException {
		driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/auth/login/");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUsername")).sendKeys("Tafsir");
		driver.findElement(By.name("txtPassword")).sendKeys("6Septembre@1989");
		Thread.sleep(5000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("menu_admin_Job")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("btnAdd")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("jobTitle_jobTitle")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("jobTitle_jobTitle")).clear();
	    driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Merci");
	    driver.findElement(By.id("btnSave")).click();
}
}



