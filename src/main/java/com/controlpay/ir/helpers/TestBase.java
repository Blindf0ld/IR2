package com.controlpay.ir.helpers;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by Plugatarenko Kate on 29-May-17.
 */
public class TestBase extends PageObject {

    protected static WebDriver driver;

    /*@BeforeClass
    public static void beforeClass(){initialization();

    }

    private static void initialization() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        RestAssured.basePath = "/student";
        *//*System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();*//*

        System.setProperty("webdriver.gecko.driver",
                "src\\test\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        *//*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();*//*
    }*/


}
