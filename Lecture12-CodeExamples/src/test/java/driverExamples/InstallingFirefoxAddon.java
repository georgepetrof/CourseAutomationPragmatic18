package driverExamples;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class InstallingFirefoxAddon {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		File file = new File ("C:/Users/Strahinski/Desktop/Automated Testing Course/Libraries - JUnit and Selenium/firebug-1.12.6-fx.xpi");
		profile.addExtension(file);
		options.setProfile(profile);
	    driver = new FirefoxDriver(options);
	    driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
	@AfterMethod
	public void tearDown() {
	    driver.quit();
	}
	
	@Test
	public void testExamples()  {
	    WebElement element = driver.findElement(By.id("nextBid"));
	    element.sendKeys("100");
	}
}
