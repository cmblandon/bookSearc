Feature: Search by using suggestions
  Description: this feature allows to user search a word by using suggestions

  Scenario: User can search by using suggestions
    Given I am on the home page https://www.google.com.co/
    When I type the name of the w into the search field
    And the suggestions list is displayed
    And I click on the first suggestion in the list
    Then I  go to the search result page
    And the first result is The Name of the Wind - Patrick Routhfuss
    When I click on the first result link
    Then I go to the Patrick Routhfuss - The Books page