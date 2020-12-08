Feature: Login Action
Background: User navigates to Demo Web Shop home page and click on Login link

 

@Successful_login
Scenario: − Successful login with valid login credentials
Description: This feature will test successful login functionality
Given User is on login page
When User enters all valid data
And click on Log in 
Then login should be successful

 

@Unsuccessful_login 
Scenario Outline:− Unsuccessful login with invalid login credentials
Given User is on login page
When I enter Email  as "<email>" and Password as "<password>" 
And click on Log in 
Then login should be Unsuccessful

 

Examples: −
| email  | password  |
| fffad.gmail.com | abcdegf  |
| suryapulagam99@gmail.com | abcde |
| abcd.abcd.gmail.com | 123 |