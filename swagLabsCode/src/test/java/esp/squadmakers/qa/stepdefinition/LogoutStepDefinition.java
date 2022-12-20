package esp.squadmakers.qa.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import esp.squadmakers.qa.model.DataUserPass;
import esp.squadmakers.qa.task.LoginUserPasswordTask;
import esp.squadmakers.qa.task.LogoutTask;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LogoutStepDefinition {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void serUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Miguel Hugo");
    }

    @Given("^login with username and password$")
    public void loginWithUsernameAndPassword(List<DataUserPass> data) {
        int number = (int) (Math.random() * 2 + 1);
        theActorInTheSpotlight().attemptsTo(LoginUserPasswordTask.withTheData(data.get(number)));
    }

    @When("^I want to log out after the purchase$")
    public void iWantToLogOutAfterThePurchase() {
        theActorInTheSpotlight().attemptsTo(LogoutTask.logoutTask());
    }
}
