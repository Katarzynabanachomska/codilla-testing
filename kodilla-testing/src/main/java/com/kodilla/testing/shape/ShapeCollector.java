package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();
    public void addFigure (Shape shape) {
        figures.add(shape);
    }
    public void removeFigure(Shape shape){
        figures.remove(shape);
    }
    public Shape getFigure(int n) {
        return figures.get(n);
    }
    public void showFigures(){
        for(Shape all: figures){
            System.out.println(all);
        }
    }
    public ArrayList<Shape> getFigures(){
        return figures;
    }
}
