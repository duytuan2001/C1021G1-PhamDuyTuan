package ss12_java_collection_framwork.execise.products.controller;

import ss12_java_collection_framwork.execise.products.model.Product;
import ss12_java_collection_framwork.execise.products.service.IProduct;
import ss12_java_collection_framwork.execise.products.service.ProductService;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        IProduct<Product> iProduct = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--------MENU---------");
            System.out.println("1. Thêm sản phẩm: ");
            System.out.println("2. Sửa sản phảm: ");
            System.out.println("3. Xoá sản phẩm: ");
            System.out.println("4. Hiển thị sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm: ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần: ");
            System.out.println("7. Sắp xếp sản phẩm giảm dần: ");
            System.out.println("0. Exit: ");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProduct.addNewProduct();
                    break;
                case 2:
                    iProduct.editProduct();
                    break;
                case 3:
                    iProduct.removeProduct();
                    break;
                case 4:
                    iProduct.displayProduct();
                    break;
                case 5:
                    iProduct.searchProduct();
                    break;
                case 6:
                    iProduct.increase();
                    break;
                case 7:
                    iProduct.decrease();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

}
