package co.com.stepDefinitions;

import co.com.drivers.Drivers;
import co.com.pageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchWithGoogleSearchStepdefs  extends Drivers {
    HomePage homePage;

    @Given("^I am on the home page (.*)$")
    public void iAmOnTheHomePageHttpsWwwGoogleComCo(String url) {
        web().get(url);
        assertThat(url).isEqualTo("https://www.google.com.co");
    }

    @When("^I type (.*) into the search field$")
    public void iTypeTheNameOfTheWindIntoTheSearchField(String word) {
        homePage = new HomePage(useDriver());
        homePage.googleSearch();
        homePage.inputWord(word);
    }

    @And("^I click on the google search button$")
    public void iClickOnTheGoogleSearchButton() {
        homePage.clickOnButton();
    }

    @Then("^I  go to the search result page$")
    public void iGoToTheSearchResultPage() {
        homePage.resultSearch();
    }

    @And("^the first result is (.*)$")
    public void theFirstResultIsTheNameOfTheWindPatrickRothfuss(String nameBook) {
        homePage.firstResultValidation(nameBook);
    }

    @When("^I click on the first result link$")
    public void iClickOnTheFirstResultLink() {
        homePage.goToFirstLink();
    }

    @Then("^I go to the Patrick Rothfuss - The Books page$")
    public void iGoToThePatrickRothfussTheBooksPage() {
    }
}
