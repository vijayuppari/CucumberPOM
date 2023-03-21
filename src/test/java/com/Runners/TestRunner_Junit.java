package com.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                features =  {"src/test/resources/Features"},
                glue = {"com/Stepdefinitions","com/Hooks"},
                plugin ={"pretty","timeline:test-output-thread/"}

)
public class TestRunner_Junit {
}
