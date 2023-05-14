Feature: Functionality of main page

  Scenario: Verify the title
    Given that you are on tech away site
    Then Verify that the title is "Teach Abroad or Online | Your Dream Teaching Job Awaits"

  Scenario: Verify the URL
    Given that you are on tech away site
    Then  Verify that the url is "https://www.teachaway.com/"

  Scenario Outline: Verify user log in with VAlID credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    And  user clicks on login button
    Then user should see the "dashboard" on url
    #Valid credential
    Examples:
      | email                 | password    |
      | albertshima@gmail.com | Aa123456789 |

  Scenario Outline: Verify user log in with INVAlID credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    And  user clicks on login button
    Then user should see a pop-up sms left bottom "Sorry, unrecognized e-mail or password. Please try again."
        #InValid credential
    Examples:
      | email                 | password    |
      | albertshim@gmail.com  | Aa123456789 |
      | albertshima@gmail.com | Aa12345678  |

  Scenario Outline: Verify user log in with BLANK PASSWORD credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    And  user clicks on login button
    Then user should see below password field "This field is required"
        #InValid credential
    Examples:
      | email                | password |
      | albertshim@gmail.com |          |

  Scenario Outline: Verify user log in with BLANK EMAIL credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    Then user should see below email field "This field is required"
        #InValid credential
    Examples:
      | email | password    |
      |       | Aa123456789 |

  Scenario Outline: Verify the REGISTER button
    Given that you are on tech away site
    When user click REGISTER button
    And fill all necessary fields, "<firstName>", "<lastName>", "<email>", , "<password>"
    And user check the check box
    And user click Sign up button
    Then user see the welcome messages, "<firstName>"

    Examples:
      | firstName | lastName | email            | password  |
      | gimi3     | gimi3    | g2iiii@gmail.com | a12345678 |

  Scenario: Verifying all the menu´s from main page
    Given that you are on tech away site
    Then you should see all menu´s of the main page