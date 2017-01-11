Feature: Admin Login and Logout Test

	Scenario: Login Test
	Given user launch the browser and navigates to url
	When user enters username and password
	And also clicks on login
	Then redirected to admin page and should display welcome message
	
	Scenario: Logout Test
	When tester clicks on welcome admin link
	And also clicks on logout
	Then oragehrm login page displayed