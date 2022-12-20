#language: en
  #autor: Miguel Hugo AP

Feature: Buy Items
  As QA Automation
  I want to enter the page swaglabs
  To purchase one or more items

  Scenario: :Buy items on the website and Logout

    Given Go to the swaglabs website
    When we login with username and password
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
    When I want to add to cart one or more articles
    Then we go to the cart and buy the products
    Then fill in the requested data
      | firstName | lastName   | postalCode |
      | Miguel    | Aguilar    | 93412      |
      | Juan      | Jurado     | 94567      |
      | Jorge     | Candelario | 92800      |
    And finish with the purchase
    And I want to log out after the purchase