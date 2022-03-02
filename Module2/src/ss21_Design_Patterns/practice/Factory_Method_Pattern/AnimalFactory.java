package ss21_Design_Patterns.practice.Factory_Method_Pattern;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
