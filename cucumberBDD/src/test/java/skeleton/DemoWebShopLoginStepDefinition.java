package skeleton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DemoWebShopLoginStepDefinition {
	WebDriver driver;
	public DemoWebShopLoginStepDefinition() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, demowebshoploginpage.class);
	}
	@Given("The URL of the Demo Web Shop {string}")
	public void the_URL_of_the_Demo_Web_Shop(String url) {
	    
		driver.get(url);   
	}

	@When("User enters {string} as username")
	public void user_enters_as_username(String username) {
	    demowebshoploginpage.email.sendKeys(username);
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String password) {
	   demowebshoploginpage.password.sendKeys(password);
	}

	@When("User clicks on Login button")
	public void user_clicks_on_Login_button() {
	    demowebshoploginpage.login.click();
	}

	@Then("User is in a valid page")
	public void user_is_in_a_valid_page() {
	    Assert.assertTrue(demowebshoploginpage.logout.isDisplayed());
	    demowebshoploginpage.logout.click();
	}


}
