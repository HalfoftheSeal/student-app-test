package step_definitions;

import io.cucumber.java.en.Given;
import page_objects.AllStudentsPage;

public class MainPageStepDefs {

    AllStudentsPage allStudentsPage = new AllStudentsPage();

    @Given("user click on add student button")
    public void userClickOnAddStudentButton() {
        allStudentsPage.waitAndClickOnAddStudentButton();
    }
}

