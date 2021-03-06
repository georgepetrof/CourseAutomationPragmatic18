package com.bdd.BDDFundTransfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundTransferStepDef  {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Given("^the user is on Fund Transfer Page$")
	public void the_user_is_on_Fund_Transfer_Page() throws Throwable {
		driver.get("http://pragmatic.bg/automation/lecture15/fundTransfer.html");
	}

	@When("^he enters \"([^\"]*)\" as payee name$")
	public void he_enters_as_payee_name(String payeeName) throws Throwable {
	    WebElement payeeWebElement = driver.findElement(By.id("payee"));
	    Select payeeDropDown = new Select(payeeWebElement);
	    payeeDropDown.selectByVisibleText(payeeName);
	}

	@When("^he enters \"([^\"]*)\" as amount$")
	public void he_enters_as_amount(String amount) throws Throwable {
	    driver.findElement(By.id("amount")).sendKeys(amount);
	}

	@When("^he Submits request for Fund Transfer$")
	public void he_Submits_request_for_Fund_Transfer() throws Throwable {
	    driver.findElement(By.id("transfer")).click();
	}

	@Then("^ensure the fund transfer is complete with \"([^\"]*)\" message$")
	public void ensure_the_fund_transfer_is_complete_with_message(String expectedTransferMessage) throws Throwable {
	   String actualTransferMessage = driver.findElement(By.id("message")).getText();
	   
	   Assert.assertEquals(actualTransferMessage, expectedTransferMessage, "bug beee");
	}

	@Then("^ensure a transaction failure message \"([^\"]*)\" is displayed$")
	public void ensure_a_transaction_failure_message_is_displayed(String expectedFailureTransferMessage) throws Throwable {
	   String actualTransferFailureMessage = driver.findElement(By.id("message")).getText();

	   Assert.assertEquals(actualTransferFailureMessage, expectedFailureTransferMessage, "bug beee");
	}


}
