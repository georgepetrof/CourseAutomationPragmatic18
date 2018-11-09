package tests.backend;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



import utils.Browser;

public class AdminUser {

	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");

	}

	public static void login(String username, String password) {
		Browser.driver.findElement(By.id("input-username")).sendKeys(username);
		Browser.driver.findElement(By.id("input-password")).sendKeys(password);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	public static void addNewAdmin(String username, String firstname, String lastname, String email, String pass,
			String confpass) {

		Browser.driver.findElement(By.cssSelector("#menu-system")).click();
		Browser.driver.findElement(By.cssSelector("#collapse42 li a[href*=\"43\"]")).click();
		Browser.driver.findElement(By.cssSelector("#collapse43 li a[href*=\"user&user\"]")).click();

		Browser.driver.findElement(By.cssSelector(".pull-right>a[href*=\"add&user\"]")).click();
		Browser.driver.findElement(By.id("input-username")).sendKeys(username);
		;
		Browser.driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		;
		Browser.driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		;
		Browser.driver.findElement(By.id("input-email")).sendKeys(email);
		;
		Browser.driver.findElement(By.id("input-password")).sendKeys(pass);
		;
		Browser.driver.findElement(By.id("input-confirm")).sendKeys(confpass);
		;
		Browser.driver.findElement(By.cssSelector(".fa-save")).click();

	}

	public static void verifyCreateAdmin() {
		WebElement successMessage = Browser.driver.findElement(By.cssSelector(".alert-success"));
		String expSuccessMessage = "Success: You have modified users";
		Assert.assertTrue(successMessage.getText().contains(expSuccessMessage));

	}

	public static void openUserPanel() {
		open();
		login("admin", "parola123!");
		Browser.driver.findElement(By.cssSelector("#menu-system")).click();
		Browser.driver.findElement(By.cssSelector("#collapse42 li a[href*=\"43\"]")).click();
		Browser.driver.findElement(By.cssSelector("#collapse43 li a[href*=\"user&user\"]")).click();
	}

	public static void deleteUser() {
		WebElement userCheck = Browser.driver.findElement(By.cssSelector(".text-center [value=\"11\"]"));
		if (!userCheck.isSelected())
			userCheck.click();
		assertTrue(userCheck.isSelected());
		Browser.driver.findElement(By.cssSelector(".btn-danger")).click();
		Alert alert = Browser.driver.switchTo().alert();
		alert.accept();

	}

	public static void verifyDeletingOfUser() {

	}

}
