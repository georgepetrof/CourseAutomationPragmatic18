package tests.frontend;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Browser;

public class PragmaticTestStore {

	@BeforeMethod
	public void setUp() {
		Browser.openBrowser();
	}

	@AfterMethod
	public void tearDown() {
		Browser.quit();
	}

	@Test
	public void sendEnquiry() {
		Home.open();
		Home.sendEnq("Ivan", "ivan@abv.bg", "Защо са толкова скъпи тия айфони?");
		Home.verifySendingEnq("Contact Us");

	}

	@Test
	public void searchForProduct() {
		Home.open();
		Home.search("iphone");
		Home.verifySearchedItem("iphone");

	}

	@Test
	public void registerUser() {
		Home.open();
		Home.regUSer( "Ivan",  "Dimitrov",  "iv100an@abv.bg",  "0883345568",  "1234",  "1234");
		Home.verifyRegiteringUser("Success");

	}

	@Test
	public void loginUser() {
		Home.open();
		Home.login();
		Home.verifyLogin();

	}

	@Test
	public void changeCurrency() {
		Home.open();
		Home.changeCurr();

	}

	@Test
	public void makeOrderDesktop() {
		Home.open();
		Home.makeOrder();
		Home.verifyMakeingOrder();

	}
}
