package ss5_access_modifier_static_method_static_property.exercise;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public AccessModifier(){
    }

    public AccessModifier(double radius, double area){
        this.area = area;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier();
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }
}
