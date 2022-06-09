Feature: Verify Initial View Page

  Background:
    Given user Enter username "t2spol"
    And user Enter password "asdfgh"
    Then click on login button

    #Assessment_TC 1
  @login
  Scenario: Verify that page title is showing as ""All  Assessments by Program"
    Given Click on Assessments option
    When  Click on the All Assessments


  #Assessment_TC 2
  @login
  Scenario: Verify that in the "All Assessments by Programr" page, "Detail Button_Primary" button is available
    Given click Assessment option from left menu
    When  click on all Assessment
    Given click detail Primary Button


    #Assessment_TC 3
  @login
  Scenario: Verify that in the "All Assessments by Program" page, "Detail Button_Primary" button is available
    Given click Assessment option from left menu
    When  click on all Assessment
    Then  click detail  secondary button

# Assessment_TC 4
  @login
  Scenario: Verify that in the "All Assessments by Program" Search bar is available
    Given click Assessment option from left menu
    When click on all Assessment
    And  click detail Primary Button
    When Search Field Check

#  Assessment_TC 05
  @login
  Scenario: Verify that in the "All Assessments by Program" Program Manager Dropdown
    Given click Assessment option from left menu
    When  click on all Assessment
    Then  click detail Primary Button
    And   Click on Program Manager Dropdown

   #  Assessment_TC 06
  @login
  Scenario: Verify that in the "All Assessments by Program" Outcome Type Dropdown
    Given click Assessment option from left menu
    When  click on all Assessment
    Then click detail Primary Button
    And  Click on Outcome Type dropdown Bar

    #  Assessment_TC  07
  @login
  Scenario: Verify that in the "All Assessments by Program" page "View All Programs" CheckBox is available
    Given click Assessment option from left menu
    When  click on all Assessment
    And  click detail Primary Button
    Then Click on View All Programs CheckBox and mark it


   #  Assessment_TC  8
#  @login
#  Scenario: Verify that in the "All Assessments by Program" page "Collapse All" CheckBox is available
#    Given click Assessment option from left menu
#    When click on all Assessment
#    And  click detail Primary Button
#    And  Click on Collapse All CheckBox and mark it

#
#   # Assessment_TC 09
#  @login
#  Scenario: Verify that page title is showing as All Assessments by Program
#    Given click Assessment option from left menu
#    When  click on all Assessment
#    And  click detail Primary Button
#    Then Click on View All Programs CheckBox and mark it
#    When Click on Collapse All CheckBox and mark it



     # Assessment_TC 10
  @login
  Scenario: Verify that in the All Assessments by Program" page, "Detail Button_Secondary" button is available
    Given click Assessment option from left menu
    When click on all Assessment
    And click Detail Button_Secondary button



   #  Assessment_TC 11
  @login
  Scenario: Verify that in the "All Assessments by Program" Search bar is available
    Given click Assessment option from left menu
    When click on all Assessment
    And click Detail Button_Secondary button
    Then Click on Search bar write a value


 #  Assessment_TC 12
  @login
  Scenario: Verify that in the "All Assessments by Program" Program Manager Dropdown
    Given click Assessment option from left menu
    And   click on all Assessment
    Then  click Detail Button_Secondary button
    And   Click on Program Manager Dropdown



# Assessment_TC 13
  @login
  Scenario: Verify that in the "All Assessments by Program" Outcome Type" dropdown is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click Detail Button_Secondary button
    And Click on Outcome Type dropdown Bar

 #  Assessment_TC 14
  @login
  Scenario: Verify that in the "All Assessments by Program" page "All Units" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click Detail Button_Secondary button
    And Click on View All Programs CheckBox and mark it

 #  Assessment_TC 15
  @login
  Scenario:Verify that in the "All Assessments by Program" page "Collapse All" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click Detail Button_Secondary button
    Then Click on Collapse All CheckBox and mark it

  # Assessment_TC 16
  @login
  Scenario:Verify that in the "All Assessments by Program" page "View All Programs"And Collapse All  CheckBox is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click Detail Button_Secondary button
    And Click on View All Programs CheckBox and mark it
    Then Click on Collapse All CheckBox and mark it

# Assessment_TC 17
  @login
  Scenario: Verify that in the "All Assessments by Manager" page, "Detail Button_Primary" button is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar

