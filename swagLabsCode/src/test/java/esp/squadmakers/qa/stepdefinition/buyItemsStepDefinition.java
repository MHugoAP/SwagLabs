package esp.squadmakers.qa.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class buyItemsStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void serUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Miguel Hugo");
    }

    @Given("^Go to the swaglabs website$")
    public void goToTheSwaglabsWebsite() {

    }

    @When("^we login with username and password$")
    public void weLoginWithUsernameAndPassword() {
        //realizar el model
    }

    @Then("^I want to buy one or more articles$")
    public void iWantToBuyOneOrMoreArticles() {

    }

}
