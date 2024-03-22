package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\OrderApplication.feature"},
		glue= {"loginstep"},
		plugin= {"pretty"}
)
public class RunnerClass_OrderApplication extends AbstractTestNGCucumberTests 
{

}