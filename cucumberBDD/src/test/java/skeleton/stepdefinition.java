package skeleton;

import org.junit.Assert;

import cucumberBDD.Person;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdefinition {
	Person Sean = new Person();
	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	    Sean.setDistance(int1);
	  
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	    Sean.setMessage(string);
	   
	}

	@Then("Lucia hears the message {string}")
	public void lucia_hears_the_message(String string) {
	    String message = Sean.getMessage();
	    Assert.assertEquals("Free Coffee",message);
	    
	}
	
	@Then("Lucia hears no message")
	public void lucia_hears_no_message() {
		String message = Sean.getMessage();
	    Assert.assertEquals(null,message);
	}

}
