Feature: Klix application
  This feature deals with the functionality of the Klix application

  Scenario: Register, login and save titles from basketball page.
    Given I open the page
    And I navigate to the register page
    And I click on google sign
    And I enter my gmail email as "semin.klika@gmail.com"
    And I click on the next button on email page
    And I enter password as "KlikaTest"
    And I click on the next button on password page
    And I enter to the sport page
    And I enter to the basketball page
    And I get all titles of articles and save them to the document