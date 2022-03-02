package ss3_mang_and_phuong_phuc_java.exercise;

import java.util.Scanner;

public class SumNumberColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int m = sc.nextInt();
        System.out.print("Nhập các phần tử trong mảng: ");
        int n = sc.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("array[" + i + "]" +"[" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Nhập cột muốn cộng: ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i][a];
        }
        System.out.println("Tổng của cột " + a + " là: " + sum);
    }
}
