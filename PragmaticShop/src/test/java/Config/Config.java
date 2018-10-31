package Config;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Config {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void changeColor() {
		WebElement multipleSelec = driver.findElement(By.cssSelector("#tabs-1 > p > select[multiple]"));
		Select color = new Select(multipleSelec);
		Assert.assertTrue(color.isMultiple());
		color.selectByVisibleText("Red");
		color.selectByVisibleText("Silver");
		assertEquals(color.getAllSelectedOptions().get(0).getText(), "Red");
		assertEquals(color.getAllSelectedOptions().get(1).getText(), "Silver");

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}