package ss5_access_modifier_static_method_static_property.practice;

public class Car {

    private String name;

    private String engine;


    public static int numberOfCars;


    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }

    // getters and setters

    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.print(Car.numberOfCars);
        System.out.println(car1.name + car1.engine);

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.print(car2.name);
        System.out.print(car2.engine);
    }
}
