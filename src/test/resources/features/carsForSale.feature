Feature: Search for a new car
In order to serach for a new car
as a buyer
I navigate to https://www.cars.com/

Scenario:
	Given I am on home page of https://www.cars.com/
	When I select Cars for Sale
	Then I select the car usage "New & Used Cars"
	And I select the Make as "BMW"
	And I select the model as "- 128"
	And I select the Max price as "$40,000"
	And I select the driven miles as "40 Miles from"
	And I inform the zip code as "12345"
	And I click on Search button
	Then I should see a list of searched car from "BMW"
	And The title of page should be "New and Used BMW 128 - in 12345 - on Cars.com"
