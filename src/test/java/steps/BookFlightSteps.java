package steps;

import cucumber.api.java.en.And;
import pages.BookFlightPage;


public class BookFlightSteps extends DriverFactory{
	
	@And("^he provides the first name as ([^\"]*)$")
	public void he_provides_the_first_name_as(String firstName) throws Throwable {
		new BookFlightPage(driver).he_provides_the_first_name_as(firstName);
	}

	@And("^he provides the last name as ([^\"]*)$")
	public void he_provides_the_last_name_as(String lastName) throws Throwable {
		new BookFlightPage(driver).he_provides_the_last_name_as(lastName);
	}
	
	@And("^he provides the meal as ([^\"]*)$")
	public void he_provides_the_meal_as(String meal) throws Throwable {
		new BookFlightPage(driver).he_provides_the_meal_as(meal);
	}
	
	@And("^he provides the card type as ([^\"]*)$")
	public void he_provides_the_card_type_as(String cardType) throws Throwable {
		new BookFlightPage(driver).he_provides_the_card_type_as(cardType);
	}
	
	@And("^he provides the card number as ([^\"]*)$")
	public void he_provides_the_card_number_as(String cardNumber) throws Throwable {
		new BookFlightPage(driver).he_provides_the_card_number_as(cardNumber);
	}
	
	@And("^he provides the expiration month as ([^\"]*)$")
	public void he_provides_the_expiration_month_as(String expMonth) throws Throwable {
		new BookFlightPage(driver).he_provides_the_expiration_month_as(expMonth);
	}
	
	@And("^he provides the expiration year as ([^\"]*)$")
	public void he_provides_the_expiration_year_as(String expYear) throws Throwable {
		new BookFlightPage(driver).he_provides_the_expiration_year_as(expYear);
	}
	
	@And("^he provides the card first name as ([^\"]*)$")
	public void he_provides_the_card_first_name_as(String cardFirstName) throws Throwable {
		new BookFlightPage(driver).he_provides_the_card_first_name_as(cardFirstName);
	}

	@And("^he provides the card last name as ([^\"]*)$")
	public void he_provides_the_card_last_name_as(String cardLastName) throws Throwable {
		new BookFlightPage(driver).he_provides_the_card_last_name_as(cardLastName);
	}
	
	@And("^he provides the billing address as ([^\"]*)$")
	public void he_provides_the_billing_address_as(String billingAddress) throws Throwable {
		new BookFlightPage(driver).he_provides_the_billing_address_as(billingAddress);
	}
	
	@And("^he provides the billing city as ([^\"]*)$")
	public void he_provides_the_billing_city_as(String billingCity) throws Throwable {
		new BookFlightPage(driver).he_provides_the_billing_city_as(billingCity);
	}
	
	@And("^he provides the billing state as ([^\"]*)$")
	public void he_provides_the_billing_state_as(String billingState) throws Throwable {
		new BookFlightPage(driver).he_provides_the_billing_state_as(billingState);
	}
	
	@And("^he provides the billing postal code as ([^\"]*)$")
	public void he_provides_the_billing_postal_code_as(String billingPostalCode) throws Throwable {
		new BookFlightPage(driver).he_provides_the_billing_postal_code_as(billingPostalCode);
	}
	
	@And("^he provides the billing country as ([^\"]*)$")
	public void he_provides_the_billing_country_as(String billingCountry) throws Throwable {
		new BookFlightPage(driver).he_provides_the_billing_country_as(billingCountry);
	}
	
	@And("^he provides the delivery address as ([^\"]*)$")
	public void he_provides_the_delivery_address_as(String deliveryAddress) throws Throwable {
		new BookFlightPage(driver).he_provides_the_delivery_address_as(deliveryAddress);
	}
	
	@And("^he provides the delivery city as ([^\"]*)$")
	public void he_provides_the_delivery_city_as(String deliveryCity) throws Throwable {
		new BookFlightPage(driver).he_provides_the_delivery_city_as(deliveryCity);
	}
	
	@And("^he provides the delivery state as ([^\"]*)$")
	public void he_provides_the_delivery_state_as(String deliveryState) throws Throwable {
		new BookFlightPage(driver).he_provides_the_delivery_state_as(deliveryState);
	}
	
	@And("^he provides the delivery postal code as ([^\"]*)$")
	public void he_provides_the_delivery_postal_code_as(String deliveryPostalCode) throws Throwable {
		new BookFlightPage(driver).he_provides_the_delivery_postal_code_as(deliveryPostalCode);
	}
	
	@And("^he provides the delivery country as ([^\"]*)$")
	public void he_provides_the_delivery_country_as(String deliveryCountry) throws Throwable {
		new BookFlightPage(driver).he_provides_the_delivery_country_as(deliveryCountry);
	}
	
	@And("^he purchases$")
	public void he_signs_up() throws Throwable {
		new BookFlightPage(driver).he_purchases();
	}
}
