package homework.case2.controller;



import homework.case2.severvice.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student By ID");
            System.out.println("3. Remove Student By Index");
            System.out.println("4. Search By character or Name");
            System.out.println("5. List all student");
            System.out.println("6. Sort student");
            System.out.println("0. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
