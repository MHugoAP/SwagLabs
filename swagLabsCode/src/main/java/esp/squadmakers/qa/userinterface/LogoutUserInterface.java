package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class LogoutUserInterface {

    public static final Target LOGOUT = Target
            .the("Log out")
            .located(By.id("react-burger-menu-btn"));

    public static final Target LOGOUT_LIST = Target
            .the("Log out list")
            .located(By.id("logout_sidebar_link"));
}
