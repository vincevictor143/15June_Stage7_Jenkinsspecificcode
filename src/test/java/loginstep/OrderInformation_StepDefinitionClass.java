package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderInformation_StepDefinitionClass 
{
	@Given("User should be logged into application")
	public void user_should_be_logged_into_application() 
	{
	   System.out.println("Given Statement for login");
	}

	@When("User should be at order page")
	public void user_should_be_at_order_page() 
	{
	    System.out.println("Given Statement for Order Page");
	}

	@When("User clicks on past order button")
	public void user_clicks_on_past_order_button() 
	{
		System.out.println("When Statement for Past Order Button");
	}

	@Then("User should be able to see the past order information")
	public void user_should_be_able_to_see_the_past_order_information() 
	{
		System.out.println("Then Statement for Past Order Information");
	}

	@When("User clicks on the current order button")
	public void user_clicks_on_the_current_order_button()
	{
		System.out.println("When Statement for Current Order Button");
	}
	
	@Then("User should be able to see the current placed order information")
	public void user_should_be_able_to_see_the_current_placed_order_information() 
	{
		System.out.println("Then Statement for Current Placed order information ");
	}

	@When("User clicks on cancelled order button")
	public void user_clicks_on_cancelled_order_button() 
	{
		System.out.println("When Statement cancelled order button");
	}

	@Then("User should be able to see cancelled order informaiton")
	public void user_should_be_able_to_see_cancelled_order_informaiton() 
	{
		System.out.println("Then Statement Cancelled Order Information");
	}

}
