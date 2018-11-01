package homework;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bg.pragmatic.lecture13mvn.waits.utils.WaitTool;

public class Bgmenu {

	public static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.takeaway.com/bg/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void searchRestaurant1() {
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("ул. Черковна, София " + Keys.RETURN);
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id(".filter-wrapper>.title"), 10);	
		
		WebElement oShipka = driver.findElement(By.cssSelector("a[href*=\"/bg/oshipka\"]>.restlogo"));
		oShipka.click();
		assertEquals(driver.getTitle(), "О'шипка|O'shipka София - Пица в италиански стил - Takeaway.com");
		
	

		

	}

	@Test
	public void searchRestaurant2() {
		
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
