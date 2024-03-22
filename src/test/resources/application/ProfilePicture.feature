# 1. Upload ProfilePicture
# 2. Update ProfilePicture
# 3. Delete ProfilePicture

Feature: Profile Picture 
Scenario: Verify the profile picture upload functionality 
Given User should at profile picture portal 
When user should click on upload profile button 
And User should select the profile picture to be upload 
Then Profile picture got uploaded successfully 

Scenario: Verify the profile picture update functionality 
Given User should at profile picture portal 
When user should click on update profile button 
And User update the picture
Then Profile picture got updated successfully

Scenario: Verify the profile picture Delete functionality 
Given User should at profile picture portal 
When user should click on Delete profile button 
Then Profile picture got Deleted successfully  