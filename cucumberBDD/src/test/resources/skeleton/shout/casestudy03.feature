Feature: Search Engine in TestsMe App

  Scenario Outline: To purchase a product in TestMe App
    Given The URL of the TestMe App is "http://10.232.237.143:443/TestMeApp/login.htm"
    When user enters "<username>" as Username
    And user enters "<password>" as password
    And user clicks Login Button
    And user is in Home page
    And user enters "<product>" as searchProduct
    And user clicks on FIND DETAILS Button
    Then user is in valid page

    Examples: 
      | product   |
      | headphone |
