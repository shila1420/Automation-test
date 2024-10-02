Feature: Test For New Pdo Application Functionality
  Background:
    Given user has logged into the portal


  @bmetPdo
  Scenario: Verify New Pdo Application Functionality
    When user clicks on pdo application button
    And user puts passport information
    And user click next button form PDO
    And user puts batch information
    And user click next1 button
    And user inputs payment
    And user upload photo
    And user click next2 button
    Then user should download enrollment card


