Feature: Application Login

Scenario: Home Page Default Login
Given User Is On Netbanking Landing Page
When User login into application with userName and password
Then Homepage is populated
And Cards are displayed