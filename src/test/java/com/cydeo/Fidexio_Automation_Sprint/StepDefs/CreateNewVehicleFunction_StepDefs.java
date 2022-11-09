package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.CreateNewVehicleFunctionPage;
import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.ConfigurationReader;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CreateNewVehicleFunction_StepDefs {
    HomePage homePage = new HomePage();
    CreateNewVehicleFunctionPage createNewVehicleFunctionPage = new CreateNewVehicleFunctionPage();


    @Given("user is logged in with username {string} and password {string}")
    public void userIsLoggedInWithUsernameAndPassword(String userName, String passWord) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        createNewVehicleFunctionPage.login(userName, passWord);
    }
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
    public void user_types_in_the_model_input(String model) {
        createNewVehicleFunctionPage.model.sendKeys(model);
    }
    @When("user clicks on the CREATE FOCUS option")
    public void user_clicks_on_the_create_focus_option() {
        createNewVehicleFunctionPage.createModelButton.click();
    }
    @And("user types {string} in the MAKE input box")
    public void userTypesInTheMAKEInputBox(String make) {
        createNewVehicleFunctionPage.make.sendKeys(make);
    }
    @And("user clicks on the CREATE and EDIT button")
    public void userClicksOnTheCREATEAndEDITButton() {
        createNewVehicleFunctionPage.createAndEdit.click();
    }
    @And("user clicks on the SAVE button for the make of the car")
    public void userClicksOnTheSAVEButtonForTheMakeOfTheCar() {

        createNewVehicleFunctionPage.saveMakeModel.click();
    }
    @And("user clicks on the SAVE button to create the make of the vehicle")
    public void userClicksOnTheSAVEButtonToCreateTheMakeOfTheVehicle() {

        createNewVehicleFunctionPage.saveButtonModel.click();
    }
    @And("user enters {string} in the LICENSE PLATE input")
    public void userEntersInTheLICENSEPLATEInput(String plate) {

        createNewVehicleFunctionPage.numberPlate.sendKeys(plate);
    }
    @And("user clicks on the SAVE button to create only with MODEL and LICENSE PLATE")
    public void userClicksOnTheSAVEButtonToCreateOnlyWithMODELAndLICENSEPLATE() {
        createNewVehicleFunctionPage.saveModelPlate.click();
    }
    @And("user sees the new vehicle created message is displayed")
    public void userSeesTheNewVehicleCreatedMessageIsDisplayed() {
        createNewVehicleFunctionPage.createdMessage.isDisplayed();
    }


}


