Feature: Login as Admin

  Scenario: As an Admin user I should be able to see notification messages displayed, when I enter a value in to the username field which is less than 5 characters.

    Given Navigate to Site

    When login as an Admin

    And Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

    And User sending the keys in Dialog Content
      | userName  | rand |
      | password1 | Romdom.433  |
      | password2 | Romdom.433   |

    And fill up the form by entering the required info to the all input boxes I click on Save button

    Then Should be at least less characters
