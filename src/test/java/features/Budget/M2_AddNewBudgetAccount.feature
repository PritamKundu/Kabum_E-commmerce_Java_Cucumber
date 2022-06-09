Feature: Verify Add New Budget Account from Budget module

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button

     #  Budget 12
  @BudgetM2
  Scenario: Verify after click new budget account open as overlay screen
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account


   #  Budget 13
  @BudgetM2
  Scenario: Verify after click new budget account open as overlay screen title
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    Then verify new budget account form title


   #  Budget 14
  @BudgetM2
  Scenario: Verify account title box
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    Then verify account title text box display


   #  Budget 15
  @BudgetM2
  Scenario: Verify planning unit dropdown list should be available
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown


    #  Budget 16
  @BudgetM2
  Scenario: Verify Function dropdown list should be available
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    Then validation function dropdown available

    #  Budget 17
  @BudgetM2
  Scenario: Verify edit button & forms all fields should be displayed
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And click on edit icon
    Then validation edit page all field

#    Budget 18
  @BudgetM2
  Scenario: Verify change budget function number.
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And click on edit icon
    And validation edit page all field
    And change budget function number
    Then Click On Save Button in budget function details

    #  Budget 19
  @BudgetM2
  Scenario: Verify without selecting budget category click on save button
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And click on add icon above function dropdown
    And change budget function number
    Then click on sava button in budget function detail page

  #   Budget 20
  @BudgetM2
  Scenario: Verify selecting budget category click on save button
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And click on add icon above function dropdown
    And change budget function number
    And select budget category
    Then click on sava button in budget function detail page

    #  Budget 21
  @BudgetM2
  Scenario: Verify write description on budget function description.
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And click on add icon above function dropdown
    And change budget function number
    And select budget category
    And write description in budget function description
    Then click on sava button in budget function detail page

      # Budget 22
  @BudgetM2
  Scenario: Verify account number text box three box should be displayed
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    Then focus on account number

#    Budget23
  @BudgetM2
  Scenario: Verify click on first test box and click on next
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And focus on account number
    And click on first text box
    Then click on second text box

    #    Budget 24
  @BudgetM2
  Scenario: Verify on first test box put any type character.
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And focus on account number
    And put "Test QA" in first text box
    Then click on save button in budget account details page

    #    Budget 25
  @BudgetM2
  Scenario: Verify that after providing value in every mandatory fields data is saved
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    When Click three dot button
    Then click new budget account
    And enter data account title field
    And click planning unit dropdown
    Then select option planning unit dropdown
    And click function unit dropdown
    And select option function unit dropdown
    And validation function dropdown available
    And focus on account number
    And put "Test QA" in first text box
    Then click on save button in budget account details page


