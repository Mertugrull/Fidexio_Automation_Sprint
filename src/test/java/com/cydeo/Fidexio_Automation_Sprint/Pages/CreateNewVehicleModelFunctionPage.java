package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CreateNewVehicleModelFunctionPage {
   public CreateNewVehicleModelFunctionPage(){PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-menu-xmlid='fleet.fleet_vehicle_model_menu']")
    public WebElement vehicleModelMenu;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement vehicleModelCreate;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement modelNameInput;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement makeInput;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

}
