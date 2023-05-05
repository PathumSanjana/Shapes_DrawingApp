package com.company;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;//all the decorators should have a shape to decorate

    public ShapeDecorator (Shape shape){
        this.decoratedShape = shape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
