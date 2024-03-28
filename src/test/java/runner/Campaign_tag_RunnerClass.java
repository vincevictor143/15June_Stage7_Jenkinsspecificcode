package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features= {"@target/failedScenario.txt"},
		glue= {"loginstep","hooks"},
		plugin= {"pretty","rerun:target/failedScenario.txt"},
//		tags="@Regression"
		publish=true
)
public class Campaign_tag_RunnerClass extends AbstractTestNGCucumberTests
{
	

}
