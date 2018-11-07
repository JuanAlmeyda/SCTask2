package steps;

import cucumber.api.java.en.And;
import pages.FlightFinderPage;

public class FlightFinderSteps extends DriverFactory{
	
	@And("^he provides the passengers as ([^\"]*)$")
	public void he_provides_the_country_as(String passengers) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_passengers_as(passengers);
	}
	
	@And("^he provides the departing as ([^\"]*)$")
	public void he_provides_the_departing_as(String departing) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_departing_as(departing);
	}
	
	@And("^he provides the departure month as ([^\"]*)$")
	public void he_provides_the_departure_month_as(String departureMonth) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_departure_month_as(departureMonth);
	}
	
	@And("^he provides the departure day as ([^\"]*)$")
	public void he_provides_the_departure_day_as(String departureDay) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_departure_day_as(departureDay);
	}
	
	@And("^he provides the arriving as ([^\"]*)$")
	public void he_provides_the_arriving_as(String arriving) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_arriving_as(arriving);
	}
	
	@And("^he provides the arrival month as ([^\"]*)$")
	public void he_provides_the_arrival_month_as(String arrivalMonth) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_arrival_month_as(arrivalMonth);
	}
	
	@And("^he provides the arrival day as ([^\"]*)$")
	public void he_provides_the_arrival_day_as(String arrivalDay) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_arrival_day_as(arrivalDay);
	}
	
	@And("^he provides the service class as ([^\"]*)$")
	public void he_provides_the_service_class_as(String service) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_service_class_as(service);
	}
	
	@And("^he provides the airline as ([^\"]*)$")
	public void he_provides_the_airline_as(String airline) throws Throwable {
		new FlightFinderPage(driver).he_provides_the_airline_as(airline);
	}
	
	@And("^he continues to Select Flight$")
	public void he_continues() throws Throwable {
		new FlightFinderPage(driver).he_continues();
	}
	
}
