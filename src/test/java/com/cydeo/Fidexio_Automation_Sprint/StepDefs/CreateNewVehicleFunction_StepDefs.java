package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.CreateNewVehicleFunctionPage;
import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class CreateNewVehicleFunction_StepDefs {
    HomePage homePage = new HomePage();
    CreateNewVehicleFunctionPage createNewVehicleFunctionPage = new CreateNewVehicleFunctionPage();

    @When("user clicks on the MORE button")
    public void user_clicks_on_the_more_button() {
        homePage.moreButton.click();
    }

    @When("user clicks on the FLEET option")
    public void user_clicks_on_the_fleet_option() {
        homePage.fleetButton.click();
    }

    @When("user clicks on the CREATE module")
    public void user_clicks_on_the_create_module() {
        createNewVehicleFunctionPage.createButton.click();
    }

    @When("user types {string} in the model input")
    public void user_types_in_the_model_input(String string) {
       createNewVehicleFunctionPage.model.sendKeys(string);
    }

    @When("user clicks on the CREATE FOCUS option")
    public void user_clicks_on_the_create_focus_option() {

        createNewVehicleFunctionPage.createModelButton.click();
    }




}
