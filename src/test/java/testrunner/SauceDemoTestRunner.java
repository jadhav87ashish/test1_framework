package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@123",
        features = "src/test/java/features/",
//        glue = {"steps", "hooks"},
                glue = {"stepdefinitions"},

        plugin = { "pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml"
//                "io.meta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true)
        
        
//        features = "src/test/java/features/",
//        tags = "@123",
//        plugin = {"pretty"})
public class SauceDemoTestRunner {

}

