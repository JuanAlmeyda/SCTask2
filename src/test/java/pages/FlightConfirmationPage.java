package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmationPage {
	
WebDriver driver;
	
	@FindBy(css = "a[href='mercurysignoff.php']")
	private WebElement logOutLink;
	
	public FlightConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isLogOutLinkDisplayed() throws Throwable {
		return logOutLink.isDisplayed();
	}


}
