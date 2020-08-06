package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarsSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {

	CarsSearchPageLocators carsSearchPageLocators = null;
	
	public CarsSearchPageActions() {
		
		this.carsSearchPageLocators = new CarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsSearchPageLocators);		
		
	}
	
	public void selectUsageDropDown(String carsUsage) {
		
		Select select = new Select(carsSearchPageLocators.carsUsageDropDown);
		select.selectByVisibleText(carsUsage);
	}
	
	public void selectMakeDropDown(String carsBrand) {
		
		Select select = new Select(carsSearchPageLocators.carsMakeDropDown);
		select.selectByVisibleText(carsBrand);
	}
	
	public void selectModelDropDown(String carsModel) {
		
		Select select = new Select(carsSearchPageLocators.carsModelDropDown);
		select.selectByVisibleText(carsModel);
	}
	
	public void selectPriceDropDown(String carsPrice) {
		
		Select select = new Select(carsSearchPageLocators.carsPriceDropDown);
		select.selectByVisibleText(carsPrice);
	}
	
	public void selectMilesDropDown(String carsMiles) {
		
		Select select = new Select(carsSearchPageLocators.carsMilesDropDown);
		select.selectByVisibleText(carsMiles);
	}
	
	public void searchCars() {
		
		carsSearchPageLocators.searchBtn.click();

	}
	
	public void insertZipCode(String zipCode) {
		
		carsSearchPageLocators.zipCodeField.sendKeys(zipCode);

	}
	
}
