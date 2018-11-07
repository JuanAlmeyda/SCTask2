package steps;

import cucumber.api.java.en.And;
import pages.SignOnPage;

public class SignOnSteps extends DriverFactory{
	
	@And("^he provides the user name as ([^\"]*)$")
	public void he_provides_the_user_name_as(String userName) throws Throwable {
		new SignOnPage(driver).he_provides_the_user_name_as(userName);
	}
	
	@And("^he provides the user password as ([^\"]*)$")
	public void he_provides_the_password_as(String password) throws Throwable {
		new SignOnPage(driver).he_provides_the_password_as(password);
	}
	
	@And("^he signs-in$")
	public void he_signs_up() throws Throwable {
		new SignOnPage(driver).he_signs_in();
	}
}
