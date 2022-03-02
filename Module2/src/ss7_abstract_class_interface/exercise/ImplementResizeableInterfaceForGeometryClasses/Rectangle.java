package ss7_abstract_class_interface.exercise.ImplementResizeableInterfaceForGeometryClasses;

import ss7_abstract_class_interface.exercise.ImplementColorableInterfaceForGeometryClasses.Shape;

public abstract class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        //super(color, false);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width * length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length = this.width*(percent/100);
        this.width = this.width*(percent/100);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() {
            @Override
            public void HowToColor() {

            }
        };
        System.out.println(rectangle);
        rectangle.resize(10);
        System.out.println(rectangle);
    }
}