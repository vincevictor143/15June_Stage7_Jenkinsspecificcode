package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\Orders.feature"},
		glue= {"loginstep"},
		plugin= {"pretty"}
)
public class RunnerClass_OrderInformation extends AbstractTestNGCucumberTests 
{

}
