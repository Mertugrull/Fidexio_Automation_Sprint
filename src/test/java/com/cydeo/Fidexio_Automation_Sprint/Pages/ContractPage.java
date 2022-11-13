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

    @FindBy(xpath = "//button[contains(text(),\"Create\")]")
    public  WebElement CreateButton;


    @FindBy(xpath = "//input[@id='o_field_input_14']")
    public  WebElement VehicleModel;



    @FindBy(xpath = "//input[@id='o_field_input_15']")
    public  WebElement VehicleType;


    @FindBy(xpath = "//input[@id='o_field_input_16']")
    public  WebElement ActivationCost;


    @FindBy(xpath = "//input[@id='o_field_input_16']")
    public  WebElement RecurringAmont;
















}
