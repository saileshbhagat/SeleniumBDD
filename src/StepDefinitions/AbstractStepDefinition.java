package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AbstractStepDefinition {
static WebDriver driver;
	
	@Given("^User has opened website in chrome$")
	public void openBrowser() 	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sailesh\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@And("^user enters username and password$")
	public void enterDetails() {
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();
	}

}
