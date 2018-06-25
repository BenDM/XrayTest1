package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch{
	
	private WebDriver driver;

	public GoogleSearch() {
//		this.driver = Hook.getDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//divers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
		// Thread.sleep(3000);
		System.out.println("Current url : " + driver.getCurrentUrl());
	}

	@When("^I navigate to google page$")
	public void i_navigate_to_google_page() throws Throwable {
		driver.get("http://www.google.com");
	}

	@Then("^I validate the search tesxt field$")
	public void i_validate_the_search_tesxt_field() throws Throwable {
		// Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		// Thread.sleep(1000);
	}

}
