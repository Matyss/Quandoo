@Hovers
Feature: Avatar hover caption
  As a logged in user
  I want to hover over the avatars
  So that I can see additional information

  Background: User navigates to avatars page
    Given I am on avatars page URL "http://the-internet.herokuapp.com/hovers"
    Then I should see "Hovers" title

  Scenario: Hovering over the avatar
    Given There are 3 avatars on the page
    When I hover over the avatar number 1
    Then I should see caption "name: user1"