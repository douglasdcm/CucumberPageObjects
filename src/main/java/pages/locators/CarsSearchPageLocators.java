package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchPageLocators {
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-stock-type > select")
	public WebElement carsUsageDropDown;
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-make > select")
	public WebElement carsMakeDropDown;
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-model > select")
	public WebElement carsModelDropDown;
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-miles > select")
	public WebElement carsMilesDropDown;
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-price > select")
	public WebElement carsPriceDropDown;
	
	@FindBy(how=How.CSS, using="div#search-widget-dropdowns--make div.sw-input.sw-zip > input")
	public WebElement zipCodeField;
	
	@FindBy(how=How.ID, using="search-widget-submit")
	public WebElement searchBtn;

}

/*
 * 
 * package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarsForSaleSteps {
	
	private static WebDriver driver;
	
	@Before
	public void setUp() {
		
		 driver = new FirefoxDriver();
		 driver.manage().window().setSize(new Dimension(1200, 765));
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if (scenario.isFailed()) {
			byte[] screeshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screeshotBytes, "image/png");
		}
		
		if(driver != null) {
			driver.quit();
		}
		
	}
	
	
	@Given("^I am on home page of https://www\\.cars\\.com/$")
	public void i_am_on_home_page_of_https_www_cars_com() throws Throwable {
	    
		driver.get("https://www.cars.com");
	    
	}

	@When("^I select Cars for Sale$")
	public void i_select_Cars_for_Sale() throws Throwable {
	    
	    driver.findElement(By.xpath(".//ul[@class='_1U4gk']//*[@data-linkname='header-buy']")).click();
	}

	@Then("^I select the car usage \"([^\"]*)\"$")
	public void i_select_the_car_usage(String usage) throws Throwable {
		
		//Thread.sleep(10000);
		
		WebElement element = driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-stock-type > select"));
		Select select = new Select(element);
		select.selectByVisibleText(usage);
	    
	}

	@Then("^I select the Make as \"([^\"]*)\"$")
	public void i_select_the_Make_as(String make) throws Throwable {
	    
		WebElement element = driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-make > select"));
		Select select = new Select(element);
		select.selectByVisibleText(make);
	    
	}

	@Then("^I select the model as \"([^\"]*)\"$")
	public void i_select_the_model_as(String model) throws Throwable {
	    
	    WebElement element = driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-model > select"));
	    Select select = new Select(element);
		select.selectByVisibleText(model);
		
	}

	@Then("^I select the Max price as \"([^\"]*)\"$")
	public void i_select_the_Max_price_as(String price) throws Throwable {
	    
		Thread.sleep(1000);
		System.out.println(price);
	    WebElement element = driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-price > select"));
	    Select select = new Select(element);
	    select.selectByValue("40000");
		
	}

	@Then("^I select the driven miles as \"([^\"]*)\"$")
	public void i_select_the_driven_miles_as(String miles) throws Throwable {
	    
	    WebElement element = driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-miles > select"));
	    Select select = new Select(element);
	    select.selectByVisibleText(miles);
		
	}

	@Then("^I inform the zip code as \"([^\"]*)\"$")
	public void i_inform_the_zip_code_as(String zipCode) throws Throwable {
	    
		driver.findElement(By.cssSelector("div#search-widget-dropdowns--make div.sw-input.sw-zip > input")).sendKeys(zipCode);;
	    
	}

	@Then("^I click on Search button$")
	public void i_click_on_Search_button() throws Throwable {
	    
	    driver.findElement(By.id("search-widget-submit")).click();
		
	}

	@Then("^I should see a list of searched car from \\\"([^\\\"]*)\\\"$")
	public void i_should_see_a_list_of_searched_cars(String cars) throws Throwable {
	    
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.cssSelector("div#srp-listing-rows-container div:nth-child(5) > a > div > div.listing-row__details > h2"));
		Assert.assertTrue(element.getText().contains(cars));
	    
	}
	
	@Then("^The title of page should be \"([^\"]*)\"$")
	public void the_title_of_page_should_be(String title) throws Throwable {
		
		//atualizar o driver?
		Thread.sleep(5000);
		Assert.assertEquals(title, driver.getTitle());
	}
	
}

 * 
 * */
