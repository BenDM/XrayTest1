package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearch{

//	private WebDriver driver;
//
//	public GoogleSearch() {
////		this.driver = Hook.getDriver();
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//divers//chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@Given("^I open a browser$")
//	public void i_open_a_browser() throws Throwable {
//		// Thread.sleep(3000);
//		System.out.println("Current url : " + driver.getCurrentUrl());
//	}
//
//	@When("^I navigate to google page$")
//	public void i_navigate_to_google_page() throws Throwable {
//		driver.get("http://www.google.com");
//	}
//
//	@Then("^I validate the search tesxt field$")
//	public void i_validate_the_search_tesxt_field() throws Throwable {
//		// Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
//		driver.findElement(By.name("q")).sendKeys("Cucumber");
//		// Thread.sleep(1000);
//	}


	///////////////////////////////////////////

	@Given("^Ich bin als Admin eingeloggt$")
	public void ich_bin_als_Admin_eingeloggt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^Ich rufe die Regeln auf$")
	public void ich_rufe_die_Regeln_auf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^Ich rufe die Maske \\(Aendern\\) auf$")
	public void ich_rufe_die_Maske_Aendern_auf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^Ich aendere die Daten$")
	public void ich_aendere_die_Daten() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^Ich klicke Speichern$")
	public void ich_klicke_Speichern() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Ich sehe die Uebersicht Regeln$")
	public void ich_sehe_die_Uebersicht_Regeln() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Die geaenderte Regeln ist selektiert$")
	public void die_geaenderte_Regeln_ist_selektiert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Die geaenderte Daten sind vorhanden$")
	public void die_geaenderte_Daten_sind_vorhanden() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
