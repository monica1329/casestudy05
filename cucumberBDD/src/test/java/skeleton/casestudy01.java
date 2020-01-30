package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy01 {
	WebDriver driver;
	
	/*@Given("The URL of the Test me app {string}")
	public void the_URL_of_the_Test_me_app(String url) {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User enters {string} as UserName")
	public void user_enters_as_UserName(String UserName) {
	    driver.findElement(By.name("userName")).sendKeys("monica1329");
	}

	@When("User enters {string} as FirstName")
	public void user_enters_as_FirstName(String FirstName) {
		driver.findElement(By.id("firstName")).sendKeys("monica");
	}

	@When("User enters {string} as LastName")
	public void user_enters_as_LastName(String LastName) {
		driver.findElement(By.id("lastName")).sendKeys("baranwal");
	}

	@When("User enters {string} as Password")
	public void user_enters_as_Password(String Password) {
		driver.findElement(By.id("password")).sendKeys("moni1329");
	}

	@When("User enters {string} as ConfirmPassword")
	public void user_enters_as_ConfirmPassword(String ConfirmPassword) {
	    driver.findElement(By.id("pass_confirmation")).sendKeys("moni1329");
	}

	@When("User enters {string} as Gender")
	public void user_enters_as_Gender(String Gender) {
	    driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
	}

	@When("User enters {string} as EmailAddress")
	public void user_enters_as_EmailAddress(String EmailAddress) {
	    driver.findElement(By.id("emailAddress")).sendKeys("monica@gmail.com");
	}

	@When("User enters {string} as MobileNumber")
	public void user_enters_as_MobileNumber(String MobileNumber) {
		driver.findElement(By.id("mobileNumber")).sendKeys("9087654321");
	}

	@When("User enters {string} as Dob")
	public void user_enters_as_Dob(String Dob) {
		driver.findElement(By.xpath("(//input[@id='dob'])")).sendKeys("13/09/1996");
	}

	@When("User enters {string} as Address")
	public void user_enters_as_Address(String Address) {
		driver.findElement(By.id("address")).sendKeys("bangalore");
	}

	@When("User enters {string} as SecurityQuestion")
	public void user_enters_as_SecurityQuestion(String SecurityQuestion) {
	    Select sq=new Select(driver.findElement(By.id("securityQuestion")));
	    sq.selectByValue("411010");
	}

	@When("User enters {string} as Answer")
	public void user_enters_as_Answer(String Answer) {
		driver.findElement(By.id("answer")).sendKeys("jharkhand");
	}

	@Then("clicks on Submit Button")
	public void clicks_on_Submit_Button() {
	    driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
}
