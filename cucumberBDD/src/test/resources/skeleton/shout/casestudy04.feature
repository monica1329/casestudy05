Feature: Proceed to payment without adding item in cart
Scenario: The one where the user moves to cart without adding any item in it
Given The URL of the TestMe App login page is "http://10.232.237.143:443/TestMeApp/login.htm"
When user enters "<User_name>" as User_name
And user enters "<Password>" as Password
And user enters Login Button
And user is in Home_page
And user enters "<product>" as search_Product
And user clicks on Find Details Button
And user clicks on Proceed to Pay Button
Then user does not find cart