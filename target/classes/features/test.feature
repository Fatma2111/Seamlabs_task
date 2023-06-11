Feature: buy product from the online shop
#Possitive scenario
  Scenario: Add product to the cart
    Given The user adds a product to the cart
    When The user opens the summary page
    Then The product price is correct
