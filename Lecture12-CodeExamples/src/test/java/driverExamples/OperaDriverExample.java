package driverExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OperaDriverExample {
	static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.opera.driver","E:\\drivers\\operadriver.exe");
		OperaOptions options = new OperaOptions();
		options.setBinary("C:\\Program Files\\Opera\\launcher.exe");
		driver = new OperaDriver(options);
		driver.get("http://pragmatic.bg/automation/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testExamples() {
		WebElement element = driver.findElement(By.partialLinkText("Example4"));
		element.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  
		// Assert that we only have 1 link
		Assert.assertEquals(1, driver.findElements(By.tagName("a")).size());
	}
}
