Feature: Login as Admin

  Background:
    Given Navigate to Site

    When login as an Admin

  Scenario: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the Password field which doesn’t have lower case character.

    And Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

    And fill up the form by entering the required info to the all input boxes I click on Save button

    And User sending the keys in Dialog Content
      | userName  | randomUser551 |
      | password1 | ASDASDASDSADS |
      | password2 | ASDASDASDSADS |


    Then  Try Different Pass is displayed