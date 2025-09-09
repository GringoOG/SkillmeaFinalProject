Feature: TutorialPointTable

  Scenario: Overeni dat tabulky
    Given uzivatel se nachazi na strance "https://www.tutorialspoint.com/selenium/practice/webtables.php#"
    Then jmeno na druhem radku tabulky bude "Alden"
    And prijmeni na druhem radku tabulky bude "Cantrell"
    And vek na druhem radku bude "45"
    And mail na druhem radku bude "alden@example.com"
    And vyplata na druhe radku bude "12000"
    And odvetvi na druhem radku "Compliance"