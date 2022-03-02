package ss7_abstract_class_interface.exercise.ImplementResizeableInterfaceForGeometryClasses;

public class Square extends Shape {
    private double side = 2.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * (percent / 100);


    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square.resize(5);
        System.out.println(square);

    }
}
