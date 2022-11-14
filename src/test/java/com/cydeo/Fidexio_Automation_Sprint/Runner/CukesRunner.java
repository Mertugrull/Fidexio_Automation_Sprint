package com.cydeo.Fidexio_Automation_Sprint.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/Features",
        glue = "com/cydeo/Fidexio_Automation_Sprint/StepDefs",
        dryRun = false,
        tags = "@fb"

)

public class CukesRunner {

}

