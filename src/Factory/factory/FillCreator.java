package Factory.factory;

import java.awt.*;

public class FillCreator extends ColorBehaviorMaker {
    public FillCreator() {
    }

    public FillCreator(Color color) {
        super(color);
    }

    @Override
    public NoFillCreator createColorBehavior() {
        return new NoFillCreator(color);
    }
}
