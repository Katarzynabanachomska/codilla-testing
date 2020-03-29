package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle ("Circle",3.35,3.14);
        //When
        shapeCollector.addFigure (circle);
        //Then
        Assert.assertEquals (circle, shapeCollector.getFigure(0));
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle ("Circle",3.35,3.14);
        shapeCollector.addFigure (circle);
        //When
        shapeCollector.removeFigure (circle);
        //Then
        Assert.assertEquals (0,shapeCollector.getFigures().size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle ("Circle",3.35,3.14);
        Shape square = new Square ("Square",10.0);
        shapeCollector.addFigure (circle);
        shapeCollector.addFigure (square);
        //When
        Shape firstFigure = shapeCollector.getFigure(0);
        Shape secondFigure = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(circle,firstFigure);
        Assert.assertEquals(square,secondFigure);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle ("Circle",3.35,3.14);
        Shape square = new Square ("Square",10.0);
        Shape triangle = new Triangle ("Triangle",10,5);
        shapeCollector.addFigure (circle);
        shapeCollector.addFigure (square);
        shapeCollector.addFigure (triangle);
        //When
        shapeCollector.showFigures();
    }
}
