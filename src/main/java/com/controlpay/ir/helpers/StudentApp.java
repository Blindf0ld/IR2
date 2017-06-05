package com.controlpay.ir.helpers;

import io.restassured.RestAssured;
import net.thucydides.core.pages.PageObject;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;


/**
 * Created by pc on 04.06.2017.
 */

public class StudentApp extends PageObject {

    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8085;
        RestAssured.basePath = "/student";

    }

    public void getStudentsList() {
        given().log().all().
                when().get("http://localhost:8085/student/list");
    }

    public void checkStudentList() {
        given().log().all().
                when().get("http://localhost:8085/student/list").
                then().statusCode(300);
    }


}
