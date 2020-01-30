package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy02 {

	WebDriver driver;
	@Given("The URL of The Demo Web Shop {string}")
	public void the_URL_of_The_Demo_Web_Shop(String url) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\Jars\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User enters {string} as Username")
	public void user_enters_as_Username(String username) {
	    driver.findElement(By.name("userName")).sendKeys("monica2913");
	}

	@When("User enters {string} as Password")
	public void user_enters_as_Password(String password) {
	    driver.findElement(By.id("password")).sendKeys("moni1329");
	}

	@Then("User clicks on login Button")
	public void user_clicks_on_login_Button() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	}



}
