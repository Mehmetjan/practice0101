#this is sign up feature
Feature: sign up

  Scenario Outline: sign up
    Given user upen url
    When user on the home page
    Then clcik on sign in button
    And user enter "email"
    Then click on Createa account button

    Examples: 
      | email            |
      | mehmet@gmail.com |
