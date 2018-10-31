package Login;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import okio.Options;

public class Login {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://shop.pragmatic.bg/admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void canLogIn() {
		WebElement usernameField = this.driver.findElement(By.id("input-username"));
		usernameField.sendKeys("admin");

		WebElement passwordField = this.driver.findElement(By.id("input-password"));
		passwordField.sendKeys("parola123!");

		WebElement loginButton = this.driver.findElement(By.cssSelector("div button"));
		loginButton.click();

		WebElement element = this.driver.findElement(By.cssSelector(".container-fluid > h1"));
		String dashboard = element.getText();
		Assert.assertEquals("Dashboard", dashboard);

	}

	@Test
	public void cantLogIn() {
		WebElement usernameField = this.driver.findElement(By.id("input-username"));
		usernameField.sendKeys("admsin");

		WebElement passwordField = this.driver.findElement(By.id("input-password"));
		passwordField.sendKeys("para123!");

		WebElement loginButton = this.driver.findElement(By.cssSelector("div button"));
		loginButton.click();

		WebElement loginFail = this.driver.findElement(By.cssSelector(".alert .fa "));
		String text = loginFail.getAttribute("class");

		Assert.assertEquals(text, "fa fa-exclamation-circle");

	}

	@Test
	public void orderStataus() {
		canLogIn();
		WebElement sales = this.driver.findElement(By.cssSelector("#menu a[href*=\"collapse26\"]"));
		sales.click();
		WebElement orders = this.driver.findElement(By.cssSelector("#collapse26 a[href*=\"order\"]"));
		orders.click();

		WebElement dropDown = this.driver.findElement(By.cssSelector("#input-order-status"));
		Select orderStatus = new Select(dropDown);
		java.util.List<WebElement> act_options = orderStatus.getOptions();
		
		
		
		java.util.List<String> exp_options = Arrays.asList(new String[] {"Missing Orders", "Canceled",
				"Canceled Reversal", "Chargeback", "Complete", "Denied", "Expired", "Failed", "Pending", "Processed",
				"Processing", "Refunded", "Reversed", "Shipped", "Voided" });

	

		assertEquals(act_options.toString(), exp_options.toString());
		

	}

}
