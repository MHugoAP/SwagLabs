package esp.squadmakers.qa.task;

import cucumber.api.java.af.En;
import esp.squadmakers.qa.interaction.ScrollUp;
import esp.squadmakers.qa.interaction.WaitInteraction;
import esp.squadmakers.qa.model.DataCheckout;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import static esp.squadmakers.qa.userinterface.CheckoutUserInterface.*;

public class CheckoutInformationTask implements Task {

    private DataCheckout dataCheckoutInstance;

    public CheckoutInformationTask(DataCheckout dataCheckout){
        this.dataCheckoutInstance = dataCheckout;
    }

    @Override
    public <T extends Actor> void performAs(T actorChecout) {
        actorChecout.attemptsTo(Click.on(PAGE),ScrollUp.on(2), WaitInteraction.waitFor(1));
        actorChecout.attemptsTo(Enter.theValue(dataCheckoutInstance.getFirstName()).into(FIRST_NAME));
        actorChecout.attemptsTo(Enter.theValue(dataCheckoutInstance.getLastName()).into(LAST_NAME));
        actorChecout.attemptsTo(Enter.theValue(dataCheckoutInstance.getPostalCode()).into(POSTAL_CODE),
                WaitInteraction.waitFor(1));
        actorChecout.attemptsTo(Click.on(CONTINUE), WaitInteraction.waitFor(1));
    }

    public static CheckoutInformationTask checkoutInformationTask( DataCheckout dataCheckout){
        return new CheckoutInformationTask(dataCheckout);
    }
}
