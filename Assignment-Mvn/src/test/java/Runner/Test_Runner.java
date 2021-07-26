package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\SignupAndLogin\\signupandlogin.feature"},
glue= {"StepDefinition"},
monochrome =true, //to make console output in a better format 
//dryRun = true ,// if my dryrun is true it will not execute the scenario
//strict = true ,//to check whether any method is missing 

plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}

)
public class Test_Runner {

}
