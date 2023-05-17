Feature: Dashboard functionality

  Background:
    #Given that you are in dashboard page
    #When remove the alerts and pop up-s

  @dashboard @smoke @Regression
  Scenario: Verify that URL contains dashboard after login
    Given that you are in dashboard page
    When remove the alerts and pop up-s
    Then user should see "dashboard" in URL

  @dashboard
  Scenario: Verify text change on "Quick Apply" button if requirements are meet
    Given that you are in dashboard page
    When remove the alerts and pop up-s
    And user click to quick apply button
    Then the text of the button should change to "Applied" or appear left bottom "You do not meet the requirements for this job"



    #Another scenario: Verify that the user can view the applied job in the Application section