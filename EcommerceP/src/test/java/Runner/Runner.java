package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = "StepDefs",
        tags = "@smoke",
        plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
        monochrome = true
)
public class Runner {
}
