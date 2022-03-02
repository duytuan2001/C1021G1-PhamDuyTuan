package ss6_inheritance.exercise.ClassCircleAndClassCylinder;

public class Circle {
    private String color;
    private double radius;
    private double Perimeter;
    private double  Area;



    public Circle (){

    }

    public Circle (String color, double radius){
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){

        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", Perimeter=" + Perimeter +
                ", Area=" + Area +
                '}';
    }

    public static void main(String[] args){
        Circle circle = new Circle("red", 5);
        System.out.println(circle);

    }

}
