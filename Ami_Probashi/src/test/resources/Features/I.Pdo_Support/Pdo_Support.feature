Feature: Test For Pdo Support Functionality
  Background:
    Given user has logged into the PDO portal


  @PdoSupport
  Scenario: Verify Pdo Support Functionality
    When user click search by batch number button
    And user click edit batch button
    And user click edit more info
#    Then user will see status 5