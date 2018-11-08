package pages.backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.Browser;
import utils.WaitTool;

public class AdminLogin {

	/**
	 * Opens the Administration login page of our project
	 */
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * Logs into the administration page using the provided credentials it also
	 * clicks the Login button
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
	 * Asserts if the expected validation message on the admin login form is
	 * contained in the actual validation message
	 * 
	 * @param expectedValidationMessage the message you would expect to be contained
	 * @param messageOnFailure          the message that will appear in your reports
	 *                                  in case of failure
	 */
	public static void verifyValidationMessage(String expectedValidationMessage, String messageOnFailure) {
		WebElement validationMessageWebElement = Browser.driver.findElement(By.cssSelector(".alert-danger"));
		String actualValidationMessage = validationMessageWebElement.getText();

		Assert.assertTrue(actualValidationMessage.contains(expectedValidationMessage), messageOnFailure);
	}

	/**
	 * If you forgot your password, click on the Forgotten Password link and fill
	 * you email, than click Reset
	 * 
	 * @param yourEmail The Email address from you registration
	 */
	public static void forgottenPassword(String yourEmail) {
		Browser.driver.findElement(By.cssSelector("a[href*=\"forgotten\"]")).click();
		// WaitTool.waitForElement(Browser.driver, By.id("input-email"), 3);
		Browser.driver.findElement(By.id("input-email")).sendKeys(yourEmail);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	/**
	 * Asserts if the expected reset password message on the Forgotten password form
	 * is contained in the actual reset password message
	 * 
	 * @param expectedResetPassMessage the message you would expect to be contained
	 * @param unvalidEmailMessage      the message that will appear in your reports
	 *                                 in case of failure
	 */
	public static void verifyPasswordRestMessage(String expectedResetPassMessage, String unvalidEmailMessage) {
		WaitTool.waitForElement(Browser.driver, By.cssSelector(".alert-success"), 5);
		WaitTool.waitForElement(Browser.driver, By.cssSelector(".alert-danger"), 5);
		WebElement alertSuccessMessage = Browser.driver.findElement(By.cssSelector(".alert-success"));
		WebElement alertFailureMessage = Browser.driver.findElement(By.cssSelector(".alert-danger"));
		String actualWrongMessage = alertFailureMessage.getText();
		String actualResetPassMessage = alertSuccessMessage.getText();
		System.out.println("print 1" + actualResetPassMessage);
		System.out.println("print 2" + actualWrongMessage);

		Assert.assertTrue(actualResetPassMessage.contains(expectedResetPassMessage),
				actualWrongMessage.concat(unvalidEmailMessage));

	}
}
