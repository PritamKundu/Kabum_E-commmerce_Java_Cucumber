Feature: Verify Initial View Page

  #Background:
    #Given user Enter username "TESSupport"
    #And user Enter password "SPOL_Support@2014"
    #Then click on login button

  # Credentialing_01/2/
  @Credentialing
  Scenario: Verify add to cart system
    Given search notebook
    When click first notebook
    And enter zip code & print shipping values

 # Credentialing_03/04
  @Credentialing
  Scenario:Verify that the credential page is open
    Given Click on the credentialing and landing on the credentialing page
    And Click All Credentials

 # Credentialing_05
  @Credentialing
  Scenario:Verify Faculty tab is displayed with the dropdown of Faculty name
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then All Faculty tab displayed and drop down with Faculty name displayed

# Credentialing_06
  @Credentialing
  Scenario:Verify All Disciplines tab is displayed with the dropdown of Disciplines name
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then All Disciplines Selected tab displayed and drop down with Disciplines name displayed
    And  Drop down with Disciplines name displayed

# Credentialing_07
  @Credentialing
  Scenario:Verify All Status tab displayed and the drop down with Status
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then  All Status tab displayed and drop down with Status displayed


# Credentialing_08
  @Credentialing
  Scenario:Verify courses Taught is displayed and Clicking the checkbox
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    And Courses Taught displayed and selecting the button

# Credentialing_09
  @Credentialing
  Scenario:Verify that semesters tab is a dropdown menu
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Courses Taught displayed and selecting the button
    And  semesters tab drop down

# Credentialing_10
  @Credentialing
  Scenario:Verify that 3 dot button contains New Faculty
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty

# Credentialing_11
  @Credentialing
  Scenario:Verify that the spol user is a dropdown menu
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then SPOL User tab displayed with drop down

# Credentialing_12
  @Credentialing
  Scenario:Verify The prefix is an insertion filled
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And selecting the new Faculty
    Then the Prefix tab is displayed and filled

# Credentialing_13
  @Credentialing
  Scenario:Verify that First name, Middle name, Last name each is an insertion field
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then Verify First name
    And  Verify Middle Name
    Then Verify Last name

#  Credentialing_14
  @Credentialing
  Scenario:Verify that Employee Name is an Insertion field
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then  Verify Employee number tab is displayed and filled

  #  Credentialing_15
  @Credentialing
  Scenario:Verify that Email is an Insertion field
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then verify email tab displayed
    Then Verify Email tab is filled and displayed

  #  Credentialing_16
  @Credentialing
  Scenario:Verify that Faculty Rank displayed a dropdown menu
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then Verify Faculty Rank tab filled and displayed with drop down

 #  Credentialing_17
  @Credentialing
  Scenario:Verify that Employment Type displayed a dropdown menu
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then Verify Employment type tab is filled and displayed with drop down

 #  Credentialing_18
  @Credentialing
  Scenario:Verify that Active button is selected
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    Then Verify Active button is verified


 #  Credentialing_19
  @Credentialing
  Scenario:Verify that Save button works properly
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    And Displayed SAVE Button

#  Credentialing_20
  @Credentialing
  Scenario:Verify that Cancel button works properly
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  selecting the new Faculty
    And   Verify Cancel button is Working

#  Credentialing_21
  @Credentialing
  Scenario:Verify that 3 dot button contains New Certificate
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials

#  Credentialing_22
  @Credentialing
  Scenario:Verify that Faculty is selected from the dropdown
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
#
#  Credentialing_23
  @Credentialing
  Scenario:Verify that new Credentials Certificate is available
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    And Select A Faculty name from Adding new Credentials
#modify needed in steps title

#  Credentialing_24
  @Credentialing
  Scenario:Verify that date is selectable from Effective Date
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    And Select A Faculty name from Adding new Credentials
    Then Adding the date to the new certificate
    And Select A Date

#  Credentialing_25
  @Credentialing
  Scenario:Verify that discipline can be selected from the dropdown
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    And Select A Faculty name from Adding new Credentials
    Then Click on  Discipline bar
    And Select A Discipline

#  Credentialing_26
  @Credentialing
  Scenario:Verify that Primary button is selected by default
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    And Select A Faculty name from Adding new Credentials
    When Primary button is displayed is not selected
    Then Primary button is displayed is not selected

