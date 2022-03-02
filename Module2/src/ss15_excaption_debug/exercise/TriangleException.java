package ss15_excaption_debug.exercise;

import java.util.Scanner;

public class TriangleException {

    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("a: ");
            int A = scanner.nextInt();
            System.out.println("b: ");
            int B = scanner.nextInt();
            System.out.println("c: ");
            int C = scanner.nextInt();
            TriangleException triangleException = new TriangleException();

            try {
                triangleException.CheckTriangle(A, B, C);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }

        }while (true);

    }

    public void CheckTriangle(int a, int b, int c) throws IllegalTriangleException{
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Bạn không được nhập số âm");
            } else if (a + b < c || b + c < a || a + c < b) {
                throw new IllegalTriangleException("Các số nhập vào không phải là 3 cạnh của tam giác.");
            } else {
                System.out.println("3 cạnh của tam giác bạn vừa nhập là : a= " + a + " b= " + b + " c= " + c);
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
