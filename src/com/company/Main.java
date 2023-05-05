package com.company;

public class Main {

    public static void main(String[] args) {

       /* Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Triangle triangle = new Triangle();
        triangle.draw(); */

        //let's create a circle with a border
        Shape circle = new Circle();
        ShapeDecorator circleWithBorder = new BorderDecorator(circle) ;
        circleWithBorder.draw();

        //let's create a triangle with a border
        Shape triangle = new Triangle();
        ShapeDecorator triangleWithBorder = new BorderDecorator(triangle) ;
        triangleWithBorder.draw();

        //let's create a rectangle with a border
        Shape rectangle = new Rectangle();
        ShapeDecorator rectangleWithBorder = new BorderDecorator(rectangle) ;
        rectangleWithBorder.draw();

        //let's create a red circle
        Shape circle1 = new Circle();
        ShapeDecorator redCircle = new ColorDecorator(circle1,"Red") ;
        redCircle.draw();
    }
}

//an application which can be used to draw different shapes