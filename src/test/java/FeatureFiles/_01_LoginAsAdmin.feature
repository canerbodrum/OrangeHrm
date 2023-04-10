Feature: Login as Admin

  Scenario: As an Admin user I should be able to create an ESS user account so that ESS user will be having his own valid username and valid password.


    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |
    And Click on the element in Dialog
      | addBtn |
    |  save    |

    And User sending the keys in Dialog Content
      | userName  | randomUser551 |
      | password1 | Romdom.433  |
      | password2 | Romdom.433   |



    And   fill up the form by entering the required info to the all input boxes I click on Save button
    Then Required  message should be displayed
