package tests.backend;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Browser;

public class AdminUserTests {

	@BeforeMethod
	public void setup() {
		Browser.openBrowser();
	}

	@Test
	public void createAdministratorUser() {
		AdminUser.open();
		AdminUser.login("admin", "parola123!");
		AdminUser.addNewAdmin();
		AdminUser.verifyCreateAdmin();

	}

	@Test
	public void createDemonstratorUser() {
		AdminUser.open();
		AdminUser.addNewDemonstrator();
		AdminUser.verifyCreateDemonstator();
	}

	//@AfterMethod
	//public void tearDown() {
	//	Browser.quit();
	//}
}
