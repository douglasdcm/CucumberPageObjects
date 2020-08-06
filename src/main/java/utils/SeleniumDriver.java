package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	//init webDriver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	
	//define the driver inside the constructor
	private SeleniumDriver() {
		
		driver =  new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200,765));
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);		

	}
	
	public static void openPage(String url) {
		
		driver.get(url);
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
		
	}
	
	
	public static void setUpDriver() {
		
		if(seleniumDriver==null) {
			
			seleniumDriver =  new SeleniumDriver();
			
		}
		
	}
	
	public static void tearDown() {
		
		if (driver != null) {
			//driver.close();
			driver.quit();
		}
		
		seleniumDriver = null;
		
	}
	
/*
	private WebDriver driver;
	
	public WebDriver getDriver(String url) {
		driver.get(url);
		return driver;
	}
	
	public SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));		
	}
	
	*/
	
	
}
