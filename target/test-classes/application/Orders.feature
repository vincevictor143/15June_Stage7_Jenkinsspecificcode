Feature: Order Functionality 
Background: 
Given User should be logged into application 
When User should be at order page 

Scenario: Fetching previosuly order information
When User clicks on past order button 
Then User should be able to see the past order information 

Scenario: Fetching currenly placed order information
When User clicks on the current order button 
Then User should be able to see the current placed order information 

Scenario: Fetching cancelled order information 
When User clicks on cancelled order button 
Then User should be able to see cancelled order informaiton 
 
