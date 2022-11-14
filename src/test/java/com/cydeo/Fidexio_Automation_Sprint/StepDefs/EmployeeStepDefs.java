package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.EmployeesPage;
import com.cydeo.Fidexio_Automation_Sprint.Pages.HomePage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeStepDefs {

    EmployeesPage employeesPage = new EmployeesPage();
    HomePage homePage = new HomePage();

    @When("users click the button of Employees on the top of pages")
    public void usersClickTheButtonOfEmployeesOnTheTopOfPages() {
        //wait.until(ExpectedConditions.elementToBeClickable(employeesPage.ClickEmployeesButton));
        homePage.moreButton.click();
        homePage.moreEmployeesButton.click();
        //employeesPage.ClickEmployeesButton.click();

    }

    @Then("users land on the Employees page")
    public void usersLandOnTheEmployeesPage() { //throws InterruptedException {
        //Thread.sleep(10000);
        BrowserUtility.sleep(4);
        Assert.assertEquals( "Employees - Odoo", Driver.getDriver().getTitle());


    }

    @And("users click the EmployeesLeft button on the left of the page")
    public void usersClickTheEmployeesButtonOnTheLeftOfThePage() {
        BrowserUtility.sleep(4);
        employeesPage.ClickEmployeesLeftButton.click();
    }

    @Then("users should be landing on the Employees page")
    public void usersShouldBeLandingOnTheEmployeesPage() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Employees - Odoo",Driver.getDriver().getTitle());

    }

    @And("users click the Badges button on the left of the page")
    public void usersClickTheBadgesButtonOnTheLeftOfThePage() {

        employeesPage.ClickBadgesButton.click();

    }

    @Then("users see all the Badges")
    public void usersSeeAllTheBadges() {

        BrowserUtility.sleep(6);
        Assert.assertEquals("Badges - Odoo",Driver.getDriver().getTitle());

    }

    @And("users click the Challenges button on the left of the page")
    public void usersClickTheChallengesButtonOnTheLeftOfThePage() {

        employeesPage.ClickChallengesButton.click();

    }

    @Then("users are directed to the Challenges section")
    public void usersAreDirectedToTheChallengesSection() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Badges - Odoo",Driver.getDriver().getTitle());

    }

    @And("users click the Goals History button")
    public void usersClickTheGoalsHistoryButton() {

        employeesPage.ClickGoalsHistoryButton.click();
    }

    @Then("users see the related Goals History page")
    public void usersSeeTheRelatedGoalsHistoryPage() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Badges - Odoo",Driver.getDriver().getTitle());
    }

    @And("users click the Departments button")
    public void usersClickTheDepartmentsButton() {
        BrowserUtility.sleep(4);
        employeesPage.ClickDepartmentsButton.click();
    }

    @Then("users see the related Departments on Departments page")
    public void usersSeeTheRelatedDepartmentsOnDepartmentsPage() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Departments - Odoo",Driver.getDriver().getTitle());

    }

    @And("users click the create button.")
    public void usersClickTheCreateButton() {

        employeesPage.ClickCreateButton.isDisplayed();
    }

    @Then("user should be able to direct to create page")
    public void userShouldBeAbleToDirectToCreatePage() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Departments - Odoo",Driver.getDriver().getTitle());
    }


    @When("users click the button of Employees on the top of page.")
    public void usersClickTheButtonOfEmployeesOnTheTopOfPage() {

        employeesPage.ClickEmployeesButton.click();

    }

    @Then("users click the create button on top")
    public void usersClickTheCreateButtonOnTop() {

        employeesPage.ClickCreateButton.isDisplayed();

    }

    @And("users write the name on Employee's Name")
    public void usersWriteTheNameOnEmployeeSName() {

        employeesPage.ClickEmployeesButton.click();
        BrowserUtility.sleep(2);
        employeesPage.EmployeeName.sendKeys("Alkan Dincer" + Keys.ENTER);
    }

    @And("users click the save button")
    public void usersClickTheSaveButton() {

        employeesPage.ClickSaveButton.click();
    }

    @Then("users see the Employee Created message under the Employee form sheet")
    public void usersSeeTheEmployeeCreatedMessageUnderTheEmployeeFormSheet() {

        employeesPage.EmployeeCreatedTitle.getText();
    }

    @Then("users see the new Employee which is already created")
    public void usersSeeTheNewEmployeeAlkanDincerWhichIsAlreadyCreated() {

        Driver.getDriver().navigate().back();
        employeesPage.EmployeeCreatedTitle.getText();
        Assert.assertEquals("Alkan Dincer",employeesPage.EmployeeCreatedTitle.getText());

    }
}
