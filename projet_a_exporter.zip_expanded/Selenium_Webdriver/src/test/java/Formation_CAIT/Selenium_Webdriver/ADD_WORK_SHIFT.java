package Formation_CAIT.Selenium_Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class ADD_WORK_SHIFT {
	
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
	    driver.findElement(By.id("menu_admin_workShift")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("btnAdd")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("workShift_name")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("workShift_name")).clear();
	    driver.findElement(By.id("workShift_name")).sendKeys("Testeur");
	    new Select(driver.findElement(By.id("workShift_workHours_from"))).selectByVisibleText("09:15");
	    new Select(driver.findElement(By.id("workShift_workHours_to"))).selectByVisibleText("17:15");
	    driver.findElement(By.id("btnSave")).click();
}
}



