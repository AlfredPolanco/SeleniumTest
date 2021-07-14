package Automation.pages;

import Automation.utility.Services;
import org.openqa.selenium.WebDriver;

public class SolutionsPage extends Services{
	
    private String xpathH2 = "//h2";
    private String xpathH2Pointof = "//*[@id='et-boc']/div/div/div[1]/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/h2";
	private String xpathSolutions = "//*[@id='menu-item-3240']/a/span[1]";
	private String xpathInnovationSquad = "//*[@id='menu-item-3248']/a/span[1]";
	private String xpathITBusinessTrans = "//*[@id='menu-item-3247']/a/span[1]";
	private String xpathCustomerSoftDev = "//*[@id='menu-item-3249']/a/span[1]";
	private String xpathAgentStaffAug = "//*[@id='menu-item-3250']/a/span[1]";
	private String xpathITSupportService = "//*[@id='menu-item-4115']/a/span[1]";
///	private String xpathITFoundation = "//*[@id='menu-item-3253']/a/span[1]";
//	private String xpathITFoundation = "//*[@id='menu-item-4115']/a/span[2]";
//	private String xpathITProtecionSupport = "//*[@id='menu-item-3254']/a/span[1]";
//	private String xpathCompareProduct = "//*[@id='menu-item-3255']/a/span[1]";
	private String xpathITNetworkSolutions = "//*[@id='menu-item-3252']/a/span[1]";
    
    public SolutionsPage(WebDriver driver) {
        super(driver);
    }
    public void hoverOverSolutions() {
    	waitForElement(xpathSolutions);
    	hoverOver(xpathSolutions);
    }
    public void clickOnInnovationSquadButton() {
    	waitForElement(xpathInnovationSquad);
        click(xpathInnovationSquad);
    }
    public void clickOnITBusinessTransButton() {
    	waitForElement(xpathITBusinessTrans);
        click(xpathITBusinessTrans);
    }
    public void clickOnCustomerSoftDevButton() {
    	waitForElement(xpathCustomerSoftDev);
        click(xpathCustomerSoftDev);
    }
    public void clickOnAgentStaffAugButton() {
    	waitForElement(xpathAgentStaffAug);
        click(xpathAgentStaffAug);
    }
    public void clickOnITSupportServiceButton() {
    	waitForElement(xpathITNetworkSolutions);
    	click(xpathITNetworkSolutions);
    }

    public void clickOnITNetworkSolutionButton() {
    	waitForElement(xpathITSupportService);
        click(xpathITSupportService);
    }
    public String getH2Text() {
    	waitForElement(xpathH2);
    	return getText(xpathH2);
    }
    public String getH2TextPointDiff() {
    	waitForElement(xpathH2Pointof);
    	return getText(xpathH2Pointof);
    }

}
