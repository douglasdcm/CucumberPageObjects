package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

	@FindBy(how=How.CSS, using="nav > ul > li:nth-child(1) > a")
	public WebElement carsForSaleLink;
	
	@FindBy(how=How.LINK_TEXT, using="Sell My Car")
	public WebElement sellMyCarLink;
	
	@FindBy(how=How.LINK_TEXT, using="Cars Reviews")
	public WebElement carReviewsLink;
	
	@FindBy(how=How.LINK_TEXT, using="Search Cars")
	public WebElement searchCarsLink;	
	
}
