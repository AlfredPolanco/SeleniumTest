package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class CareersPage extends Services{
	
    private String xpathH2 = "//h2";
	private String xpathCareers = "//*[@id='menu-item-475']/a/span[1]";
	
	public CareersPage(WebDriver driver) {
        super(driver);
    }
	
    public void clickCareersButton() {
    	waitForElement(xpathCareers);
    	click(xpathCareers);
    }
    public String getH2Text() {
    	waitForElement(xpathH2);
    	return getText(xpathH2);
    }
}
