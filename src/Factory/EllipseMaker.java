package Factory;

import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;

public class EllipseMaker implements ShapeMaker{
    @Override
    public RectangularShape buildShape()
    {
        new Ellipse2D.Double();
        return null;
    }
}
