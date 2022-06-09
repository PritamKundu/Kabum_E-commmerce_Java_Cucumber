Feature: Verify Budget History tab available

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button

# Budget 60

  @BudgetM6
    Scenario: Verify that clicking on History row  check View All
      Given click budget option from left Menu
      When  click on all Budget
      And   Click All Unit Box
      Then  Find a Value from Searchbox
      And   Click All Unit Box
      Then  Open a previous created file from Search
      Then  Click on History tab
      And   Click All View All Icon





