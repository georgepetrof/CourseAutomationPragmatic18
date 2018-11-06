package pages.backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.Browser;

public class AdminDashboard {

	/**
	 * Asserts the if the current header text in the browser
	 * contains the provided header text as parameter
	 * 
	 * @param expectedContainedHeaderText the expected text you believe is there in the header
	 * @param messageOnFailure the message you will see in the reports in case of assertion failure
	 */
	public static void verifyExistanceOfHeaderText(String expectedContainedHeaderText, String messageOnFailure) {
		WebElement headerWebElement = Browser.driver.findElement(By.id("header"));
		String actualContainedHeaderText = headerWebElement.getText();
		
		Assert.assertTrue(actualContainedHeaderText.contains(expectedContainedHeaderText), messageOnFailure);
	}

}
