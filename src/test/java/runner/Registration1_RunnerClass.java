package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features={"src\\test\\resources\\application\\Registration1.feature"},
		glue={"loginstep"},
		plugin={"pretty"}
)
public class Registration1_RunnerClass extends AbstractTestNGCucumberTests
{

}
