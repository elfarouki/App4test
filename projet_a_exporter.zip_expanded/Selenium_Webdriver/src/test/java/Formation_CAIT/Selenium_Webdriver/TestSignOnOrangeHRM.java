package Formation_CAIT.Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSignOnOrangeHRM {

protected static WebDriver driver;
	
	@BeforeTest
	public static void Chrome_Options() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\almahdi\\Desktop\\webdrivers2\\chromedriver.exe");//Ajout chemin du driver
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-extensions");
	    options.addArguments("start-maximized");//prendre la taille de ecran
	    driver = new ChromeDriver(options);
	}
	@Test
	public static void ConnectAccount() throws InterruptedException {
		driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/auth/login/");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Wachntamrid#1");
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("menu_admin_UserManagement")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("btnAdd")).click();
                Thread.sleep(1000);
        new Select(driver.findElement(By.id("systemUser_userType"))).selectByVisibleText("ESS");
                Thread.sleep(1000);
                // driver.findElement(By.id("systemUser_userType")).click();
        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("aar aerarae");
        Thread.sleep(1000);
        new Select(driver.findElement(By.id("systemUser_status"))).selectByVisibleText("Inactif");
        Thread.sleep(1000);
        driver.findElement(By.id("systemUser_password")).sendKeys("fITEC2020*1");
        Thread.sleep(3000);
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("fITEC2020*1");
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.name("btnSave")).click();
		//driver.findElement(By.name("welcome")).click();
		//driver.findElement(By.linkText("Logout")).click();
	//	driver.findElement(By.xpath("//*[@id="welcome-menu"]/ul/li[2]/a")).click();
		driver.quit();

}
}
