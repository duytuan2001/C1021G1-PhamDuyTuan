package ss23_Behavioral_Design_Pattern.practice.Template_Method;

public class TemplateMethodDemo {
    public static void main(String[] args) {

        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();

    }
}
