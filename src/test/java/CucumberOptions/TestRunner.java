package CucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="Stepdefinition",tags="@PositiveCases, @NegativeCases",
        monochrome=true)

public class TestRunner { }