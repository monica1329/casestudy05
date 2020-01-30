Feature: Test me app Registration
Scenario: Valid Login For Test me app
    Given The URL of the Test me app "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
    When User enters "monica1329" as USerName
    And User enters "monica" as FIrstName
    And User enters "baranwal" as LAstName
    And User enters "moni1329" as PAssword
    And User enters "moni1329" as COnfirmPassword
    And User enters "female" as GEnder
    And User enters "monica@gmail.com" as EMailAddress
    And User enters "9087654321" as MObileNumber
    And User enters "13/09/1996" as DOb
    And User enters "bangalore" as ADdress
    And User enters "What is your Birth Place?" as SEcurityQuestion
    And User enters "jharkhand" as ANswer
    Then clicks on SUbmit Button