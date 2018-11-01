package driverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		this.driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		this.driver.get("http://abv.bg");
	}

	@Test
	public void myFirstTest() {
		WebElement usernameField = this.driver.findElement(By.id("username"));
		usernameField.sendKeys("dqdo koleda");
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		this.driver.quit();
	}

}
