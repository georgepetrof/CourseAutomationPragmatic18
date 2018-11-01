package driverExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class EdgeDriverExample {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.edge.driver", "E:\\drivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://abv.bg");
	}

	@Test
	public void testExamples(){
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys("pragmabg");
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys("parola");
		driver.findElement(By.id("loginBut")).click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
