package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features= {"src\\test\\resources\\application\\Campaign_tags.feature"},
		glue= {"loginstep","hooks"},
		plugin= {"pretty","html:target/cucumber-reports/Campaign_tag.html","json:target/cucumber-report.json"},
// 
//		tags="@Regression"
		publish=true
)
public class Campaign_tag_RunnerClass extends AbstractTestNGCucumberTests
{
	

}
