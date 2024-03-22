# Drafts Campaign 
# Created Campaign 
# Sent Campaign 

Feature: Campaign functionality 

@Regression 
Scenario: Drafts Campaign 
Given User is Campaign portal 
When User click on Draft Campaign button
And User submit the rquired information 
Then Drafts campaign created successfully 


Scenario: Created Campaign 
Given User is Campaign portal 
When User click on Created Campaign button
And User submit the rquired information for creating campaign 
Then Created Campaign successfully created 

@Regression 
Scenario: Sent Campaign 
Given User is Campaign portal 
When User click on Sent Campaign button
And User submit the customer requirement sent information 
Then Sent Campaign successfully created
 