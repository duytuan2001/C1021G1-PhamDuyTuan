package ss4_class_and_object_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return ((-b) + Math.sqrt(b*b - 4*a*c)) / 2*a ;
    }

    public double getX2() {
        return ((-b) - Math.sqrt(b*b - 4*a*c)) / 2*a;
    }

    public double getDiscriminant() {
        return b*b - 4*a*c;
    }

    public void check() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                System.out.println("phuong trinh co 1 nghiem la: x = " + (-c/b));
            }
            return;
        }

        double delta = getDiscriminant();
        double x2;
        double x1;
        if (delta > 0) {
            x1 = getX1();
            x2 = getX2();

            System.out.println("phuong trinh co 2 nghiem la: x1 = " + x1 +  "x2 = " + x2);
        } else if(delta == 0){
            x1 = (-b/2*a);
            System.out.println("phuong trinh co nghiem kep la: x1 = " + x1);
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A: ");
        double a = sc.nextDouble();
        System.out.println("Input B: ");
        double b = sc.nextDouble();
        System.out.println("Input C: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("a la: " + quadraticEquation.getA());
        System.out.println("b la: " + quadraticEquation.getB());
        System.out.println("c la: " + quadraticEquation.getC());
        System.out.println("Your delta" + quadraticEquation.getDiscriminant());
        quadraticEquation.check();
    }
}