package esp.squadmakers.qa.task;

import esp.squadmakers.qa.interaction.WaitInteraction;
import esp.squadmakers.qa.model.DataUserPass;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static esp.squadmakers.qa.userinterface.LoginUserInterface.*;

public class LoginUserPasswordTask implements Task {

    private DataUserPass userPassInstance;

    public LoginUserPasswordTask(DataUserPass userPass){
        this.userPassInstance = userPass;
    }

    @Override
    public <T extends Actor> void performAs(T actorLogin) {
        actorLogin.attemptsTo(Enter.theValue(userPassInstance.getUsername()).into(USERNAME));
        actorLogin.attemptsTo(Enter.theValue(userPassInstance.getPassword()).into(PASSWORD)
        , WaitInteraction.waitFor(2));
        actorLogin.attemptsTo(Click.on(LOGIN_BUTTON));

    }

    public static LoginUserPasswordTask withTheData(DataUserPass dataUserPass){
        return new LoginUserPasswordTask(dataUserPass);
    }
}
