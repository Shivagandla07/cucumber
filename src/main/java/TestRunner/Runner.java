package TestRunner;

import org.junit.runner.RunWith;

import StepDefination.AddEmp;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"featurefiles"},monochrome=true,glue= {"StepDefination"},
plugin = {"pretty","html:target/cucumber-reports"})


public class Runner extends AddEmp {

}
