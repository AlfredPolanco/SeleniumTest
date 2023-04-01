package Automation.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Services {
	
    protected WebDriver driver;

    public Services(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElement(String locator) {
        Duration timeout = Duration.ofSeconds(10);
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    protected void click(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    protected void type(String locator, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }
    protected void hoverOver(String locator) {
    	Actions action = new Actions(driver);
    	action.moveToElement(driver.findElement(By.xpath(locator))).perform();
    }
    public String getText(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }
}
