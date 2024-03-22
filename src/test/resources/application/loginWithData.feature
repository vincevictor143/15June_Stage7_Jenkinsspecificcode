Feature: Login with data functionality 
Scenario: Verify the login functionality 
Given User is at login page 
When User entered the username as 123
And User entered the password as 456
And User click on login button 
Then User is successfully logged in 