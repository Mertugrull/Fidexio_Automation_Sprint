package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVehicleFunctionPage {
    public CreateNewVehicleFunctionPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    LoginPage loginPage = new LoginPage();

    public void login(String userName, String passWord) {
        loginPage.username.sendKeys(userName);
        loginPage.password.sendKeys(passWord);
        loginPage.loginButton.click();
    }


    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public WebElement createButton;

    @FindBy(xpath = "((//div[@class=\"o_input_dropdown\"])/input)[1]")
    public WebElement model;

    @FindBy(xpath = "//li[@class=\"o_m2o_dropdown_option ui-menu-item\"]/a/strong")
    public WebElement createModelButton;

    @FindBy(xpath = "((//div[@class=\"o_input_dropdown\"])[5])/input")
    public WebElement make;

    @FindBy(xpath = "(//div[@class=\"modal-footer\"]//button)[1]")
    public WebElement saveButtonModel;

    @FindBy(xpath = "//input[@name=\"license_plate\"]")
    public WebElement numberPlate;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveModelPlate;

    @FindBy(xpath = "//div[@class=\"o_thread_message_content\"]/p")
    public WebElement createdMessage;

    @FindBy (xpath = "((//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content\"])/li[9])[2]")
    public WebElement createAndEdit;

    @FindBy (xpath = "(//div[@class=\"modal-footer\"])[2]/button")
    public WebElement saveMakeModel;

}
