package com.cydeo.Fidexio_Automation_Sprint.StepDefs;


import com.cydeo.Fidexio_Automation_Sprint.Pages.LoginPage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.ConfigurationReader;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {


    LoginPage loginPage= new LoginPage();

    @Given("user is on the login page of fidexio page")
    public void user_is_on_the_login_page_of_fidexio_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {

        loginPage.username.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {

        loginPage.password.sendKeys(password);

    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {

        loginPage.loginButton.click();


    }
    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedUrl) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(expectedUrl));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
