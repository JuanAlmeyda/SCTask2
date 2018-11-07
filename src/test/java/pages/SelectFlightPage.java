package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	
	WebDriver driver;
	
	@FindBy(css = "input[value='Unified Airlines$363$281$11:24']")
	private WebElement departureFlightRadio;
	@FindBy(css = "input[value='Unified Airlines$633$303$18:44']")
	private WebElement arrivalFlightRadio;
	@FindBy(name = "reserveFlights")
	private WebElement continueButton;
	
	public SelectFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_provides_the_departure_flight_as(String departure) throws Throwable {
		 departureFlightRadio.click();	
	}
	
	public void he_provides_the_arrival_flight_as(String arrival) throws Throwable {
		 arrivalFlightRadio.click();	
	}
		
	public void he_continues() throws Throwable {
		continueButton.click();
	}
}
