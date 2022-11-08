package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.FleetPage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Pre_Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FleetMenuStepDefs {

FleetPage fleetPage= new FleetPage();


    @Given("posmanager is on the profile page")
    public void posmanager_is_on_the_profile_page() {

        Pre_Condition.loginPage();
    }
    @When("posmanager clicks the More module")
    public void posmanager_clicks_the_more_module() {

        BrowserUtility.sleep(3);
        fleetPage.moreModule.click();
        BrowserUtility.sleep(3);

    }
    @When("posmanager clicks Fleet button")
    public void posmanager_clicks_fleet_button() {

        fleetPage.fleetButton.click();


    }


    @Then("user sees menu")
    public void userSeesMenu() {

        List<WebElement> allOptions= Driver.getDriver().findElements(By.className("oe_menu_text"));

        for (WebElement each : allOptions) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
    }
}
