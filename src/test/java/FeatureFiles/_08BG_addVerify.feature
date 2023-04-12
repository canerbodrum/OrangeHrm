Feature: Login as Admin

  Scenario: As an Admin user I should be able to create an ESS user account so that ESS user will be having his own valid username and valid password.

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |

    Then add button is displayed