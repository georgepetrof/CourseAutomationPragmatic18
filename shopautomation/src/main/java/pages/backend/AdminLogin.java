package pages.backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.Browser;

public class AdminLogin {

	/**
	 * Opens the Administration login page of our project
	 */
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * Logs into the administration page using the provided credentials
	 * it also clicks the Login button
	 * 
	 * @param username the username you would like to login with
	 * @param password the password you would like to login with
	 */
	public static void login(String username, String password) {
		Browser.driver.findElement(By.id("input-username")).sendKeys(username);
		Browser.driver.findElement(By.id("input-password")).sendKeys(password);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	/**
	 * Asserts if the expected validation message on the admin login form
	 * is contained in the actual validation message
	 * 
	 * @param expectedValidationMessage the message you would expect to be contained
	 * @param messageOnFailure the message that will appear in your reports in case of failure
	 */
	public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure) {
		WebElement validationMessageWebElement = Browser.driver.findElement(By.cssSelector(".alert-danger"));
		String actualValidationMessage = validationMessageWebElement.getText();
		
		Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
	}

}
