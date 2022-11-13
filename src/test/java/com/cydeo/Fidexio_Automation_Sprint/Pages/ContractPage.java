package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractPage {
    public ContractPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-menu='146']")
    public  WebElement VehiclesContract;
}
