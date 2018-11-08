package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;

	/**
	 * Opens a browser and maximizes it, then sets 10 seconds implicit wait
	 */
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * Quits the browser
	 */
	public static void quit() {
		driver.quit();
	}

}
