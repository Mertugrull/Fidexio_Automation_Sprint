package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class=\"dropdown-toggle\"]/b")
    public WebElement moreModule;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=134&action=\"]")
    public WebElement fleetButton;

    @FindBy(xpath = "//a[@data-menu='140']")
    public WebElement vehicleOdometers;

    @FindBy(xpath = "//div[@class='o_list_buttons']//button[1]")////div[@class="o_list_buttons"]//button[1]
    ////button[@class='btn btn-primary btn-sm o_list_button_add']
    public WebElement createButton;

    @FindBy(xpath = "((//div[@class=\"o_input_dropdown\"])/input)[1]")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "//li[@class=\"o_m2o_dropdown_option ui-menu-item\"][2]")
    public WebElement createAndEditButton;

    @FindBy(xpath = "//input[@placeholder=\"e\uFEFF.\uFEFFg\uFEFF.\uFEFF \uFEFFM\uFEFFo\uFEFFd\uFEFFe\uFEFFl\uFEFF \uFEFFS\"]")
    public WebElement model;

    @FindBy(id="o_field_input_397")
    public WebElement make;

    @FindBy(xpath = "/html/body/div[7]/div/div/div[3]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@placeholder='e.g. PAE 326']")
    public WebElement plateNumber;

    @FindBy(xpath = "//input[@name='odometer']")
    public WebElement km;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]")
    public WebElement saveButton2;






}
