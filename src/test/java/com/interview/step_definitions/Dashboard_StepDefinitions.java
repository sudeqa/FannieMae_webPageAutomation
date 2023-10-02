package com.interview.step_definitions;

import com.interview.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_StepDefinitions {

    DashboardPage dashboardPage= new DashboardPage();
    @When("user clicks on questions search arrow")
    public void user_clicks_on_questions_search_arrow() {
       dashboardPage.commonQarrow.click();
    }
    @Then("the user should see {string} questions on the list")
    public void the_user_should_see_questions_on_the_list(String actualNumber) {
      String expectedNumber= String.valueOf(dashboardPage.list());
        Assert.assertEquals(expectedNumber,actualNumber);
    }

}
