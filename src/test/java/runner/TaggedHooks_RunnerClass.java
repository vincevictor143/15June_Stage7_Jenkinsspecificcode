package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"src\\test\\resources\\application\\TaggedHooks.feature",},
		glue= {"loginstep","hooks2"},
		plugin= {"pretty"},
		tags="(@sanity or @regression) and (not @functional)"
		
)
public class TaggedHooks_RunnerClass extends AbstractTestNGCucumberTests 
{
	
}


// background 
// scenario outline
// datatable
// 
