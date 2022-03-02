//package Auditions_1.controller;
//
//import Auditions_1.service.Impl.LecturersServiceImpl;
//import Auditions_1.service.Impl.StudentServiceImpl;
//import java.util.Scanner;
//
//public class StudentController {
//    static boolean check;
//    static int choice = 0;
//    static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        StudentManagerDisplay();
//    }
//
//    private static void StudentManagerDisplay(){
//        do {
//            check = false;
//            System.out.println("---STUDENT MANAGEMENT PROGRAM---");
//            System.out.println("1. Add Lecturers or add Student");
//            System.out.println("2. Remove Lecturers or remove Student");
//            System.out.println("3. Display Lecturers or display Student");
//            System.out.println("4. Search Lecturers or search Student");
//            System.out.println("5. Exit");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choice){
//                case 1:
//                    addManagementProgram();
//                    break;
//                case 2:
//                    removeManagementProgram();
//                    break;
//                case 3:
//                    displayManagementProgram();
//                    break;
//                case 4:
//                    searchManagementProgram();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        }while (check);
//    }
//
//    // case 1
//    private static void addManagementProgram(){
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        LecturersServiceImpl lecturersService = new LecturersServiceImpl();
//        do {
//            check =true;
//            System.out.println("---ADD MANAGEMENT PROGRAM---");
//            System.out.println("1. Add Lecturers");
//            System.out.println("2. Add Student");
//            System.out.println("3. Return Menu");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//                check = false;
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choice){
//                case 1:
//                    lecturersService.addLecturers();
////                    addManagementProgram();
//                    break;
//                case 2:
//                    studentService.addStudent();
////                    addManagementProgram();
//                    break;
//                case 3:
//                    StudentManagerDisplay();
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//            if(check == false){
//                check = true;
//                break;
//            }
//        }while (check);
//    }
//
//    //case 2
//    private static void removeManagementProgram(){
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        LecturersServiceImpl lecturersService = new LecturersServiceImpl();
//        do {
//            check = false;
//            System.out.println("---REMOVE MANAGEMENT PROGRAM---");
//            System.out.println("1. Remove Lecturers");
//            System.out.println("2. Remove Student");
//            System.out.println("3. Return Menu");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choice){
//                case 1:
//                    lecturersService.removeLecturers();
//                    removeManagementProgram();
//                    break;
//                case 2:
//                    studentService.removeStudent();
//                    removeManagementProgram();
//                    break;
//                case 3:
//                    StudentManagerDisplay();
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        }while (check);
//    }
//
//    // case 3
//    private static void displayManagementProgram(){
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        LecturersServiceImpl lecturersService = new LecturersServiceImpl();
//        do {
//            check = false;
//            System.out.println("---DISPLAY MANAGEMENT PROGRAM---");
//            System.out.println("1. Display Lecturers");
//            System.out.println("2. Display Student");
//            System.out.println("3. Return Menu");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choice){
//                case 1:
//                    lecturersService.displayLecturers();
//                    displayManagementProgram();
//                    break;
//                case 2:
//                    studentService.displayStudent();
//                    displayManagementProgram();
//                    break;
//                case 3:
//                    StudentManagerDisplay();
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        }while (check);
//    }
//
//    //case 4
//    private static void searchManagementProgram(){
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        LecturersServiceImpl lecturersService = new LecturersServiceImpl();
//        do {
//            check = false;
//            System.out.println("---SEARCH MANAGEMENT PROGRAM---");
//            System.out.println("1. Search Lecturers");
//            System.out.println("2. Search Student");
//            System.out.println("3. Return Menu");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
//                check = true;
//                continue;
//            }
//            switch (choice){
//                case 1:
//                    lecturersService.searchLecturers();
//                    searchManagementProgram();
//                    break;
//                case 2:
//                    studentService.searchStudent();
//                    searchManagementProgram();
//                    break;
//                case 3:
//                    StudentManagerDisplay();
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        }while (check);
//    }
//
//
//}
