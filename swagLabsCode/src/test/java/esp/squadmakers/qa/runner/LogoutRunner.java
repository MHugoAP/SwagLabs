package esp.squadmakers.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/logout.feature"
        , glue = "esp.squadmakers.qa.stepdefinition"
        , snippets = SnippetType.CAMELCASE)
public class LogoutRunner {
}
