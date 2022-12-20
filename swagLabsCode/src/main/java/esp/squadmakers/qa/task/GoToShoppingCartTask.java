package esp.squadmakers.qa.task;

import esp.squadmakers.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static esp.squadmakers.qa.userinterface.ShoppingCart.*;

public class GoToShoppingCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actorShoppingCart) {
        actorShoppingCart.attemptsTo(Click.on(SHOPPING_CART),
                Scroll.to(CHECKOUT));
        actorShoppingCart.attemptsTo(Click.on(CHECKOUT), WaitInteraction.waitFor(1));
    }

    public static GoToShoppingCartTask shoppingCartTask(){
        return Tasks.instrumented(GoToShoppingCartTask.class);
    }
}
