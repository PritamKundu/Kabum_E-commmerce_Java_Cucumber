Feature: Verify Add New GL Code from Budget module

  Background:
    Given user Enter username "arouf"
    And user Enter password "SPOLAR@2022"
    Then click on login button


#Budget 001
  Scenario: Verify Budget Approval chain showing multiple approval levels 2
    Given click budget option from left menu
    When click on all budget
    Then click on all unit checkbox
    And enter data "Hooterville" search field
    And click search data
    


# Budget 26
  @BudgetM3
  Scenario: Verify click on 3 dot icon box in new gl code
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    Then Click three dot button

#   Budget 27
  @BudgetM3
  Scenario: Verify click on new GL code from dropdown
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click on new gl code from dropdown


    #   Budget 28
  @BudgetM3
  Scenario: Verify enter a code in gl code text box
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    Then click on sava button in GL code detail page

#  Budget 29
  @BudgetM3
  Scenario: Verify enter a code in gl code text box new
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    And select a category from category list in GL code details
    Then click on sava button in GL code detail page

    # Budget 30
  @BudgetM3
  Scenario: Verify that set minimum and maximum amount
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    And select a category from category list in GL code details
    And set minimum amount "0" and maximum amount "1" in text field
    Then click on sava button in GL code detail page

#  Budget 31
  @BudgetM3
  Scenario: Verify that set minimum amount 1 and maximum amount 2
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    And select a category from category list in GL code details
    And set minimum amount "1" and maximum amount "2" in text field
    Then click on sava button in GL code detail page

    #  Budget 32
  @BudgetM3
  Scenario: Verify that write something on description text box
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    And select a category from category list in GL code details
    And set minimum amount "1" and maximum amount "2" in text field
    And write something on description text box
    Then click on sava button in GL code detail page

      #  Budget 33
  @BudgetM3
  Scenario: Verify that click on active checkbox
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And Click three dot button
    And click on new gl code from dropdown
    And enter "007" in gl code text box
    And select a category from category list in GL code details
    And set minimum amount "1" and maximum amount "2" in text field
    And write something on description text box
    And click on active checkbox unmark it
    Then click on sava button in GL code detail page


