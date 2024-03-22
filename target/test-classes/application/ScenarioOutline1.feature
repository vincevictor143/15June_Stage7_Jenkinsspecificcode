Feature: Signup Functionality 
Scenario Outline: Verify the Signup Functionality
Given User is at Signup portal of application 
When user enters the "<name>" in a form of scenarioOutline1 
And user enters the <pincode> 
And user enters the "<Gender>" of  new scenario gender
Then user account created successfully after filling details

Examples:
|name|pincode|Gender|
|Vince|411041|male|
|Victor|452524|male|

