package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class casestudy03 {
	
	WebDriver driver;
	@Given("The URL of the TestMe App is {string}")
	public void the_URL_of_the_TestMe_App_is(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enters {string} as Username")
	public void user_enters_as_Username(String username) {
	    driver.findElement(By.name("userName")).sendKeys("Dipsi");
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String password) {
	    driver.findElement(By.name("password")).sendKeys("abc123");
	}

	@When("user clicks Login Button")
	public void user_clicks_Login_Button() {
	    driver.findElement(By.name("Login")).click();
	}

	@When("user is in Home page")
	public void user_is_in_Home_page() {
	    Assert.assertEquals("Home", driver.getTitle());
	}

	@When("user enters {string} as searchProduct")
	public void user_enters_as_searchProduct(String searchProduct) {
	   driver.findElement(By.name("products")).sendKeys(searchProduct);
	}

	@When("user clicks on FIND DETAILS Button")
	public void user_clicks_on_FIND_DETAILS_Button() {
	    driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@Then("user is in valid page")
	public void user_is_in_valid_page() {
	    Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Home')]")).isDisplayed());
	}


}
