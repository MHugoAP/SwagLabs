package esp.squadmakers.qa.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ScrollUp implements Interaction {

    private int taps;

    public ScrollUp(int taps) {
        this.taps = taps;
    }

    @Override
    public <T extends Actor> void performAs(T actorScroll) {
        try {
            Robot robot = new Robot();
            //robot.keyPress(KeyEvebt.VK_END);
            for (int i = 0; i < taps; i++)
                robot.keyPress(KeyEvent.VK_PAGE_UP);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public static ScrollUp on(int taps) {
        return new ScrollUp(taps);
    }
}
