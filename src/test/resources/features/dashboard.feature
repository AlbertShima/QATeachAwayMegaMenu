Feature: Dashboard functionality

  Background:
    #Given that you are in dashboard page
    #When remove the alerts and pop up-s

  @smoke @Regression
  Scenario: Verify that URL contains dashboard after login
    Given that you are in dashboard page
    When remove the alerts and pop up-s
    Then you should see "dashboard" in URL


  Scenario: Verify text change on "Quick Apply" button if requirements are meet
    Given that you are in dashboard page
    When remove the alerts and pop up-s
    And user click to quick apply button
    Then the text of the button should change to "Applied"



    #Another scenario: Verify that the user can view the applied job in the Application section