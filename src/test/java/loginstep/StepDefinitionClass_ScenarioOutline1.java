package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass_ScenarioOutline1 
{
	@Given("User is at Signup portal of application")
	public void user_is_at_signup_portal_of_application() 
	{
	   System.out.println("User is at signup portal ");
	}

	@Then("user account created successfully after filling details")
	public void user_account_created_successfully_after_filling_details() 
	{
		System.out.println("User account  got created successfully");
	}
	
	@When("user enters the {string} in a form of scenarioOutline1")
	public void user_enters_the_in_a_form_of_scenario_outline1(String nameOfUser) 
	{
	    System.out.println("User entered the name"+nameOfUser);
	}

	@When("user enters the {int}")
	public void user_enters_the(Integer pincodeOfUser) 
	{
		System.out.println("User entered the Pincode"+pincodeOfUser);
	}

	@When("user enters the {string} of  new scenario gender")
	public void user_enters_the_of_new_scenario_gender(String genderOfUser) 
	{
		System.out.println("User entered the gender"+genderOfUser);
	}
}
