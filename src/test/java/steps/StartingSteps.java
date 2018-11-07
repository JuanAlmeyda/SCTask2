package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory{
	
	@Before
	public void presetup() {
		String projectLocation = System.getProperty("user.dir"); 
		System.setProperty("webdriver.gecko.driver",projectLocation+"\\src\\lib\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","src/lib/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^the user is on landing page$")
	public void setup() throws Throwable {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}
}
