package bg.pragmatic.datadriven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CsvTestData {

	private WebDriver driver;

	@DataProvider
	public String[][] testData() throws IOException {
		return getTestData(
				"C:\\Users\\Strahinski\\Desktop\\Automated Testing Course\\Lectures\\Lecture 15 - Data-Driven & Behavior-Driven Testing\\Test Data Files\\data.csv");
	}

	public String[][] getTestData(String fileName) throws IOException {
		List<String[]> records = new ArrayList<String[]>();
		String record;

		BufferedReader file = new BufferedReader(new FileReader(fileName));
		while ((record = file.readLine()) != null) {
			String fields[] = record.split(",");
			records.add(fields);
		}

		file.close();
		
		return records.toArray(new String[records.size()][]);
	}

	@BeforeClass
	public void setUp() throws Exception {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
	}

	@Test(dataProvider = "testData")
	public void testBMICalculator(String height, String weight, String expectedBmi, String expectedBmiCategory) throws Exception {
		WebElement heightField = driver.findElement(By.name("heightCMS"));
		heightField.clear();
		heightField.sendKeys(height);

		WebElement weightField = driver.findElement(By.name("weightKg"));
		weightField.clear();
		weightField.sendKeys(weight);

		WebElement calculateButton = driver.findElement(By.id("Calculate"));
		calculateButton.click();

		WebElement bmiLabel = driver.findElement(By.name("bmi"));
		Assert.assertEquals(bmiLabel.getAttribute("value"), expectedBmi);

		WebElement bmiCategoryLabel = driver.findElement(By.name("bmi_category"));
		Assert.assertEquals(bmiCategoryLabel.getAttribute("value"), expectedBmiCategory);
	}

	@AfterClass
	public void tearDown() throws Exception {
		// Close the browser
		driver.quit();
	}
}
