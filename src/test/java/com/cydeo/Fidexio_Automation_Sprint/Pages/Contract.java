package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contract {

    public void Contract(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class=\"dropdown-toggle\"]/b")
    public WebElement MoreModule;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=134&action=\"]")
    public WebElement FleetButton;

    @FindBy(xpath = "//a[@data-menu='146']")
    public WebElement VehiclesContracts;


    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public WebElement CreateButton;

}
