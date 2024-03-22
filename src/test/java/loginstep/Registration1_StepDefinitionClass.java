package loginstep;

import io.cucumber.java.en.Given;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration1_StepDefinitionClass 
{
	
	@Given("User should at registration portal1")
	public void user_should_at_registration_portal1() 
	{
	    System.out.println("User is at registration page");
	}

	@When("User should enter the required information1")
	public void user_should_enter_the_required_information1(DataTable dataTable) 
	{
		System.out.println("Below is  the Entered information by user :");
		List<List<String>> data = dataTable.asLists(String.class);
		List<String> firstlist = data.get(0);
		String SpecificValue = firstlist.get(2);
		
//		 for(List<String> var:data)
//		 {
//			 
//			 System.out.println(var);
//		 }
	}

	@When("User should click on registration button1")
	public void user_should_click_on_registration_button1() 
	{
		System.out.println("User clicked on Registration Button");
	}

	@Then("User got successfully registered1")
	public void user_got_successfully_registered1()
	{
		System.out.println("User got successfully registered on page");
	}

}
