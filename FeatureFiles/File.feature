Feature: Add empolyee
As a admin user should to create multiple employees 
Scenario Outline: 
Validate add employee
Given user navigate url"http://orangehrm.qedgetech.com/"
When  user login as username "Admin"and"Qedge123!@#"
When user click login button
When  user click on pim button
When  user click add button
When user Enter "<Firstname>"and"<middlename>"and "<lastname>"
When user capture emid
When user click save button
When user click emid aftersave
Then user valid emid 
Then  user close browser
Examples:
|Firstname|middlename|lastname|
|shiva|rama|krishna|
|puspha|raj|srivalli|
|rocky|bangram|adheera|





