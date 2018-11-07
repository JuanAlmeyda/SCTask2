package steps;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.FlightConfirmationPage;


public class FlightConfirmationSteps extends DriverFactory{
	
	@Then("^he should get his flight confirmation$")
	public void he_should_get_a_welcome_message() throws Throwable {
		Assert.assertTrue(new FlightConfirmationPage(driver).isLogOutLinkDisplayed());
	}
}
