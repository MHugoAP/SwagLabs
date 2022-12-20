package esp.squadmakers.qa.task;

import esp.squadmakers.qa.interaction.WaitInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static esp.squadmakers.qa.userinterface.LogoutUserInterface.*;

public class LogoutTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actorLogout) {
        actorLogout.attemptsTo(Click.on(LOGOUT), WaitInteraction.waitFor(1));
        actorLogout.attemptsTo(Click.on(LOGOUT_LIST), WaitInteraction.waitFor(1));
    }

    public static LogoutTask logoutTask(){
        return Tasks.instrumented(LogoutTask.class);
    }
}
