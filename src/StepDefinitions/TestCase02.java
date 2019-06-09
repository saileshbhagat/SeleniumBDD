package StepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;

public class TestCase02 {
	@When("^user selects (.*) from to port$")
	public void selectDropDown(String countryName) {
		AbstractStepDefinition.driver.findElement(By.xpath("//select[@name='toPort']//option[@value='"+countryName+"']")).click();
	}
	
	@When("^user selects (.*) from AirfLine Preferece$")
	public void selectArlinesDropDown(String selectairlines) {
		AbstractStepDefinition.driver.findElement(By.xpath("//select[@name='airline']//option[contains(text(),'"+selectairlines+"')]")).click();
	}

}
