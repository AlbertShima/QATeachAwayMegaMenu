Feature: Dashboard functionality

  Scenario: Verify login functionality
    Given that you are in dashboard page
    And remove the alerts and pop up-s
    Then you should see "dashboard" in URL
