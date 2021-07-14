package Automation.testcases;

import Automation.pages.HomePage;
import Automation.pages.SolutionsPage;
import Automation.pages.WhoWeArePage;
import Automation.pages.CaseStudiesPage;
import Automation.pages.CareersPage;
import Automation.utility.Init;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GBHWebTest extends Init{
	@Test
	public void clickOnTabs() {
		//Goes to HomePage and clicks on Home
        HomePage homePage = new HomePage(driver);
        String h2HomePage = "We transform businesses. \n"
        		+ "Measuring our achievements by their impact.";
        String h2TexthomePage = homePage.getH2Text();
        assertEquals(h2HomePage, h2TexthomePage);
        homePage.clickOnHomeButton();
        
		//Hovers on Solutions Page clicks the subpages
        SolutionsPage solutionsPage = new SolutionsPage(driver);
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnInnovationSquadButton();
        String h2TextsolutionsPage = solutionsPage.getH2Text();
        String h2InnovationSquad = "Tech-enabled Innovation";
        assertEquals(h2TextsolutionsPage, h2InnovationSquad);
        
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnITBusinessTransButton();
        String h2TextITBusinessTrans = solutionsPage.getH2Text();
        String h2ITBusinessTrans = "You’re moving fast. We’ve got a board-level vCIO to get you there faster.";
        assertEquals(h2TextITBusinessTrans, h2ITBusinessTrans);
        
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnCustomerSoftDevButton();
        String h2TextCustomerSoftDev = solutionsPage.getH2Text();
        String h2CustomerSoftDev = "Custom Software Development";
        assertEquals(h2TextCustomerSoftDev, h2CustomerSoftDev);
        
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnAgentStaffAugButton();
        String h2TextAgentStaffAug = solutionsPage.getH2Text();
        String h2AgentStaffAug = "Staff Augmentation";
        assertEquals(h2TextAgentStaffAug, h2AgentStaffAug);
        
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnITSupportServiceButton();
        
        solutionsPage.hoverOverSolutions();
        solutionsPage.clickOnITNetworkSolutionButton();
		String h2TextITNetworkSolution = solutionsPage.getH2Text();
		String h2ITSupportService = "From design to implementation and support.\n"
				+ "Full-Service Network Solutions that increase your business’ stability and security.";
		assertEquals(h2TextITNetworkSolution, h2ITSupportService);
   
        //Goes to Who we are and subpages
        WhoWeArePage whoWeArePage = new WhoWeArePage(driver);
        whoWeArePage.hoverOverWhoWeAre();
        whoWeArePage.clickOnAboutUsButton();
		String h2TextAboutUs = solutionsPage.getH2Text();
		String h2AboutUs = "We’re driven by an earnest belief";
		assertEquals(h2TextAboutUs, h2AboutUs);
		
        whoWeArePage.hoverOverWhoWeAre();
        whoWeArePage.clickOnPointOfDiffButton();
		String h2TextPointOfDiff = solutionsPage.getH2TextPointDiff();
		String h2PointOfDiff = "Devoted to delivering results...";
		assertEquals(h2TextPointOfDiff, h2PointOfDiff);
		
        whoWeArePage.hoverOverWhoWeAre();
        whoWeArePage.clickOnBlogButton();
		String h2TextBlog = solutionsPage.getH2Text();
		String h2Blog = "Our latest insights on the strategic use of tech to amplify your impact.";
		assertEquals(h2TextBlog, h2Blog);
        
        //Goes to Case Studies Page
        CaseStudiesPage caseStudies = new CaseStudiesPage(driver);
        caseStudies.clickCaseStudiesButton();
		String h2TextCaseStudies = caseStudies.getH2Text();
		String h2CaseStudies = "We deliver market-ready tech that defines industries.";
		assertEquals(h2TextCaseStudies, h2CaseStudies);
        
        //Goes to Case Studies Page
        CareersPage careersPage = new CareersPage(driver);
        careersPage.clickCareersButton();
        caseStudies.clickCaseStudiesButton();
		String h2TextCareers = careersPage.getH2Text();
		String h2Casreers = "We deliver market-ready tech that defines industries.";
		assertEquals(h2TextCareers, h2Casreers);

    }
}
