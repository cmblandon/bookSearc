package co.com.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@CucumberOptions(features = "src/test/resources/features/SearchWithGoogleSearch.feature",
        glue = {"co/com/stepDefinitions"},
        snippets = SnippetType.CAMELCASE)

public class TestRunner {


}