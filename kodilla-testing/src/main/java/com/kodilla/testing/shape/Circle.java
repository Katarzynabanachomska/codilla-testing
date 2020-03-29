package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private String name;
    private double radius;
    private double pi;

    public Circle(String name, double radius, double pi) {
        this.name=name;
        this.radius=radius;
        this.pi=pi;
    }
    public String getName(){
        return name;
    }
    public double getRadius(){
        return radius;
    }
    public double getPi(){
        return pi;
    }
    @Override
    public String getShapeName(){
        return name;
    }
    @Override
    public double getField(){
        return pi * radius * radius;
    }
    @Override
    public String toString(){
        return "Name figure is" + name + "sieze of the field is" + getField();
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if(!(o instanceof Circle)) return false;
        Circle circle = (Circle)o;
        return getRadius() == circle.getRadius()&&
                getPi()== circle.getPi()&&
                Objects.equals(getName(),circle.getName());
    }
    @Override
    public  int hashCode(){
        return Objects.hash (getName(),getRadius(),getPi());
    }
}
