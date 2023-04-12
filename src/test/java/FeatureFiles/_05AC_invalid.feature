Feature: Login as Admin

  Scenario: As an Admin user I should be able to see notification messages displayed, when I enter an invalid Admin name in to the Employee name field.

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

    And Role Select And Status Select as ESS

    And User sending the keys in Dialog Content
      | userName  | randomUser551 |
      | password1 | Romdom.433  |
      | password2 | Romdom.433   |
      | employee  | dasddasd      |


    And Click on the element in Dialog
      | saveButton |

    Then invalid Not Match