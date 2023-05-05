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
        Circle circle = new Circle();
        ShapeDecorator circleWithBorder = new BorderDecorator(circle) ;
        circleWithBorder.draw();

        //let's create a triangle with a border
        Triangle triangle = new Triangle();
        ShapeDecorator triangleWithBorder = new BorderDecorator(triangle) ;
        triangleWithBorder.draw();
    }
}

//an application which can be used to draw different shapes