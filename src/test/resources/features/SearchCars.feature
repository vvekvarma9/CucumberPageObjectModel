@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine.
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the home page "https://www.carsguide.com.au/" of Carsguide website
    When I move to the menu
      | Menu       |
      | buy + Sell |
      | reviews     |
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select carmodel as "1 Series" from AnyModel dropdown
    And select location as "ACT - All" from AnyLocation dropdown
    And select price as "$1,000" from price dropdown
    And click on Find_My_Next_Car
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale ACT | carsguide"