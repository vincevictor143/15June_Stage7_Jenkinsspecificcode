package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_BackgroundWithScenarioOutline 
{
	@Given("User should be logged into application1")
	public void user_should_be_logged_into_application1() 
	{
	    System.out.println("Test 1");
	}

	@When("User should be at order page1")
	public void user_should_be_at_order_page1()
	{
		  System.out.println("Test 2");
	}

	@When("User clicks on past order button1")
	public void user_clicks_on_past_order_button1() 
	{
		  System.out.println("Test 3");
	}

	@Then("User should be able to see the past order information1")
	public void user_should_be_able_to_see_the_past_order_information1()
	{
		  System.out.println("Test 4");
	}

	@When("User clicks on cancel order button1")
	public void user_clicks_on_cancel_order_button1()
	{
		  System.out.println("Test 5");
	}

	@Then("User should be able to see the cancel order information1")
	public void user_should_be_able_to_see_the_cancel_order_information1() 
	{
		  System.out.println("Test 6");
	}

}
