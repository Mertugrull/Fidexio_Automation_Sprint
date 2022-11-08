package com.cydeo.Fidexio_Automation_Sprint.Utilities;

import com.cydeo.Fidexio_Automation_Sprint.Pages.LoginPage;

public class Pre_Condition {


    public static void loginPage(){

        LoginPage loginPage=new LoginPage();

        loginPage.username.sendKeys(ConfigurationReader.getProperty("pos.manager.username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("pos.manager.password"));
        loginPage.loginButton.click();

    }

}
