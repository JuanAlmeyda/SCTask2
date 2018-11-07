package steps;

import cucumber.api.java.en.When;
import pages.LandingPage;

public class LandingSteps extends DriverFactory{
	
	@When("^he chooses to sign on$")
	public void he_chooses_to_sign_on() throws Throwable {
		new LandingPage(driver).he_chooses_to_sign_on();
	}

}
