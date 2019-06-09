package StepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.When;

public class TesCase01 {
	@When("^I select oneway$")
	public void oneway()
	{
		AbstractStepDefinition.driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}

}
