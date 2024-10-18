package factory;

import factory.creator.EllipseMaker;
import factory.creator.RectangleMaker;
import factory.factory.MyShapeCreator;
import factory.factory.NoFillCreator;

import java.awt.*;
import java.awt.geom.RectangularShape;

public class Main {
    public static void main(String[] args) {
        MyShapeCreator shapeFactory = new MyShapeCreator(new RectangleMaker(), new NoFillCreator(Color.BLUE));

        RectangularShape shape1 = shapeFactory.createShape();
        RectangularShape shape2 = shapeFactory.createShape();
        shapeFactory.setShapeMaker(new EllipseMaker());
        RectangularShape shape3 = shapeFactory.createShape();
        RectangularShape shape4 = shapeFactory.createShape();
        System.out.println("\n");
    }
}
