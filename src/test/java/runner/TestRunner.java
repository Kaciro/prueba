package runner;

import pageObjects.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//         plugin ={"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@Demo"
)

public class TestRunner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}

