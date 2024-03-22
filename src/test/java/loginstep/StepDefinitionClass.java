package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass 
{
	@Given("User should be at login page")
	public void preCondition()
	{
		System.out.println("User is at login Page");
	}
	
	@When("user need to enter the {string}")
	public void user_need_to_enter_the(String username) 
	{
	    System.out.println("Entered username is "+username);
	}

	@When("user need to enter the password {string}")
	public void user_need_to_enter_the_password(String password) 
	{
		System.out.println("Entered Password is "+password);
	}
	
	@When("user need to click on login button")
	public void clickButton()
	{
		System.out.println("Clicked on login button ");
	}
	
	@Then("user should be logged into applicaiton")
	public void loginPage()
	{
		System.out.println("User successfully logged in");
	}
	
	@Given("user is at insurance portal")
	public void user_is_at_insurance_portal() 
	{
	    System.out.println("User is at insurance login portal");
	}

	@Given("user logged into application")
	public void user_logged_into_application() 
	{
		 System.out.println("User logged in to portal");
	}

	@When("user clicked on insurance button")
	public void user_clicked_on_insurance_button()
	{
		 System.out.println("User clicked on insurance button");
	}

	@When("user clicked on the car insurance button")
	public void user_clicked_on_the_car_insurance_button()
	{
		 System.out.println("Click on the car insurance button");
	}

	@Then("user is at car Insurance page")
	public void user_is_at_car_insurance_page()
	{
		 System.out.println("Final output");
	}


}
