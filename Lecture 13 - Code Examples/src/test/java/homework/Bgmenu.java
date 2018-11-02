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
	public void searchOshipka() {
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("ул. Черковна, София ");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id("#reference[data-name='ул. „Черковна“, София']"), 5);
		driver.findElement(By.cssSelector("#reference[data-name='ул. „Черковна“, София']")).click();

		WaitTool.waitForElement(driver, By.cssSelector(".filter-wrapper>.title"), 5);

		WebElement oShipka = driver.findElement(By.cssSelector("a[href*=\"/bg/oshipka\"]>.restlogo"));
		oShipka.click();
		assertEquals(driver.getTitle(), "О'шипка|O'shipka София - Пица в италиански стил - Takeaway.com");

	}

	@Test
	public void searchAnkona() {
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("Слатина");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id("#reference[data-name='Слатина, София'"), 5);
		driver.findElement(By.cssSelector("#reference[data-name='Слатина, София'")).click();

		WaitTool.waitForElement(driver, By.cssSelector(".filter-wrapper>.title"), 5);

		WebElement ankona = driver.findElement(By.cssSelector("a[href*=\"bg/ancona-reduta\"]>.restlogo"));
		ankona.click();
		assertEquals(driver.getTitle(), "Ancona Reduta|Анкона Редута София - Пица в италиански стил , Италианска Поръчай храна за вкъщи - Takeaway.com");

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
