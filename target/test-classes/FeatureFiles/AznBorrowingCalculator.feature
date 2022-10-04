@azn
Feature: This feature is to validate the functionalities of borrowing calculator

  
	Scenario: To verify the borrowing estimate when user enter the required details
    Given the user is on the borrowing estimate calculator page
    When the user select "Single" application type
    And user enters "0" in dependants text field
    And user select "Home to live in" property option
  	And user enter "80000" in annual income text field
  	And user enter "10000" in other annual income text field
  	And user enter "500" in living expenses text field
  	And user enter "0" in home loan repayment text field
  	And user enter "100" in other loan repayment text field
  	And user enter "0" in other monthly commitments text field
  	And user enter "10000" in credit card limits text field
  	And user click Work out how much I could borrow button
  	Then user verify "$429,000" estimated amount to borrow
  	
  @StartOver	
	Scenario: To verify clicking on the start button clears the form
    Given the user is on the borrowing estimate calculator page
    When the user select "Single" application type
    And user enters "0" in dependants text field
    And user select "Home to live in" property option
  	And user enter "80,000" in annual income text field
  	And user enter "10,000" in other annual income text field
  	And user enter "500" in living expenses text field
  	And user enter "0" in home loan repayment text field
  	And user enter "100" in other loan repayment text field
  	And user enter "0" in other monthly commitments text field
  	And user enter "10,000" in credit card limits text field
  	And user click Work out how much I could borrow button
  	Then user verify "$429,000" estimated amount to borrow  
  	Then user click on Start over button	
  	Then user verify the form is cleared
  	
  @msg
  Scenario: To verify the message displayed when user enter 1 dollor living expense and other fields as 0
    Given the user is on the borrowing estimate calculator page
  	When user enter "1" in living expenses text field
  	And user click Work out how much I could borrow button
  	Then user verify the message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500." is displayed
  	
  	