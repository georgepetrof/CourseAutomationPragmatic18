package tests.backend;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.backend.AdminDashboard;
import pages.backend.AdminLogin;
import pages.components.AdminHeader;
import utils.Browser;
import utils.WaitTool;

public class AdminLoginTests {

	@BeforeMethod
	public void setup() {
		Browser.openBrowser();
	}

	@Test
	public void successfulLogin() {
		AdminLogin.open();
		AdminLogin.login("admin", "parola123!");

		AdminDashboard.verifyExistanceOfHeaderText("Logout", "We did not login successfully.");

		AdminHeader.logout();
	}

	@Test
	public void unsuccessfulLogin() {
		AdminLogin.open();
		AdminLogin.login("dsfsdaf", "asdfasdfasdf");

		AdminLogin.verifyValidationMessage("No match for Username and/or Password.",
				"The expected validation on the login form did not appear.");

	}

	@Test
	public void forgottenPasswordFunction() {
		AdminLogin.open();
		AdminLogin.forgottenPassword("milen.strah8inski@pragmatic.bg");
		AdminLogin.verifyPasswordRestMessage(
				"An email with a confirmation link has been sent your admin email address.",
				"Warning: The E-Mail Address was not found in our records, please try again!");
	}

	@AfterMethod
	public void tearDown() {
		Browser.quit();
	}

}
