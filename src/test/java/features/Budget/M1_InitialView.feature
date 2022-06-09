Feature: Verify Initial View Page

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button

    # Budget 01
  @BudgetM1
  Scenario: Title Should be Shown "All Budget" by Unit Manager Page
    Given click budget option from left menu
    When click on all budget
    Then validation of page title

    # Budget 02
  @BudgetM1
  Scenario: All Budget by Unit Manager page, "Detail Button_Primary" button is available
    Given click budget option from left menu
    When click on all budget
    Given Click detail Primary Button

    # Budget 03
  @BudgetM1
  Scenario: All Budget by Unit Manager page, "Detail Button_Secondary button is available
    Given click budget option from left menu
    When click on all budget
    Then click detail button secondary

#  Budget 04
  @BudgetM1
  Scenario: Verify that click on search bar write a value
    Given click budget option from left menu
    When click on all budget
    And Click detail Primary Button
    When Search field check

#   Budget 05
  @BudgetM1
  Scenario: Verify all unit checkbox
    Given click budget option from left menu
    When click on all budget
    Then click on all unit checkbox

    #  SP 06 need pavel for correction {SP_05 Repeated}- Not done
  @BudgetM1
  Scenario: Verify all unit checkbox is available
    Given click budget option from left menu
    When click on all budget
    Then click on all unit checkbox

    #  SP 07 {SP_04 Repeated} - Not Done
  @BudgetM1
  Scenario: Verify pending approval checkbox is available
    Given click budget option from left menu
    When click on all budget
    And Click detail Primary Button
    Then click on all unit checkbox


   #  Budget 08
  @BudgetM1
  Scenario: Verify that secondary button available or not
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    Then click detail button secondary


    #  Budget 09
  @BudgetM1
  Scenario: Verify search data
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    Then click detail button secondary
    When Search field check
    Then verify no records display


   #  Budget 10
  @BudgetM1
  Scenario: Verify unit manager & all unit check box data
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    Then click unit manager dropdown
    Then click on all unit checkbox


   #  Budget 11
  @BudgetM1
  Scenario: Verify after click three dot button will display account and gl code
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then verify display budget account and gl code


