package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\ScenarioOutline1.feature"},
		glue= {"loginstep"},
		plugin={"pretty"}
)

public class RunnerClass_ScnearionOutline1 extends AbstractTestNGCucumberTests
{
	

}
