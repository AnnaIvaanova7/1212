package Factory;

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class RectangularMaker implements ShapeMaker{


    @Override
    public RectangularShape buildShape()
    {
        new Rectangle2D.Double();
        return null;
    }
}
