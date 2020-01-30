package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy001 {
	WebDriver driver;
	@Given("The URL of the Test me app {string}")
	public void the_URL_of_the_Test_me_app(String url) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.01.07\\Desktop\\Selenium\\Jars\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	}

	@When("User enters {string} as USerName")
	public void user_enters_as_USerName(String USerName) {
	    driver.findElement(By.name("userName")).sendKeys(USerName);
	}

	@When("User enters {string} as FIrstName")
	public void user_enters_as_FIrstName(String FIrstName) {
	   driver.findElement(By.id("firstName")).sendKeys(FIrstName);
	}

	@When("User enters {string} as LAstName")
	public void user_enters_as_LAstName(String LAstName) {
	   driver.findElement(By.id("lastName")).sendKeys(LAstName);
	}

	@When("User enters {string} as PAssword")
	public void user_enters_as_PAssword(String PAssword) {
	    driver.findElement(By.id("password")).sendKeys(PAssword);
	}

	@When("User enters {string} as COnfirmPassword")
	public void user_enters_as_COnfirmPassword(String COnfirmPassword) {
	    driver.findElement(By.id("confirmPassword")).sendKeys(COnfirmPassword);
	}

	@When("User enters {string} as GEnder")
	public void user_enters_as_GEnder(String GEnder) {
	    driver.findElement(By.xpath("(//input[@id='gender'])[2]")).click();
	}

	@When("User enters {string} as EMailAddress")
	public void user_enters_as_EMailAddress(String EMailAddress) {
	    driver.findElement(By.id("emailAddress")).sendKeys(EMailAddress);
	}

	@When("User enters {string} as MObileNumber")
	public void user_enters_as_MObileNumber(String MObileNumber) {
	    driver.findElement(By.id("mobileNumber")).sendKeys(MObileNumber);
	}

	@When("User enters {string} as DOb")
	public void user_enters_as_DOb(String DOb) {
	    driver.findElement(By.xpath("(//input[@id='dob']")).sendKeys(DOb);
	}

	@When("User enters {string} as ADdress")
	public void user_enters_as_ADdress(String ADdress) {
	    driver.findElement(By.id("address")).sendKeys(ADdress);
	}

	@When("User enters {string} as SEcurityQuestion")
	public void user_enters_as_SEcurityQuestion(String SEcurityQuestion) {
	    Select sq= new Select(driver.findElement(By.id("securityQuestion")));
	    sq.selectByValue("411010");
	}

	@When("User enters {string} as ANswer")
	public void user_enters_as_ANswer(String ANswer) {
	    driver.findElement(By.id("answer")).sendKeys(ANswer);
	}

	@Then("clicks on SUbmit Button")
	public void clicks_on_SUbmit_Button() {
	   driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}




}
