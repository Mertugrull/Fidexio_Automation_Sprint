package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.VehicleOdometerPage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.security.Key;

public class VehicleOdoStepDefs {


    VehicleOdometerPage vehicleOdometerPage=new VehicleOdometerPage();

    @When("user clicks More Module")
    public void user_clicks_more_module() {

    vehicleOdometerPage.moreModule.click();

    }
    @When("user clicks Fleet button")
    public void user_clicks_fleet_button() {

        vehicleOdometerPage.fleetButton.click();
    }
    @When("user cliks the Vehicle Odometer")
    public void user_cliks_the_vehicle_odometer() {

        vehicleOdometerPage.vehicleOdometers.click();

    }
    @When("user cliks the create button;")
    public void user_cliks_the_create_button() {

        vehicleOdometerPage.createButton.click();

    }
    @When("user click the vehicle dropdown")
    public void user_click_the_vehicle_dropdown() {

        vehicleOdometerPage.vehicleDropDown.click();

    }
    @When("users clicks the create and edit button")
    public void users_clicks_the_create_and_edit_button() {

        vehicleOdometerPage.createAndEditButton.click();

    }
    @When("users inputs model {string} and press tab")
    public void users_inputs_model_and_press_tab(String model) {

        vehicleOdometerPage.model.sendKeys(model);
        BrowserUtility.sleep(2);
        vehicleOdometerPage.model.sendKeys(""+Keys.TAB);



    }

    @When("user input {string}")
    public void user_input(String plate) {

        vehicleOdometerPage.plateNumber.sendKeys(plate);

    }
    @When("user inputs {string}")
    public void user_inputs(String km) {

        vehicleOdometerPage.km.sendKeys(km);

    }

    @When("user clicks  the save button")
    public void user_clicks_the_save_button() {

        vehicleOdometerPage.saveButton2.click();

    }



}
