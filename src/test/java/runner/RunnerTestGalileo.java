package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/galileo.html","json:reports/galileo.json"},
        features ={"src/test/resources"},
        tags = "@login or @web",
        glue = {"stepDef"}
)

public class RunnerTestGalileo {
}
