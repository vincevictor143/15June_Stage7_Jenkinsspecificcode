Feature: Order functionality
Background: 
Given User should be at login Page
When User should be at order page product

Scenario: Verify Previously order products 
When User should click on previously order products button
Then user should be able to see the Previously order products


Scenario: Verify Currently order products 
When User should click on Current order products button
Then user should be able to see the Current order products

Scenario: Verify Cancelled order products 
When User should click on cancel order products button
Then user should be able to see the cancel order products


 
