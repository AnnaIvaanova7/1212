package Factory.creator;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangleMaker implements factory.creator.ShapeMaker {
    @Override
    public RectangularShape buildShape() {
        return new Rectangle2D.Double();
    }
}