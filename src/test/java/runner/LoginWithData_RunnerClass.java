package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\loginWithData.feature"},
		glue= {"loginstep","hooks"},
		plugin= {"pretty"}
)

public class LoginWithData_RunnerClass extends AbstractTestNGCucumberTests
{
	

}
