//package practicing_test.controller;
//
////import practicing_test.service.Impl.ExportProductsImpl;
//import practicing_test.service.Impl.ImportedProductsImpl;
//
//import java.util.Scanner;
//
//public class controller {
//    static boolean check;
//    static int choice = 0;
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {         //Hiển thị MainMenu()
//        displayProductMenu();
//    }
//
//    public static void displayProductMenu() {
//        do {
//            check = false;
//            System.out.println("----Sản Phẩm----");
//            System.out.println("1.\tSản phẩm nhập khẩu");
//            System.out.println("2.\tSản phẩm xuất khẩu");
//            System.out.println("3.\tThoát");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
//                check = true;
//                continue;
//            }
//            switch (choice) {
//                case 1:
//                    displayImportedProductMenu();
//                    break;
//                case 2:
////                    displayExportProductMenu();
//                    break;
//                case 3:
//                    System.exit(0);
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//    }
//
////    Case1: Nhập Khẩu
//    public static void displayImportedProductMenu() {
//        ImportedProductsImpl importedProducts = new ImportedProductsImpl();
//        do {
//            check = false;
//            System.out.println("----Sản Phẩm Nhập Khẩu----");
//            System.out.println("1.\tThêm vào danh sách nhập khẩu");
//            System.out.println("2.\tXóa danh sách nhập khẩu");
//            System.out.println("3.\tXem danh sách nhập khẩu");
//            System.out.println("4.\tTìm kiếm danh sách nhập khẩu");
//            System.out.println("5.\tQuay lại");
//            try {
//                choice = Integer.parseInt(scanner.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
//                check = true;
//                continue;
//            }
//            switch (choice) {
//                case 1:
//                    importedProducts.add();
//                    displayImportedProductMenu();
//                    break;
//                case 2:
//                    importedProducts.remove();
//                    displayImportedProductMenu();
//                    break;
//                case 3:
//                    importedProducts.display();
//                    displayImportedProductMenu();
//                    break;
//                case 4:
//                    importedProducts.search();
//                    displayImportedProductMenu();
//                    break;
//                case 5:
//                    displayProductMenu();
//                    break;
//                default:
//                    check = true;
//                    break;
//            }
//        } while (check);
//    }
//
////    Case 2: Xuất Khẩu
////    public static void displayExportProductMenu() {
////        ExportProductsImpl exportProducts = new ExportProductsImpl();
////        do {
////            check = false;
////            System.out.println("----Sản Phẩm Xuất Khẩu----");
////            System.out.println("1.\tThêm Vào danh sách Xuất Khẩu");
////            System.out.println("2.\tXóa danh sách xuất khẩu");
////            System.out.println("3.\tXem danh sách xuất khẩu");
////            System.out.println("3.\tTìm kiếm danh sách xuất khẩu");
////            System.out.println("4.\tQuay lại");
////            try {
////                choice = Integer.parseInt(scanner.nextLine());
////
////            } catch (NumberFormatException e) {
////                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
////                check = false;
////                continue;
////            }
////            switch (choice) {
////                case 1:
////                    exportProducts.add();
////                    displayExportProductMenu();
////                    break;
////                case 2:
////                    exportProducts.remove();
////                    displayExportProductMenu();
////                    break;
////                case 3:
////                    exportProducts.display();
////                    displayExportProductMenu();
////                    break;
////                case 4:
////                    exportProducts.search();
////                    displayExportProductMenu();
////                case 5:
////                    displayProductMenu();
////                    break;
////                default:
////                    check = true;
////                    break;
////            }
////        } while (check);
////    }
//}
