Feature: To validate Login Functionality in Facebook Application

  Scenario: To validate Login using invalid username and invalid password
    When User enter Invalid username and Invalid password
      | Username | greens                |
      | Mail     | Selenium123@gmail.com |
      | Phone    |             343346567 |
      | Address  | tambaram              |
    And User click the login button
    Then User is in invalid credential page

  Scenario: To validate Login using valid username and invalid password
    When User enter valid username and invalid password
      | Username | Mail       | Phone     | Address  |
      | Abi      | sdffhgh    | 234567878 | tambaram |
      | Mani     | awserdtfyg |   2345678 | Guindy   |
    And User click the login button
    Then User is in invalid credential page
