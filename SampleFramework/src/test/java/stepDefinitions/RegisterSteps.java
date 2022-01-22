package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;





public class RegisterSteps {
	WebDriver driver;
	RegisterPage rg;

	@Given("user upen url")
	public void user_upen_url() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	     driver.get("http://automationpractice.com");
	}

	@When("user on the home page")
	public void user_on_the_home_page() {
      rg= new RegisterPage(driver);
	}

	@Then("clcik on sign in button")
	public void clcik_on_sign_in_button() {
     rg.clickSignin();
	}

	@Then("user enter {string}")
	public void user_enter(String string) {
     rg.enterEmail();
	}

	@Then("click on Createa account button")
	public void click_on_createa_account_button() throws Exception {
      rg.submit();
      Thread.sleep(6000);
      driver.quit();
	}

}
