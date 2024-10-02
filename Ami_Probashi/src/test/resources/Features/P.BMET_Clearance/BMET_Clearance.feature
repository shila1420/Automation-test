Feature: Test for BMET Clearance Functionality
  Background:
    Given user has logged into the portal


    @BMETClearance
    Scenario: Verify BMET Clearance Functionality
      When user click on BMET Clearance button
      And user input job details information
      And user input Application Documents information
      And user input Candidates information

