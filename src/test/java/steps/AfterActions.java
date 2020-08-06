package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterActions {

	@After
	public static void tearDown(Scenario scenario) {
		
		
		//take snapshots before tearDown
		if (scenario.isFailed()) {
			byte[] screeshotBytes = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screeshotBytes, "image/png");
		}
		
		SeleniumDriver.tearDown();
		
	}
	
}
