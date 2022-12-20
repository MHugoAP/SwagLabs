package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddItemToCartUserInterface {

    public static final Target ARTICLE_ONE = Target
            .the("Clic on the button sauce-labs-backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target ARTICLE_TWO = Target
            .the("Clic on the button sauce-labs-bike-light")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target ARTICLE_THREE = Target
            .the("Clic on the button sadd-to-cart-sauce-labs-bolt-t-shirt")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

    public static final Target ARTICLE_FOUR = Target
            .the("Clic on the button add-to-cart-sauce-labs-fleece-jacket")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));

    public static final Target ARTICLE_FIVE = Target
            .the("Clic on the button add-to-cart-sauce-labs-onesie")
            .located(By.id("add-to-cart-sauce-labs-onesie"));

    public static final Target ARTICLE_SIX = Target
            .the("Clic on the button add-to-cart-test.allthethings()-t-shirt-(red)")
            .located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));


}
