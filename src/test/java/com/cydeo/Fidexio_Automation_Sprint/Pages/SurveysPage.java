package com.cydeo.Fidexio_Automation_Sprint.Pages;

import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SurveysPage {

    public SurveysPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[15]/a")
    public WebElement ClickSurveysButton;

    @FindBy (xpath = "(//li[@class='active'])[2]")
    public WebElement SurveyText;


    @FindBy (xpath = "//a[@data-menu='477']")
    public WebElement ClickAnswersButton;

    @FindBy (xpath ="//button[@aria-label='list']")
    public WebElement ClickListButton;

    public void VerifyCreatedSurveys(){

        WebElement yourTable = Driver.getDriver().findElement(By.tagName("table"));
        List<WebElement>tableRows=yourTable.findElements(By.xpath("//table//tr[1]/td[2]"));

        for(int i=0; i<tableRows.size(); i++){
            WebElement row  = tableRows.get(i);
        }
    }

    @FindBy (xpath = "(//button[@type='button'])[7]")
    public WebElement ClickImportButton;

    @FindBy (xpath = "//html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement ClickCreateButton;

    @FindBy (xpath = "//ol[@class='breadcrumb']")
    public  WebElement NewSurveyPageText;

    @FindBy (css = "input.o_searchview_input")
    public WebElement SearchBox;

    @FindBy (xpath = "(//*[text()='dasda'])[2]")//(css = "div.o_kanban_record_top")
    public WebElement PostSearchSurvey;





    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement SurveyTitle;

    @FindBy (linkText = "Add an item")  //td[@class='o_field_x2many_list_row_add']
    public WebElement AddItemButton;

    @FindBy   (xpath = "(//*[text()='Add an item'])[2]")//(xpath = "(//td[@class='o_field_x2many_list_row_add'])[2]") //(linkText = "Add an item")
    public WebElement AddItemButton2;


    @FindBy (xpath = "(//input[@name='title'])[2]")  //input[@placeholder='Page Title']
    public WebElement PageTitle;


    @FindBy (xpath = "//input[@placeholder='Question Name']")
    public WebElement QuestionName;

    @FindBy  (xpath = "(//*[text()='Save  & Close'])[2]")//(xpath = "//*[@id=\"modal_85\"]/div/div/div[3]/button[1]")
    public WebElement SaveAndCloseButton;

    @FindBy (xpath = "//*[text()='Save  & Close']")
    public WebElement SaveAndCloseButton2;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement SaveButton;

    @FindBy (xpath = "//div[@class='o_thread_message_content']/p")
    public WebElement CreatedSurveyMessage;

    @FindBy (xpath = "(//*[text()='Environment'])[1]")
    public WebElement CreatedSurvey;











}
