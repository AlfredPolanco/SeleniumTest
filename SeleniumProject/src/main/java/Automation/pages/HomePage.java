package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;


public class HomePage extends Services{
	
    private String xpathHomeButton = "//*[@id='menu-item-31']/a/span[1]";
    private String xpathH2 = "//h2";
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    public void clickOnHomeButton() {
    	waitForElement(xpathHomeButton);
        click(xpathHomeButton);
    }
    public String getH2Text() {
    	waitForElement(xpathH2);
    	return getText(xpathH2);
    }
	
}
