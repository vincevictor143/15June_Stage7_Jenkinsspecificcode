package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\Background_With_ScenarioOutline.feature"}, // Feature file path
		glue= {"loginstep"},  // Step definition package name
		plugin= {"pretty"}
		
)

public class RunnerClass_BackgroundWithScenario extends AbstractTestNGCucumberTests
{
  
}













