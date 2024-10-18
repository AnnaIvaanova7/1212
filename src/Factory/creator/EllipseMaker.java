package Factory.creator;

import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class EllipseMaker implements factory.creator.ShapeMaker {
    @Override
    public RectangularShape buildShape() {
        return new Ellipse2D.Double();
    }
}
