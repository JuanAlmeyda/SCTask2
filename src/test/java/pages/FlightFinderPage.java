package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {
	
WebDriver driver;
	
	@FindBy(name = "passCount")
	private WebElement passengerSelect;
	@FindBy(name = "fromPort")
	private WebElement departingSelect;
	@FindBy(name = "fromMonth")
	private WebElement departureMonthSelect;
	@FindBy(name = "fromDay")
	private WebElement departureDaySelect;
	@FindBy(name = "toPort")
	private WebElement arrivingSelect;
	@FindBy(name = "toMonth")
	private WebElement arrivalMonthSelect;
	@FindBy(name = "toDay")
	private WebElement arrivalDaySelect;
	@FindBy(css = "input[value='Business']")
	private WebElement serviceClassRadio;
	@FindBy(name = "airline")
	private WebElement airlineSelect;
	@FindBy(name = "findFlights")
	private WebElement continueButton;
	
	
	public FlightFinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_provides_the_passengers_as(String passengers) throws Throwable {
		Select dropdown = new Select(passengerSelect);
		dropdown.selectByVisibleText(passengers);	
	}
	
	public void he_provides_the_departing_as(String departing) throws Throwable {
		Select dropdown = new Select(departingSelect);
		dropdown.selectByVisibleText(departing);	
	}
	
	public void he_provides_the_departure_month_as(String departureMonth) throws Throwable {
		Select dropdown = new Select(departureMonthSelect);
		dropdown.selectByVisibleText(departureMonth);	
	}
	
	public void he_provides_the_departure_day_as(String departureDay) throws Throwable {
		Select dropdown = new Select(departureDaySelect);
		dropdown.selectByVisibleText(departureDay);	
	}
	
	public void he_provides_the_arriving_as(String arriving) throws Throwable {
		Select dropdown = new Select(arrivingSelect);
		dropdown.selectByVisibleText(arriving);	
	}
	
	public void he_provides_the_arrival_month_as(String arrivalMonth) throws Throwable {
		Select dropdown = new Select(arrivalMonthSelect);
		dropdown.selectByVisibleText(arrivalMonth);	
	}
	
	public void he_provides_the_arrival_day_as(String arrivalDay) throws Throwable {
		Select dropdown = new Select(arrivalDaySelect);
		dropdown.selectByVisibleText(arrivalDay);	
	}
	
	public void he_provides_the_service_class_as(String service) throws Throwable {
		 serviceClassRadio.click();	
	}
	
	public void he_provides_the_airline_as(String airline) throws Throwable {
		Select dropdown = new Select(airlineSelect);
		dropdown.selectByVisibleText(airline);	
	}
	
	public void he_continues() throws Throwable {
		continueButton.click();
	}
	
	

}
