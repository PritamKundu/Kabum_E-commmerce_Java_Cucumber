Feature: Verify Budget Approval and note

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button

    # Budget 34
  @BudgetM4
  Scenario: Verify that click on active checkbox
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    Then input searchbox on budget unit manager

    #Budget 35
  @BudgetM4
  Scenario: Verify that Add Remove GL Code to Budget available
    Given Click Budget option
    Then  Click on the All Budget from left menu items
    And   Click on All Unit CheckBox
    Then  Click on Search bar write a value of your previous making Budget Account
    And   open it  display will show you Budget Details
    Then  click on DRAFT

  #Budget 36
  @BudgetM4
  Scenario: Verify that Add or Remove GL Code to Budget available
    Given  Click on Budget option
    When   Click on the All Budget from left menu item
    Then   Click on All Units CheckBox
    And    Search Bar Write AValue Of Your Previous Making Budget Account
    Then   open it  display will show you Budget Details
    Then   Click on plus button

  # Budget 37
  @BudgetM4
  Scenario: Verify that left side  Budget Summary form available
    Given Click on Budget options
    Then  Click the all Budget from left menu item
    And   click All Unit CheckBox
    Then  Click Search bar write a value of your previous making Budget Account
    And   click All Unit CheckBox
    Then  open it  display will show you Budget Details
    Then  Click on Plus  button
    And   Select A value from Add and Remove GL Code to Budget form select option

  # Budget 38
  @BudgetM4
  Scenario: Verify that Approval Note" popup should be displayed
    Given Click On Budget option
    Then  Click All Budget from left menu items
    And   click On all Unit CheckBox
    Then  Click Search Bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click OnPlus Button
    Then  Select A value From Add Remove GL Code to Budget form select option
    Then  Click the Save Button

  # Budget 39
  @BudgetM4
  Scenario: Verify that New Selection Bar will be on display
    Given Click on Budget option
    And   Click All Budget from left menu items
    Then  click On all Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    Then  Click OnPlus Button
    And   Select A value From Add Remove GL Code to Budget form select option
    And   Click the Cancel Button

#SB_40
  @BudgetM4
  Scenario: Verify that click on active checkbox and budget details and save
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    And click budget unit account button
    And click plus btn
    Then select a value from add remove GL
    Then click save button on budget details
#Budget_40
  @BudgetM4
  Scenario: Verify that click on checkbox
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    And click budget unit account button
    Then click on chk box
#Budget_41

  @BudgetM4
  Scenario: Verify that click on active checkbox and budget details and click expenditures
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then click expenditures

#Budget_42
  @BudgetM4
  Scenario: Verify that click on checkbox and budget details click expenditures and three dot
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then click expenditures
    Then click three dot budget summery

#Budget_43
  @BudgetM4
  Scenario: Verify that click on checkbox and budget details click expenditures and three dot and delete
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then click expenditures
    Then click three dot budget summery
    Then click delete button on budget summery


#Budget_44
  @BudgetM4
  Scenario: Verify that click on checkbox and delete
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then click expenditures
    Then click three dot budget summery
    Then click delete button on budget summery
    Then click delete button and delete

#FAVORITE ICON
# Budget 45
  @BudgetM4
  Scenario: Verify that "Favourite" icon is showing in gray color beside the "Note" icon
    Given Click on Budget option
    When  Click on the All Budget from left menu items
    And   click on All Unit CheckBox
    Then  Click on Search bar write a value of your previous making Budget Account
    And   open it  display will show you Budget Details
    Then  Click the  Favourite star icon



#Budget 46
  @BudgetM4
  Scenario: Verify that after clicking on "Favourite" icon the color is changing
  to Yellow and notification message as Added to Favourite successfully is showing
    Given Click on Budget option
    Then Click on the All Budget from left menu items
    And  click on All Unit CheckBox
    Then Click on Search bar write a value of your previous making Budget Account
    Then open it  display will show you Budget Details
    And  Again click the  Favourite star icon
#Budget 47
  @BudgetM4
  Scenario:Verify that clicking on the "Budget Attachments" link a new form is opening in the right side of the details page
  Given Click on Budget option
  And   Click on the All Budget from left menu items
  Then  click on All Unit CheckBox
  Then  Click on Search bar write a value of your previous making Budget Account
  And   open it  display will show you Budget Details
  Then  Click on Attachments Tab
  Then  Click on Document Repository Plus button

#Budget48
  @BudgetM4
  Scenario: Verify that clicking on the "Attachments and click budget document
  " link a new form is opening with following attributes:
  > Budget Documents Upload
  > Download >Dpload > Delete > Version > Search Box
    Given Click on Budget option
    Then  Click on the All Budget from left menu items
    And   click on All Unit CheckBox
    Then  Click on Search bar write a value of your previous making Budget Account
    And   open it  display will show you Budget Details
    Then  Click on Attachments Tab
    And   Click on Document Repository Plus button
    Then  Mouse Right click of Budget Document
    And   Create a New Directory


# Budget 49
  @BudgetM4
  Scenario:Verify that clicking on the "Attachments and click delete button
  " link a new form is opening with following attributes
    Given  Click on Budget option
    Then  Click on the All Budget from left menu item
    Then  click on All Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click on Attachments Tab
    And   Click on Document Repository Plus button
    And   Select New Directory folder
    Then  click Blue Color UPLOAD button
    Then Click on Select files and select any file from your device


# Budget 50
  @BudgetM4
  Scenario: Verify that clicking on the "Attachments
  " link a new form is opening with following attributes:
  >Select your Uploaded  file
    Given  Click on Budget option
    Then  Click on the All Budget from left menu item
    Then  click on All Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click on Attachments Tab
    And   Click on Document Repository Plus button
    And   Select New Directory folder
    Then  click Blue Color UPLOAD button
    Then Click on Select files and select any file from your device
#    Then  Click on Upload Button




















