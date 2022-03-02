package ss2_vong_lap_java.exercise;

import java.util.Scanner;

public class DrawingPicture {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int width = 0;
        int height = 0;
        DrawingPicture dp = new DrawingPicture();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw a right triangle Bottom-left");
            System.out.println("3. Draw a right triangle Top-left");
            System.out.println("4. Draw an isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    height = inputHeight();
                    width = inputWidth();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    height = inputHeight();
                    for (int i = 1; i <= height; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    height = inputHeight();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    height = inputHeight();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int m = 1; m <= 2 * i - 1; m++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }


    }

    static public int inputWidth () {
        System.out.println("Enter a height: ");
        int width = input.nextInt();
        return width;
    }

    static public int inputHeight (){
        System.out.println("Enter a height: ");
        int height = input.nextInt();
        return height;


    }

}







