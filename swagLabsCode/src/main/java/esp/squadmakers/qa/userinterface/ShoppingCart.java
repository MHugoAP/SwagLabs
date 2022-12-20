package esp.squadmakers.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart {

    public static final Target SHOPPING_CART = Target
            .the("shopping cart")
            .located(By.id("shopping_cart_container"));

    public static final Target CHECKOUT = Target
            .the("Checkout")
            .located(By.id("checkout"));
}
