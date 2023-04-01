package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends Services{
	
    private String searchBar = "//input[@name='q']";
	private String googleSearchButton = "//input[@name='btnK']";
	
	public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void checkForWeather() {
    	waitForElement(searchBar);
    	type(searchBar, "Weather in San Francisco, California");
        click(googleSearchButton);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
