package ss17_IO_Binary_File_Serialization.exercise.controller;

import ss17_IO_Binary_File_Serialization.exercise.Service.ServiceImpl.ProductImpl;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        displayProductMenu();
    }

    public static void displayProductMenu() {
        ProductImpl product = new ProductImpl();
        boolean check = true;
        while (check) {
            System.out.println("---DisplayProductMenu---");
            System.out.println("1. DisplayProductList");
            System.out.println("2. AddDisplayList");
            System.out.println("3. SearchDisplay");
            System.out.println("---DisplayProductMenu---");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    product.displayProductList();
                    break;
                case 2:
//                    product.product();
//                    break;
//                case 3:
//                    productService.searchProduct();
//                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
