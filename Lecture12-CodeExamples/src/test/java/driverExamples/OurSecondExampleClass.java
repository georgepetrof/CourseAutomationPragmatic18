package driverExamples;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OurSecondExampleClass {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver19.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://pragmatic.bg/automation/example4.html");
		options.setProfile(profile);
	    driver = new FirefoxDriver(options);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown(){
	    driver.quit();
	}
	
	@Test
	public void testExamples(){
		driver.findElement(By.xpath("//div"));
	    WebElement element = driver.findElement(By.linkText("Index"));
	    element.click();
	}


}
