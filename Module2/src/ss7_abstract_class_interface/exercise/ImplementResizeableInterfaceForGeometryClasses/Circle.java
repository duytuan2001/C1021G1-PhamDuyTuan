package ss7_abstract_class_interface.exercise.ImplementResizeableInterfaceForGeometryClasses;

import ss7_abstract_class_interface.exercise.ImplementColorableInterfaceForGeometryClasses.Shape;

public abstract class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (percent / 100);
    }


    //     CircleTest
    public static void main(String[] args) {
        Circle circle = new Circle() {
            @Override
            public void HowToColor() {

            }
        };
        System.out.println(circle);

        circle.resize(10);
        System.out.println(circle);
    }



}