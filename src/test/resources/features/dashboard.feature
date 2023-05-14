Feature: Dashboard functionality
  Background:
    Given that you are in dashboard page
    And remove the alerts and pop up-s
  @smoke @Regression
  Scenario: Verify that URL contains dashboard after login
    Then you should see "dashboard" in URL
