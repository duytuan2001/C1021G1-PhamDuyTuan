package ss6_inheritance.exercise.DesignAndImplementationClass;


import ss6_inheritance.practice.Shape;

public class Triangle extends Shape {
    private double size1;
    private double size2;
    private double size3;

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.size1) * (p - this.size2) * (p - this.size3));
    }

    public double getPerimeter() {
        return this.size1 + this.size2 + this.size3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("brown", true, 7, 14, 10);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

}
