package esp.squadmakers.qa.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import esp.squadmakers.qa.model.DataUserPass;
import esp.squadmakers.qa.task.BuyItemsTask;
import esp.squadmakers.qa.task.LoginUserPasswordTask;
import esp.squadmakers.qa.task.OpenBrowser;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

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
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^we login with username and password$")
    public void weLoginWithUsernameAndPassword(List<DataUserPass> data) {
        int number = (int) (Math.random() * 3 + 1);
        theActorInTheSpotlight().attemptsTo(LoginUserPasswordTask.withTheData(data.get(number)));
    }

    @Then("^I want to buy one or more articles$")
    public void iWantToBuyOneOrMoreArticles() {
        theActorInTheSpotlight().attemptsTo(BuyItemsTask.buyItems());
    }

    @After
    public void closeTheStage() {
        OnStage.drawTheCurtain();
    }
}
