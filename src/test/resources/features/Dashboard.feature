Feature: Find answers to common questions feature

  User Story:
  As a user, I should be able to see the list of common questions from search.

  @commonQ
  Scenario: The number of list of common questions verification
    Given user is on the dashboard of the application
    When user clicks on questions search arrow
    Then the user should see "8" questions on the list