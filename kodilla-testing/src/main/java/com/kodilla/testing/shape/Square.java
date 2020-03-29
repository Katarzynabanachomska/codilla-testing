package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
    private double sideA;

    public Square(String name,double sideA){
        this.name=name;
        this.sideA=sideA;
    }
    public String getName(){
        return name;
    }

    public double getSideA() {
        return sideA;
    }
    @Override
    public String getShapeName(){
        return name;
    }
    @Override
    public  double getField(){
        return sideA * 2;
    }
    @Override
    public String toString() {
        return "Name of the figure is"+name+"size of the field is"+getField();
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof Square)) return false;
        Square square=(Square)o;
        return Double.compare(square.getSideA(),getSideA())==0 &&
                getName().equals(square.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(),getSideA());
    }
}
