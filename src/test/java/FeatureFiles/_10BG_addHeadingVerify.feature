Feature: Login as Admin

  Scenario: As an Admin user I should be able to see the head “Add User” displayed, when I navigate to the User Management page

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |






    Then Add User Heading is displayed