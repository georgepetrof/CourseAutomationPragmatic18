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
		AdminUser.addNewAdmin("newuser", "ivan", "ivan", "ivan@gmail.com", "1234", "1234");

		AdminUser.verifyCreateAdmin();

	}

	@Test
	public void deleteUser() {
		AdminUser.openUserPanel();
		AdminUser.deleteUser();
		AdminUser.verifyDeletingOfUser();

	}

	@AfterMethod
	public void tearDown() {
		Browser.quit();

	}
}