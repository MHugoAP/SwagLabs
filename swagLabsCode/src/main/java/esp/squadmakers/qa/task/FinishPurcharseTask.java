package esp.squadmakers.qa.task;

import esp.squadmakers.qa.interaction.ScrollUp;
import esp.squadmakers.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static esp.squadmakers.qa.userinterface.FinishPurchaseUserInterface.*;

public class FinishPurcharseTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actorFinishPurchase) {
        actorFinishPurchase.attemptsTo(Click.on(PAGE), ScrollUp.on(3), WaitInteraction.waitFor(1));
        actorFinishPurchase.attemptsTo(Click.on(FINISH), ScrollUp.on(3), WaitInteraction.waitFor(1));
        actorFinishPurchase.attemptsTo(Click.on(BACK_HOME), ScrollUp.on(3), WaitInteraction.waitFor(1));
    }

    public static FinishPurcharseTask finishPurcharseTask(){
        return Tasks.instrumented(FinishPurcharseTask.class);
    }
}
