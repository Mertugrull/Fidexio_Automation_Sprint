package com.cydeo.Fidexio_Automation_Sprint.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/step_definitions",
        features = "@target/rerun.txt"


)

public class FailedRunner {
}
