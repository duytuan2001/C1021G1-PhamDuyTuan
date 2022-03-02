package ss3_mang_and_phuong_phuc_java.exercise;

import java.util.Scanner;

public class FindLargestTwoArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size1:");
            size1 = scanner.nextInt();
            if (size1 > 20)
                System.out.println("Size should not exceed 20");
        } while (size1> 20);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.print("Enter a size2:");
            size2 = scanner1.nextInt();
            if (size2 > 20)
                System.out.println("Size should not exceed 20");
        } while (size2> 20);
        array = new int[size1][size2];
        int i = 0;
        int u = 0;
        while (i < array.length) {
            while (u< array.length){
                System.out.print("Enter element  "  + (i + 1) + " : ");

                array[i][u] = scanner.nextInt() ;

                System.out.print("Enter element "  + (u + 1) + " : ");

                array[i][u] = scanner1.nextInt() ;
                i++;
                u++;
            }
        }
        int max = array[0][0];
        int index = 1;
        int index1 = 1;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0 ; k < array.length; k ++){
                if (array[j][k] > max) {
                    max = array[j][k];
                    index = j + 1;
                    index1 = k + 1 ;


                }
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index + index1);
    }
}
