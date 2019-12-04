package Stepdefinition;


import Constants.PageConstants;
import CucumberOptions.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepDefs extends PageFunctions {
    public WebDriver driver;
    public WebDriverWait webDriverWait;

    @Given("^User is on landing page \"([^\"]*)\"$")
    public void user_is_on_landing_page_something(String page) throws Throwable {
        driver = Base.getDriver();
        webDriverWait =Base.getWait();
        driver.get(page);
        driver.manage().window().fullscreen();
        assertTrue(driver.getCurrentUrl().contains(page), "Wrong link");
    }

    @And("^Navigate to login page$")
    public void navigate_to_login_page() throws Throwable {
        clickButton(PageConstants.CLOSE_POP_UP);
        mouseOver(PageConstants.HOME_PAGE_SIGN_IN_BUTTON);
        clickButton(PageConstants.SIGN_IN_BUTTON);
    }
    @Then("^Login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_something_and_something(String email, String password) throws Throwable {
        sendKey(PageConstants.EMAIL_INPUT,email);
        sendKey(PageConstants.PASSWORD_INPUT,password);
        clickButton(PageConstants.LOGIN_PAGE_SIGN_IN_BUTTON);
    }
    @And("^Logout the User$")
    public void logout_the_user() throws Throwable {
        getWait().until(ExpectedConditions.elementToBeClickable(PageConstants.MY_ACCOUNT));
        WebElement element = driver.findElement(PageConstants.MY_ACCOUNT);
        assertTrue(element.isDisplayed(), "User failed to login successfully");
        clickButton(PageConstants.LOGOUT);
    }
    @Then("^Login with wrong email \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_wrong_email_something_and_something(String email, String password) throws Throwable {
        sendKey(PageConstants.EMAIL_INPUT,email);
        sendKey(PageConstants.PASSWORD_INPUT,password);
        clickButton(PageConstants.LOGIN_PAGE_SIGN_IN_BUTTON);
        getWait().until(ExpectedConditions.elementToBeClickable(PageConstants.WARNING_POP_UP));
        WebElement element = driver.findElement(PageConstants.WARNING_POP_UP);
        assertTrue(element.isDisplayed(), "Error message cannot be displayed");
        clickButton(PageConstants.WARNING_POP_UP_CLOSE);
        clearText(PageConstants.EMAIL_INPUT);
        clearText(PageConstants.PASSWORD_INPUT);
    }

    @Then("^Login with wrong email and password \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_wrong_email_and_password_something_and_something(String email, String password) throws Throwable {
        sendKey(PageConstants.EMAIL_INPUT,email);
        sendKey(PageConstants.PASSWORD_INPUT,password);
        clickButton(PageConstants.LOGIN_PAGE_SIGN_IN_BUTTON);
        getWait().until(ExpectedConditions.elementToBeClickable(PageConstants.WARNING_POP_UP));
        WebElement element = driver.findElement(PageConstants.WARNING_POP_UP);
        assertTrue(element.isDisplayed(), "Error message cannot be displayed");
        clickButton(PageConstants.WARNING_POP_UP_CLOSE);
        clearText(PageConstants.EMAIL_INPUT);
        clearText(PageConstants.PASSWORD_INPUT);
    }

    @And("^Login with wrong password \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_wrong_password_something_and_something(String email, String password) throws Throwable {
        sendKey(PageConstants.EMAIL_INPUT,email);
        sendKey(PageConstants.PASSWORD_INPUT,password);
        clickButton(PageConstants.LOGIN_PAGE_SIGN_IN_BUTTON);
        getWait().until(ExpectedConditions.elementToBeClickable(PageConstants.WARNING_POP_UP));
        WebElement element = driver.findElement(PageConstants.WARNING_POP_UP);
        assertTrue(element.isDisplayed(), "Error message cannot be displayed");
        clickButton(PageConstants.WARNING_POP_UP_CLOSE);
        clearText(PageConstants.EMAIL_INPUT);
        clearText(PageConstants.PASSWORD_INPUT);
    }

}
