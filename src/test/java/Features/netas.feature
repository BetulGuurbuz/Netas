Feature: Netas
  Scenario: Job Payment
    Given User at home page
    When Accept cookies
    When Click kariyer
    When Accept repeat cookies
    When Click BT
    When Click Genel Basvuru
    When Click Simdi Basvur
    When Click again Simdi Basvur
    Then Write email
    Then Write password
    Then Click SignIn


