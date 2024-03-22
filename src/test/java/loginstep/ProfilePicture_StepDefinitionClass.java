package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePicture_StepDefinitionClass 
{
	@Given("User should at profile picture portal")
	public void user_should_at_profile_picture_portal() 
	{
	    System.out.println("User is at profile picture portal");
	}

	@When("user should click on upload profile button")
	public void user_should_click_on_upload_profile_button()
	{
		 System.out.println("User clicked on upload profile button");
	}

	@When("User should select the profile picture to be upload")
	public void user_should_select_the_profile_picture_to_be_upload() 
	{
		 System.out.println("User selected the profile picture");
	}

	@Then("Profile picture got uploaded successfully")
	public void profile_picture_got_uploaded_successfully() 
	{
		 System.out.println("Profile picture got uploaded successfully");
	}

	@When("user should click on update profile button")
	public void user_should_click_on_update_profile_button() 
	{
		 System.out.println("User clicked update picture button");
	}

	@When("User update the picture")
	public void user_update_the_picture()
	{
		 System.out.println("User updated the picture");
	}

	@Then("Profile picture got updated successfully")
	public void profile_picture_got_updated_successfully() 
	{
		 System.out.println("Pciture got updated successfully");
	}

	@When("user should click on Delete profile button")
	public void user_should_click_on_delete_profile_button() 
	{
		 System.out.println("User clicked on delete button ");
	}

	@Then("Profile picture got Deleted successfully")
	public void profile_picture_got_deleted_successfully() 
	{
		 System.out.println("Picture got deleted");
	}
}
