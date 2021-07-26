Feature: To sign up and login into the application

Scenario Outline: To test sign up and login

Given Sign up page
When Click on Sign up
And  Enter first name "<firstname>"
And Enter last name "<lastname>"
And Enter e-mail "<email>"
And Enter username "<username>"
And Enter Pass "<password>"
And Enter Confirm Password "<confirmpassword>"
And click on Submit
And verify registration
And Click on dropdown
Then Click on Logout

Examples:
firstname|lastname|email         |username|password|confirmpassword
 Nam123  |Nam456  |test@gmail.com|Nam123  |happy123|happy123


