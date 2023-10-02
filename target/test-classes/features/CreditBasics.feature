Feature: Navigation Header feature

  User Story:
  As a user, I should be able to go to Credit Basics page from dashboard Page.

  @header
  Scenario: Page Header Verification
    Given user is on the dashboard of the application
    When user clicks on "rent" tab and "credit-basics" module
    Then user should see the header "Credit Basics"
