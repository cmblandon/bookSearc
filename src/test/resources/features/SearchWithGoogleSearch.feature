Feature: Google HomePage Search
  Description: this feature allows to user search a word into the google search bar

  Background: Ingreso al sitio AdvantageDemo
    Given I am on the home page https://www.google.com.co

  Scenario: User can search with google search
    When I type The Name of the Wind into the search field
    And I click on the google search button
    Then I  go to the search result page
    And the first result is The Name of the Wind - Patrick Rothfuss
    When I click on the first result link
    Then I go to the Patrick Rothfuss - The Books page