@Login
Feature: Login
  As a registered user
  I want to login to my account
  So that I can view website content

  Background: User navigates to main page
    Given I am on "The Internet" page on URL "http://the-internet.herokuapp.com/login"
    Then I should see title "Login Page"

  Scenario: Successful login
    When I provide "Username" as "tomsmith"
    And I provide "Password" as "SuperSecretPassword!"
    And I click on the "Login" button
    Then I should see alert message "You logged out of the secure area!"
#
#  Scenario Outline: Failed login
#    When I provide "Username" as "<username>"
#    And I provide "Password" as "<password>"
#    And I click on the "Login" button
#    Then I should see "<alert>" message
#    Examples:
#      | username | password                     | alert                       |
#      | Smith    | SuperSecretPassword!         | Your username is invalid!   |
#      | tomsmith | SuperWrongPass               | Your password is invalid!   |