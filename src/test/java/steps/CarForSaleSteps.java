package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class CarForSaleSteps {

	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();
	
	@Given("^I am on home page of https://www\\.cars\\.com/$")
	public void i_am_on_home_page_of_https_www_cars_com() throws Throwable {
	    
		
		SeleniumDriver.openPage("https://www.cars.com");
		
	}

	@When("^I select Cars for Sale$")
	public void i_select_Cars_for_Sale() throws Throwable {
		
		carsGuideHomePageActions.clickOnCarsForSaleMenu();		
		
	}

	@Then("^I select the car usage \"([^\"]*)\"$")
	public void i_select_the_car_usage(String usage) throws Throwable {
		
		carsSearchPageActions.selectUsageDropDown(usage);
		
	}

	@Then("^I select the Make as \"([^\"]*)\"$")
	public void i_select_the_Make_as(String carsBrand) throws Throwable {

		carsSearchPageActions.selectMakeDropDown(carsBrand);
		
	}

	@Then("^I select the model as \"([^\"]*)\"$")
	public void i_select_the_model_as(String model) throws Throwable {

		carsSearchPageActions.selectModelDropDown(model);
		
	}

	@Then("^I select the Max price as \"([^\"]*)\"$")
	public void i_select_the_Max_price_as(String price) throws Throwable {

		carsSearchPageActions.selectPriceDropDown(price);
		
	}

	@Then("^I select the driven miles as \"([^\"]*)\"$")
	public void i_select_the_driven_miles_as(String miles) throws Throwable {

		carsSearchPageActions.selectMilesDropDown(miles);
		
	}

	@Then("^I inform the zip code as \"([^\"]*)\"$")
	public void i_inform_the_zip_code_as(String zipCode) throws Throwable {

		carsSearchPageActions.insertZipCode(zipCode);
		
	}

	@Then("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {

		carsSearchPageActions.searchCars();
		
	}

	@Then("^I should see a list of searched car from \"([^\"]*)\"$")
	public void i_should_see_a_list_of_searched_car_from(String arg1) throws Throwable {

		System.out.println("Found");
		
	}

	@Then("^The title of page should be \"([^\"]*)\"$")
	public void the_title_of_page_should_be(String expectedTitle) throws Throwable {

		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}


	
}
