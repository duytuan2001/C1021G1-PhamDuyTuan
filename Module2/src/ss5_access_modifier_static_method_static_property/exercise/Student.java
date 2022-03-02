package ss5_access_modifier_static_method_static_property.exercise;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getClasses() {

        return classes;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    public static void main(String[] args) {
        Student test = new Student();
        test.setName("Khoa Ngao");
        test.setClasses("C1021G1");
        System.out.println("Classes: " + test.getClasses());
        System.out.println("Name: " + test.getName());
    }
}
