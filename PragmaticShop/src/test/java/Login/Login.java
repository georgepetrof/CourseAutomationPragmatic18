package Login;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

	}

	@Test
	public void cantLogIn() {
		WebElement usernameField = this.driver.findElement(By.id("input-username"));
		usernameField.sendKeys("admsin");

		WebElement passwordField = this.driver.findElement(By.id("input-password"));
		passwordField.sendKeys("para123!");

		WebElement loginButton = this.driver.findElement(By.cssSelector("div button"));
		loginButton.click();
	}

	@Test
	public void orderStatus() {
		canLogIn();
		WebElement sales = this.driver.findElement(By.cssSelector("#menu a[href*=\"collapse26\"]"));
		sales.click();
		WebElement orders = this.driver.findElement(By.cssSelector("#collapse26 a[href*=\"order\"]"));
		orders.click();
		Select orderStatus = new Select(this.driver.findElement(By.name("Order Status")));
	}
}
