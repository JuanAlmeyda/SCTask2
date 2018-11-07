package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPage {
	
	WebDriver driver;
	
	@FindBy(name = "passFirst0")
	private WebElement firstNameTextBox;
	@FindBy(name = "passLast0")
	private WebElement lastNameTextBox;
	@FindBy(name = "pass.0.meal")
	private WebElement mealSelect;
	@FindBy(name = "creditCard")
	private WebElement cardTypeSelect;
	@FindBy(name = "creditnumber")
	private WebElement cardNumberTextBox;
	@FindBy(name = "cc_exp_dt_mn")
	private WebElement expMonthSelect;
	@FindBy(name = "cc_exp_dt_yr")
	private WebElement expYearSelect;
	@FindBy(name = "cc_frst_name")
	private WebElement cardFirstNameTextBox;
	@FindBy(name = "cc_last_name")
	private WebElement cardLastNameTextBox;
	@FindBy(name = "billAddress1")
	private WebElement billingAddressTextBox;
	@FindBy(name = "billCity")
	private WebElement billingCityTextBox;
	@FindBy(name = "billState")
	private WebElement billingStateTextBox;
	@FindBy(name = "billZip")
	private WebElement billingPostalCodeTextBox;
	@FindBy(name = "billCountry")
	private WebElement billingCountrySelect;
	@FindBy(name = "delAddress1")
	private WebElement deliveryAddressTextBox;
	@FindBy(name = "delCity")
	private WebElement deliveryCityTextBox;
	@FindBy(name = "delState")
	private WebElement deliveryStateTextBox;
	@FindBy(name = "delZip")
	private WebElement deliveryPostalCodeTextBox;
	@FindBy(name = "delCountry")
	private WebElement deliveryCountrySelect;
	@FindBy(name = "buyFlights")
	private WebElement purchaseButton;
	
	public BookFlightPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_provides_the_first_name_as(String firstName) throws Throwable {
		firstNameTextBox.sendKeys(firstName);
	}

	public void he_provides_the_last_name_as(String lastName) throws Throwable {
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void he_provides_the_meal_as(String meal) throws Throwable {
		Select dropdown = new Select(mealSelect);
		dropdown.selectByVisibleText(meal);	
	}
	
	public void he_provides_the_card_type_as(String cardType) throws Throwable {
		Select dropdown = new Select(cardTypeSelect);
		dropdown.selectByVisibleText(cardType);	
	}
	
	public void he_provides_the_card_number_as(String cardNumber) throws Throwable {
		cardNumberTextBox.sendKeys(cardNumber);
	}
	
	public void he_provides_the_expiration_month_as(String expirationMonth) throws Throwable {
		Select dropdown = new Select(expMonthSelect);
		dropdown.selectByVisibleText(expirationMonth);	
	}
	public void he_provides_the_expiration_year_as(String expirationYear) throws Throwable {
		Select dropdown = new Select(expYearSelect);
		dropdown.selectByVisibleText(expirationYear);	
	}
	
	public void he_provides_the_card_first_name_as(String cardFirstName) throws Throwable {
		cardFirstNameTextBox.sendKeys(cardFirstName);
	}

	public void he_provides_the_card_last_name_as(String cardLastName) throws Throwable {
		cardLastNameTextBox.sendKeys(cardLastName);
	}
	
	public void he_provides_the_billing_address_as(String billingAddress) throws Throwable {
		billingAddressTextBox.sendKeys(billingAddress);
	}
	
	public void he_provides_the_billing_city_as(String billingCity) throws Throwable {
		billingCityTextBox.sendKeys(billingCity);
	}
	
	public void he_provides_the_billing_state_as(String billingState) throws Throwable {
		billingStateTextBox.sendKeys(billingState);
	}
	
	public void he_provides_the_billing_postal_code_as(String billingPostalCode) throws Throwable {
		billingPostalCodeTextBox.sendKeys(billingPostalCode);
	}
	
	public void he_provides_the_billing_country_as(String billingCountry) throws Throwable {
		Select dropdown = new Select(billingCountrySelect);
		dropdown.selectByVisibleText(billingCountry.trim().toUpperCase());
		
	}
	
	public void he_provides_the_delivery_address_as(String deliveryAddress) throws Throwable {
		deliveryAddressTextBox.sendKeys(deliveryAddress);
	}
	
	public void he_provides_the_delivery_city_as(String deliveryCity) throws Throwable {
		deliveryCityTextBox.sendKeys(deliveryCity);
	}
	
	public void he_provides_the_delivery_state_as(String deliveryState) throws Throwable {
		deliveryStateTextBox.sendKeys(deliveryState);
	}
	
	public void he_provides_the_delivery_postal_code_as(String deliveryPostalCode) throws Throwable {
		deliveryPostalCodeTextBox.sendKeys(deliveryPostalCode);
	}
	
	public void he_provides_the_delivery_country_as(String deliveryCountry) throws Throwable {
		Select dropdown = new Select(deliveryCountrySelect);
		dropdown.selectByVisibleText(deliveryCountry.trim().toUpperCase());
		
	}
	
	public void he_purchases() throws Throwable {
		purchaseButton.click();
	}
		
}
