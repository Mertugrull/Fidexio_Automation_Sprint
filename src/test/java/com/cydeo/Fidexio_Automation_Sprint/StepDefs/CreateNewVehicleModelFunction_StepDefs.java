package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.CreateNewVehicleModelFunctionPage;
import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CreateNewVehicleModelFunction_StepDefs {
    CreateNewVehicleModelFunctionPage vehicleModelFunctionPage = new CreateNewVehicleModelFunctionPage();
    HomePage homePage = new HomePage();

    @When("User cliks on the More button")
    public void user_cliks_on_the_more_button() {
        homePage.moreButton.click();


    }
    @When("User cliks on the Fleet button")
    public void user_cliks_on_the_fleet_button() {
        homePage.fleetButton.click();

    }
    @When("User cliks on the Vehicle Model button which is based on the Configuration section")
    public void user_cliks_on_the_vehicle_model_button_which_is_based_on_the_configuration_section() {
        vehicleModelFunctionPage.vehicleModelMenu.click();

    }
    @When("User clicks Create button")
    public void user_clicks_create_button() {
        vehicleModelFunctionPage.vehicleModelCreate.click();

    }
    @When("User types {string} into Model Name input")
    public void user_types_into_model_name_input(String string) {
        vehicleModelFunctionPage.modelNameInput.sendKeys(string+ Keys.ENTER);

    }
    @When("User types {string} into make section")
    public void user_types_into_make_section(String string) {
        vehicleModelFunctionPage.makeInput.sendKeys(string+Keys.ENTER);

    }
    @When("user clicks Save button")
    public void user_clicks_save_button() {
        vehicleModelFunctionPage.saveButton.click();

    }
    @Then("user verify created Vehicle Function Model")
    public void user_verify_created_vehicle_function_model() {
        Assert.assertEquals("New - Odoo", Driver.getDriver().getTitle());
    }


}