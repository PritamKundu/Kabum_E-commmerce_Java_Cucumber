Feature: Login with Valid Field



  Scenario Outline: Check login Empty Data
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    Then click on login button

    Examples:
      | Username | Password    |
      |     |  |


  Scenario Outline: Check empty username & valid password
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    Then click on login button

    Examples:
      | Username | Password    |
      |     | SPOLAR@2022 |


  Scenario Outline: Check login Invalid Data
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    Then click on login button

    Examples:
      | Username | Password    |
      | arouf 1   | SPOLAR@20221 |



  Scenario Outline: Check login invalid username & valid password
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    Then click on login button

    Examples:
      | Username | Password    |
      | arouf1    | SPOLAR@2022 |



  Scenario Outline: Check login Valid Data
    Given user Enter username "<Username>"
    And user Enter password "<Password>"
    Then click on login button

    Examples:
      | Username | Password    |
      | arouf    | SPOLAR@2022 |



