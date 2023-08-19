package com.fdmgroup.testScripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
					glue= {"com.fdmgroup"},
					publish=true,
					plugin= {"pretty","html:target/cucumber.html",
							"json:target/cucumber.json",
							"junit:target/cucumber.xml"}
					)
public class TestRunner {
	
}
