package com.controlpay.ir.stepdefinitions;

import com.controlpay.ir.steps.EndUserSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.openqa.selenium.WebDriver;

public class DefinitionSteps {

    @Managed
    WebDriver chrome;

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    private WebDriver inti(String name, WebDriver firefox) {
        switch (name) {
            case "chrome" :
                System.getProperty("webdriver.chrome.driver", "src\\test\\resources\\webdriver\\chromedriver.exe");;
                return chrome;
            default:
                return firefox;
        }
    }

}
