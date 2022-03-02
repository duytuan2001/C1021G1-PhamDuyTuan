package ss6_inheritance.exercise.ClassCircleAndClassCylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.getRadius() *this.getRadius() * this.height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                " color " + this.getColor() +
                " height= " + height +
                " radius " + this.getColor() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder("red", 1, 5);
        System.out.println(cylinder);
        System.out.println("Volume " + cylinder.getVolume());

    }

}
