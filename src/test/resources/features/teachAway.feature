Feature: Functionality of the main page https://www.teachaway.com/

  @teachAway
  Scenario: Verify the title of the page https://www.teachaway.com/
    Given that you are on tech away site
    Then Verify that the title is "Teach Abroad or Online | Your Dream Teaching Job Awaits"

  @teachAway
  Scenario: Verify the URL of the page https://www.teachaway.com/
    Given that you are on tech away site
    Then  Verify that the url is "https://www.teachaway.com/"

  @teachAway
  Scenario Outline: Verify user log in with VAlID credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    And  user clicks on log in button
    Then user should see the "dashboard" on url
    #Valid credential
    Examples:
      | email                 | password    |
      | albertshima@gmail.com | Aa123456789 |

  @teachAway
  Scenario Outline: Verify user log in with INVAlID credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And user enter password "<password>"
    And  user clicks on log in button
    Then user should see a pop-up sms left bottom "Sorry, unrecognized e-mail or password. Please try again."
        #InValid credential
    Examples:
      | email                 | password    |
      | albertshim@gmail.com  | Aa123456789 |
      | albertshima@gmail.com | Aa12345678  |

  @teachAway
  Scenario Outline: Verify user log in with BLANK PASSWORD credentials
    Given that you are on tech away site
    When user click on log in button
    And user enter email "<email>"
    And  user clicks on login button
    Then user should see below password field "This field is required"
        #InValid credential
    Examples:
      | email                 |
      | albertshima@gmail.com |

  @teachAway
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

  @teachAway
  Scenario Outline: Verify the REGISTER button is working properly
    Given that you are on tech away site
    When user click REGISTER button
    And fill all necessary fields, "<firstName>", "<lastName>", "<email>", , "<password>"
    And user check the check box
    And user click Sign up button
    Then user see the welcome messages, "<firstName>"

    Examples:
      | firstName | lastName | email              | password  |
      | Agim      | gimi3    | g28iii6i@gmail.com | a12345678 |

  @teachAway @wip
  Scenario: Verifying all the menu´s from main page are displayed
    Given that you are on tech away site
    Then you should see all menu´s of the main page