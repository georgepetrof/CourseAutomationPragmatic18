package tests.backend;

import org.openqa.selenium.By;

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


	public static void addNewAdmin(String username, String firstname, String lastname, String email, String pass, String confpass) {
		Browser.driver.findElement(By.cssSelector("#menu-system")).click();
		
		
		Browser.driver.findElement(By.cssSelector(".pull-right>a[href*=\"add&user\"]")).click();
		Browser.driver.findElement(By.cssSelector("#input-username")).sendKeys(username);;
		Browser.driver.findElement(By.cssSelector("")).sendKeys(firstname);;
		Browser.driver.findElement(By.cssSelector("")).sendKeys(lastname);;
		Browser.driver.findElement(By.cssSelector("")).sendKeys(email);;
		Browser.driver.findElement(By.cssSelector("")).sendKeys(pass);;
		Browser.driver.findElement(By.cssSelector("")).sendKeys(confpass);;

	}

	public static void addNewDemonstrator() {

	}

	public static void verifyCreateAdmin() {

	}

	public static void verifyCreateDemonstator() {

	}

	
}
