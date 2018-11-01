package seleniumapi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowMaximize {
	
	@Test
	public void testRowSelectionUsingControlKey() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		
		driver.quit();
	}
}
