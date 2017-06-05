package com.controlpay.ir.stepdefinitions;

import com.controlpay.ir.steps.StudentStepsREST;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by pc on 04.06.2017.
 */
public class StudentRestDefinitionsSteps {

    @Steps
    StudentStepsREST studentStepsREST;

    @Given("user opens student app")
    public void givenUserOpensStudentApp() {

    }

    @When("user send GET request to see all students")
    public void whenUserSendsGetRequest() {
        studentStepsREST.send_get_to_students_list();
    }

    @Then("user sees all registered students")
    public void thenUserSeesAllStudentsList() {
        studentStepsREST.get_all_students_list();
    }
}
