#Feature:
#
  #Scenario: Validate google search text field
    #Given I open a browser
    #And I navigate to google page
    #Then I validate the search tesxt field
Feature: Regeln

  Scenario:
    Given Ich bin als Admin eingeloggt
    Given Ich rufe die Regeln auf
    When Ich aendere die Daten
    And Ich klicke Speichern
    Then Ich sehe die Uebersicht Regeln
    And Die geaenderte Regeln ist selektiert
    And Die geaenderte Daten sind vorhanden
