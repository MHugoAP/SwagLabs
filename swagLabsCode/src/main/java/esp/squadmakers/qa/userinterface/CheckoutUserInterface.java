package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class CheckoutUserInterface {

    public static final Target FIRST_NAME = Target
            .the("First Name")
            .located(By.id("first-name"));

    public static final Target LAST_NAME = Target
            .the("Last Name")
            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target
            .the("Postal Code")
            .located(By.id("postal-code"));

    public static final Target CONTINUE = Target
            .the("Continue")
            .located(By.id("continue"));

    public static final Target PAGE = Target
            .the("Page")
            .locatedBy("//div[@class='checkout_info_wrapper']//form");
}
