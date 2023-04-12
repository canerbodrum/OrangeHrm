Feature: Login as Admin

  Scenario: As an Admin user I should be able to see notification messages displayed, when I click on Save button without entering mandatory fields.

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn     |