#  Credentialing_27
  @Credentialing
  Scenario:Verify that cancel button works properly
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    When Select A Faculty name from Adding new Credentials
#    Then Click on cancel Button

#  Credentialing_28
  @Credentialing
  Scenario:Verify that save button works fine
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name
    And Select A Faculty name from Adding new Credentials
    Then Click on  Discipline bar
    And Select A Discipline
    Then Click on Course CheckBox
    And  Click on Relevant Credentials CheckBox
#    Then  Click on save button

#  Credentialing_29
  @Credentialing
  Scenario:Verify that another Faculty Can be selected from the dropdown
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then click detail  secondary option
    Then Clicking right 3 dots
    And  Verify New Credentials certificate tab is open by clicking New Credentials
    Then Verify Selecting the Faculty name
    And Select A Faculty name


#  Credentialing_30
  @Credentialing
  Scenario:Verify the Faculty Details info is displayed
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And selecting the new Faculty
    Then SPOL User tab displayed with drop down
    And  Select Before Created SPOL User

#  Credentialing_31
  @Credentialing
  Scenario:Verify the Faculty Details info is displayed with a popup form
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Clicking right 3 dots
    And selecting the new Faculty
    Then SPOL User tab displayed with drop down
    And  Select Before Created SPOL User
    Then Verify the Faculty Details info

#  Credentialing_32
  @Credentialing
  Scenario:Verify Degree and Relevant Courses are displayed and Adding the info by pressing
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    When Relevant Courses are displayed
    Then Verify Degree and Relevant Courses are displayed and Adding the info

#  Credentialing_33
  @Credentialing
  Scenario:Verify Degrees and Relevant Courses info tab is displayed Highest Degree Earned select box
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And Verify Degrees and Relevant Courses info tab is displayed with Highest Degree Earned with select box

#  Credentialing_34
  @Credentialing
  Scenario:Verify Degrees and Relevant Courses tab is displayed the Earned Degree dropdown
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Earned Degree with the drop down
    Then select the option from down

#  Credentialing_35
  @Credentialing
  Scenario:Verify plus or edit the faculty degree press plus icon on the right Earned degree
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Click on plus icon or Add or Edit option
    And  Add Degree Acronym
    Then Enter a Degree Title
    When Mark Is Terminal check Box
    And  Mark a Active Check Box

   #  Credentialing_36
  @Credentialing
  Scenario:Verify Add/Edit displayed with Degree Acronym, Degree Title, Is Terminal and Active
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Click on plus icon or Add or Edit option

    #  Credentialing_37
  @Credentialing
  Scenario:Verify Make sure Save and cancel button is working
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Click on plus icon or Add or Edit option
    And  Add Degree Acronym
    Then Enter a Degree Title
    When Mark Is Terminal check Box
    And  Mark a Active Check Box
    And  Verify Make sure Cancel Button is working
    Then Click on plus icon or Add or Edit option
    And  Add Degree Acronym
    Then Enter a Degree Title
    When Mark Is Terminal check Box
    And  Mark a Active Check Box
    Then Verify Make sure Save Button is working

#  Credentialing_38
  @Credentialing
  Scenario:Verify Granting Institution is selected the institution from the dropdown
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Granting Institution with the drop down
    Then select the option from down

#  Credentialing_39
  @Credentialing
  Scenario:Verify Granting Institution Detail tab is oped by clicking plus icon on the Degree and Relevant course
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Granting Institution with the drop down
    Then Click on plus icon or Add option

#  Credentialing_40
  @Credentialing
  Scenario:Verify Institution name is displayed and filled
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Granting Institution with the drop down
    Then Verify Institution name is displayed and filled

#  Credentialing_41
  @Credentialing
  Scenario:Verify Accrediting Body is selected from the drop down and click on plus icon in the top Accrediting Body Detail
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Granting Institution with the drop down
    Then Verify Institution name is displayed and filled
    When Click on plus icon or Add option
    Then Again Click on plus icon or Add option
    And  Add Accrediting body Acronym
    Then Add Accrediting body name
    And Select on  Active Checkbox
    And Select on  Active Checkbox
    Then selected with save button

#  Credentialing_42
  @Credentialing
  Scenario:Granting Institution Detail tab contains all the insertion values
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Granting Institution with the drop down
    Then Verify Institution name is displayed and filled
    When Click on plus icon or Add option
    And  Enter Address 1
    Then Enter Address 2
    And Click on country
    Then Add Country
    And  Click on State
    Then Then Add State
    And  Add City
    Then Add Zip code
    Then Click on Accredited checkbox
    And  Mark a Active Check Box
    Then Mark a Active Check Box

