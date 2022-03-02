package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi= usd * 23000;
        System.out.println("Giá trị VND: "+ quydoi);
    }
}
