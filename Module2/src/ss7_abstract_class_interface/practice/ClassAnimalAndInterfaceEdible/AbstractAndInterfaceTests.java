package ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible;


import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.Animal.Animal;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.Animal.Chicken;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.Animal.Tiger;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.edible.Edible;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.fruit.Apple;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.fruit.Fruit;
import ss7_abstract_class_interface.practice.ClassAnimalAndInterfaceEdible.fruit.Orange;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}


