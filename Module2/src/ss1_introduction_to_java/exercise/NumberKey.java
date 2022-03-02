package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class NumberKey {
    public static void main(String[] args) {
        NumberKey nk = new NumberKey();
        Scanner sc = new Scanner(System.in);
        int num;
        String result = "";
        do {
            System.out.println("Please enter num: ");
            num = sc.nextInt();
        } while (nk.checkkedValue(num));

        if (num < 11) {
            System.out.println(nk.less10(num, result));
        } else if (num < 20) {
            System.out.println(nk.less20(num, result));

        } else if (num < 100) {

            System.out.print(nk.less100(num, result));
            int units = num - num / 10 * 10;

            System.out.print(nk.less10(units, result));
        }

    }

    public static boolean checkkedValue(int num) {
        if (num > 999 || num < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String less10(int num, String result) {

        switch (num) {
            case 0:
                result += "zero";
                break;
            case 1:
                result += "Once";
                break;
            case 2:
                result += "Two";
                break;
            case 3:
                result += "Three";
                break;
            case 4:
                result += "Four";
                break;
            case 5:
                result += "Five";
                break;
            case 6:
                result += "Six";
                break;
            case 7:
                result += "Seven";
                break;
            case 8:
                result += "Eight";
                break;
            case 9:
                result += "Nine";
                break;
            case 10:
                result += "Ten";
                break;
        }
        return result;
    }

    public static String less20(int num, String result) {
        switch (num) {
            case 11:
                result += "eleven";
                break;
            case 12:
                result += "twelve";
                break;
            case 13:
                result += "thirteen";
                break;
            case 14:
                result += "fourteen";
                break;
            case 15:
                result += "fifteen";
                break;
            case 16:
                result += "sixteen";
                break;
            case 17:
                result += "Seventeen";
                break;
            case 18:
                result += "eighteen";
                break;
            case 19:
                result += "nineteen";
                break;

        }
        return result;
    }


    public static String less100(int num, String result) {
        int tens = num / 10;
        switch (tens) {
            case 2:
                result += "twenty";
                break;
            case 3:
                result += "thirty";
                break;
            case 4:
                result += "forty";
                break;
            case 5:
                result += "fifty";
                break;
            case 6:
                result += "sixty";
                break;
            case 7:
                result += "seventy";
                break;
            case 8:
                result += "eighty";
                break;
            case 9:
                result += "ninety";
                break;
        }
        return result;
    }

}








