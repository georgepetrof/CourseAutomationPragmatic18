package pages.components;

import org.openqa.selenium.By;

import utils.Browser;

public class AdminHeader {

	/**
	 * Clicks logout on top of the header
	 */
	public static void logout() {
		Browser.driver.findElement(By.partialLinkText("Logout")).click();
	}

}
