package bg.pragmatic.lecture14bmi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BmiCalculatorTests {

	@Test
	public void calculateOverweightBmiTest() {
		BmiCalcPage bmiPage = new BmiCalcPage();
		
		bmiPage.goTo();
		bmiPage.calculateBmi("12", "44");
		
		String actualBmi = bmiPage.getBmi();
		String actualBmiCategory = bmiPage.getBmiCategory();
		
		Assert.assertEquals(actualBmi, "22");
		Assert.assertEquals(actualBmiCategory, "Overweight");

		bmiPage.quit();
	}
	
	@Test
	public void calculateOverweightBmiTest2() {
		BmiCalcPage bmiPage = new BmiCalcPage();
		
		bmiPage.goTo();
		bmiPage.calculateBmi("150", "50");
		
		String actualBmi = bmiPage.getBmi();
		String actualBmiCategory = bmiPage.getBmiCategory();
		
		Assert.assertEquals(actualBmi, "22.2", "Ima buuuuug");
		Assert.assertEquals(actualBmiCategory, "Normal", "Ima buuuuug");

		bmiPage.quit();
	}

}
