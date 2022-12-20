package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginUserInterface {

    public static final Target USERNAME = Target
            .the("Username")
            .located(By.id("user-name"));

    public static final Target PASSWORD = Target
            .the("Password")
            .locatedBy("//input[@id='password']");

    public static final Target LOGIN_BUTTON = Target
            .the("Login Button")
            .located(By.id("login-button"));
}
