Feature: Verify product successfully saved add to cart section

  @addToCart
  Scenario: Verify add to cart system
    Given search notebook
    When click first notebook
    And enter zip code & print shipping values
    When close the shipping modal box
    And click on purchase button
    When click on add to cart icon
    Then validate this product available in this cart


