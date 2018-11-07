Feature:
	As a user
	I want to be able to book a trip in the system
	So that i can get a flight confirmation
	
Scenario: Book a round trip flight
	Given the user is on landing page
	When he chooses to sign on
	And he provides the user name as mercury
	And he provides the user password as mercury
	And he signs-in
	And he provides the passengers as 1
	And he provides the departing as London
	And he provides the departure month as December
	And he provides the departure day as 16
	And he provides the arriving as Zurich
	And he provides the arrival month as January
	And he provides the arrival day as 6
	And he provides the service class as Business Class
	And he provides the airline as Unified Airlines
	And he continues to Select Flight
	And he provides the departure flight as Unified Airlines 363
	And he provides the return flight as Unified Airlines 633
	And he continues to Book Flight
	And he provides the first name as James
	And he provides the last name as Hetfield
	And he provides the meal as Hindu
	And he provides the card type as Visa
	And he provides the card number as 5599637465142567
	And he provides the expiration month as 09
	And he provides the expiration year as 2005
	And he provides the card first name as James
	And he provides the card last name as Hetfield
	And he provides the billing address as P.O. Box 3700 
	And he provides the billing city as Eureka
	And he provides the billing state as California
	And he provides the billing postal code as 95502
	And he provides the billing country as United States
	And he provides the delivery address as P.O. Box 3700 
	And he provides the delivery city as Eureka
	And he provides the delivery state as California
	And he provides the delivery postal code as 95502
	And he provides the delivery country as United States
	And he purchases
	Then he should get his flight confirmation