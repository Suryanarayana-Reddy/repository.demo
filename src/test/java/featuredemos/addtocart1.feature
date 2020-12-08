Feature: Add to cart  Action
Background: User has already logged in with valid credentials and is navigated to Demo workshop home page.
Given User is on home page
When User clicks on log in enters into login page
And User enters Email and Password
Then User logins successfully
@Add_to_cart
Scenario: − Successful adding an item to the cart
Description: This feature will test successful Add to cart functionality
When User clicks on books link
And selects a book to add to cart
And click on Add to cart 
Then item is added to cart successfully