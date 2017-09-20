package com.cucumber.CucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"classpath:features/calculator.feature"}
  , plugin = {"json:target/reports/Abcd.json"}
  , glue = {"com.cucumber.CucumberTest.Calculator"}
)
public class CalculatorIntegrationTest {
}
