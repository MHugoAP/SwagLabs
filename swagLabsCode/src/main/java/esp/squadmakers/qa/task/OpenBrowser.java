package esp.squadmakers.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    @Override
    public <T extends Actor> void performAs(T openBrowser) {
        openBrowser.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    public static OpenBrowser browser(){
        return Tasks.instrumented(OpenBrowser.class);
    }
}
