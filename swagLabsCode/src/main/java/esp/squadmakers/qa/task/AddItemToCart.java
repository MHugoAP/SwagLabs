package esp.squadmakers.qa.task;

import esp.squadmakers.qa.interaction.ScrollUp;
import esp.squadmakers.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static esp.squadmakers.qa.userinterface.AddItemToCartUserInterface.*;

public class AddItemToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actorCart) {
        actorCart.attemptsTo(Click.on(ARTICLE_ONE), WaitInteraction.waitFor(1));
        actorCart.attemptsTo(Click.on(ARTICLE_TWO), WaitInteraction.waitFor(1));
        actorCart.attemptsTo(Click.on(ARTICLE_THREE), WaitInteraction.waitFor(1));
        actorCart.attemptsTo(Click.on(ARTICLE_FOUR), WaitInteraction.waitFor(1),
                Scroll.to(ARTICLE_FIVE));
        actorCart.attemptsTo(Click.on(ARTICLE_FIVE), WaitInteraction.waitFor(1));
        actorCart.attemptsTo(Click.on(ARTICLE_SIX), WaitInteraction.waitFor(1),
                ScrollUp.on(3), WaitInteraction.waitFor(1));

    }

    public static AddItemToCart buyItems(){
        return Tasks.instrumented(AddItemToCart.class);
    }
}
