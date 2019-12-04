package CucumberOptions;

import CucumberOptions.Base;
import cucumber.api.java.After;

public class Hooks extends Base {

    @After("@PositiveCases, @NegativeCases")
    public void Aftervalidation () throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