#  Credentialing_43
  @Credentialing
  Scenario:verify Faculty Discipline tab is filled with the drop down and select on plus icon Faculty Discipline Detail tab will open
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Again Click on plus icon or Add option 2

#  Credentialing_44
  @Credentialing
  Scenario:Verify Faculty Discipline Detail tab is displayed with Discipline Title, Active with select button and save the title
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Again Click on plus icon or Add option 2
    And  Enter Discipline Title
    Then Mark a Active Check Box
    And  Mark a Active Check Box
    And  Click on Save Button

 #  Credentialing_45
  @Credentialing
  Scenario:Verify Date conferred is displayed and filled
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    Then Adding the date to the new certificate
    And Select A Date


 #  Credentialing_46
  @Credentialing
  Scenario:Verify Relevant course credit Earned is displayed and select plus icon
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Verify Relevant course credit Earned is displayed and adding plus press

#  Credentialing_47
  @Credentialing
  Scenario: Verify after clicking Degrees and Relevant Courses plus icon display Degrees and Relevant Courses popup form
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    Then Verify Degree and Relevant Courses are displayed and Adding the info
    And  Verify Relevant course credit Earned is displayed and adding plus press
    Then Add Course Number
    And  Add Course Title
    Then Add Hours Earned
    And  Select hours Type with drop down
    And  Select hours Type
    And  Click on Relevant Course Credit Earned save button

#  Credentialing_48
  @Credentialing
  Scenario: Verify that professional Experiences displayed and clicking plus icon the professional Experience info tab is opened at right side
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click And Professional Experience

#  Credentialing_49
  @Credentialing
  Scenario: Verify Professional Experience tab is displayed with all details
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And Open Before Created Faculty tony Adam
    And Click And Professional Experience
    And Displayed Employer
    And Displayed Location
    And Displayed Begin Date
    And Displayed End date
    And Displayed Descriptions
    And Displayed SAVE Button

#  Credentialing_50
  @Credentialing
  Scenario:verify that Faculty Detail page, Licensures and certification displayed and clicking plus icon the professional Experience info tab is opened
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Licensures and Certifications

#  Credentialing_51
  @Credentialing
  Scenario:verify that Licensures and certification Tab is displayed with details info
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Licensures and Certifications
    And Displayed Awarde dy
    And Displayed Location
    And Displayed Begin Date
    And Displayed End date
    And Displayed Descriptions
    And Displayed SAVE Button

#  Credentialing_52
  @Credentialing
  Scenario:verify that after clicking plus icon Other Scholarly Activities Displayed a popup form
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Other Scholarly Activities
    And Click On Activity Type
    And Select On activity Type
    And Click Activity Date
    And Set on Activity Date
    And Input on Sponsor
    And Displayed SAVE Button
    And Click Description on Follow Up on other

#  Credentialing_53
  @Credentialing
  Scenario:verify that Mr.Tony Adam Faculty: Attachments tab is clicked and displayed with the Document Repository
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Attachment Tab

#  Credentialing_54
  @Credentialing
  Scenario:verify that Attachments tab is clicked and displayed with the Document Repository
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Attachment Tab
    And Click on document repository button

#  Credentialing_55
  @Credentialing
  Scenario:Verify A Faculty: Attachments tab is clicked and Faculty Documents tab is displayed
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And Open Before Created Faculty tony Adam
    And Click on Attachment Tab
    And Click on document repository button
    And Displayed download
    And Displayed Upload
    And Displayed Delete
    And Displayed Version

#  Credentialing_56
  @Credentialing
  Scenario:Verify the Attachments tab is selected and click on the document then Assign document change to REMOVE Document
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on Attachment Tab
    And Click on document repository button
    And Click on the Document and the assign document change to remove document

#  Credentialing_57
  @Credentialing
  Scenario:verify User Is Able To Navigate To History Tab
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on History Button

#  Credentialing_58
  @Credentialing
  Scenario:verify History Details Displayed Correctly
    Given Click on the credentialing and landing on the credentialing page
    And  Click All Credentials
    Then Search created Employee number
    And  Open Before Created Faculty tony Adam
    And Click on History Button
    And focus on action button that is show all Info