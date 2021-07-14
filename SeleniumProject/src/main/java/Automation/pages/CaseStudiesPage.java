package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class CaseStudiesPage extends Services{
	
    private String xpathH2 = "//h2";
	private String xpathCaseStudies = "//*[@id='menu-item-353']/a/span[1]";
	
    public CaseStudiesPage(WebDriver driver) {
        super(driver);
    }
    public void clickCaseStudiesButton() {
    	waitForElement(xpathCaseStudies);
    	click(xpathCaseStudies);
    }
    public String getH2Text() {
    	waitForElement(xpathH2);
    	return getText(xpathH2);
    }
}
