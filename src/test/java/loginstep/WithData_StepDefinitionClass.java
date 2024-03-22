package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithData_StepDefinitionClass 
{
	@Given("User is at login page")
	public void user_is_at_login_page() 
	{
	    System.out.println("User is on login page");
	}

	@When("User entered the username as {int}")
	public void user_entered_the_username_as(int username) 
	{
	    System.out.println("Entered username is  :"+username);
	}

	@When("User entered the password as {int}")
	public void user_entered_the_password_as(int password) 
	{
		System.out.println("Entered username is  :"+password);
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
	   System.out.println("Click on login button");
	}

	@Then("User is successfully logged in")
	public void user_is_successfully_logged_in() 
	{
	   System.out.println("User is successfully logged in");
	}

}
