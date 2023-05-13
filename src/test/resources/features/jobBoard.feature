Feature: Checking JOBS tab from the menu

  Scenario: Jobs board functionality

    Given that you are on tech away site
    And you go to the jobs board
    Then you should see the text
      | Find Teaching Jobs Abroad                                                                                                                                                  |
      | Search hundreds of teaching jobs abroad, including opportunities with international schools, government programs, universities and language colleges in over 40 countries. |


  Scenario: Verify link "ESL job board" functionality
    Given that you are on tech away site
    And you go to the jobs board
    Then you should click the link ESL job board
    |https://www.teachaway.com/teaching-jobs-abroad/all-countries/esl-teaching/any-subject/any-level|


    Scenario: Verify that "All countries", "All Positions" and "Search jobs" are displayed
      Given that you are on tech away site
      And you go to the jobs board
      Then you should see on the page All countries, All Positions and Search jobs
