package Factory.factory;

import java.awt.*;

public class NoFillCreator extends ColorBehaviorMaker {
    public NoFillCreator() {
        super();
    }

    public NoFillCreator(Color color) {
        super(color);
    }

    public NoFillCreator createColorBehavior() {
        return new NoFillCreator(color);
    }
}
