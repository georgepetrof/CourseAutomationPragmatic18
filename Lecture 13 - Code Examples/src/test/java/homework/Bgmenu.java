package homework;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bg.pragmatic.lecture13mvn.waits.utils.WaitTool;

public class Bgmenu {

	public static WebDriver driver;

	public static String mail = "122423j2ffff@mailinator.com";
	public static String pass = "123456789@Aa";

	@BeforeMethod
	// Setup Chrome Driver and open www.takeaway.com
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\DEV\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.takeaway.com/bg/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	// Search for restaurant O!Shipka in Sofia
	public void searchOshipka() {
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("ул. Черковна, София ");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id("#reference[data-name='ул. „Черковна“, София']"), 5);
		driver.findElement(By.cssSelector("#reference[data-name='ул. „Черковна“, София']")).click();

		WaitTool.waitForElement(driver, By.cssSelector(".filter-wrapper>.title"), 5);

		WebElement oShipka = driver.findElement(By.cssSelector("a[href*=\"/bg/oshipka\"]>.restlogo"));
		oShipka.click();
		assertEquals(driver.getTitle(), "О'шипка|O'shipka София - Пица в италиански стил - Takeaway.com");

	}

	@Test
	// Search for restaurant Ankona in Sofia
	public void searchAnkona() {
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("Слатина");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id("#reference[data-name='Слатина, София'"), 5);
		driver.findElement(By.cssSelector("#reference[data-name='Слатина, София'")).click();

		WaitTool.waitForElement(driver, By.cssSelector(".filter-wrapper>.title"), 5);

		WebElement ankona = driver.findElement(By.cssSelector("a[href*=\"bg/ancona-reduta\"]>.restlogo"));
		ankona.click();
		assertEquals(driver.getTitle(),
				"Ancona Reduta|Анкона Редута София - Пица в италиански стил , Италианска Поръчай храна за вкъщи - Takeaway.com");

	}

	@Test
	// Can I change the language settings from BG to FR
	public void changeLanguage() {
		driver.findElement(By.cssSelector("#locale .button-user")).click();
		WaitTool.waitForElement(driver, By.id(".menu a[href^=\"/bg-fr/\"]"), 2);
		driver.findElement(By.cssSelector(".menu a[href^=\"/bg-fr/\"]")).click();
		assertEquals(driver.getTitle(), "Takeaway.com | Commander repas en ligne - Pizza.fr");

	}

	@Test
	// Can I make a valid registration into the site
	public void registration() {
		driver.findElement(By.cssSelector(".myaccount>.menu")).click();
		driver.findElement(By.cssSelector("#userpanel-wrapper .more[data-click=register]")).click();
		driver.findElement(By.cssSelector("#iaccountuser")).sendKeys(mail);
		driver.findElement(By.cssSelector("#iaccountsurname")).sendKeys("I am Test");
		driver.findElement(By.cssSelector("#iaccountpass")).sendKeys(pass);
		driver.findElement(By.cssSelector("#iaccountpass2")).sendKeys(pass);
		driver.findElement(By.cssSelector("#registerbutton")).click();
		WebElement successReg = driver.findElement(By.cssSelector("#userpanel-wrapper p"));

		assertEquals(successReg.getText(),
				"Благодарим ти, че си създаде профил на Takeaway.com. Остава ти само още една стъпка! Само потвърди профила си като натиснеш върху връзката за потвърждение, която сме изпратили до "
						+ mail + " и твоят профил ще е готов за ползване.");

	}

	@Test
	// Can I log-in into the site
	public void login() {
		driver.findElement(By.cssSelector(".myaccount>.menu")).click();
		driver.findElement(By.cssSelector("#userpanel-wrapper .more[data-click=login]")).click();
		driver.findElement(By.cssSelector("#iusername")).sendKeys(mail);
		driver.findElement(By.cssSelector("#ipassword")).sendKeys(pass);
		;
		driver.findElement(By.cssSelector(".button_form ")).click();
		WebElement entrance = driver.findElement(By.cssSelector("#notification"));
		assertEquals(entrance.getText(),
				"Трябва да активираш своя профил, преди да можеш да влезеш в него. Моля, провери пощенската си кутия за връзка за потвърждение.");
	}

	@Test
	// Complete user journey: login, select restaurant, select meal, make on order
	public void makeOrder() {
		driver.findElement(By.cssSelector(".myaccount>.menu")).click();
		driver.findElement(By.cssSelector("#userpanel-wrapper .more[data-click=login]")).click();
		driver.findElement(By.cssSelector("#iusername")).sendKeys("jop120@mailinator.com");
		driver.findElement(By.cssSelector("#ipassword")).sendKeys("Jop1234@");
		;
		driver.findElement(By.cssSelector(".button_form ")).click();
		driver.findElement(By.cssSelector(".modal-title .modal-close")).click();
		driver.findElement(By.cssSelector("#imysearchstring")).sendKeys("Слатина");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WaitTool.waitForElement(driver, By.id("#reference[data-name='Слатина, София'"), 3);
		driver.findElement(By.cssSelector("#reference[data-name='Слатина, София'")).click();

		WaitTool.waitForElement(driver, By.cssSelector(".filter-wrapper>.title"), 3);

		WebElement ankona = driver.findElement(By.cssSelector("a[href*=\"bg/ancona-reduta\"]>.restlogo"));
		ankona.click();
		assertEquals(driver.getTitle(),
				"Ancona Reduta|Анкона Редута София - Пица в италиански стил , Италианска Поръчай храна за вкъщи - Takeaway.com");

		// Select Salad Rukola with cherry and proschuto
		driver.findElement(By.cssSelector("#productformNRO3OPNN7")).click();
		driver.findElement(By.cssSelector("#btn-basket")).click();
		driver.findElement(By.cssSelector(".cartbutton .cartbutton-button")).click();

		WebElement finalOrder = driver.findElement(By.cssSelector(".checkout-orderbutton-btn"));
		assertEquals(finalOrder.getText(), "ЗАВЪРШИ ПОРЪЧКАТА");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
