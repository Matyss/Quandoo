@Login
Feature: Login
  As a registered user
  I want to login to my account
  So that I can view website content

  Background: User navigates to main page
    Given I am on "The Internet" page on URL "http://the-internet.herokuapp.com/login"
    Then I should see title "Login Page"

  Scenario: Successful login
    When I provide username as "tomsmith" and password as "SuperSecretPassword!"
    And I click on the "Login" button
    Then I should see alert message "You logged into a secure area!"

  Scenario Outline: Failed login
    When I provide username as "<username>" and password as "<password>"
    And I click on the "Login" button
    Then I should see "<alert>" message
    Examples:
      | username | password             | alert                     |
      | Smith    | SuperSecretPassword! | Your username is invalid! |
      | tomsmith | SuperWrongPass       | Your password is invalid! |