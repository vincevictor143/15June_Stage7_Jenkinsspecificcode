package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Campaign_Step 
{
	@Given("User is Campaign portal")
	public void user_is_campaign_portal()
	{
	    System.out.println("Given statement for Campaign Portal ");
	}

	@When("User click on Draft Campaign button")
	public void user_click_on_draft_campaign_button()
	{
		
		System.out.println("When statement for Draft Campaign button ");
	}

	@When("User submit the rquired information")
	public void user_submit_the_rquired_information() 
	{
		System.out.println("When statement for submit the rquired information ");
	}

	@Then("Drafts campaign created successfully")
	public void drafts_campaign_created_successfully() 
	{
		System.out.println("Then statement for Drafts campaign created successfully\" ");
	}

	@When("User click on Created Campaign button")
	public void user_click_on_created_campaign_button()
	{
		System.out.println("When statement User click on Created Campaign button ");
	}

	@When("User submit the rquired information for creating campaign")
	public void user_submit_the_rquired_information_for_creating_campaign() 
	{
		System.out.println("When statement for rquired information for creating campaign ");
	}

	@Then("Created Campaign successfully created")
	public void created_campaign_successfully_created() 
	{
		System.out.println("Then statement for Created Campaign successfully created");
	}

	@When("User click on Sent Campaign button")
	public void user_click_on_sent_campaign_button() 
	{
		System.out.println("When statement for click on Sent Campaign button\"");
	}

	@When("User submit the customer requirement sent information")
	public void user_submit_the_customer_requirement_sent_information() 
	{
		System.out.println("When statement submit the customer requirement sent information");
	}

	@Then("Sent Campaign successfully created")
	public void sent_campaign_successfully_created() 
	{
		System.out.println("When statement submit the customer requirement sent information");
	}
}
