package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features= {"src\\test\\resources\\application\\ProfilePicture.feature"},
		glue= {"loginstep","hooks"},
		plugin= {"pretty"}
)
public class ProfilePicture_RunnerClass extends AbstractTestNGCucumberTests
{
	

}
