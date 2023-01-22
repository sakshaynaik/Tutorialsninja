package com.tutorialsninja.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:reports/tutorialsninja.html" },
                 features = "features",
                 glue = "com.tutorialsninja.stepdefination",
               	 publish=true,
                 dryRun = false,
                 monochrome = true,
                 tags = "@all")      
public class Run {

}
 