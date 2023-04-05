package step_definitions;

import io.cucumber.java.en.Given;

import static utils.ConfigHelper.getConfig;
import static utils.DriverManager.getInstance;

public class CommonStepDefs {
    @Given("user is on the app page")
    public void userIsOnTheAppPage() {
        getInstance().get(getConfig().getString("student.app.hostname"));
    }
}
