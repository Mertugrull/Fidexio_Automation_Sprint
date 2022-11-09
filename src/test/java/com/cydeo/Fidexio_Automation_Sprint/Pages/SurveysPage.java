package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {

    public SurveysPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[15]/a")
    public WebElement ClickSurveysButton;

    @FindBy (xpath = "//a[@data-menu='477']")
    public WebElement ClickAnswersButton;









}
