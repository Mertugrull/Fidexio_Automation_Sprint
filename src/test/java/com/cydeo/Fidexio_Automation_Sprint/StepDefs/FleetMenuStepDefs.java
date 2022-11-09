package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.FleetPage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FleetMenuStepDefs {

FleetPage fleetPage= new FleetPage();

    @When("posmanager clicks the More module")
    public void posmanager_clicks_the_more_module() {

        fleetPage.moreModule.click();

    }
    @When("posmanager clicks Fleet button")
    public void posmanager_clicks_fleet_button() {

        fleetPage.fleetButton.click();

    }
    @Then("user is able to see Vehicles")
    public void user_is_able_to_see_vehicles() {

        Assert.assertTrue(fleetPage.vehiclesTitle.isDisplayed());

    }
    @Then("user should see Vehicles")
    public void user_should_see_vehicles() {

        Assert.assertTrue(fleetPage.vehicleSubTitle.isDisplayed());

    }
    @Then("user is able to see Vehicles Odometer")
    public void user_is_able_to_see_vehicles_odometer() {

        Assert.assertTrue(fleetPage.vehicleOdometers.isDisplayed());

    }
    @Then("user is able to see Vehicle Costs")
    public void user_is_able_to_see_vehicle_costs() {

        Assert.assertTrue(fleetPage.vehicleCost.isDisplayed());

    }
    @Then("user is able to see Vehicles Contracts")
    public void user_is_able_to_see_vehicles_contracts() {

        Assert.assertTrue(fleetPage.vehicleContracts.isDisplayed());

    }
    @Then("user is able to see  Vehicles Fuel Logs")
    public void user_is_able_to_see_vehicles_fuel_logs() {

        Assert.assertTrue(fleetPage.vehicleFuelLog.isDisplayed());

    }
    @Then("user is able to see Vehicles Services Logs")
    public void user_is_able_to_see_vehicles_services_logs() {

        Assert.assertTrue(fleetPage.vehicleServiceLogs.isDisplayed());

    }
    @Then("user is able to see Reporting")
    public void user_is_able_to_see_reporting() {

        Assert.assertTrue(fleetPage.reporting.isDisplayed());
    }
    @Then("user is able to see Costs")
    public void user_is_able_to_see_costs() {

        Assert.assertTrue(fleetPage.cost.isDisplayed());

    }
    @Then("user is able to see  Indicative Costs")
    public void user_is_able_to_see_indicative_costs() {

        Assert.assertTrue(fleetPage.indicativeCost.isDisplayed());

    }
    @Then("user is able to see Configuration")
    public void user_is_able_to_see_configuration() {

        Assert.assertTrue(fleetPage.configuration.isDisplayed());

    }
    @Then("user is able to see Vehicle Model")
    public void user_is_able_to_see_vehicle_model() {

        Assert.assertTrue(fleetPage.vehicleModel.isDisplayed());

    }
    @Then("user is able to see Model make of Vehicle")
    public void user_is_able_to_see_model_make_of_vehicle() {

        Assert.assertTrue(fleetPage.makeModel.isDisplayed());

    }
    @Then("user is able to see Service Types")
    public void user_is_able_to_see_service_types() {

        Assert.assertTrue(fleetPage.serviceTypes.isDisplayed());

    }
    @Then("user is able to see Contract Types")
    public void user_is_able_to_see_contract_types() {

        Assert.assertTrue(fleetPage.contractTypes.isDisplayed());

    }
    @Then("user is able to see Vehicle status")
    public void user_is_able_to_see_vehicle_status() {

        Assert.assertTrue(fleetPage.vehicleStatus.isDisplayed());

    }
    @Then("user is able to see Vehicle Tags")
    public void user_is_able_to_see_vehicle_tags() {

        Assert.assertTrue(fleetPage.vehicleTags.isDisplayed());
    }


}
