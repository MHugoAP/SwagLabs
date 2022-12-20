package esp.squadmakers.qa.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import esp.squadmakers.qa.model.DataCheckout;
import esp.squadmakers.qa.model.DataUserPass;
import esp.squadmakers.qa.task.*;
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
        int number = (int) (Math.random() * 0 + 1);
        theActorInTheSpotlight().attemptsTo(LoginUserPasswordTask.withTheData(data.get(number)));
    }

    @When("^I want to add to cart one or more articles$")
    public void iWantToAddToCartOneOrMoreArticles() {
        theActorInTheSpotlight().attemptsTo(AddItemToCart.buyItems());
    }

    @Then("^we go to the cart and buy the products$")
    public void weGoToTheCartAndBuyTheProducts() {
        theActorInTheSpotlight().attemptsTo(GoToShoppingCartTask.shoppingCartTask());
    }

    @Then("^fill in the requested data$")
    public void fillInTheRequestedData(List<DataCheckout> dataCheckouts) {
        int numberCheck = (int) (Math.random() * 2 + 1);
        theActorInTheSpotlight().attemptsTo(CheckoutInformationTask.checkoutInformationTask(dataCheckouts.get(numberCheck)));
    }

    @And("^finish with the purchase$")
    public void finishWithThePurchase() {
        theActorInTheSpotlight().attemptsTo(FinishPurcharseTask.finishPurcharseTask());
    }

    @After
    public void closeTheStage() {
        OnStage.drawTheCurtain();
    }
}
