package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends Services{
	
    private String locationTemperature = "//span[@id='wob_tm']";
	private String weatherIcon = "//div[@id='wob_loc']";
	
    public ResultsPage(WebDriver driver) {
        super(driver);
    }
    public void checkForWeatherInfo() {
    	waitForElement(weatherIcon);
        waitForElement(locationTemperature);
    }
    public String getTemperature() {
    	return getText(locationTemperature);
    }
}
