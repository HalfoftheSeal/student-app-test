import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import utils.DriverManager;

@CucumberOptions(tags = "@SMOKE",
        features = {"src/test/resources/features/"},
        glue = {"step_definitions"},
        plugin = {"html:target/cucumber-reports.html"})
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        DriverManager.closeDriver();
    }
}