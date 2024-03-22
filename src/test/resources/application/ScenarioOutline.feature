Feature: Scenario Outline Functionality 
Scenario Outline: Verify the Signup Functionality 
Given User is at Signup page of application 
When user enters the "<name>" in a form  
And user enters the "<Country>" of entered person name
And user enters the "<Gender>" of entered person
Then user created successfully 

Examples:
|name|Country|Gender|
|Vince|India|male|
|Victor|Russia|male|