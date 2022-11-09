package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewVehicleFunctionPage {
    public CreateNewVehicleFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public WebElement createButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/h1/div/div/input")
    public WebElement model;


    @FindBy(xpath = "//li[@class=\"o_m2o_dropdown_option ui-menu-item\"]/a/strong")
    public WebElement createModelButton;

}
