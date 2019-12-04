package Stepdefinition;

import Constants.PageConstants;
import CucumberOptions.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageFunctions extends Base {


    public void clickButton(By by){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    public void sendKey(By by, String keys){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(keys);
    }
    public void mouseOver(By by){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);
        action.moveToElement(element).perform();
    }
    public void clearText(By by){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).clear();
    }

    public void assertTrue(boolean condition, String message) {
        Assert.assertTrue(message, condition);
    }

    public void assertEqual(boolean condition, String message) {
        Assert.assertEquals(message,condition,condition);
    }
}

