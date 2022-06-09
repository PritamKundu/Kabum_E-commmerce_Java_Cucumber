Feature: Verify Initial View Page

  Background:
    Given user Enter username "tspol"
    And user Enter password "asdfgh"
    Then click on login button


#SA 01
  Scenario: Verify that page title is showing as ""All  Accreditation by standard"
    Given Click on Accreditation option
    When Click on the All Accreditation

#SA 02
  Scenario: Verify that in the "All Accreditation by Standard" page, "Detail Button_Primary" button is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click detail primary button on accreditation page

#SA 03
  Scenario: Verify that in the "All Accreditation by Standard" page, "Detail Secondary" button
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click detail Secondary button on accreditation page

#SA 04
  Scenario: Verify that in the "All Accreditation by Standard" page, "Detail Secondary" button
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click detail Secondary button on accreditation page

#SA 04
  Scenario: Verify that in the "All Accreditation by Standard" page, "Accreditation Source"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Source code bar dropdown

#SA 05
  Scenario: Verify that in the "All Accreditation by Standard" page, "Accreditation-Cycle"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on test Accre Cycle

#SA 06
  Scenario: Verify that in the "All Accreditation by Standard" page, "Accreditation-Standard"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on Assigned Standard dropdown

#SA 07
  Scenario:Verify that in the "All Accreditation by Standard" page, "View All Standards"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox

#SA 08
  Scenario:Verify that in the "All Accreditation by Standard" page, "Collapse all Checkbox"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on Collapse All checkbox

#SA 09
  Scenario:Verify that in the "All Accreditation by Standard" page, "Publish" Button is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on publish button

#SA 10
  Scenario:Verify that in the "All Accreditation by Standard" page, "3 dot_icon-box dropdown"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Focus on three dot box

#SA 11
  Scenario:Verify that in the "All Accreditation by Standard" page, and click "3 dot_icon-box dropdown"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box

#SA 12
  Scenario:Verify that in the "All Accreditation by Standard" page, and click "New Section"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section

#SAC 13
  Scenario:Verify that in the "New Section" form, "Version" dropdown field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And version dropdown should be displayed

#SAC 14
  Scenario:Verify that in the "New Sectiont" form, "Section Number" text field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Section Number should be displayed

#SAC 15
  Scenario:Verify that in the "New Section" form, "Section Title" text field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Section Title should be displayed

#SAC 16
  Scenario:Verify that in the "New Section" form, "Report Header" text field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Input value on report header

#SAC 17
  Scenario:Verify that in the "New Section" form, "Sort Order" text field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Sort Order Should be Displayed

#SAC 18
  Scenario:Verify that in the "New Section" form, "Parent Section" dropdown field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Parent section Should be Displayed

#SAC 19
  Scenario:Verify that in the "New Section" form, "Save" button field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And displayed on save button

#SAC 20
  Scenario:Verify that in the "New Section" form, "Cancel" button field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And displayed Cancel button

#SAC 21
  Scenario:Verify that in the "New Sectiont" And Click "Section Number"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Click Section Number Field

#SAC 22
  Scenario:Verify that in the "New Sectiont" And Click "Section Title"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Click Section Title Field

#SAC 23
  Scenario:Verify that after providing value in every mandatory fields data is saved
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And click on New Section
    And Input Section Number Field
    And Input Section Title Field
    And click on save button

#SAC 24
  Scenario:Verify that after providing value and click new standard
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard

#SAC 25
  Scenario:Verify that in the "New Standard" form, "Standard Number:" dropdown field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And focus on Standard Number

#SAC 26
  Scenario:Verify that in the "New Standard" form, "Sort Order:" dropdown field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And focus on Sort Order

#SAC 27
  Scenario:Verify that in the "New Standard" form, "Parent Section" dropdown field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And focus on parent section on new standard

#SAC 28
  Scenario:Verify that in the "New Standard" form, "Standard Summary" text field is available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And focus on standard summary

#SAC 29
  Scenario:Verify that in the "New Standard" And input on "Sort Order"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And Input On Sort Order

#SAC 30
  Scenario:Verify that in the "New Standard" And click on "save"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And Click on SAVE button

#SAC 31
  Scenario:Verify that in the "New Standard" And click on "Cancel"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And Click on Cancel button

#SAC 32
  Scenario:Verify that after providing value in every mandatory fields on new standard
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on three dot box
    And Click on New Standard
    And Input on Standard Number
    And Input On Sort Order
    And click on parent section
    And select mission on parent section
    And select Standard Summary
    And Enter value into Standard Description
    And click save on new standard

#sub-module : Plan A New Cycle

#SAC 33
  Scenario:Verify that in the "Plan a New Cycle" page are displayed in this screen
    Given Click on Accreditation option
    When Click on the Plan a New Cycle

#SAC 34
  Scenario:Verify that in the "Plan a New Cycle" page are displayed in this screen
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Focus on Select step cycle icon

#SAC 35
  Scenario:Verify that "Select " page, by default all Source Acronym are unselected.
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Focus on Select step cycle icon
    And Click on Select Source Acronym

#SAC 36
  Scenario:Verify that "Select Accreditation Source" page, select Source Acronym
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button

#SAC 37
  Scenario:Verify that clicking on the "Next Button" link a new page "Enter Reporting Cycle Data" is opening
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input Value On Accreditation Cycle Title
    And Click on Next Button

#SAC 38
  Scenario:Verify that clicking on the "Next Button" and try to move any others fields
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Click On Accreditation Cycle Title
    And Click On Begin Date

#SAC 39
  Scenario:Verify that enter "Accreditation Cycle Title"  and click on Next Button a new page "Select a Baseline " is opening
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button


