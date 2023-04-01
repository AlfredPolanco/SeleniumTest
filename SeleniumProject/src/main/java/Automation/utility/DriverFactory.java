package Automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {

    public WebDriver getDriver() {
        String browser = System.getProperty("browser");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//resources//chromedriver");
        if (browser == null)
            browser = "chrome";

        if (browser.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser.equalsIgnoreCase("ie"))
            return new InternetExplorerDriver();
        else {
            //FirefoxProfile ffprofile = createFirefoxProfile();
            return new FirefoxDriver();
        }
    }
}
