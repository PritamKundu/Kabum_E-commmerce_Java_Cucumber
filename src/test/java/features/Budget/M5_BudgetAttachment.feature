Feature: Verify Budget Attachment add link management

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button
# Budget 51
  @BudgetM5
  Scenario: Verify that clicking on the "Attachments link a new form is opening with following attributes
    Given  Click on Budget option
    Then  Click on the All Budget from left menu item
    Then  click on All Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click on Attachments Tab
    And   Click on Document Repository Plus button
    And   Select New Directory folder
#    Then  click Blue Color UPLOAD button
#    And Click on Select files and select any file from your device
#    Then  Click on Upload Button
#    Then created folders button and right click of your mouse

    # Budget 52
  @BudgetM5
  Scenario: Verify that clicking on the "Attachments link a new form is opening with following attributes and delete
    Given  Click on Budget option
    Then  Click on the All Budget from left menu item
    Then  click on All Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click on Attachments Tab
    And   Click on Document Repository Plus button
    And   Select New Directory folder
#    Then  click Blue Color UPLOAD button
#    And Click on Select files and select any file from your device
#    Then  Click on Upload Button
#    Then created folders button and right click of your mouse
#    Then click delete directory on budget documents
#    Then click delete button plus yes

 # Budget 53
  @BudgetM5
  Scenario: Verify that clicking on the "Attachments link a new form is opening with following attributes and click x icon
    Given  Click on Budget option
    Then  Click on the All Budget from left menu item
    Then  click on All Unit CheckBox
    And   Click on Search bar write a value of your previous making Budget Account
    Then  open it  display will show you Budget Details
    And   Click on Attachments Tab
    And   Click on Document Repository Plus button
    And   Select New Directory folder
    Then  click Blue Color UPLOAD button
    And Click on Select files and select any file from your device
#    Then  Click on Upload Button
#    Then created folders button and right click of your mouse
#    Then click delete directory on budget documents
#    Then click delete button plus yes
#    Then click delete button plus yes and x icon
    #Budget 54
  @BudgetM5
  Scenario: Verify that clicking the attachment
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then  Click on Attachments Tab
    Then click on budget attchment plus button
#    Then right click on budget link
#    Then right click on new directory
#    Then show four options

    #Budget 55
  @BudgetM5
  Scenario: Verify that clicking the attachment select file and click edit
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then  Click on Attachments Tab
    Then click on budget attchment plus button
#    Then right click on budget link
#    Then right click on new directory
#    Then right click on new directory for edit button
#    Then Click edit blue button

     #Budget 56
  @BudgetM5
  Scenario: Verify that clicking the attachment select file and click edit and input value
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then  Click on Attachments Tab
    Then click on budget attchment plus button
#    Then right click on budget link
#    Then right click on new directory
#    Then right click on new directory for edit button
#    Then Click edit blue button
#    Then input link name on edit links
#    Then input Link URL from edit option
#    And  input a Link Description
#    Then Click on Save button

   #Budget 57
  @BudgetM5
  Scenario: Verify that clicking the attachment New Popup From Should be created
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then  Click on Attachments Tab
    Then click on budget attchment plus button
#    Then right click on budget link
#    Then right click on new directory
#    Then right click on new directory for edit button
#    Then Click NEW blue button
#    Then input link name on edit links
#    Then input Link URL from edit option
#    And  input a Link Description
#    Then Click on Save button

# Budget 58
  @BudgetM5
  Scenario: Verify that previous The Created Link is working properly
    Given click budget option from left menu
    When  click on all budget
    And   verify unit manager page is available
    And   click all unit box in bugt by unit manager
    And   input searchbox on budget unit manager
    Then  click budget unit account button
    Then  Click on Attachments Tab
    Then  click on budget attchment plus button
#    Then  right click on budget link
#    And   Select a Created Directory
#    Then  Click on Blue Color NEW Icon


# #SB 59
# @login
#   Scenario: Verify that clicking on Attachments Created new Directory Rename
#   Given click budget option from left menu
#   When  click on all budget
#   And   verify unit manager page is available
#   And   click all unit box in bugt by unit manager
#   And   input searchbox on budget unit manager
#   Then  click budget unit account button
#   Then  Click on Attachments Tab
#   Then  click on budget attchment plus button
#   Then  right click on budget link
#   And   Select a Created Directory right click
#   Then  Click on Rename Directory
#   And   change name Directory



  #Budget 59
  @BudgetM5
  Scenario: Verify that clicking the attachment Created Links Will Delete And display will be close
    Given click budget option from left menu
    When click on all budget
    And verify unit manager page is available
    And click all unit box in bugt by unit manager
    And input searchbox on budget unit manager
    Then click budget unit account button
    Then  Click on Attachments Tab
    Then click on budget attchment plus button
#    Then right click on budget link
#    Then right click on new directory for edit button
#    And  Click On Delete Button
#    Then Click on YES Button
#    And  Click On X Icon





