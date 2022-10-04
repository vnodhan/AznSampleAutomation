package com.azn.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles",
		glue = "com.azn.step_definitions",
//		tags = "@msg",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty",
				"html:target/cucumber-report/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		)
public class TestRunner {

}
