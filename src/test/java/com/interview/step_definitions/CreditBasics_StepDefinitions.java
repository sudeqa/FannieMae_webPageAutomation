package com.interview.step_definitions;

import com.interview.pages.BasePage;
import com.interview.pages.CreditBasicsPage;
import com.interview.pages.DashboardPage;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class CreditBasics_StepDefinitions extends BasePage {


    @Given("user is on the dashboard of the application")
    public void user_is_on_the_dashboard_of_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }
    CreditBasicsPage credit= new CreditBasicsPage();

    @When("user clicks on {string} tab and {string} module")
    public void user_clicks_on_tab_and_tab(String tab, String module) {
        navigateToModule(tab, module);

    }


    @Then("user should see the header {string}")
    public void user_should_see_the_header(String expectedHeader) {
        String currentWindow=Driver.getDriver().getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);
        Set<String> allHandles= Driver.getDriver().getWindowHandles();

        for(String each: allHandles){
            Driver.getDriver().switchTo().window(each);
            if(Driver.getDriver().getTitle().equals(credit.title.getText())){
                break;
            }
        }

     String actualHeader= credit.header.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }


}
