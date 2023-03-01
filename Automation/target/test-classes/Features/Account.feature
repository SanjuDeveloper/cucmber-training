Feature: Portal Login
@smoke
Scenario: Home Page Default Login
Given User Is On Netbanking Landing Page
When User login into application with "peter" and "peter@12"
Then Homepage is populated
And Cards displayed "True"