package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_OrderApplication 
{
	@Given("User should be at login Page")
	public void user_should_be_at_login_page() 
	{
	    System.out.println("User is on login page");
	}

	@When("User should be at order page product")
	public void user_should_be_at_order_page_product()
	{
		System.out.println("User is at order product page");
	}

	@When("User should click on previously order products button")
	public void user_should_click_on_previously_order_products_button() 
	{
		System.out.println("User click on previously order products button");
	}

	@Then("user should be able to see the Previously order products")
	public void user_should_be_able_to_see_the_previously_order_products() 
	{
		System.out.println("User is able to see previous orders ");
	}

	@When("User should click on Current order products button")
	public void user_should_click_on_current_order_products_button() 
	{
		System.out.println("User click on Current order products button");
	  
	}

	@Then("user should be able to see the Current order products")
	public void user_should_be_able_to_see_the_current_order_products() 
	{
		System.out.println("User is able to see current order products");
	}

	@When("User should click on cancel order products button")
	public void user_should_click_on_cancel_order_products_button() 
	{
		System.out.println("User click on cancelled order products button");
	}

	@Then("user should be able to see the cancel order products")
	public void user_should_be_able_to_see_the_cancel_order_products() 
	{
		System.out.println("User is able to see cancel order products");
	}

}
