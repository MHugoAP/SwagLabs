#language: en
  #autor: Miguel Hugo AP

Feature: Buy Items
  As QA Automation
  I want to enter the page swaglabs
  To purchase one or more items

  Background:Buy items on the website
    Given Go to the swaglabs website

  Scenario: Logout
    Given login with username and password
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
    When I want to log out after the purchase