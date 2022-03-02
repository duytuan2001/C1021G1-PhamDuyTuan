package ss2_vong_lap_java.practice;

import java.util.Scanner;

public class Check_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number < 2)
            System.out.println(number + " is not a price.");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a price.");
            else
                System.out.println(number + " is not a price");
        }
    }
}
