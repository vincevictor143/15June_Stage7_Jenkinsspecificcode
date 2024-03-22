package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineFeatureClass 
{
	@Given("User is at Signup page of application")
	public void user_is_at_signup_page_of_application() 
	{
	    System.out.println("User is at Signup Page");
	}

	@When("user enters the {string} in a form")
	public void user_enters_the_in_a_form(String name) 
	{
		System.out.println("Entered name is "+name);
	}

	@When("user enters the {string} of entered person name")
	public void user_enters_the_of_entered_person_name(String Country)
	{
		System.out.println("Entered Country name is "+Country);
	}

	@When("user enters the {string} of entered person")
	public void user_enters_the_of_entered_person(String Gender) 
	{
		System.out.println("Entered Gender is "+Gender);
	}

	@Then("user created successfully")
	public void user_created_successfully() 
	{
		System.out.println("User got created successfully");
	}
}
