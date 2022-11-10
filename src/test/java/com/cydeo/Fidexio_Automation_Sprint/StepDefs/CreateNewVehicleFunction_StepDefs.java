package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.CreateNewVehicleFunctionPage;
import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.ConfigurationReader;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


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

    @When("user clicks on the CREATE option")
    public void user_clicks_on_the_create_option() {
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


    @Then("user types {string} in the model input and clicks Enter on the keyboard")
    public void userTypesInTheModelInputAndClicksEnterOnTheKeyboard(String model) {
        createNewVehicleFunctionPage.model.sendKeys(model);
        BrowserUtility.sleep(1);
        createNewVehicleFunctionPage.model.sendKeys(Keys.TAB);
    }

    @Then("user types {string} in the MAKE input box and clicks Enter on the keyboard")
    public void userTypesInTheMAKEInputBoxAndClicksEnterOnTheKeyboard(String make) {
        createNewVehicleFunctionPage.make.sendKeys(make);
        BrowserUtility.sleep(1);
    }

    @And("save button should be displayed")
    public void saveButtonShouldBeDisplayed() {
        Assert.assertTrue("Not Displayed", createNewVehicleFunctionPage.saveModelPlate.isDisplayed());
    }


    @Then("user can see the newly created car's make {string} is displayed")
    public void userCanSeeTheNewlyCreatedCarSMakeIsDisplayed(String make) {
        BrowserUtility.sleep(3);
        System.out.println("createNewVehicleFunctionPage.modelMakeId.getText() = " + createNewVehicleFunctionPage.modelMakeId.getText());
        Assert.assertTrue("Not displayed", createNewVehicleFunctionPage.modelMakeId.getText().contains(make));

    }


    @Then("user can see the newly created car's model {string} is displayed")
    public void userCanSeeTheNewlyCreatedCarSModelIsDisplayed(String model) {
        Assert.assertTrue("Not displayed", createNewVehicleFunctionPage.modelMakeId.getText().contains(model));
    }


    @And("user can see the edit button")
    public void userCanSeeTheEditButton() {
        Assert.assertTrue("Not displayed", createNewVehicleFunctionPage.editButton.isDisplayed());
    }

    @Then("user clicks on the create button")
    public void userClicksOnTheCreateButton() {
        createNewVehicleFunctionPage.createMakeButton.click();
    }

    @When("user clicks on the search box")
    public void userClicksOnTheSearchBox() {
        createNewVehicleFunctionPage.searchBox.click();

    }

    @When("user types they the number plate {string} of the newly created vehicle")
    public void userTypesTheyTheNumberPlateOfTheNewlyCreatedVehicle(String numberPlate) {
        createNewVehicleFunctionPage.searchBox.sendKeys(numberPlate);
        //BrowserUtility.sleep(3);
    }

    @Then("user press the ENTER button on the Keyboard")
    public void userPressTheENTERButtonOnTheKeyboard() {
        createNewVehicleFunctionPage.searchBox.sendKeys(Keys.ENTER);
        //BrowserUtility.sleep(3);
    }

    @And("user sees the newly created vehicle {string} is displayed")
    public void userSeesTheNewlyCreatedVehicleIsDisplayed(String numberPlate) {
        Assert.assertTrue(createNewVehicleFunctionPage.numberPlateVerification.getText().contains(numberPlate));
    }
}


