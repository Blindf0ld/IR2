package com.controlpay.ir.steps;

import com.controlpay.ir.helpers.StudentApp;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by pc on 04.06.2017.
 */
public class StudentStepsREST extends ScenarioSteps {

    StudentApp studentApp;

    @Step
    public void send_get_to_students_list() {
        studentApp.getStudentsList();
    }

    @Step
    public void get_all_students_list() {
        studentApp.checkStudentList();
    }
}
