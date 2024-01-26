package org.example;
public abstract class Shape {
    public abstract void displayShapeName();
    public static void main(String[] args) {
        ShapePrinter shapePrinter = new ShapePrinter();

        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(rectangle);
    }
}
