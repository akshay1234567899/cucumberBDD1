package testrunner;

import cucumber.api.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Feature/",
        features = {"/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Feature/Customer.feature"},
        glue ="stepdefination",
        monochrome = true,
        dryRun = false,
        tags = "@regression",
//        tags = "@sanity or @regression",
        plugin = {"pretty","html:target/cucumber-reports/reports1.html"}

)

public class Testrunner {

}