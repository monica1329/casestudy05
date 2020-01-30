package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class casestudy04 {
	
	WebDriver driver;
	
	@Given("The URL of the TestMe App login page is {string}")
	public void the_URL_of_the_TestMe_App_login_page_is(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("user enters {string} as User_name")
	public void user_enters_as_User_name(String User_name) {
	    driver.findElement(By.name("userName")).sendKeys("monica2913");
	}

	@When("user enters {string} as Password")
	public void user_enters_as_Password(String Password) {
	   driver.findElement(By.name("password")).sendKeys("moni1329");
	}

	@When("user enters Login Button")
	public void user_enters_Login_Button() {
	    driver.findElement(By.name("Login")).click();
	}

	@When("user is in Home_page")
	public void user_is_in_Home_page() {
	    Assert.assertEquals("Home", driver.getTitle());
	}

	@When("user enters {string} as search_Product")
	public void user_enters_as_search_Product(String search_Product) {
		driver.findElement(By.name("products")).sendKeys("headphones");
	}

	@When("user clicks on Find Details Button")
	public void user_clicks_on_Find_Details_Button() {
	    driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	@When("user clicks on Proceed to Pay Button")
	public void user_clicks_on_Proceed_to_Pay_Button() {
	   driver.findElement(By.xpath("//form[2]//input[1]")).click();
	}

	@Then("user does not find cart")
	public void user_does_not_find_cart() {
	    driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
	}




}
