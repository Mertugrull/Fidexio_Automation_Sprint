package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehContract {

    VehContract vehContract=new VehContract();

    HomePage homePage=new HomePage();


    @When("user clicks on the MORE module")
    public void userClicksOnTheMOREModule() {
       homePage.moreButton.click();
    }


    @When("user clicks on the FLEET option")
    public void user_clicks_on_the_fleet_option() {
      homePage.fleetButton.click();
    }


    @Then("clicks on the Vehicles Contracts option")
    public void clicksOnTheVehiclesContractsOption() {

    }

    @And("users click the Create button")
    public void usersClickTheCreateButton() {
    }
}
