package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String name;
    private double sideA;
    private double height;

    public Triangle(String name,double sideA,double height){
        this.name=name;
        this.sideA=sideA;
        this.height=height;
    }
    public String getName(){
        return name;
    }
    public double getSideA(){
        return sideA;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public String getShapeName(){
        return name;
    }
    @Override
    public double getField() {
        return sideA *height/2;
    }
    @Override
    public String toString(){
        return "Name is the figure is "+name+"size of the field is "+getField();
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle=(Triangle)o;
        return Double.compare(triangle.getSideA(),getSideA())== 0 &&
                Double.compare(triangle.getHeight(),getHeight())== 0 &&
                Objects.equals(getName(),triangle.getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(),getSideA(),getHeight());
    }
}
