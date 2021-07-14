package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class WhoWeArePage extends Services{
	
	private String xpathWhoWeAre = "//*[@id='menu-item-3241']/a/span[1]";
	private String xpathAboutUs = "//*[@id='menu-item-3243']/a/span[1]";
	private String xpathPointOfDiff = "//*[@id='menu-item-3242']/a/span[1]";
	private String xpathBlog = "//*[@id='menu-item-4661']/a/span[1]";

    public WhoWeArePage(WebDriver driver) {
        super(driver);
    }
    
    public void hoverOverWhoWeAre() {
    	waitForElement(xpathWhoWeAre);
    	hoverOver(xpathWhoWeAre);
    }
    public void clickOnAboutUsButton() {
    	waitForElement(xpathAboutUs);
    	click(xpathAboutUs);
    }
    public void clickOnPointOfDiffButton() {
    	waitForElement(xpathPointOfDiff);
    	click(xpathPointOfDiff);
    }
    public void clickOnBlogButton() {
    	waitForElement(xpathBlog);
    	click(xpathBlog);
    }
}