# Assessment_TC 18
  @login
  Scenario: Verify that in the "All Assessments by Course" page, is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    And Click on by Course

# Assessment_TC_19
  @login
  Scenario: Verify that page title is showing as ""All Assessments by Course and Top right side corner Alert Icon will be clickable
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    And Click on by Course
    Then click on Alert Icon

# Assessment_TC_20
  @login
  Scenario: Verify that in the "All Assessments by Course" page, "Detail Button_Primary" button is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    And  click detail Primary Button

#  Assessment_TC_21
  @login
  Scenario: Verify that in the "All Assessments by  Course" Faculty Dropdown bar is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    Then Click on by Course
    When click detail Primary Button
    And  Click on Program Faculty Dropdown

# Assessment_TC_22
  @login
  Scenario: Verify that in the "All Assessments by  Course" Outcome Type Dropdown list  is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    When click detail Primary Button
    Then Click on Outcome Type dropdown Bar

# Assessment_TC_23
  @login
  Scenario: Verify that in the "All Assessments by  Course" page "View All Courses" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    When click detail Primary Button
    And Click on View All Courses CheckBox and mark it

# Assessment_TC_24
  @login
  Scenario:Verify that in the "All Assessments by Course" page "Collapse All" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    And click detail Primary Button
    Then Click on Collapse All CheckBox and mark it

# Assessment_TC_25
  @login
    Scenario: Verify that page title is showing as  All Assessments by Course
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    Then Click on by Course
    And click detail Primary Button
    When Click on View All Courses CheckBox and mark it
    Then Click on Collapse All CheckBox and mark it

# Assessment_TC_26
  @login
  Scenario: Verify that in the "All Assessments by Course" page, "Detail Button_Secondary" button is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    And click Detail Button_Secondary button

# Assessment_TC_27
  @login
  Scenario:Verify that in the "All Assessments by Course" page,  Three dot button  is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Course
    And Click on Three dot Icon

# Assessment_TC_28
  @login
  Scenario: Verify that in the "All Assessments by by Service Ariea" page, is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    And Click on by Service Area

# Assessment_TC_29
  @login
  Scenario:Verify that page title is showing as ""All Assessments by Service Area" right top search bar is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Service Area
    And click on right side top corner search Bar

# Assessment_TC_30
  @login
  Scenario: Verify that in the "All Assessments by Service Area" page, "Detail Button_Primary" button is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    And  Click on by Service Area
    Then click Detail Button_Primary button

# Assessment_TC_31
  @login
  Scenario: Verify that in the "All Assessments by Service Area" Dropdown is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Service Area
    And click Detail Button_Primary button
    Then Click on Service Area Manager Dropdown

# Assessment_TC_32
  @login
  Scenario: Verify that in the All Assessments by Service Area Outcome Type Dwopdown is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    And Click on by Service Area
    Then click Detail Button_Primary button
    And  Click on Outcome Type dropdown Bar

# Assessment_TC_33
  @login
  Scenario: Verify that in the "All Assessments View All Service Areas" page "View All  Service Areas " CheckBox is available
    Given click Assessment option from left menu
    And click on all Assessment
    Then click on All Assessments by Program text bar
    And Click on by Service Area
    Then click Detail Button_Primary button
    And  Click on View All Service Areas CheckBox and mark it

# Assessment_TC_34
  @login
  Scenario:Verify that in the "All Assessments by Service Area" page "Collapse All" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And click on All Assessments by Program text bar
    Then Click on by Service Area
    And  click Detail Button_Primary button
    Then Click on Collapse All CheckBox and mark it

# Assessment_TC_35
  @login
  Scenario: Verify that page title is showing as "All Assessments by Service Area"
  View All  Service Areas and Collapse All" CheckBox is available
    Given click Assessment option from left menu
    Then click on all Assessment
    And  click on All Assessments by Program text bar
    Then Click on by Service Area
    And  click Detail Button_Primary button
    When Click on View All Service Areas CheckBox and mark it
    Then Click on Collapse All CheckBox and mark it

# Assessment_TC_36
  @login
  Scenario: Verify that in the "All Assessments by Service Area" page, "Detail Button_Secondary" button is available
    Given click Assessment option from left menu
    And   click on all Assessment
    Then  click on All Assessments by Program text bar
    And  Click on by Service Area
    Then click Detail Button_Secondary button