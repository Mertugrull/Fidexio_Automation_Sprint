package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage {

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "body > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(16) > a:nth-child(1) > span:nth-child(1)")
    public WebElement ClickEmployeesButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement EmployeesText;

    @FindBy(css = "a[data-action-id='179'][data-menu='161']")
    public WebElement ClickEmployeesLeftButton;

    @FindBy(css = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(16) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
    public WebElement ClickBadgesButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement BadgesText;

    @FindBy(css = "li[class='active'] a[class='oe_menu_leaf'] span[class='oe_menu_text']")
    public WebElement ClickChallengesButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement ChallengesText;

    @FindBy(css = "li[class='active'] a[class='oe_menu_leaf'] span[class='oe_menu_text']")
    public WebElement ClickGoalsHistoryButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement GoalsText;

    @FindBy(css = "a[data-action-id='184'][data-menu='163']")
    public WebElement ClickDepartmentsButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement DepartmentsText;

    @FindBy(css = ".btn.btn-primary.btn-sm.o-kanban-button-new.btn-default")
    public WebElement ClickCreateButton;

    @FindBy(css = "ol[class='breadcrumb'] li[class='active']")
    public WebElement NewText;

    @FindBy(xpath = "//input[@id='o_field_input_2203']")
    public WebElement EmployeeName;

    @FindBy(css = ".btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement ClickSaveButton;

    @FindBy(css = "div[class='o_thread_message_content'] p")
    public WebElement EmployeeCreatedTitle;

    @FindBy(xpath = "@FindBy(xpath = \"//button[@class='btn btn-primary btn-sm o_form_button_save']\")\n" +
            "    public WebElement ClickSaveButton;")
    public WebElement ClickAlkanDincerButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement AlkanDincerText;

}