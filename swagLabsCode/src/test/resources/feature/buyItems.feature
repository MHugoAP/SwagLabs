#language: en
  #autor: Miguel Hugo AP

Feature: Buy Items
  As QA Automation
  I want to enter the page swaglabs
  To purchase one or more items

  Scenario: Buy items on the website

    Given Go to the swaglabs website
    When we login with username and password
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
    Then I want to buy one or more articles