#SAC 40
  Scenario:Verify that "Select a Baseline" page, by default all Reporting Cycle are unselected.
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Focus on Reporting cycle

#SAC 41
  Scenario:Verify that "Select a Baseline" page, Source, Accreditation Cycle And version are displayed
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Focus on Select a BaseLine
    And Focus on Source
    And Focus on Accreditation Cycle Title
    And Focus on Version

#SAC 42
  Scenario:Verify that "Select a Baseline" page, click on select button than "Reporting Cycle" is selected
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle

#SAC 43
  Scenario:Verify that select "Reporting Cycle" and click on Next Button a new page "Select Approvers" is opening
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle
    And Click on Next Button

#SAC 44
  Scenario:Verify that after clicking on Next button"Planning Unit" reader dropdown is Displyed
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle
    And Click on Next Button
    And Click on Chairman planning unit

#SAC 45
  Scenario:Verify that select "Select Source Level Approvers" and click on Next Button a new page "Select Standards" is opening
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle
    And Click on Next Button
    And Click on Chairman planning unit
    And Select a planning unit
    And Click on Next Button

#SAC 46
  Scenario:Verify that after click on Next Button "Standards to Include in Cycle" is displyed
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle
    And Click on Next Button
    And Click on Chairman planning unit
    And Select a planning unit
    And Click on Next Button
    And Click on Select Standard to include in Cycle

#SAC 47
  Scenario:Verify that select "Standards to Include in Cycle" and click on Next Button a new page "Finish" is opening
    Given Click on Accreditation option
    When Click on the Plan a New Cycle
    Then Select One On Source Acronym
    And Click on Next Button
    And Input On Accreditation Cycle Title
    And Click on Next Button
    And Click on Radio Button in Reporting Cycle
    And Click on Next Button
    And Click on Chairman planning unit
    And Select a planning unit
    And Click on Next Button
    And Click on Select Standard to include in Cycle
    And Click on Next Button

#Publish a Cycle // Publish Report
# SAC 48
  Scenario:Verify that in the "publish A  Cycle" page are displayed in this screen
    Given Click on Accreditation option
    When Click on the Publish a New Cycle

#SAC 49
  Scenario:Verify that in the "Publish Report" page, "Source Dropdown , Cycle Dropcoen, Report Dropdown are available
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click Source on publish
    And Click Select a Cycle
    And Click Report DropDown

#SAC 50
  Scenario:Verify that in the "Publish Report" page, "Preview and Publish" button is displayed
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Focus on Publish

#SAC 51
  Scenario:Verify that in the "Publish Report" page, "Preview and Publish" button by default disable
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click on Publish Button

#SAC 52
  Scenario:Verify that after select "Source" dropdown then "Cycle" dropdown filtering and displayed result accordingly
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click Source on publish
    And Select Source on Publish
#    And Click Select a Cycle
#    And Select on SelectaCycle
#    And Click Report DropDown

#SAC 53
  Scenario:Verify that after select "Cycle" dropdown then Select Standard A new form is open right side
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click Source on publish
    And Select Source on Publish
    And Click Select a Cycle
    And Select on SelectaCycle
#    And Click Report DropDown

#SAC 55
  Scenario:Verify that after select "Report" dropdown then, "Preview and Publish" button is displayed Enable
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click Source on publish
    And Select Source on Publish
    And Click Select a Cycle
    And Select on SelectaCycle
    And Click Report DropDown
    And Select Generic Report Dropdown

#SAC 56
  Scenario:Verify that after select "Report" dropdown then, "Preview and Publish" button is displayed Enable
    Given Click on Accreditation option
    When Click on the Publish a New Cycle
    And Click Source on publish
    And Select Source on Publish
    And Click Select a Cycle
    And Select on SelectaCycle
    And Click Report DropDown
    And Select Generic Report Dropdown
    And Click on Publish Button

#SAC 57
  Scenario:Verify that page Header title is showing as "Standard Details"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Standard page displayed

#SAC 58
  Scenario:Verify that "Standard Detaild" Page, Standard, Approval DRAFT, Approval Notes, Favorite icon are displaying
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Standard page displayed
    And Info Page Displayed
    And Response Page Displayed
    And Associations Page Displayed
    And Attachment Page Displayed
    And History Page Displayed

##SA 58
#  Scenario:Verify that on "Standard Details" - INFO tab", following fields are displaying
#    Given Click on Accreditation option
#    When Click on the All Accreditation
#    Then Click on Focus on View All Standard checkbox
#    And Click On Standard
#    And Standard page displayed
#    And Info Page Displayed
#    And Response Page Displayed
#    And Associations Page Displayed
#    And Attachment Page Displayed
#    And History Page Displayed

#SAC 59
  Scenario:Verify that on "Standard Details" - INFO tab", following fields are displaying
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Displayed Follow Up
    And Displayed Planning Units

    #............................................Add Suggested Follow Up....................................................#

#SAC 60
  Scenario:Verify that new form title is showing as "Suggested Follow Up"
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Click Follow Up

#SAC 61
  Scenario:Verify that following fields are available in the "Suggested Follow Up" form
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Click Follow Up
    And Click Format on Follow Up
    And Select A Format On Follow Up

#SAC 62
  Scenario:Verify that Cancel and Save button are available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Click Follow Up
    And Click Format on Follow Up
    And Select A Format On Follow Up
    And Focus on SAVE Button
    And Focus on CANCEL Button

#SAC 63
  Scenario:Verify that Cancel and Save button are available
    Given Click on Accreditation option
    When Click on the All Accreditation
    Then Click on Focus on View All Standard checkbox
    And Click On Standard
    And Click Follow Up
    And Click Description on Follow Up