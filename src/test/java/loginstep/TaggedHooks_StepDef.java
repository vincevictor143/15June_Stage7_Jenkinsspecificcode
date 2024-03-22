package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHooks_StepDef 
{
	@Given("this is first step of first scenario")
	public void this_is_first_step_of_first_scenario() 
	{
	   System.out.println("Given statement for first scenario");
	}

	@When("this is second step of first scenario")
	public void this_is_second_step_of_first_scenario()
	{
		System.out.println("When statement for first scenario");
	}

	@Then("this is third  step of first scenario")
	public void this_is_third_step_of_first_scenario() 
	{
		System.out.println("Then statement for first scenario");
	}

	@Given("this is first step of second scenario")
	public void this_is_first_step_of_second_scenario()
	{
		System.out.println("Given statement for second scenario");
	}

	@When("this is second step of second scenario")
	public void this_is_second_step_of_second_scenario()
	{
		System.out.println("when statement for second scenario");
	}

	@Then("this is third  step of second scenario")
	public void this_is_third_step_of_second_scenario() 
	{
		System.out.println("Then statement for second scenario");
	}

	@Given("this is first step of third scenario")
	public void this_is_first_step_of_third_scenario()
	{
		System.out.println("Given statement for Third scenario");
	}

	@When("this is second step of third scenario")
	public void this_is_second_step_of_third_scenario() 
	{
		System.out.println("Given statement for Third scenario");
	}

	@Then("this is third  step of third scenario")
	public void this_is_third_step_of_third_scenario()
	{
		System.out.println("Given statement for Third scenario");
	}

}
