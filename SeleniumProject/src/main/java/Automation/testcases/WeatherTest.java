package Automation.testcases;

import Automation.pages.GoogleHomePage;
import Automation.pages.ResultsPage;
import Automation.utility.Init;
import Automation.utility.OpenWeatherMapAPI;
import Automation.utility.TempObj;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class WeatherTest extends Init{
	@Test
	public void checkWeather() {
        //Visits the google home page and types San FrancISCO, California
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        assertEquals(googleHomePage.getURL(), "https://www.google.com/");
        googleHomePage.checkForWeather();

        //Get location Temperature
        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.checkForWeatherInfo();
        System.out.println("Google Weather: " + resultsPage.getTemperature());

        //Calls the OpenWeatherMapAPI
        OpenWeatherMapAPI openWeatherMapAPI = new OpenWeatherMapAPI();
        System.out.println("OpenWeatherMapAPI: " + openWeatherMapAPI.getAPIData());

        //Adding values to the Temp Obj
        TempObj tempObj = new TempObj(resultsPage.getTemperature(), openWeatherMapAPI.getAPIData());
        System.out.println(tempObj.tempDiff());
    }
}
