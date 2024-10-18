package Factory.factory;

import Factory.creator.ShapeMaker;

import java.awt.geom.RectangularShape;

public class MyShapeCreator {
    private ShapeMaker shapeMaker;
    private ColorBehaviorMaker colorBehaviorMaker;
    public MyShapeCreator(ShapeMaker shapeMaker, ColorBehaviorMaker colorBehaviorMaker) {
        this.shapeMaker = shapeMaker;
        this.colorBehaviorMaker = colorBehaviorMaker;
    }

}
