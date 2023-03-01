Feature: Application Login

Scenario: Home Page Default Login
Given User Is On Netbanking Landing Page
When User login into application with "sanjau" and "admin123"
Then Homepage is populated
And Cards displayed "True"

 @regassion  @smoke
Scenario: Home Page Default Login
Given User Is On Netbanking Landing Page
When User login into application with "admin@example.com" and "admin123"
Then Homepage is populated
And Cards displayed "Flae"

Scenario: Home Page Default Login
Given User Is On Netbanking Landing Page
When User signup into application with details
|sanjay|bhatt|8954382331|admin@example.com|
Then Homepage is populated
And Cards are displayed "Yes"

@regassion
Scenario Outline: Home Page Default Login
Given User Is On Netbanking Landing Page
When User log in to application with <UserName> and <Password>
Then Homepage is populated
And Cards are displayed "Yes"

Examples:
|UserName|Password|
|Sanju ji|admin123|
|bagisto |1234!@as|
|Admin   |anj@12  |