package com.cydeo.Fidexio_Automation_Sprint.StepDefs;

import com.cydeo.Fidexio_Automation_Sprint.Pages.SurveysPage;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.BrowserUtility;
import com.cydeo.Fidexio_Automation_Sprint.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SurveysStepDefs {

    SurveysPage surveysPage = new SurveysPage();

    @When("users click the button of Surveys on the top of page")
    public void users_click_the_button_of_surveys_on_the_top_of_page() {
        surveysPage.ClickSurveysButton.click();
       
    }
    @Then("users land on the surveys page")
    public void users_land_on_the_surveys_page()  {
        BrowserUtility.sleep(4);
        Assert.assertEquals( "Surveys - Odoo",Driver.getDriver().getTitle());

       // Assert.assertEquals("Surveys",surveysPage.SurveyText.getText());

    }
    @Then("users click the answers button on the left of the page")
    public void users_click_the_answers_button_on_the_left_of_the_page() {
        surveysPage.ClickAnswersButton.click();

    }
    @Then("users should be land on the answers page")
    public void users_should_be_land_on_the_answers_page() {

        BrowserUtility.sleep(4);
        Assert.assertEquals("Answers - Odoo",Driver.getDriver().getTitle());

    }
    @Then("users click the List button")
    public void users_click_the_list_button() {

        surveysPage.ClickListButton.click();
        
    }
    @Then("users see all the created surveys")
    public void users_see_all_the_created_surveys() {
        surveysPage.VerifyCreatedSurveys();
       
    }
    @And("users see import button on the page")
    public void usersSeeImportButtonOnThePage() {

        surveysPage.ClickImportButton.isDisplayed();

    }
    @And("users see the create button")
    public void usersSeeTheCreateButton() {
        surveysPage.ClickCreateButton.isDisplayed();
    }


    @Then("users write one survey's name which is already created into the search box")
    public void users_write_one_survey_s_name_which_is_already_created_into_the_search_box() {
        surveysPage.ClickSurveysButton.click();
        BrowserUtility.sleep(2);
        surveysPage.SearchBox.click();
        BrowserUtility.sleep(2);
        surveysPage.SearchBox.sendKeys("dasda" + Keys.ENTER);
        
    }
    @Then("users see the related or matched surveys")
    public void users_see_the_related_or_matched_surveys() {

        BrowserUtility.sleep(4);

        Assert.assertEquals("dasda",surveysPage.PostSearchSurvey.getText());
        
    }



    // 2nd acceptance criteria

    @Then("users click the create button")
    public void users_click_the_create_button() {
        BrowserUtility.sleep(3);
        surveysPage.ClickCreateButton.click();
        BrowserUtility.sleep(3);


    }

    @Then("users write the title for the survey")
    public void users_write_the_title_for_the_survey() {

        surveysPage.SurveyTitle.sendKeys("Environment");

    }

    @Then("users click the add an item button")
    public void users_click_the_add_an_item_button() {
        BrowserUtility.sleep(3);
       surveysPage.AddItemButton.click();

    }

    @Then("users write the page title for the survey")
    public void users_write_the_page_title_for_the_survey() {
        BrowserUtility.sleep(3);
        surveysPage.PageTitle.sendKeys("Universe");

    }

    @And("users click one more time the add an item button")
    public void usersClickOneMoreTimeTheAddAnItemButton() {
        BrowserUtility.sleep(3);
        surveysPage.AddItemButton2.click();
    }

    @Then("users write the question name for the survey")
    public void users_write_the_question_name_for_the_survey() {

        surveysPage.QuestionName.sendKeys("Infinity");
    }

    @Then("users click the save and close button")
    public void users_click_the_save_and_close_button() {
        BrowserUtility.sleep(3);
        surveysPage.SaveAndCloseButton.click();
    }

    @And("users click the save and close button again")
    public void usersClickTheSaveAndCloseButtonAgain() {

        surveysPage.SaveAndCloseButton2.click();
    }


    @Then("users click the save button for the survey")
    public void users_click_the_save_button_for_the_survey() {
        BrowserUtility.sleep(3);
       surveysPage.SaveButton.click();
    }

    @Then("users see the created survey message under the survey form sheet")
    public void users_see_the_created_survey_message_under_the_survey_form_sheet() {

        surveysPage.CreatedSurveyMessage.getText();
    }


    @Then("users see the survey which is already created")
    public void usersSeeTheSurveyWhichIsAlreadyCreated() {

         surveysPage.CreatedSurvey.getText();
         Assert.assertEquals("Environment",surveysPage.CreatedSurvey.getText());

    }
}
