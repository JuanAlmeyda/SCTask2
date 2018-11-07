package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {
	
	WebDriver driver;
	
	@FindBy(name = "userName")
	private WebElement userNameTextBox;
	@FindBy(name = "password")
	private WebElement passwordTextBox;
	@FindBy(name = "login")
	private WebElement loginButton;
	
	
	public SignOnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void he_provides_the_user_name_as(String user) throws Throwable {
		userNameTextBox.sendKeys(user);
	}
	
	public void he_provides_the_password_as(String password) throws Throwable {
		passwordTextBox.sendKeys(password);
	}
	
	public void he_signs_in() throws Throwable {
		loginButton.click();
	}
}
