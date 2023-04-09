#Step 1 – I login as an Admin

#Step 2 – I navigate to Admin / User Management page.

#Step 3 – I click on Add button

#Step 4 – I enter a value in to the username field which is less than 5 characters

#Step 5 – I verify that notification messages “Should be at least 5 characters” in red color displayed.

Feature: When I enter value to user name must be 5 character
  Scenario:
    When Navigate to Site
    When login as an Admin

    And Click on the element in LeftNav
      |admin|
    And Click on the element in Dialog
      |addBtn|
    And Send to user name five  characters

