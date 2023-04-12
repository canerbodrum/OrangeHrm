Feature: Login as Admin

  Scenario: As an Admin user I should be able to see Add button displayed, when I navigate to the User Management page

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |










    Then add button is displayed