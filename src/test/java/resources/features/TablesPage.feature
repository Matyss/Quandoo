@Tables
Feature: Sort the table alphabetically
  As a user on page with table No. 2
  I want to be able to sort the table records in Last Name column
  So that the last names are sorted alphabetically in ascending and descending order

  Background: User navigates to tables page
    Given I am on tables page URL "http://the-internet.herokuapp.com/tables"
    Then I should see page "Data Tables" title

  Scenario: Sorting in ascending order
    Given There is a non-empty column with last names
    When I click on the "Last Name" table header cell 1 time
    Then I should see the list sorted in ascending order

  Scenario: Sorting in descending order
    Given There is a non-empty column filled with last names
    When I click on the "Last Name" table header 2 times
    Then I should see the list sorted in descending order