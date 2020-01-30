Feature: Logining into the test me app

  Scenario Outline: Valid Login For Test Me App
    Given The URL of The Demo Web Shop "http://10.232.237.143:443/TestMeApp/login.htm"
    When User enters "<username>" as Username
    And User enters "<Password>" as Password
    Then User clicks on login Button

    Examples: 
      | username   | password |
      | monica2913 | moni1329 |
