package steps;

import cucumber.api.java.en.And;
import pages.SelectFlightPage;

public class SelectFlightSteps extends DriverFactory{
	
	@And("^he provides the departure flight as ([^\"]*)$")
	public void he_provides_the_departure_flight_as(String departure) throws Throwable {
		new SelectFlightPage(driver).he_provides_the_departure_flight_as(departure);
	}
	
	@And("^he provides the return flight as ([^\"]*)$")
	public void he_provides_the_retun_flight_as(String arrival) throws Throwable {
		new SelectFlightPage(driver).he_provides_the_arrival_flight_as(arrival);
	}
	
	@And("^he continues to Book Flight$")
	public void he_continues() throws Throwable {
		new SelectFlightPage(driver).he_continues();
	}
}
