Feature: As a user I want to login to my account so that i can access my profile and settings
  Scenario: I should be logged in with valid credentials
    Given I am on the login page
    When I type username as "Payal"
    And I type password as "Java1234"
    And I click on login button
    Then I should be logged in to my account successfully

  Scenario: I should not be logged in with invalid credentials
    Given I am on the login page
    When I type username as "Aniket"
    And I type password as "Test1234"
    And I click on login button
    Then I should not be logged in
    And I should see error message "your username or password wrong"

  Scenario: I should not be logged in with invalid username and valid password
    Given I am on the login page
    When I type username as "Aniket"
    And I type password as "Java1234"
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your username is wrong"

  Scenario: I should not be logged in with valid username and invalid password
    Given I am on the login page
    When I type username as "Payal"
    And I type password as "Test1234"
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your password is wrong"

  Scenario: I should not be logged in with  username left blank and valid password
    Given I am on the login page
    When I type username as "    "
    And I type password as "Java1234"
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your username is blank"

  Scenario: I should not be logged in with valid username  and password left blank
    Given I am on the login page
    When I type username as "Payal"
    And I type password as "    "
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your password is blank"

  Scenario: I should not be logged in with username left blank and invalid password
    Given I am on the login page
    When I type username as "    "
    And I type password as "Test1234"
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your username is blank and invalid password"

  Scenario: I should not be logged in with username and password left blank
    Given I am on the login page
    When I type username as "    "
    And I type password as "    "
    And I click on login button
    Then I should not be logged in
    And I shold see error message "your username is blank and password is blank"