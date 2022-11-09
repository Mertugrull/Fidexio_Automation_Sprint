package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {

    public FleetPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//a[@class=\"dropdown-toggle\"]/b")
    public WebElement moreModule;

    @FindBy(xpath = "//a[@href=\"/web#menu_id=134&action=\"]")
    public WebElement fleetButton;

    @FindBy(xpath = "//div[@data-menu-xmlid='fleet.fleet_vehicles']")
    public WebElement vehiclesTitle;

    @FindBy(xpath = "//a[@data-menu='139']")
    public WebElement vehicleSubTitle;

    @FindBy(xpath = "//a[@data-menu='140']")
    public WebElement vehicleOdometers;

    @FindBy(xpath = "//a[@data-menu='145']")
    public WebElement vehicleCost;

    @FindBy(xpath = "//a[@data-menu='146']")
    public WebElement vehicleContracts;

    @FindBy(xpath = "//a[@data-menu='147']")
    public WebElement vehicleFuelLog;

    @FindBy(xpath = "//a[@data-menu='148']")
    public WebElement vehicleServiceLogs;

    @FindBy(xpath = "//div[@data-menu-xmlid='fleet.menu_fleet_reporting']")
    public WebElement reporting;

    @FindBy(xpath = "//a[@data-menu='150']")
    public WebElement cost;

    @FindBy(xpath = "//a[@data-menu='151']")
    public WebElement indicativeCost;

    @FindBy(xpath = "//div[@data-menu-xmlid='fleet.fleet_configuration']")
    public WebElement configuration;

    @FindBy(xpath = "//a[@data-menu='136']")
    public WebElement vehicleModel;

    @FindBy(xpath = "//a[@data-menu='137']")
    public WebElement makeModel;

    @FindBy(xpath = "//a[@data-menu='141']")
    public WebElement serviceTypes;

    @FindBy(xpath = "//a[@data-menu='142']")
    public WebElement contractTypes;

    @FindBy(xpath = "//a[@data-menu='143']")
    public WebElement vehicleStatus;

    @FindBy(xpath = "//a[@data-menu='144']")
    public WebElement vehicleTags;

    @FindBy(className = "oe_menu_text")
    public WebElement commonAttribute;









}
