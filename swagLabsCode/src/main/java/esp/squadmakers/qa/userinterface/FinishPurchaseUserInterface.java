package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class FinishPurchaseUserInterface {

    public static final Target FINISH = Target
            .the("Finish purchase")
            .located(By.id("finish"));

    public static final Target BACK_HOME = Target
            .the("Back Home")
            .located(By.id("back-to-products"));

    public static final Target PAGE = Target
            .the("Page Finish")
            .located(By.id("contents_wrapper"));
}
