package tests.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import utils.Browser;

public class Home {

	
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/");

	}

	public static void sendEnq(String name, String email, String Equiry) {
		Browser.driver.findElement(By.cssSelector(".list-unstyled  a[href*=\"contact\"]")).click();
		Browser.driver.findElement(By.cssSelector("#input-name")).sendKeys(name);
		Browser.driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
		Browser.driver.findElement(By.cssSelector("#input-enquiry")).sendKeys(Equiry);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();

	}

	public static void verifySendingEnq(String messageOnSuccess) {
		String actMessage = Browser.driver.findElement(By.cssSelector(".col-sm-12>h1")).getText();
		Assert.assertTrue(actMessage.contains(messageOnSuccess));

	}

	public static void search(String search) {
		Browser.driver.findElement(By.name("search")).sendKeys(search);
		Browser.driver.findElement(By.cssSelector(".btn-default ")).click();

	}

	public static void verifySearchedItem(String search) {
		String searchMessage = Browser.driver.findElement(By.cssSelector("#content h1")).getText();
		Assert.assertTrue(searchMessage.contains(search));

	}

	public static void regUSer(String fname, String lname, String email, String tel, String pass, String cpass) {
		Browser.driver.findElement(By.cssSelector("[title~= Account]")).click();
		Browser.driver.findElement(By.cssSelector(".dropdown a[href*=login]")).click();
		Browser.driver.findElement(By.cssSelector("a[href*=register].btn-primary")).click();

		Browser.driver.findElement(By.id("input-firstname")).sendKeys(fname);
		Browser.driver.findElement(By.id("input-lastname")).sendKeys(lname);
		Browser.driver.findElement(By.id("input-email")).sendKeys(email);
		Browser.driver.findElement(By.id("input-telephone")).sendKeys(tel);
		Browser.driver.findElement(By.id("input-password")).sendKeys(pass);
		Browser.driver.findElement(By.id("input-confirm")).sendKeys(cpass);

		WebElement agree = Browser.driver.findElement(By.name("agree"));
		if (!agree.isSelected())
			agree.click();

	}

	public static void verifyRegiteringUser(String expsuccessMessage) {
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
		String successMessage = Browser.driver.findElement(By.cssSelector("a[href*=success]")).getText();
		Assert.assertTrue(successMessage.contains(expsuccessMessage));
	}

	public static void login() {

	}

	public static void verifyLogin() {

	}

	public static void changeCurr() {

	}

	public static void makeOrder() {

	}

	public static void verifyMakeingOrder() {

	}

}
